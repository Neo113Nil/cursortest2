package xsna;

import androidx.compose.animation.core.RepeatMode;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VkShimmerTheme.kt */
/* loaded from: classes17.dex */
public final class ujv0 {
    public static final tjv0 a;
    public static final iyk0 b;

    static {
        yuw a2 = jq2.a(4, 0L, RepeatMode.Restart, new dtp0(600, 800, luo.d));
        long j = l5g.k;
        a = new tjv0(a2, 6, 25.0f, e43.l(new l5g(l5g.c(14, j, 0.55f)), new l5g(l5g.c(14, j, 1.0f)), new l5g(l5g.c(14, j, 0.5f))), e43.l(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), Float.valueOf(0.5f), Float.valueOf(1.0f)), 400);
        b = new iyk0(new qc00(22));
    }
}
