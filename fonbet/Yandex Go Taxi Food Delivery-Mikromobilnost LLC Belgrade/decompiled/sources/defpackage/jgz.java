package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ru.yandex.taxi.logistics.sdk.logger.Logger$Severity;

/* loaded from: classes9.dex */
public final class jgz {
    public static final jgz a = new jgz();
    public static final ArrayList b = new ArrayList();
    public static final ThreadLocal c = new ThreadLocal();
    public static yfz d = (dgz) fgz.a.getValue();
    public static final String e = "Dlvr";

    public static void a(String str, Object... objArr) {
        if (objArr.length != 0) {
            if (str != null) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            } else {
                str = null;
            }
        }
        g(Logger$Severity.DEBUG, e(), str, null, 8);
    }

    public static void b(String str, Object... objArr) {
        if (objArr.length != 0) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            str = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
        }
        g(Logger$Severity.ERROR, e(), str, null, 8);
    }

    public static void c(Throwable th) {
        g(Logger$Severity.ERROR, e(), null, th, 4);
    }

    public static void d(Throwable th, String str, Object... objArr) {
        if (objArr.length != 0) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            str = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
        }
        Logger$Severity logger$Severity = Logger$Severity.ERROR;
        String e2 = e();
        d.a(logger$Severity, e2, str, th);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            ((bez) it.next()).a(logger$Severity, e2, str, th);
        }
    }

    public static String e() {
        ThreadLocal threadLocal = c;
        String str = (String) threadLocal.get();
        if (str == null) {
            return e;
        }
        threadLocal.remove();
        return str;
    }

    public static void f(String str, Object... objArr) {
        if (objArr.length != 0) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            str = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
        }
        g(Logger$Severity.INFO, e(), str, null, 8);
    }

    public static void g(Logger$Severity logger$Severity, String str, String str2, Throwable th, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            th = null;
        }
        d.a(logger$Severity, str, str2, th);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            ((bez) it.next()).a(logger$Severity, str, str2, th);
        }
    }

    public final void h(String str) {
        c.set("Dlvr_".concat(str));
    }
}
