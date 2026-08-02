package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.animation.core.a;
import androidx.compose.foundation.layout.LayoutOrientation;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes10.dex */
public abstract class id00 {
    public static volatile Handler a;
    public static final oj2 b = new oj2(Float.POSITIVE_INFINITY);
    public static final pj2 c = new pj2(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final qj2 d = new qj2(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final rj2 e = new rj2(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final oj2 f = new oj2(Float.NEGATIVE_INFINITY);
    public static final pj2 g = new pj2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final qj2 h = new qj2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final rj2 i = new rj2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static a a(float f2) {
        return new a(Float.valueOf(f2), gtq0.f, Float.valueOf(0.01f), 8);
    }

    public static final void b(x021 x021Var, tls tlsVar, fid fidVar, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-403078664);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.k(x021Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            afd.a.getClass();
            cx20.a(null, null, null, null, null, false, false, afd.b, wwg.S(46257542, true, new ays0(19, x021Var, tlsVar), btsVar), btsVar, 113246208, HProv.PP_VERSION_TIMESTAMP);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(x021Var, tlsVar, i2, 14);
        }
    }

    public static long c(long j, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return p8e.a(layoutOrientation == layoutOrientation2 ? n8e.k(j) : n8e.j(j), layoutOrientation == layoutOrientation2 ? n8e.i(j) : n8e.h(j), layoutOrientation == layoutOrientation2 ? n8e.j(j) : n8e.k(j), layoutOrientation == layoutOrientation2 ? n8e.h(j) : n8e.i(j));
    }

    public static long d(int i2, long j) {
        return p8e.a(0, n8e.i(j), (i2 & 4) != 0 ? n8e.j(j) : 0, n8e.h(j));
    }

    public static tt e(zm41 zm41Var, UiWebViewConfig uiWebViewConfig, bi41 bi41Var, dp41 dp41Var, to41 to41Var, ms41 ms41Var) {
        zm41Var.getClass();
        uiWebViewConfig.getClass();
        bi41Var.getClass();
        dp41Var.getClass();
        to41Var.getClass();
        ms41Var.getClass();
        tt ttVar = new tt();
        ttVar.a = n3w.a(uiWebViewConfig);
        ttVar.b = new tcg(zm41Var, 2);
        ttVar.c = new tcg(zm41Var, 10);
        ttVar.d = new tcg(zm41Var, 11);
        ttVar.e = n3w.a(bi41Var);
        ttVar.f = i5m.b(new ubq0((tcg) ttVar.b, (tcg) ttVar.c, (tcg) ttVar.d, (n3w) ttVar.e, n3w.a(dp41Var), new tcg(zm41Var, 5), new tcg(zm41Var, 6), 26, false));
        ttVar.g = new tcg(zm41Var, 0);
        ttVar.h = new tcg(zm41Var, 1);
        ttVar.i = new tcg(zm41Var, 4);
        ttVar.j = new tcg(zm41Var, 7);
        ttVar.k = new tcg(zm41Var, 12);
        ttVar.l = new tcg(zm41Var, 3);
        ttVar.m = n3w.a(to41Var);
        ttVar.n = i5m.b(new wi7((n3w) ttVar.a, (xvf0) ttVar.f, (xvf0) ttVar.g, (xvf0) ttVar.h, (xvf0) ttVar.i, (xvf0) ttVar.j, (xvf0) ttVar.k, (xvf0) ttVar.l, (xvf0) ttVar.m, n3w.a(ms41Var), new tcg(zm41Var, 9), new tcg(zm41Var, 8)));
        return ttVar;
    }

    public static Handler f() {
        if (a != null) {
            return a;
        }
        synchronized (id00.class) {
            try {
                if (a == null) {
                    a = Handler.createAsync(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    public static final long g(long j, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? p8e.a(n8e.k(j), n8e.i(j), n8e.j(j), n8e.h(j)) : p8e.a(n8e.j(j), n8e.h(j), n8e.k(j), n8e.i(j));
    }
}
