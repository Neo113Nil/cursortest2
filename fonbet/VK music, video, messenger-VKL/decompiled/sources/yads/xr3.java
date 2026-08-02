package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;

/* loaded from: classes10.dex */
public final class xr3 implements h00 {
    public final BannerAdEventListener a;

    public xr3(BannerAdEventListener bannerAdEventListener) {
        this.a = bannerAdEventListener;
    }

    @Override // yads.h00
    public final void a(j5 j5Var) {
        new CallbackStackTraceMarker(new ur3(this, j5Var != null ? new ps3(j5Var) : null));
    }

    @Override // yads.h00
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new rr3(this));
    }

    @Override // yads.h00
    public final void onAdLoaded() {
        new CallbackStackTraceMarker(new tr3(this));
    }

    @Override // yads.h00
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new vr3(this));
    }

    @Override // yads.h00
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new wr3(this));
    }

    @Override // yads.h00
    public final void a(l4 l4Var) {
        new CallbackStackTraceMarker(new sr3(this, new AdRequestError(l4Var.a, l4Var.c, l4Var.d)));
    }

    @Override // yads.h00
    public final void closeBannerAd() {
    }
}
