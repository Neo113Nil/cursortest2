package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;

/* loaded from: classes10.dex */
public final class is3 implements h00 {
    public final ClosableBannerAdEventListener a;

    public is3(ClosableBannerAdEventListener closableBannerAdEventListener) {
        this.a = closableBannerAdEventListener;
    }

    @Override // yads.h00
    public final void a(j5 j5Var) {
        new CallbackStackTraceMarker(new fs3(this, j5Var != null ? new ps3(j5Var) : null));
    }

    @Override // yads.h00
    public final void closeBannerAd() {
        new CallbackStackTraceMarker(new bs3(this));
    }

    @Override // yads.h00
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new cs3(this));
    }

    @Override // yads.h00
    public final void onAdLoaded() {
        new CallbackStackTraceMarker(new es3(this));
    }

    @Override // yads.h00
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new gs3(this));
    }

    @Override // yads.h00
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new hs3(this));
    }

    @Override // yads.h00
    public final void a(l4 l4Var) {
        new CallbackStackTraceMarker(new ds3(this, new AdRequestError(l4Var.a, l4Var.c, l4Var.d)));
    }
}
