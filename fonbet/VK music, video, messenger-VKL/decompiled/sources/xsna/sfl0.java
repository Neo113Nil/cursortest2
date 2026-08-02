package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: StickyPlayerColors.kt */
@vby
/* loaded from: classes3.dex */
public final class sfl0 {
    public static final List b = rl3.u0(new Integer[]{-10923181, -13554634, -10922666, -15198443});
    public final List a;

    public /* synthetic */ sfl0(List list) {
        this.a = list;
    }

    public static final long a(List list) {
        if (epx.f(list, b)) {
            return b(f870.d(4280952872L));
        }
        return b(f870.b((l5g.i(f870.c(((Number) list.get(3)).intValue())) * 0.39f) + (l5g.i(f870.c(((Number) list.get(2)).intValue())) * 0.39f) + (l5g.i(f870.c(((Number) list.get(1)).intValue())) * 0.110000014f) + (l5g.i(f870.c(((Number) list.get(0)).intValue())) * 0.110000014f), (l5g.h(f870.c(((Number) list.get(3)).intValue())) * 0.39f) + (l5g.h(f870.c(((Number) list.get(2)).intValue())) * 0.39f) + (l5g.h(f870.c(((Number) list.get(1)).intValue())) * 0.110000014f) + (l5g.h(f870.c(((Number) list.get(0)).intValue())) * 0.110000014f), (l5g.f(f870.c(((Number) list.get(3)).intValue())) * 0.39f) + (l5g.f(f870.c(((Number) list.get(2)).intValue())) * 0.39f) + (l5g.f(f870.c(((Number) list.get(1)).intValue())) * 0.110000014f) + (l5g.f(f870.c(((Number) list.get(0)).intValue())) * 0.110000014f), 1.0f, h8g.e));
    }

    public static long b(long j) {
        long j2 = l5g.b;
        long i = f870.i(l5g.c(14, j2, 0.24f), j);
        float d = tfl0.d(i);
        if (d <= 0.5f) {
            return i;
        }
        float f = 1 - (0.5f / d);
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return f870.i(l5g.c(14, j2, f), i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sfl0) {
            return epx.f(this.a, ((sfl0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return jr.a(')', new StringBuilder("StickyPlayerColors(colors="), this.a);
    }
}
