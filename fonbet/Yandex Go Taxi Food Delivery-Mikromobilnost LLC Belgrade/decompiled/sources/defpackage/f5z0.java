package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import ru.yandex.video.m3.player.drm.DrmLoadException;

/* loaded from: classes10.dex */
public abstract class f5z0 {
    public final ThreadLocal a = new ThreadLocal();

    public void a(String str, Object... objArr) {
        l(3, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void b(Throwable th, String str, Object... objArr) {
        l(3, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void c(DrmLoadException.ErrorDiagnostic errorDiagnostic) {
        l(3, errorDiagnostic, null, new Object[0]);
    }

    public void d(String str, Object... objArr) {
        l(6, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void e(Throwable th) {
        l(6, th, null, new Object[0]);
    }

    public void f(Throwable th, String str, Object... objArr) {
        l(6, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    public /* synthetic */ String g() {
        ThreadLocal threadLocal = this.a;
        String str = (String) threadLocal.get();
        if (str != null) {
            threadLocal.remove();
        }
        return str;
    }

    public void h(String str, Object... objArr) {
        l(4, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void i(Throwable th, String str, Object... objArr) {
        l(4, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    public boolean j(String str) {
        return !(this instanceof hot);
    }

    public abstract void k(int i, String str, String str2);

    public final void l(int i, Throwable th, String str, Object... objArr) {
        String g = g();
        if (j(g)) {
            if (str != null && str.length() != 0) {
                if (objArr.length != 0) {
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    str = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                }
                if (th != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) str);
                    sb.append('\n');
                    StringWriter stringWriter = new StringWriter(256);
                    PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    sb.append(stringWriter.toString());
                    str = sb.toString();
                }
            } else {
                if (th == null) {
                    return;
                }
                StringWriter stringWriter2 = new StringWriter(256);
                PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
                th.printStackTrace(printWriter2);
                printWriter2.flush();
                str = stringWriter2.toString();
            }
            k(i, g, str);
        }
    }

    public void m(String str, Object... objArr) {
        l(2, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void n(Throwable th, String str, Object... objArr) {
        l(2, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void o(String str, Object... objArr) {
        l(5, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void p(Throwable th, String str, Object... objArr) {
        l(5, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void q(String str, Object... objArr) {
        l(7, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void r(Throwable th, String str, Object... objArr) {
        l(7, th, str, Arrays.copyOf(objArr, objArr.length));
    }
}
