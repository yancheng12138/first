package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.StrConvert;


public class loginServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = StrConvert.ToCN(request.getParameter("username"));
		String password = request.getParameter("password");

		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();

		if (username != null) {
			out.println("您的用户名是 ：" + username + "<br>");
		}

		if (password != null) {
			out.println("您的密码是 ：" + password);
		}

		out.flush();
		out.close();	

	}

}
