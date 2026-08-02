package xsna;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.superapp.ads.js.bridge.api.events.CheckBannerAd$Parameters;
import com.vk.superapp.ads.js.bridge.api.events.CheckNativeAds$Parameters;
import com.vk.superapp.ads.js.bridge.api.events.HideBannerAd$Parameters;
import com.vk.superapp.ads.js.bridge.api.events.ShowBannerAd$Parameters;
import com.vk.superapp.ads.js.bridge.api.events.ShowNativeAds$Parameters;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.ReportableStubDelegate;
import java.util.List;
import xsna.f1y;

/* compiled from: JsAdsDelegateStub.kt */
/* loaded from: classes6.dex */
public final class o1y extends ReportableStubDelegate implements f1y {
    public final com.vk.superapp.base.js.bridge.b b;

    public o1y(com.vk.superapp.base.js.bridge.b bVar) {
        this.b = bVar;
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final String B1() {
        return com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
    }

    @Override // xsna.d1y
    public final void F(p2y<CheckNativeAds$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppCheckNativeAds"), p2yVar);
    }

    @Override // xsna.f1y, xsna.d1y
    @JavascriptInterface
    public void VKWebAppBannerAdClosedByUser(String str) {
        f1y.a.VKWebAppBannerAdClosedByUser(this, str);
    }

    @Override // xsna.f1y, xsna.d1y
    @JavascriptInterface
    public void VKWebAppBannerAdUpdated(String str) {
        f1y.a.VKWebAppBannerAdUpdated(this, str);
    }

    @Override // xsna.f1y, xsna.d1y
    @JavascriptInterface
    public void VKWebAppCheckBannerAd(String str) {
        f1y.a.VKWebAppCheckBannerAd(this, str);
    }

    @Override // xsna.f1y, xsna.d1y
    @JavascriptInterface
    public void VKWebAppCheckNativeAds(String str) {
        f1y.a.VKWebAppCheckNativeAds(this, str);
    }

    @Override // xsna.f1y, xsna.d1y
    @JavascriptInterface
    public void VKWebAppHideBannerAd(String str) {
        f1y.a.VKWebAppHideBannerAd(this, str);
    }

    @Override // xsna.f1y, xsna.d1y
    @JavascriptInterface
    public void VKWebAppShowBannerAd(String str) {
        f1y.a.VKWebAppShowBannerAd(this, str);
    }

    @Override // xsna.f1y, xsna.d1y
    @JavascriptInterface
    public void VKWebAppShowNativeAds(String str) {
        f1y.a.VKWebAppShowNativeAds(this, str);
    }

    @Override // xsna.d1y
    public final void d1(p2y<CheckBannerAd$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppCheckBannerAd"), p2yVar);
    }

    @Override // xsna.d1y
    public final void j1(p2y<ShowNativeAds$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppShowNativeAds"), p2yVar);
    }

    @Override // xsna.d1y
    public final void k(p2y<ShowBannerAd$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppShowBannerAd"), p2yVar);
    }

    @Override // xsna.d1y
    public final void w1(p2y<HideBannerAd$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppHideBannerAd"), p2yVar);
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final com.vk.superapp.base.js.bridge.b z1() {
        return this.b;
    }

    @Override // xsna.f1y
    public final void a() {
    }

    @Override // xsna.f1y
    public final void f() {
    }

    @Override // xsna.f1y
    public final void i() {
    }

    @Override // xsna.npf0
    public final void release() {
    }

    @Override // xsna.f1y
    public final void b(Context context) {
    }

    @Override // xsna.f1y
    public final void e(Context context) {
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
    }

    @Override // xsna.f1y
    public final void g(aj0 aj0Var, List<? extends AdvertisementType> list, WebAdConfig webAdConfig) {
    }
}
