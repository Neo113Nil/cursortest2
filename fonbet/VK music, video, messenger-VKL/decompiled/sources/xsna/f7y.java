package xsna;

import android.webkit.JavascriptInterface;

/* compiled from: JsVkConnectBridge.kt */
/* loaded from: classes6.dex */
public interface f7y {
    @JavascriptInterface
    void VKWebAppGetAuthToken(String str);

    @JavascriptInterface
    void VKWebAppGetSilentToken(String str);

    @JavascriptInterface
    void VKWebAppOAuthActivate(String str);

    @JavascriptInterface
    void VKWebAppOAuthDeactivate(String str);
}
