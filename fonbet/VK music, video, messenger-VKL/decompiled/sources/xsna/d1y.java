package xsna;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.vk.superapp.ads.js.bridge.api.events.CheckBannerAd$Parameters;
import com.vk.superapp.ads.js.bridge.api.events.CheckNativeAds$Parameters;
import com.vk.superapp.ads.js.bridge.api.events.HideBannerAd$Parameters;
import com.vk.superapp.ads.js.bridge.api.events.ShowBannerAd$Parameters;
import com.vk.superapp.ads.js.bridge.api.events.ShowNativeAds$Parameters;
import xsna.p2y;

/* compiled from: JsAdsBridge.kt */
/* loaded from: classes6.dex */
public interface d1y {
    void F(p2y<CheckNativeAds$Parameters> p2yVar);

    @JavascriptInterface
    void VKWebAppBannerAdClosedByUser(String str);

    @JavascriptInterface
    void VKWebAppBannerAdUpdated(String str);

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

    void d1(p2y<CheckBannerAd$Parameters> p2yVar);

    void j1(p2y<ShowNativeAds$Parameters> p2yVar);

    void k(p2y<ShowBannerAd$Parameters> p2yVar);

    void w1(p2y<HideBannerAd$Parameters> p2yVar);

    /* compiled from: JsAdsBridge.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppCheckBannerAd(d1y d1yVar, String str) {
            try {
                CheckBannerAd$Parameters a = CheckBannerAd$Parameters.a((CheckBannerAd$Parameters) new Gson().fromJson(str, CheckBannerAd$Parameters.class));
                CheckBannerAd$Parameters.b(a);
                d1yVar.d1(new p2y<>(a, str));
            } catch (Exception e) {
                d1yVar.d1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppCheckNativeAds(d1y d1yVar, String str) {
            try {
                CheckNativeAds$Parameters a = CheckNativeAds$Parameters.a((CheckNativeAds$Parameters) new Gson().fromJson(str, CheckNativeAds$Parameters.class));
                CheckNativeAds$Parameters.b(a);
                d1yVar.F(new p2y<>(a, str));
            } catch (Exception e) {
                d1yVar.F(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppHideBannerAd(d1y d1yVar, String str) {
            try {
                HideBannerAd$Parameters a = HideBannerAd$Parameters.a((HideBannerAd$Parameters) new Gson().fromJson(str, HideBannerAd$Parameters.class));
                HideBannerAd$Parameters.b(a);
                d1yVar.w1(new p2y<>(a, str));
            } catch (Exception e) {
                d1yVar.w1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppShowBannerAd(d1y d1yVar, String str) {
            try {
                ShowBannerAd$Parameters a = ShowBannerAd$Parameters.a((ShowBannerAd$Parameters) new Gson().fromJson(str, ShowBannerAd$Parameters.class));
                ShowBannerAd$Parameters.b(a);
                d1yVar.k(new p2y<>(a, str));
            } catch (Exception e) {
                d1yVar.k(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppShowNativeAds(d1y d1yVar, String str) {
            try {
                ShowNativeAds$Parameters a = ShowNativeAds$Parameters.a((ShowNativeAds$Parameters) new Gson().fromJson(str, ShowNativeAds$Parameters.class));
                ShowNativeAds$Parameters.b(a);
                d1yVar.j1(new p2y<>(a, str));
            } catch (Exception e) {
                d1yVar.j1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppBannerAdClosedByUser(d1y d1yVar, String str) {
        }

        @JavascriptInterface
        public static void VKWebAppBannerAdUpdated(d1y d1yVar, String str) {
        }
    }
}
