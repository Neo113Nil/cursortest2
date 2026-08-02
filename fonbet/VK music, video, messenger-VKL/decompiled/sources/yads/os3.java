package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener;

/* loaded from: classes10.dex */
public final class os3 implements z00 {
    public final ClosableNativeAdEventListener a;

    public os3(ClosableNativeAdEventListener closableNativeAdEventListener) {
        this.a = closableNativeAdEventListener;
    }

    @Override // yads.z00
    public final void a(j5 j5Var) {
        new CallbackStackTraceMarker(new ls3(this, j5Var != null ? new ps3(j5Var) : null));
    }

    @Override // yads.z00
    public final void closeNativeAd() {
        new CallbackStackTraceMarker(new js3(this));
    }

    @Override // yads.z00
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new ks3(this));
    }

    @Override // yads.z00
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new ms3(this));
    }

    @Override // yads.z00
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new ns3(this));
    }
}
