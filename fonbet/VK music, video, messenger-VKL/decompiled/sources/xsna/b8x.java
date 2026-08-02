package xsna;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* compiled from: InstrURLConnectionBase.java */
/* loaded from: classes13.dex */
public final class b8x {
    public static final ra2 f = ra2.d();
    public final HttpURLConnection a;
    public final e560 b;
    public long c = -1;
    public long d = -1;
    public final Timer e;

    public b8x(HttpURLConnection httpURLConnection, Timer timer, e560 e560Var) {
        this.a = httpURLConnection;
        this.b = e560Var;
        this.e = timer;
        e560Var.n(httpURLConnection.getURL().toString());
    }

    public final void a() throws IOException {
        long j = this.c;
        e560 e560Var = this.b;
        Timer timer = this.e;
        if (j == -1) {
            timer.reset();
            long j2 = timer.b;
            this.c = j2;
            e560Var.i(j2);
        }
        try {
            this.a.connect();
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    public final Object b() throws IOException {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        e560 e560Var = this.b;
        e560Var.f(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                e560Var.j(httpURLConnection.getContentType());
                return new x7x((InputStream) content, e560Var, timer);
            }
            e560Var.j(httpURLConnection.getContentType());
            e560Var.k(httpURLConnection.getContentLength());
            e560Var.l(timer.d());
            e560Var.d();
            return content;
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    public final Object c(Class[] clsArr) throws IOException {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        e560 e560Var = this.b;
        e560Var.f(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                e560Var.j(httpURLConnection.getContentType());
                return new x7x((InputStream) content, e560Var, timer);
            }
            e560Var.j(httpURLConnection.getContentType());
            e560Var.k(httpURLConnection.getContentLength());
            e560Var.l(timer.d());
            e560Var.d();
            return content;
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    public final InputStream d() {
        HttpURLConnection httpURLConnection = this.a;
        e560 e560Var = this.b;
        i();
        try {
            e560Var.f(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f.a();
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        return errorStream != null ? new x7x(errorStream, e560Var, this.e) : errorStream;
    }

    public final InputStream e() throws IOException {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        e560 e560Var = this.b;
        e560Var.f(responseCode);
        e560Var.j(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream != null ? new x7x(inputStream, e560Var, timer) : inputStream;
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final OutputStream f() throws IOException {
        Timer timer = this.e;
        e560 e560Var = this.b;
        try {
            OutputStream outputStream = this.a.getOutputStream();
            return outputStream != null ? new y7x(outputStream, e560Var, timer) : outputStream;
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    public final int g() throws IOException {
        i();
        long j = this.d;
        Timer timer = this.e;
        e560 e560Var = this.b;
        if (j == -1) {
            long d = timer.d();
            this.d = d;
            e560Var.e.A(d);
        }
        try {
            int responseCode = this.a.getResponseCode();
            e560Var.f(responseCode);
            return responseCode;
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    public final String h() throws IOException {
        HttpURLConnection httpURLConnection = this.a;
        i();
        long j = this.d;
        Timer timer = this.e;
        e560 e560Var = this.b;
        if (j == -1) {
            long d = timer.d();
            this.d = d;
            e560Var.e.A(d);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            e560Var.f(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i() {
        long j = this.c;
        e560 e560Var = this.b;
        if (j == -1) {
            Timer timer = this.e;
            timer.reset();
            long j2 = timer.b;
            this.c = j2;
            e560Var.i(j2);
        }
        HttpURLConnection httpURLConnection = this.a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            e560Var.e(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            e560Var.e("POST");
        } else {
            e560Var.e("GET");
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
