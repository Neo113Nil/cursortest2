package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: VKRipple.kt */
/* loaded from: classes17.dex */
public final class qer0 {
    public static final iyk0 a = new iyk0(new c6(29));
    public static final ykg0 b = new ykg0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public static final mlg0 c;
    public static final mlg0 d;

    static {
        long j = l5g.k;
        c = new mlg0(j, Float.NaN, true);
        d = new mlg0(j, Float.NaN, false);
    }

    public static mlg0 a(float f, int i, long j, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            j = l5g.k;
        }
        return (pco.b(f, Float.NaN) && l5g.d(j, l5g.k)) ? z ? c : d : new mlg0(j, f, z);
    }
}
