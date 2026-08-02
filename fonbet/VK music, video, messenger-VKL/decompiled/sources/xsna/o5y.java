package xsna;

import android.webkit.JavascriptInterface;

/* compiled from: JsNavigationBridge.kt */
/* loaded from: classes6.dex */
public interface o5y {
    @JavascriptInterface
    void VKWebAppOpenCodeReader(String str);

    @JavascriptInterface
    void VKWebAppOpenContacts(String str);

    @JavascriptInterface
    void VKWebAppOpenExternalLink(String str);

    @JavascriptInterface
    void VKWebAppOpenPackage(String str);

    @JavascriptInterface
    void VKWebAppShare(String str);

    @JavascriptInterface
    void VKWebAppShowImages(String str);

    @JavascriptInterface
    void VKWebAppShowQR(String str);
}
