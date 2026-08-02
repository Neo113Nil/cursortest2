package xsna;

import android.webkit.JavascriptInterface;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;

/* compiled from: InternalWebBridge.kt */
/* loaded from: classes7.dex */
public class onx extends r6y implements g8y, e8y {
    public final pnx d0;
    public final com.vk.webapp.bridges.features.audio.b e0;
    public final dv3 f0;
    public final qgx0 g0;
    public mgx0 h0;

    public onx(fvv0 fvv0Var, pnx pnxVar) {
        super(fvv0Var);
        this.d0 = pnxVar;
        this.e0 = new com.vk.webapp.bridges.features.audio.b(this);
        this.f0 = new dv3(this);
        this.g0 = new qgx0(this, fvv0Var, pnxVar);
        this.h0 = new mgx0(this, pnxVar);
    }

    @Override // xsna.x6y
    public final void P(VkAlertData vkAlertData, SuperappUiRouterBridge.d dVar) {
        this.d0.c(vkAlertData, dVar);
    }

    @Override // xsna.g8y
    @JavascriptInterface
    public void VKWebAppAlert(String str) {
        J().VKWebAppAlert(str);
    }

    @Override // xsna.g8y, xsna.c8y
    @JavascriptInterface
    public void VKWebAppAudioGetStatus(String str) {
        super.VKWebAppAudioGetStatus(str);
    }

    @Override // xsna.g8y, xsna.c8y
    @JavascriptInterface
    public void VKWebAppAudioPause(String str) {
        super.VKWebAppAudioPause(str);
    }

    @Override // xsna.g8y, xsna.c8y
    @JavascriptInterface
    public void VKWebAppAudioPlay(String str) {
        super.VKWebAppAudioPlay(str);
    }

    @Override // xsna.g8y, xsna.c8y
    @JavascriptInterface
    public void VKWebAppAudioSetPosition(String str) {
        super.VKWebAppAudioSetPosition(str);
    }

    @Override // xsna.g8y, xsna.c8y
    @JavascriptInterface
    public void VKWebAppAudioStop(String str) {
        super.VKWebAppAudioStop(str);
    }

    @Override // xsna.g8y, xsna.c8y
    @JavascriptInterface
    public void VKWebAppAudioUnpause(String str) {
        super.VKWebAppAudioUnpause(str);
    }

    @Override // xsna.g8y
    @JavascriptInterface
    public void VKWebAppChangePassword(String str) {
        super.VKWebAppChangePassword(str);
    }

    @Override // xsna.e8y
    @JavascriptInterface
    public void VKWebAppDonutSubscriptionPaid(String str) {
        super.VKWebAppDonutSubscriptionPaid(str);
    }

    @Override // xsna.g8y
    @JavascriptInterface
    public void VKWebAppFriendsSearch(String str) {
        super.VKWebAppFriendsSearch(str);
    }

    @Override // xsna.g8y
    @JavascriptInterface
    public void VKWebAppGetClientLogs(String str) {
        super.VKWebAppGetClientLogs(str);
    }

    @Override // xsna.g8y
    @JavascriptInterface
    public void VKWebAppGetClientLogsAvailability(String str) {
        super.VKWebAppGetClientLogsAvailability(str);
    }

    @Override // xsna.g8y, xsna.f8y
    @JavascriptInterface
    public void VKWebAppGroupCreated(String str) {
        super.VKWebAppGroupCreated(str);
    }

    @Override // xsna.g8y, xsna.f8y
    @JavascriptInterface
    public void VKWebAppGroupInviteLinkCreated(String str) {
        super.VKWebAppGroupInviteLinkCreated(str);
    }

    @Override // xsna.g8y, xsna.f8y
    @JavascriptInterface
    public void VKWebAppGroupInviteLinkDeleted(String str) {
        super.VKWebAppGroupInviteLinkDeleted(str);
    }

    @Override // xsna.g8y
    @JavascriptInterface
    public void VKWebAppInstallBundle(String str) {
        super.VKWebAppInstallBundle(str);
    }

    @Override // xsna.g8y
    @JavascriptInterface
    public void VKWebAppLogout(String str) {
        super.VKWebAppLogout(str);
    }

    @Override // xsna.g8y
    @JavascriptInterface
    public void VKWebAppMarketItemEdit(String str) {
        super.VKWebAppMarketItemEdit(str);
    }

    @Override // xsna.g8y, xsna.f8y
    @JavascriptInterface
    public void VKWebAppOpenInviteFriendsModal(String str) {
        super.VKWebAppOpenInviteFriendsModal(str);
    }

    @Override // xsna.g8y
    @JavascriptInterface
    public void VKWebAppOpenLiveCoverCamera(String str) {
        super.VKWebAppOpenLiveCoverCamera(str);
    }

    @Override // xsna.g8y
    @JavascriptInterface
    public void VKWebAppOpenP2P(String str) {
        super.VKWebAppOpenP2P(str);
    }

    @Override // xsna.g8y
    @JavascriptInterface
    public void VKWebAppProfileEditSuccess(String str) {
        super.VKWebAppProfileEditSuccess(str);
    }

    @Override // xsna.g8y, xsna.f8y
    @JavascriptInterface
    public void VKWebAppUpdateCommunityPage(String str) {
        super.VKWebAppUpdateCommunityPage(str);
    }

    @Override // xsna.g8y
    @JavascriptInterface
    public void VKWebAppUpdatePostPromotionStatus(String str) {
        super.VKWebAppUpdatePostPromotionStatus(str);
    }

    @Override // xsna.e8y
    public final dv3 a() {
        return this.f0;
    }

    @Override // xsna.c8y
    public final com.vk.webapp.bridges.features.audio.b d() {
        return this.e0;
    }

    public qju f() {
        return this.h0;
    }

    @Override // xsna.g8y
    public final qgx0 g() {
        return this.g0;
    }
}
