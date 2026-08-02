package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: AuthorHeaderMediaPagerState.kt */
/* loaded from: classes5.dex */
public final class ja5 {
    public final wh50 a;

    public ja5() {
        this(0, 0);
    }

    public final la5 a() {
        return (la5) ((zak0) this.a).getValue();
    }

    public ja5(int i, int i2) {
        this.a = androidx.compose.runtime.k.b(new la5(i2, i < 0 ? 0 : i, i < 0 ? 0 : i, swe0.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)));
    }
}
