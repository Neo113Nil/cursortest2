package xsna;

import androidx.compose.animation.core.RepeatMode;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: Shimmer.kt */
/* loaded from: classes17.dex */
public final class udj0 {
    public static final tjv0 a;

    static {
        tjv0 tjv0Var = ujv0.a;
        yuw yuwVar = new yuw(new dtp0(400, 800, luo.d), RepeatMode.Restart, 0);
        long j = l5g.k;
        a = tjv0.a(tjv0Var, yuwVar, 0, e43.l(new l5g(l5g.c(14, j, 0.55f)), new l5g(l5g.c(14, j, 1.0f)), new l5g(l5g.c(14, j, 0.5f))), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 50);
    }
}
