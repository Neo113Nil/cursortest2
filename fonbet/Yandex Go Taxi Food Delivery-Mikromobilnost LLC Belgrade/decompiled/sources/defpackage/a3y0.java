package defpackage;

import java.util.Arrays;
import kotlinx.serialization.SerializationException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class a3y0 {
    public final String a;
    public final String b;

    public a3y0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static void a(a3y0 a3y0Var, String[] strArr, ljk0 ljk0Var, int i) {
        a3y0Var.getClass();
        h(strArr);
        hst hstVar = jst.e;
    }

    public static /* synthetic */ void d(a3y0 a3y0Var, String str, Throwable th, sls slsVar, int i) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            slsVar = null;
        }
        a3y0Var.b(str, th, slsVar);
    }

    public static /* synthetic */ void e(a3y0 a3y0Var, String[] strArr, Throwable th, sls slsVar, int i) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            slsVar = null;
        }
        a3y0Var.c(strArr, th, slsVar);
    }

    public static String h(String[] strArr) {
        return strArr.length == 0 ? "" : j73.L(strArr, Extension.DOT_CHAR, Extension.DOT_CHAR, null, 60);
    }

    public static /* synthetic */ void k(a3y0 a3y0Var, SerializationException serializationException, sls slsVar, int i) {
        if ((i & 2) != 0) {
            serializationException = null;
        }
        a3y0Var.i(null, serializationException, slsVar);
    }

    public static void m(a3y0 a3y0Var, String str, Throwable th, fck0 fck0Var, int i) {
        Throwable th2 = (i & 2) != 0 ? null : th;
        if ((i & 4) != 0) {
            fck0Var = null;
        }
        String l = a3y0Var.l(new String[]{str});
        if (fck0Var == null) {
            xby.y(jst.e, l, a3y0Var.a, th2, null, 8);
            return;
        }
        hst hstVar = jst.e;
        String str2 = a3y0Var.a;
        ist m = hstVar.m(l);
        ke00 a = m.b.a();
        if (a == null || !a.b(20)) {
            return;
        }
        a.a(20, str2, th2, (String) fck0Var.invoke(), m.a);
    }

    public final void b(String str, Throwable th, sls slsVar) {
        c(new String[]{str}, th, slsVar);
    }

    public final void c(String[] strArr, Throwable th, sls slsVar) {
        String l = l(strArr);
        if (slsVar == null) {
            xby.l(jst.e, l, this.a, th, null, 8);
            return;
        }
        ist m = jst.e.m(l);
        ke00 a = m.b.a();
        if (a == null || !a.b(15)) {
            return;
        }
        a.a(15, this.a, th, (String) slsVar.invoke(), m.a);
    }

    public final void f(sls slsVar, String str) {
        g(new String[]{str}, null, slsVar);
    }

    public final void g(String[] strArr, Throwable th, sls slsVar) {
        String h = h(strArr);
        hst hstVar = jst.e;
        ke00 a = hstVar.b.a();
        if (a == null || !a.b(10)) {
            return;
        }
        String str = slsVar != null ? (String) slsVar.invoke() : null;
        if (str == null) {
            str = "";
        }
        a.a(10, this.a, th, evu0.k0("[" + this.b + h + "] " + str).toString(), hstVar.a);
    }

    public final void i(String str, Throwable th, sls slsVar) {
        String[] strArr = (String[]) scc.h(str).toArray(new String[0]);
        j((String[]) Arrays.copyOf(strArr, strArr.length), th, slsVar);
    }

    public final void j(String[] strArr, Throwable th, sls slsVar) {
        String l = l(strArr);
        hst hstVar = jst.e;
        hstVar.getClass();
        ist m = hstVar.m(l);
        ke00 a = m.b.a();
        if (a == null || !a.b(15)) {
            return;
        }
        a.a(15, this.a, th, (String) slsVar.invoke(), m.a);
    }

    public final String l(String[] strArr) {
        return this.a + Extension.DOT_CHAR + this.b + h(strArr);
    }
}
