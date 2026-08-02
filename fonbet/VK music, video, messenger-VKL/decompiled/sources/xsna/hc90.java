package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Pair;

/* compiled from: PagerSnapLayoutInfoProvider.kt */
/* loaded from: classes11.dex */
public final class hc90 implements v9k0 {
    public final /* synthetic */ mc90 a;
    public final /* synthetic */ za90 b;
    public final /* synthetic */ gc90 c;

    public hc90(mc90 mc90Var, za90 za90Var, gc90 gc90Var) {
        this.a = mc90Var;
        this.b = za90Var;
        this.c = gc90Var;
    }

    @Override // xsna.v9k0
    public final float a(float f) {
        mc90 mc90Var = this.a;
        x9k0 f2 = mc90Var.n().f();
        List<e990> g = mc90Var.n().g();
        int size = g.size();
        float f3 = Float.POSITIVE_INFINITY;
        float f4 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            e990 e990Var = g.get(i);
            int n = egi.n(mc90Var.n());
            int b = mc90Var.n().b();
            int c = mc90Var.n().c();
            int d = mc90Var.n().d();
            int offset = e990Var.getOffset();
            mc90Var.o();
            float d2 = offset - f2.d(n, d, b, c);
            if (d2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && d2 > f4) {
                f4 = d2;
            }
            if (d2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && d2 < f3) {
                f3 = d2;
            }
        }
        if (f4 == Float.NEGATIVE_INFINITY) {
            f4 = f3;
        }
        if (f3 == Float.POSITIVE_INFINITY) {
            f3 = f4;
        }
        if (!mc90Var.c()) {
            if (a020.u(mc90Var, f)) {
                f4 = 0.0f;
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
            }
        }
        if (!mc90Var.e()) {
            f4 = 0.0f;
            if (!a020.u(mc90Var, f)) {
                f3 = 0.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f4), Float.valueOf(f3));
        float floatValue = ((Number) pair.d()).floatValue();
        float floatValue2 = ((Number) pair.g()).floatValue();
        float floatValue3 = ((Number) this.b.invoke(Float.valueOf(f), Float.valueOf(floatValue), Float.valueOf(floatValue2))).floatValue();
        if (floatValue3 != floatValue && floatValue3 != floatValue2 && floatValue3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            xzw.c("Final Snapping Offset Should Be one of " + floatValue + ", " + floatValue2 + " or 0.0");
        }
        return (floatValue3 == Float.POSITIVE_INFINITY || floatValue3 == Float.NEGATIVE_INFINITY) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : floatValue3;
    }

    @Override // xsna.v9k0
    public final float b(float f, float f2) {
        mc90 mc90Var = this.a;
        int p = ((tb90) ((zak0) mc90Var.m).getValue()).c + mc90Var.p();
        if (p == 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i = f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? mc90Var.e + 1 : mc90Var.e;
        int g = swe0.g(((int) (f2 / p)) + i, 0, mc90Var.o());
        mc90Var.p();
        int i2 = ((tb90) ((zak0) mc90Var.m).getValue()).c;
        long j = i;
        long j2 = this.c.a;
        long j3 = j - j2;
        if (j3 < 0) {
            j3 = 0;
        }
        int i3 = (int) j3;
        long j4 = j + j2;
        if (j4 > 2147483647L) {
            j4 = 2147483647L;
        }
        int abs = Math.abs((swe0.g(swe0.g(g, i3, (int) j4), 0, mc90Var.o()) - i) * p) - p;
        int i4 = abs >= 0 ? abs : 0;
        if (i4 == 0) {
            return i4;
        }
        return Math.signum(f) * i4;
    }
}
