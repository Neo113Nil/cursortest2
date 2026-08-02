package xsna;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
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
import xsna.p2y;

/* compiled from: JsVkclientBridge.kt */
/* loaded from: classes6.dex */
public interface r7y {
    void A(p2y<GetFriends$Parameters> p2yVar);

    void A0(p2y<GroupCreated$Parameters> p2yVar);

    void G0(p2y<GetClientLogsAvailability$Parameters> p2yVar);

    void H0(p2y<AudioUnpaused$Parameters> p2yVar);

    void I0(p2y<DonutSubscriptionPaid$Parameters> p2yVar);

    void J(p2y<StoreRateDialog$Parameters> p2yVar);

    void K0(p2y<InstallBundle$Parameters> p2yVar);

    void Q(p2y<DenyNotifications$Parameters> p2yVar);

    void Q0(p2y<OpenP2P$Parameters> p2yVar);

    void T0(p2y<AudioPaused$Parameters> p2yVar);

    void U(p2y<LeaveGroup$Parameters> p2yVar);

    @JavascriptInterface
    void VKWebAppAddToCommunity(String str);

    @JavascriptInterface
    void VKWebAppAddToFavorites(String str);

    @JavascriptInterface
    void VKWebAppAllowMessagesFromGroup(String str);

    @JavascriptInterface
    void VKWebAppAllowNotifications(String str);

    @JavascriptInterface
    void VKWebAppAudioPaused(String str);

    @JavascriptInterface
    void VKWebAppAudioStopped(String str);

    @JavascriptInterface
    void VKWebAppAudioTrackChanged(String str);

    @JavascriptInterface
    void VKWebAppAudioUnpaused(String str);

    @JavascriptInterface
    void VKWebAppDenyNotifications(String str);

    @JavascriptInterface
    void VKWebAppDonutSubscriptionPaid(String str);

    @JavascriptInterface
    void VKWebAppFriendsSearch(String str);

    @JavascriptInterface
    void VKWebAppGetClientLogs(String str);

    @JavascriptInterface
    void VKWebAppGetClientLogsAvailability(String str);

    @JavascriptInterface
    void VKWebAppGetFriends(String str);

    @JavascriptInterface
    void VKWebAppGetGroupInfo(String str);

    @JavascriptInterface
    void VKWebAppGroupCreated(String str);

    @JavascriptInterface
    void VKWebAppInstallBundle(String str);

    @JavascriptInterface
    void VKWebAppJoinGroup(String str);

    @JavascriptInterface
    void VKWebAppLeaveGroup(String str);

    @JavascriptInterface
    void VKWebAppLogout(String str);

    @JavascriptInterface
    void VKWebAppOpenLiveCoverCamera(String str);

    @JavascriptInterface
    void VKWebAppOpenP2P(String str);

    @JavascriptInterface
    void VKWebAppShowCommunityWidgetPreviewBox(String str);

    @JavascriptInterface
    void VKWebAppShowGoodOrderBox(String str);

    @JavascriptInterface
    void VKWebAppShowInviteBox(String str);

    @JavascriptInterface
    void VKWebAppShowNewPostBox(String str);

    void VKWebAppShowNewPostBoxInternal(p2y<ShowNewPostBox$Parameters> p2yVar);

    @JavascriptInterface
    void VKWebAppShowOrderBox(String str);

    @JavascriptInterface
    void VKWebAppShowStoryBox(String str);

    @JavascriptInterface
    void VKWebAppShowStoryBoxLoadFinish(String str);

    @JavascriptInterface
    void VKWebAppShowSubscriptionBox(String str);

    @JavascriptInterface
    void VKWebAppShowWallPostBox(String str);

    void VKWebAppShowWallPostBoxInternal(p2y<ShowWallPostBox$Parameters> p2yVar);

    @JavascriptInterface
    void VKWebAppStoreRateDialog(String str);

    void W0(p2y<ShowSubscriptionBox$Parameters> p2yVar);

    void X(p2y<OpenLiveCoverCamera$Parameters> p2yVar);

    void b0(p2y<AllowMessagesFromGroup$Parameters> p2yVar);

    void c(p2y<ShowStoryBox$Parameters> p2yVar);

    void c0(p2y<GetClientLogs$Parameters> p2yVar);

    void c1(p2y<JoinGroup$Parameters> p2yVar);

    void e1(p2y<ShowGoodOrderBox$Parameters> p2yVar);

    void g1(p2y<AudioStopped$Parameters> p2yVar);

    void h(p2y<Logout$Parameters> p2yVar);

    void i0(p2y<AudioTrackChanged$Parameters> p2yVar);

    void n1(p2y<AllowNotifications$Parameters> p2yVar);

    void o(p2y<FriendsSearch$Parameters> p2yVar);

    void o0(p2y<AddToCommunity$Parameters> p2yVar);

    void o1(p2y<ShowInviteBox$Parameters> p2yVar);

    void q1(p2y<AddToFavorites$Parameters> p2yVar);

    void s(p2y<ShowCommunityWidgetPreviewBox$Parameters> p2yVar);

    void u1(p2y<ShowOrderBox$Parameters> p2yVar);

    void x0(p2y<GetGroupInfo$Parameters> p2yVar);

    /* compiled from: JsVkclientBridge.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppAddToCommunity(r7y r7yVar, String str) {
            try {
                AddToCommunity$Parameters a = AddToCommunity$Parameters.a((AddToCommunity$Parameters) new Gson().fromJson(str, AddToCommunity$Parameters.class));
                AddToCommunity$Parameters.b(a);
                r7yVar.o0(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.o0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppAddToFavorites(r7y r7yVar, String str) {
            try {
                AddToFavorites$Parameters a = AddToFavorites$Parameters.a((AddToFavorites$Parameters) new Gson().fromJson(str, AddToFavorites$Parameters.class));
                AddToFavorites$Parameters.b(a);
                r7yVar.q1(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.q1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppAllowMessagesFromGroup(r7y r7yVar, String str) {
            try {
                AllowMessagesFromGroup$Parameters a = AllowMessagesFromGroup$Parameters.a((AllowMessagesFromGroup$Parameters) new Gson().fromJson(str, AllowMessagesFromGroup$Parameters.class));
                AllowMessagesFromGroup$Parameters.c(a);
                AllowMessagesFromGroup$Parameters.b(a);
                r7yVar.b0(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.b0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppAllowNotifications(r7y r7yVar, String str) {
            try {
                AllowNotifications$Parameters a = AllowNotifications$Parameters.a((AllowNotifications$Parameters) new Gson().fromJson(str, AllowNotifications$Parameters.class));
                AllowNotifications$Parameters.b(a);
                r7yVar.n1(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.n1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppAudioPaused(r7y r7yVar, String str) {
            try {
                AudioPaused$Parameters a = AudioPaused$Parameters.a((AudioPaused$Parameters) new Gson().fromJson(str, AudioPaused$Parameters.class));
                AudioPaused$Parameters.b(a);
                r7yVar.T0(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.T0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppAudioStopped(r7y r7yVar, String str) {
            try {
                AudioStopped$Parameters a = AudioStopped$Parameters.a((AudioStopped$Parameters) new Gson().fromJson(str, AudioStopped$Parameters.class));
                AudioStopped$Parameters.b(a);
                r7yVar.g1(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.g1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppAudioTrackChanged(r7y r7yVar, String str) {
            try {
                AudioTrackChanged$Parameters a = AudioTrackChanged$Parameters.a((AudioTrackChanged$Parameters) new Gson().fromJson(str, AudioTrackChanged$Parameters.class));
                AudioTrackChanged$Parameters.b(a);
                r7yVar.i0(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.i0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppAudioUnpaused(r7y r7yVar, String str) {
            try {
                AudioUnpaused$Parameters a = AudioUnpaused$Parameters.a((AudioUnpaused$Parameters) new Gson().fromJson(str, AudioUnpaused$Parameters.class));
                AudioUnpaused$Parameters.b(a);
                r7yVar.H0(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.H0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppDenyNotifications(r7y r7yVar, String str) {
            try {
                DenyNotifications$Parameters a = DenyNotifications$Parameters.a((DenyNotifications$Parameters) new Gson().fromJson(str, DenyNotifications$Parameters.class));
                DenyNotifications$Parameters.b(a);
                r7yVar.Q(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.Q(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppDonutSubscriptionPaid(r7y r7yVar, String str) {
            try {
                DonutSubscriptionPaid$Parameters a = DonutSubscriptionPaid$Parameters.a((DonutSubscriptionPaid$Parameters) new Gson().fromJson(str, DonutSubscriptionPaid$Parameters.class));
                DonutSubscriptionPaid$Parameters.b(a);
                r7yVar.I0(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.I0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppFriendsSearch(r7y r7yVar, String str) {
            try {
                FriendsSearch$Parameters a = FriendsSearch$Parameters.a((FriendsSearch$Parameters) new Gson().fromJson(str, FriendsSearch$Parameters.class));
                FriendsSearch$Parameters.b(a);
                r7yVar.o(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.o(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetClientLogs(r7y r7yVar, String str) {
            try {
                GetClientLogs$Parameters a = GetClientLogs$Parameters.a((GetClientLogs$Parameters) new Gson().fromJson(str, GetClientLogs$Parameters.class));
                GetClientLogs$Parameters.b(a);
                r7yVar.c0(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.c0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetClientLogsAvailability(r7y r7yVar, String str) {
            try {
                GetClientLogsAvailability$Parameters a = GetClientLogsAvailability$Parameters.a((GetClientLogsAvailability$Parameters) new Gson().fromJson(str, GetClientLogsAvailability$Parameters.class));
                GetClientLogsAvailability$Parameters.b(a);
                r7yVar.G0(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.G0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetFriends(r7y r7yVar, String str) {
            try {
                GetFriends$Parameters a = GetFriends$Parameters.a((GetFriends$Parameters) new Gson().fromJson(str, GetFriends$Parameters.class));
                GetFriends$Parameters.b(a);
                r7yVar.A(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.A(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetGroupInfo(r7y r7yVar, String str) {
            try {
                GetGroupInfo$Parameters a = GetGroupInfo$Parameters.a((GetGroupInfo$Parameters) new Gson().fromJson(str, GetGroupInfo$Parameters.class));
                GetGroupInfo$Parameters.c(a);
                GetGroupInfo$Parameters.b(a);
                r7yVar.x0(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.x0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGroupCreated(r7y r7yVar, String str) {
            try {
                GroupCreated$Parameters a = GroupCreated$Parameters.a((GroupCreated$Parameters) new Gson().fromJson(str, GroupCreated$Parameters.class));
                GroupCreated$Parameters.c(a);
                GroupCreated$Parameters.b(a);
                r7yVar.A0(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.A0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppInstallBundle(r7y r7yVar, String str) {
            try {
                InstallBundle$Parameters a = InstallBundle$Parameters.a((InstallBundle$Parameters) new Gson().fromJson(str, InstallBundle$Parameters.class));
                InstallBundle$Parameters.b(a);
                r7yVar.K0(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.K0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppJoinGroup(r7y r7yVar, String str) {
            try {
                JoinGroup$Parameters a = JoinGroup$Parameters.a((JoinGroup$Parameters) new Gson().fromJson(str, JoinGroup$Parameters.class));
                JoinGroup$Parameters.c(a);
                JoinGroup$Parameters.b(a);
                r7yVar.c1(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.c1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppLeaveGroup(r7y r7yVar, String str) {
            try {
                LeaveGroup$Parameters a = LeaveGroup$Parameters.a((LeaveGroup$Parameters) new Gson().fromJson(str, LeaveGroup$Parameters.class));
                LeaveGroup$Parameters.c(a);
                LeaveGroup$Parameters.b(a);
                r7yVar.U(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.U(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppLogout(r7y r7yVar, String str) {
            try {
                Logout$Parameters a = Logout$Parameters.a((Logout$Parameters) new Gson().fromJson(str, Logout$Parameters.class));
                Logout$Parameters.b(a);
                r7yVar.h(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.h(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppOpenLiveCoverCamera(r7y r7yVar, String str) {
            try {
                OpenLiveCoverCamera$Parameters a = OpenLiveCoverCamera$Parameters.a((OpenLiveCoverCamera$Parameters) new Gson().fromJson(str, OpenLiveCoverCamera$Parameters.class));
                OpenLiveCoverCamera$Parameters.b(a);
                r7yVar.X(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.X(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppOpenP2P(r7y r7yVar, String str) {
            try {
                OpenP2P$Parameters a = OpenP2P$Parameters.a((OpenP2P$Parameters) new Gson().fromJson(str, OpenP2P$Parameters.class));
                OpenP2P$Parameters.b(a);
                r7yVar.Q0(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.Q0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppShowCommunityWidgetPreviewBox(r7y r7yVar, String str) {
            try {
                ShowCommunityWidgetPreviewBox$Parameters a = ShowCommunityWidgetPreviewBox$Parameters.a((ShowCommunityWidgetPreviewBox$Parameters) new Gson().fromJson(str, ShowCommunityWidgetPreviewBox$Parameters.class));
                ShowCommunityWidgetPreviewBox$Parameters.c(a);
                ShowCommunityWidgetPreviewBox$Parameters.b(a);
                r7yVar.s(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.s(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppShowGoodOrderBox(r7y r7yVar, String str) {
            try {
                ShowGoodOrderBox$Parameters a = ShowGoodOrderBox$Parameters.a((ShowGoodOrderBox$Parameters) new Gson().fromJson(str, ShowGoodOrderBox$Parameters.class));
                ShowGoodOrderBox$Parameters.b(a);
                r7yVar.e1(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.e1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppShowInviteBox(r7y r7yVar, String str) {
            try {
                ShowInviteBox$Parameters a = ShowInviteBox$Parameters.a((ShowInviteBox$Parameters) new Gson().fromJson(str, ShowInviteBox$Parameters.class));
                ShowInviteBox$Parameters.b(a);
                r7yVar.o1(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.o1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppShowNewPostBox(r7y r7yVar, String str) {
            try {
                ShowNewPostBox$Parameters a = ShowNewPostBox$Parameters.a((ShowNewPostBox$Parameters) new Gson().fromJson(str, ShowNewPostBox$Parameters.class));
                ShowNewPostBox$Parameters.b(a);
                r7yVar.VKWebAppShowNewPostBoxInternal(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.VKWebAppShowNewPostBoxInternal(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppShowOrderBox(r7y r7yVar, String str) {
            try {
                ShowOrderBox$Parameters a = ShowOrderBox$Parameters.a((ShowOrderBox$Parameters) new Gson().fromJson(str, ShowOrderBox$Parameters.class));
                ShowOrderBox$Parameters.b(a);
                r7yVar.u1(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.u1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppShowStoryBox(r7y r7yVar, String str) {
            try {
                ShowStoryBox$Parameters a = ShowStoryBox$Parameters.a((ShowStoryBox$Parameters) new Gson().fromJson(str, ShowStoryBox$Parameters.class));
                ShowStoryBox$Parameters.b(a);
                r7yVar.c(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.c(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppShowSubscriptionBox(r7y r7yVar, String str) {
            try {
                ShowSubscriptionBox$Parameters a = ShowSubscriptionBox$Parameters.a((ShowSubscriptionBox$Parameters) new Gson().fromJson(str, ShowSubscriptionBox$Parameters.class));
                ShowSubscriptionBox$Parameters.b(a);
                r7yVar.W0(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.W0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppShowWallPostBox(r7y r7yVar, String str) {
            try {
                ShowWallPostBox$Parameters a = ShowWallPostBox$Parameters.a((ShowWallPostBox$Parameters) new Gson().fromJson(str, ShowWallPostBox$Parameters.class));
                ShowWallPostBox$Parameters.c(a);
                ShowWallPostBox$Parameters.b(a);
                r7yVar.VKWebAppShowWallPostBoxInternal(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.VKWebAppShowWallPostBoxInternal(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppStoreRateDialog(r7y r7yVar, String str) {
            try {
                StoreRateDialog$Parameters a = StoreRateDialog$Parameters.a((StoreRateDialog$Parameters) new Gson().fromJson(str, StoreRateDialog$Parameters.class));
                StoreRateDialog$Parameters.b(a);
                r7yVar.J(new p2y<>(a, str));
            } catch (Exception e) {
                r7yVar.J(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppShowStoryBoxLoadFinish(r7y r7yVar, String str) {
        }
    }
}
