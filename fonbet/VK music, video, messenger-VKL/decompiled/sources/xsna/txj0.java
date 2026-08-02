package xsna;

import androidx.compose.foundation.layout.Direction;
import com.unity3d.services.UnityAdsConstants;
import xsna.dt1;
import xsna.ty6;

/* compiled from: Size.kt */
/* loaded from: classes11.dex */
public final class txj0 {
    public static final tbr a;
    public static final tbr b;
    public static final tbr c;
    public static final mzx0 d;
    public static final mzx0 e;
    public static final mzx0 f;
    public static final mzx0 g;
    public static final mzx0 h;
    public static final mzx0 i;

    static {
        Direction direction = Direction.Horizontal;
        a = new tbr(direction, 1.0f);
        Direction direction2 = Direction.Vertical;
        b = new tbr(direction2, 1.0f);
        Direction direction3 = Direction.Both;
        c = new tbr(direction3, 1.0f);
        dt1.a.getClass();
        ty6.a aVar = dt1.a.o;
        d = new mzx0(direction, false, new m00(aVar, 8), aVar);
        ty6.a aVar2 = dt1.a.n;
        e = new mzx0(direction, false, new m00(aVar2, 8), aVar2);
        ty6.b bVar = dt1.a.l;
        int i2 = 13;
        f = new mzx0(direction2, false, new w5h(bVar, i2), bVar);
        ty6.b bVar2 = dt1.a.k;
        g = new mzx0(direction2, false, new w5h(bVar2, i2), bVar2);
        ty6 ty6Var = dt1.a.f;
        int i3 = 6;
        h = new mzx0(direction3, false, new yd4(ty6Var, i3), ty6Var);
        ty6 ty6Var2 = dt1.a.b;
        i = new mzx0(direction3, false, new yd4(ty6Var2, i3), ty6Var2);
    }

    public static final q630 A(q630 q630Var, dt1 dt1Var, boolean z) {
        dt1.a.getClass();
        return q630Var.g((!epx.f(dt1Var, dt1.a.f) || z) ? (!epx.f(dt1Var, dt1.a.b) || z) ? new mzx0(Direction.Both, z, new yd4(dt1Var, 6), dt1Var) : i : h);
    }

    public static q630 B(q630 q630Var, dt1 dt1Var, int i2) {
        if ((i2 & 1) != 0) {
            dt1.a.getClass();
            dt1Var = dt1.a.f;
        }
        return A(q630Var, dt1Var, (i2 & 2) == 0);
    }

    public static q630 C(q630 q630Var, dt1.b bVar, int i2) {
        if ((i2 & 1) != 0) {
            dt1.a.getClass();
            bVar = dt1.a.o;
        }
        dt1.a.getClass();
        return q630Var.g(epx.f(bVar, dt1.a.o) ? d : epx.f(bVar, dt1.a.n) ? e : new mzx0(Direction.Horizontal, false, new m00(bVar, 8), bVar));
    }

    public static final q630 a(q630 q630Var, float f2, float f3) {
        return q630Var.g(new y5q0(f2, f3));
    }

    public static /* synthetic */ q630 b(float f2, float f3, int i2, q630 q630Var) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(q630Var, f2, f3);
    }

    public static final q630 c(q630 q630Var, float f2) {
        return q630Var.g(f2 == 1.0f ? b : new tbr(Direction.Vertical, f2));
    }

    public static final q630 d(q630 q630Var, float f2) {
        return q630Var.g(f2 == 1.0f ? c : new tbr(Direction.Both, f2));
    }

    public static final q630 f(q630 q630Var, float f2) {
        return q630Var.g(f2 == 1.0f ? a : new tbr(Direction.Horizontal, f2));
    }

    public static final q630 h(q630 q630Var, float f2) {
        return q630Var.g(new rxj0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, true, a5x.a, 5));
    }

    public static final q630 i(q630 q630Var, float f2, float f3) {
        return q630Var.g(new rxj0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, true, a5x.a, 5));
    }

    public static /* synthetic */ q630 j(float f2, float f3, int i2, q630 q630Var) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return i(q630Var, f2, f3);
    }

    public static final q630 k(q630 q630Var, float f2) {
        return q630Var.g(new rxj0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, false, a5x.a, 5));
    }

    public static q630 l(float f2, float f3, int i2, q630 q630Var) {
        return q630Var.g(new rxj0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (i2 & 1) != 0 ? Float.NaN : f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (i2 & 2) != 0 ? Float.NaN : f3, false, a5x.a, 5));
    }

    public static final q630 m(q630 q630Var, float f2) {
        return q630Var.g(new rxj0(f2, f2, f2, f2, false, a5x.a));
    }

    public static final q630 n(q630 q630Var, float f2, float f3) {
        return q630Var.g(new rxj0(f2, f3, f2, f3, false, a5x.a));
    }

    public static q630 o(q630 q630Var, float f2, float f3, float f4, float f5, int i2) {
        return q630Var.g(new rxj0(f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, false, a5x.a));
    }

    public static final q630 p(q630 q630Var, float f2) {
        return q630Var.g(new rxj0(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, a5x.a, 10));
    }

    public static final q630 q(q630 q630Var, float f2) {
        return q630Var.g(new rxj0(f2, f2, f2, f2, true, a5x.a));
    }

    public static final q630 r(long j, q630 q630Var) {
        return s(q630Var, uco.c(j), uco.b(j));
    }

    public static final q630 s(q630 q630Var, float f2, float f3) {
        return q630Var.g(new rxj0(f2, f3, f2, f3, true, a5x.a));
    }

    public static final q630 t(q630 q630Var, float f2, float f3, float f4, float f5) {
        return q630Var.g(new rxj0(f2, f3, f4, f5, true, a5x.a));
    }

    public static /* synthetic */ q630 u(q630 q630Var, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        if ((i2 & 8) != 0) {
            f5 = Float.NaN;
        }
        return t(q630Var, f2, f3, f4, f5);
    }

    public static final q630 v(q630 q630Var, float f2) {
        return q630Var.g(new rxj0(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, a5x.a, 10));
    }

    public static final q630 w(q630 q630Var, float f2, float f3) {
        return q630Var.g(new rxj0(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, a5x.a, 10));
    }

    public static /* synthetic */ q630 x(float f2, float f3, int i2, q630 q630Var) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return w(q630Var, f2, f3);
    }

    public static final q630 y(q630 q630Var, dt1.c cVar, boolean z) {
        dt1.a.getClass();
        return q630Var.g((!epx.f(cVar, dt1.a.l) || z) ? (!epx.f(cVar, dt1.a.k) || z) ? new mzx0(Direction.Vertical, z, new w5h(cVar, 13), cVar) : g : f);
    }

    public static q630 z(q630 q630Var, dt1.c cVar, int i2) {
        if ((i2 & 1) != 0) {
            dt1.a.getClass();
            cVar = dt1.a.l;
        }
        return y(q630Var, cVar, false);
    }
}
