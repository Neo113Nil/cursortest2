package xsna;

import android.webkit.JavascriptInterface;

/* compiled from: JsAdsBridge.kt */
/* loaded from: classes6.dex */
public interface e1y {
    @JavascriptInterface
    void VKWebAppCheckBannerAd(String str);

    @JavascriptInterface
    void VKWebAppCheckNativeAds(String str);

    @JavascriptInterface
    void VKWebAppHideBannerAd(String str);

    @JavascriptInterface
    void VKWebAppShowBannerAd(String str);

    @JavascriptInterface
    void VKWebAppShowNativeAds(String str);
}
