package xsna;

import android.webkit.JavascriptInterface;

/* compiled from: JsAuthBridge.kt */
/* loaded from: classes6.dex */
public interface y1y {
    @JavascriptInterface
    void VKWebAppAuthByExchangeToken(String str);

    @JavascriptInterface
    void VKWebAppAuthPauseRequests(String str);

    @JavascriptInterface
    void VKWebAppAuthRestore(String str);

    @JavascriptInterface
    void VKWebAppAuthResumeRequests(String str);

    @JavascriptInterface
    void VKWebAppConfirmUserByService(String str);

    @JavascriptInterface
    void VKWebAppForceLogout(String str);

    @JavascriptInterface
    void VKWebAppGetRestoreHash(String str);

    @JavascriptInterface
    void VKWebAppIsMultiaccountAvailable(String str);

    @JavascriptInterface
    void VKWebAppIsPasskeyAvailable(String str);

    @JavascriptInterface
    void VKWebAppOpenMultiaccountSwitcher(String str);

    @JavascriptInterface
    void VKWebAppRegisterPasskey(String str);

    @JavascriptInterface
    void VKWebAppRelatedPinCodeChanged(String str);

    @JavascriptInterface
    void VKWebAppUserDeactivated(String str);

    @JavascriptInterface
    void VKWebAppUsersSearch(String str);

    @JavascriptInterface
    void VKWebAppValidatePhone(String str);
}
