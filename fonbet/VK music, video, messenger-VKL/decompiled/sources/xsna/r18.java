package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: Border.kt */
/* loaded from: classes11.dex */
public final class r18 {
    public static final q630 a(float f, long j, q630 q630Var, r5j0 r5j0Var) {
        return b(f, new rek0(j), q630Var, r5j0Var);
    }

    public static final q630 b(float f, yk8 yk8Var, q630 q630Var, r5j0 r5j0Var) {
        return q630Var.g(new v18(f, yk8Var, r5j0Var));
    }

    public static final long c(float f, long j) {
        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (j >> 32)) - f);
        float max2 = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }
}
