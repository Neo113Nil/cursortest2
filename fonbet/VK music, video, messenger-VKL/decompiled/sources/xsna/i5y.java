package xsna;

import android.webkit.JavascriptInterface;

/* compiled from: JsLocationInfoBridge.kt */
/* loaded from: classes6.dex */
public interface i5y {
    @JavascriptInterface
    void VKWebAppGetGeodata(String str);

    @JavascriptInterface
    void VKWebAppGetGeodataPermission(String str);

    @JavascriptInterface
    void VKWebAppSetLocation(String str);
}
