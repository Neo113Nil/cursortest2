package xsna;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import java.util.List;
import xsna.d1y;

/* compiled from: JsAdsDelegate.kt */
/* loaded from: classes6.dex */
public interface f1y extends d1y, npf0 {

    /* compiled from: JsAdsDelegate.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppBannerAdClosedByUser(f1y f1yVar, String str) {
            d1y.a.VKWebAppBannerAdClosedByUser(f1yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppBannerAdUpdated(f1y f1yVar, String str) {
            d1y.a.VKWebAppBannerAdUpdated(f1yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppCheckBannerAd(f1y f1yVar, String str) {
            d1y.a.VKWebAppCheckBannerAd(f1yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppCheckNativeAds(f1y f1yVar, String str) {
            d1y.a.VKWebAppCheckNativeAds(f1yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppHideBannerAd(f1y f1yVar, String str) {
            d1y.a.VKWebAppHideBannerAd(f1yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppShowBannerAd(f1y f1yVar, String str) {
            d1y.a.VKWebAppShowBannerAd(f1yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppShowNativeAds(f1y f1yVar, String str) {
            d1y.a.VKWebAppShowNativeAds(f1yVar, str);
        }
    }

    @Override // xsna.d1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppBannerAdClosedByUser(String str);

    @Override // xsna.d1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppBannerAdUpdated(String str);

    @Override // xsna.d1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppCheckBannerAd(String str);

    @Override // xsna.d1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppCheckNativeAds(String str);

    @Override // xsna.d1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppHideBannerAd(String str);

    @Override // xsna.d1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppShowBannerAd(String str);

    @Override // xsna.d1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppShowNativeAds(String str);

    void a();

    void b(Context context);

    void e(Context context);

    void f();

    void g(aj0 aj0Var, List<? extends AdvertisementType> list, WebAdConfig webAdConfig);

    void i();
}
