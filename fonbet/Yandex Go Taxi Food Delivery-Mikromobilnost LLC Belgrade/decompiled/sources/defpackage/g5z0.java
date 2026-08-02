package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;

/* loaded from: classes8.dex */
public abstract class g5z0 {
    public final ThreadLocal a = new ThreadLocal();

    public void a(String str, Object... objArr) {
        i(3, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void b(Throwable th) {
        i(3, th, null, new Object[0]);
    }

    public void c(Throwable th, String str, Object... objArr) {
        i(3, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void d(String str, Object... objArr) {
        i(6, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void e(Throwable th) {
        i(6, th, null, new Object[0]);
    }

    public void f(Throwable th, String str, Object... objArr) {
        i(6, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void g(String str, Object... objArr) {
        i(4, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    public abstract void h();

    public final void i(int i, Throwable th, String str, Object... objArr) {
        ThreadLocal threadLocal = this.a;
        if (((String) threadLocal.get()) != null) {
            threadLocal.remove();
        }
        if (str != null && str.length() != 0) {
            if (objArr.length != 0) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            }
            if (th != null) {
                StringWriter stringWriter = new StringWriter(256);
                PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                th.printStackTrace(printWriter);
                printWriter.flush();
                stringWriter.toString();
            }
        } else {
            if (th == null) {
                return;
            }
            StringWriter stringWriter2 = new StringWriter(256);
            PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
            th.printStackTrace(printWriter2);
            printWriter2.flush();
            stringWriter2.toString();
        }
        h();
        throw null;
    }

    public void j(String str, Object... objArr) {
        i(5, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void k(Throwable th) {
        i(5, th, null, new Object[0]);
    }

    public void l(Throwable th, Object... objArr) {
        i(5, th, "Error during card deletion", Arrays.copyOf(objArr, objArr.length));
    }
}
