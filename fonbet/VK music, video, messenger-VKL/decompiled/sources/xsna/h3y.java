package xsna;

import android.webkit.JavascriptInterface;

/* compiled from: JsCommunityBridge.kt */
/* loaded from: classes6.dex */
public interface h3y {
    @JavascriptInterface
    void VKWebAppAddToCommunity(String str);

    @JavascriptInterface
    void VKWebAppAllowMessagesFromGroup(String str);

    @JavascriptInterface
    void VKWebAppAllowNotifications(String str);

    @JavascriptInterface
    void VKWebAppDenyNotifications(String str);

    @JavascriptInterface
    void VKWebAppGetCommunityAuthToken(String str);

    @JavascriptInterface
    void VKWebAppGetCommunityToken(String str);

    @JavascriptInterface
    void VKWebAppGetGroupInfo(String str);

    @JavascriptInterface
    void VKWebAppJoinGroup(String str);

    @JavascriptInterface
    void VKWebAppLeaveGroup(String str);

    @JavascriptInterface
    void VKWebAppSendPayload(String str);

    @JavascriptInterface
    void VKWebAppShowCommunityWidgetPreviewBox(String str);

    @JavascriptInterface
    void VKWebAppShowWallPostBox(String str);
}
