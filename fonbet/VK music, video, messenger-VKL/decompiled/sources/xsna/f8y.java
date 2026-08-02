package xsna;

import android.webkit.JavascriptInterface;

/* compiled from: JsWebGroupBridge.kt */
/* loaded from: classes6.dex */
public interface f8y {
    @JavascriptInterface
    default void VKWebAppGroupCreated(String str) {
        f().d(str);
    }

    @JavascriptInterface
    default void VKWebAppGroupInviteLinkCreated(String str) {
        f().a(str);
    }

    @JavascriptInterface
    default void VKWebAppGroupInviteLinkDeleted(String str) {
        f().e(str);
    }

    @JavascriptInterface
    default void VKWebAppOpenInviteFriendsModal(String str) {
        f().b(str);
    }

    @JavascriptInterface
    default void VKWebAppUpdateCommunityPage(String str) {
        f().c(str);
    }

    qju f();
}
