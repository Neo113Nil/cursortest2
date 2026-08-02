package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* loaded from: classes10.dex */
public final class nu3 implements z00 {
    public final NativeAdEventListener a;

    public nu3(NativeAdEventListener nativeAdEventListener) {
        this.a = nativeAdEventListener;
    }

    @Override // yads.z00
    public final void a(j5 j5Var) {
        new CallbackStackTraceMarker(new ku3(this, j5Var != null ? new ps3(j5Var) : null));
    }

    @Override // yads.z00
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new ju3(this));
    }

    @Override // yads.z00
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new lu3(this));
    }

    @Override // yads.z00
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new mu3(this));
    }

    @Override // yads.z00
    public final void closeNativeAd() {
    }
}
