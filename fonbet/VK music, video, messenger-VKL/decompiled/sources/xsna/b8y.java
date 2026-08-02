package xsna;

import android.webkit.JavascriptInterface;
import com.vk.superapp.base.js.bridge.ReportableStubDelegate;
import com.vk.superapp.vkclient.js.bridge.api.events.AddToCommunity$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.AddToFavorites$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.AllowMessagesFromGroup$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.AllowNotifications$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.AudioPaused$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.AudioStopped$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.AudioTrackChanged$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.AudioUnpaused$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.DenyNotifications$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.DonutSubscriptionPaid$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.FriendsSearch$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.GetClientLogs$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.GetClientLogsAvailability$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.GetFriends$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.GetGroupInfo$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.GroupCreated$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.InstallBundle$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.JoinGroup$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.LeaveGroup$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.Logout$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.OpenLiveCoverCamera$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.OpenP2P$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowCommunityWidgetPreviewBox$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowGoodOrderBox$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowInviteBox$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowNewPostBox$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowOrderBox$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowStoryBox$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowSubscriptionBox$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowWallPostBox$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.StoreRateDialog$Parameters;
import xsna.s7y;

/* compiled from: JsVkclientDelegateStub.kt */
/* loaded from: classes6.dex */
public final class b8y extends ReportableStubDelegate implements s7y {
    public final com.vk.superapp.base.js.bridge.b b;

    public b8y(com.vk.superapp.base.js.bridge.b bVar) {
        this.b = bVar;
    }

    @Override // xsna.r7y
    public final void A(p2y<GetFriends$Parameters> p2yVar) {
        lq.b("VKWebAppGetFriends", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void A0(p2y<GroupCreated$Parameters> p2yVar) {
        lq.b("VKWebAppGroupCreated", this, p2yVar);
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final String B1() {
        return "vkclient";
    }

    @Override // xsna.r7y
    public final void G0(p2y<GetClientLogsAvailability$Parameters> p2yVar) {
        lq.b("VKWebAppGetClientLogsAvailability", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void H0(p2y<AudioUnpaused$Parameters> p2yVar) {
        lq.b("VKWebAppAudioUnpaused", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void I0(p2y<DonutSubscriptionPaid$Parameters> p2yVar) {
        lq.b("VKWebAppDonutSubscriptionPaid", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void J(p2y<StoreRateDialog$Parameters> p2yVar) {
        lq.b("VKWebAppStoreRateDialog", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void K0(p2y<InstallBundle$Parameters> p2yVar) {
        lq.b("VKWebAppInstallBundle", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void Q(p2y<DenyNotifications$Parameters> p2yVar) {
        lq.b("VKWebAppDenyNotifications", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void Q0(p2y<OpenP2P$Parameters> p2yVar) {
        lq.b("VKWebAppOpenP2P", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void T0(p2y<AudioPaused$Parameters> p2yVar) {
        lq.b("VKWebAppAudioPaused", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void U(p2y<LeaveGroup$Parameters> p2yVar) {
        lq.b("VKWebAppLeaveGroup", this, p2yVar);
    }

    @Override // xsna.s7y
    public final void V(String str) {
        C1("handleStoryBoxFailed(desc=" + str + ')');
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppAddToCommunity(String str) {
        s7y.a.VKWebAppAddToCommunity(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppAddToFavorites(String str) {
        s7y.a.VKWebAppAddToFavorites(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppAllowMessagesFromGroup(String str) {
        s7y.a.VKWebAppAllowMessagesFromGroup(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppAllowNotifications(String str) {
        s7y.a.VKWebAppAllowNotifications(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppAudioPaused(String str) {
        s7y.a.VKWebAppAudioPaused(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppAudioStopped(String str) {
        s7y.a.VKWebAppAudioStopped(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppAudioTrackChanged(String str) {
        s7y.a.VKWebAppAudioTrackChanged(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppAudioUnpaused(String str) {
        s7y.a.VKWebAppAudioUnpaused(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppDenyNotifications(String str) {
        s7y.a.VKWebAppDenyNotifications(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppDonutSubscriptionPaid(String str) {
        s7y.a.VKWebAppDonutSubscriptionPaid(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppFriendsSearch(String str) {
        s7y.a.VKWebAppFriendsSearch(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppGetClientLogs(String str) {
        s7y.a.VKWebAppGetClientLogs(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppGetClientLogsAvailability(String str) {
        s7y.a.VKWebAppGetClientLogsAvailability(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppGetFriends(String str) {
        s7y.a.VKWebAppGetFriends(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppGetGroupInfo(String str) {
        s7y.a.VKWebAppGetGroupInfo(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppGroupCreated(String str) {
        s7y.a.VKWebAppGroupCreated(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppInstallBundle(String str) {
        s7y.a.VKWebAppInstallBundle(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppJoinGroup(String str) {
        s7y.a.VKWebAppJoinGroup(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppLeaveGroup(String str) {
        s7y.a.VKWebAppLeaveGroup(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppLogout(String str) {
        s7y.a.VKWebAppLogout(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppOpenLiveCoverCamera(String str) {
        s7y.a.VKWebAppOpenLiveCoverCamera(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppOpenP2P(String str) {
        s7y.a.VKWebAppOpenP2P(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppShowCommunityWidgetPreviewBox(String str) {
        s7y.a.VKWebAppShowCommunityWidgetPreviewBox(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppShowGoodOrderBox(String str) {
        s7y.a.VKWebAppShowGoodOrderBox(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppShowInviteBox(String str) {
        s7y.a.VKWebAppShowInviteBox(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppShowNewPostBox(String str) {
        s7y.a.VKWebAppShowNewPostBox(this, str);
    }

    @Override // xsna.r7y
    public final void VKWebAppShowNewPostBoxInternal(p2y<ShowNewPostBox$Parameters> p2yVar) {
        lq.b("VKWebAppShowNewPostBox", this, p2yVar);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppShowOrderBox(String str) {
        s7y.a.VKWebAppShowOrderBox(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppShowStoryBox(String str) {
        s7y.a.VKWebAppShowStoryBox(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppShowStoryBoxLoadFinish(String str) {
        s7y.a.VKWebAppShowStoryBoxLoadFinish(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppShowSubscriptionBox(String str) {
        s7y.a.VKWebAppShowSubscriptionBox(this, str);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppShowWallPostBox(String str) {
        s7y.a.VKWebAppShowWallPostBox(this, str);
    }

    @Override // xsna.r7y
    public final void VKWebAppShowWallPostBoxInternal(p2y<ShowWallPostBox$Parameters> p2yVar) {
        lq.b("VKWebAppShowWallPostBox", this, p2yVar);
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppStoreRateDialog(String str) {
        s7y.a.VKWebAppStoreRateDialog(this, str);
    }

    @Override // xsna.r7y
    public final void W0(p2y<ShowSubscriptionBox$Parameters> p2yVar) {
        lq.b("VKWebAppShowSubscriptionBox", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void X(p2y<OpenLiveCoverCamera$Parameters> p2yVar) {
        lq.b("VKWebAppOpenLiveCoverCamera", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void b0(p2y<AllowMessagesFromGroup$Parameters> p2yVar) {
        lq.b("VKWebAppAllowMessagesFromGroup", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void c(p2y<ShowStoryBox$Parameters> p2yVar) {
        lq.b("VKWebAppShowStoryBox", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void c0(p2y<GetClientLogs$Parameters> p2yVar) {
        lq.b("VKWebAppGetClientLogs", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void c1(p2y<JoinGroup$Parameters> p2yVar) {
        lq.b("VKWebAppJoinGroup", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void e1(p2y<ShowGoodOrderBox$Parameters> p2yVar) {
        lq.b("VKWebAppShowGoodOrderBox", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void g1(p2y<AudioStopped$Parameters> p2yVar) {
        lq.b("VKWebAppAudioStopped", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void h(p2y<Logout$Parameters> p2yVar) {
        lq.b("VKWebAppLogout", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void i0(p2y<AudioTrackChanged$Parameters> p2yVar) {
        lq.b("VKWebAppAudioTrackChanged", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void n1(p2y<AllowNotifications$Parameters> p2yVar) {
        lq.b("VKWebAppAllowNotifications", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void o(p2y<FriendsSearch$Parameters> p2yVar) {
        lq.b("VKWebAppFriendsSearch", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void o0(p2y<AddToCommunity$Parameters> p2yVar) {
        lq.b("VKWebAppAddToCommunity", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void o1(p2y<ShowInviteBox$Parameters> p2yVar) {
        lq.b("VKWebAppShowInviteBox", this, p2yVar);
    }

    @Override // xsna.s7y
    public final void q0(int i, long j) {
        StringBuilder b = jr.b(i, "handleStoryBoxFinish(storyId:", ", storyOwnerId:", j);
        b.append(')');
        C1(b.toString());
    }

    @Override // xsna.r7y
    public final void q1(p2y<AddToFavorites$Parameters> p2yVar) {
        lq.b("VKWebAppAddToFavorites", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void s(p2y<ShowCommunityWidgetPreviewBox$Parameters> p2yVar) {
        lq.b("VKWebAppShowCommunityWidgetPreviewBox", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void u1(p2y<ShowOrderBox$Parameters> p2yVar) {
        lq.b("VKWebAppShowOrderBox", this, p2yVar);
    }

    @Override // xsna.r7y
    public final void x0(p2y<GetGroupInfo$Parameters> p2yVar) {
        lq.b("VKWebAppGetGroupInfo", this, p2yVar);
    }

    @Override // xsna.s7y
    public final void z0(int i) {
        C1("handleStoryBoxResult(resultCode=" + i + ')');
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final com.vk.superapp.base.js.bridge.b z1() {
        return this.b;
    }

    @Override // xsna.npf0
    public final void release() {
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
    }
}
