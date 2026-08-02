package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: OneVideoPlayerFactory.kt */
/* loaded from: classes3.dex */
public final class sm80 {
    public static final xgp0 a() {
        dhp0 b = com.vk.toggle.d.s.b();
        xgp0 a = xgp0.a(xgp0.j, 0L, 0L, 0L, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 383);
        return b != null ? xgp0.a(a, b.a, b.b, b.c, b.d, b.e, b.f, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) : a;
    }
}
