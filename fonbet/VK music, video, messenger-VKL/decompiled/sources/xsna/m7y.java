package xsna;

import android.webkit.JavascriptInterface;

/* compiled from: JsVkPayBridge.kt */
/* loaded from: classes6.dex */
public interface m7y {
    @JavascriptInterface
    void VKWebAppAddCard(String str);

    @JavascriptInterface
    void VKWebAppCanAddVirtualCard(String str);

    @JavascriptInterface
    void VKWebAppGetMyTrackerId(String str);

    @JavascriptInterface
    void VKWebAppOpenPayForm(String str);

    @JavascriptInterface
    void VKWebAppSecureTokenGet(String str);

    @JavascriptInterface
    void VKWebAppSecureTokenGetInfo(String str);

    @JavascriptInterface
    void VKWebAppSecureTokenRemove(String str);

    @JavascriptInterface
    void VKWebAppSecureTokenRequestAccess(String str);

    @JavascriptInterface
    void VKWebAppSecureTokenSet(String str);
}
