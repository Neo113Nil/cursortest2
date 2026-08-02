package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;

/* loaded from: classes10.dex */
public final class tu3 implements c10 {
    public final NativeAdLoadListener a;

    public tu3(NativeAdLoadListener nativeAdLoadListener) {
        this.a = nativeAdLoadListener;
    }

    public final void a(x12 x12Var) {
        new CallbackStackTraceMarker(new su3(this, new com.yandex.mobile.ads.nativeads.d(x12Var)));
    }

    public final void a(l4 l4Var) {
        new CallbackStackTraceMarker(new ru3(this, new AdRequestError(l4Var.a, l4Var.c, l4Var.d)));
    }
}
