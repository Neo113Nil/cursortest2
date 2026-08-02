package defpackage;

import android.graphics.drawable.Drawable;
import android.webkit.WebView;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.lang.reflect.InvocationHandler;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class im91 {
    public static final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-472309293);
        if (btsVar.V(i & 1, i != 0)) {
            o9d.a.getClass();
            ydb1.a(null, o9d.c, o9d.d, null, null, null, null, false, btsVar, 432, 249);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vu30(i, 3);
        }
    }

    public static final void b(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1217259654);
        if (btsVar.V(i & 1, i != 0)) {
            o9d.a.getClass();
            ydb1.a(null, null, o9d.b, null, null, null, null, false, btsVar, 384, 251);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vu30(i, 4);
        }
    }

    public static final void c(l940 l940Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(114469944);
        int i2 = (btsVar.k(l940Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            crb1.c(null, wwg.S(-1824425207, true, new sg0(23, tlsVar), btsVar), null, wwg.S(1065350411, true, new sc20(13, l940Var), btsVar), null, null, null, btsVar, 3120, HProv.PP_NK_SYNC);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z740(l940Var, tlsVar, i, i3);
        }
    }

    public static final void d(l940 l940Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1913569793);
        dmw0 dmw0Var = btsVar.a;
        int i3 = (btsVar.k(l940Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            f530 d = i9a1.d(i9a1.f(ljs0.c));
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, d);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            c(l940Var, tlsVar, btsVar, i3 & HProv.PP_DELETE_SAVED_PASSWD);
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            c530 c530Var = c530.a;
            f530 d3 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d3);
            com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(an91.o(c530Var, 24.0f, 8.0f, 24.0f, 0.0f, 8), 1.0f), 454.0f), cyk0.c(32.0f), false, null, null, null, false, btsVar, 0, 252);
            oeb1.c(btsVar, ljs0.e(c530Var, 36.0f));
            i2 = 0;
            b(btsVar, 0);
            btsVar.e0(-244997054);
            for (int i4 = 0; i4 < 4; i4++) {
                a(btsVar, 0);
            }
            tse0.t(btsVar, false, true, true);
        } else {
            i2 = 0;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z740(l940Var, tlsVar, i, i2);
        }
    }

    public static InvocationHandler f() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, WebView.getWebViewClassLoader()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static os41 g() {
        return nq41.a;
    }

    public static int h(Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static boolean i(Drawable drawable, int i) {
        return drawable.setLayoutDirection(i);
    }
}
