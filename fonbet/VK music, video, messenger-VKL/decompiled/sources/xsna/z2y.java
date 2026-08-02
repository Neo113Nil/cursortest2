package xsna;

import android.webkit.JavascriptInterface;

/* compiled from: JsClientInfoBridge.kt */
/* loaded from: classes6.dex */
public interface z2y {
    @JavascriptInterface
    void VKWebAppGetEmail(String str);

    @JavascriptInterface
    void VKWebAppGetPhoneNumber(String str);

    @JavascriptInterface
    void VKWebAppGetUserInfo(String str);

    @JavascriptInterface
    void VKWebAppStorageGet(String str);

    @JavascriptInterface
    void VKWebAppStorageSet(String str);
}
