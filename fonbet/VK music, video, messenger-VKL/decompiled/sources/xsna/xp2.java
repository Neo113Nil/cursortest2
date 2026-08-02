package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.dt1;

/* compiled from: AnimationModifier.kt */
/* loaded from: classes11.dex */
public final class xp2 {
    public static final long a;

    static {
        long j = Integer.MIN_VALUE;
        a = (j & 4294967295L) | (j << 32);
    }

    public static q630 a(q630 q630Var, dtp0 dtp0Var, int i) {
        phr phrVar = dtp0Var;
        if ((i & 1) != 0) {
            long j = 1;
            phrVar = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new q9x((j & 4294967295L) | (j << 32)), 1);
        }
        q630 e = rte0.e(q630Var);
        dt1.a.getClass();
        return e.g(new nxj0(phrVar, dt1.a.b));
    }
}
