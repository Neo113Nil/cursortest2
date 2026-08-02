package xsna;

import android.content.res.Resources;
import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.api.dto.group.WebGroupShortInfo;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonMissingParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnsupportedPlatform;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
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
import com.vk.superapp.vkclient.js.bridge.api.events.LeaveGroup$Error;
import com.vk.superapp.vkclient.js.bridge.api.events.LeaveGroup$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.Logout$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.OpenLiveCoverCamera$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.OpenP2P$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowCommunityWidgetPreviewBox$Error;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowCommunityWidgetPreviewBox$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowGoodOrderBox$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowInviteBox$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowNewPostBox$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowOrderBox$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowStoryBox$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowStoryBoxLoadFinish$Response;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowSubscriptionBox$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowWallPostBox$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.StoreRateDialog$Parameters;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.p2y;
import xsna.pgn0;
import xsna.s7y;

/* compiled from: JsVkclientDelegateImpl.kt */
/* loaded from: classes6.dex */
public final class x7y extends z46 implements s7y {
    public static final Long[] n = {7058363L, 7787819L};
    public static final Long[] o = {53670660L};
    public xwv0 d;
    public final com.vk.superapp.base.js.bridge.b e;
    public final s13 f;
    public final z6y g;
    public final bpn0 h;
    public final bpn0 i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final bpn0 m;

    /* compiled from: JsVkclientDelegateImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ShowGoodOrderBox$Parameters.Type.values().length];
            try {
                iArr[ShowGoodOrderBox$Parameters.Type.GOODS_ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShowGoodOrderBox$Parameters.Type.GOODS_SUBSCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ShowSubscriptionBox$Parameters.Action.values().length];
            try {
                iArr2[ShowSubscriptionBox$Parameters.Action.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ShowSubscriptionBox$Parameters.Action.RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ShowSubscriptionBox$Parameters.Action.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public x7y(xwv0 xwv0Var, com.vk.superapp.base.js.bridge.b bVar, s13 s13Var, r5i r5iVar, z6y z6yVar) {
        super(xwv0Var, 4);
        this.d = xwv0Var;
        this.e = bVar;
        this.f = s13Var;
        this.g = z6yVar;
        this.h = new bpn0(new g4g(this, 27));
        this.i = new bpn0(new z0h(this, 26));
        this.j = new bpn0(new m1i(this, 22));
        this.k = new bpn0(new l9h(this, 26));
        this.l = new bpn0(new fgm(this, 20));
        this.m = new bpn0(new maj(this, 28));
    }

    @Override // xsna.z46
    public final xwv0 L() {
        return this.d;
    }

    public final pvp L0() {
        return (pvp) this.h.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.r7y
    public final void U(p2y<LeaveGroup$Parameters> p2yVar) {
        this.e.k(new JsMethod("VKWebAppLeaveGroup"), p2yVar.b());
        if (this.d == null) {
            return;
        }
        try {
            qro0.c(new com.vk.movika.tools.controls.seekbar.g(10, this, new JSONObject(new Gson().toJson(p2yVar.a())).toString()));
        } catch (Throwable th) {
            pvp L0 = L0();
            Responses$ClientError responses$ClientError = new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, th.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null);
            com.vk.superapp.base.js.bridge.b.o(L0.a, new JsMethod("VKWebAppLeaveGroup"), new LeaveGroup$Error(null, new LeaveGroup$Error.Data(LeaveGroup$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
        }
    }

    @Override // xsna.s7y
    public final void V(String str) {
        L0().i(fco0.g(new RuntimeException(str)), null);
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

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0015, B:5:0x0025, B:6:0x002e, B:8:0x003b, B:9:0x003f, B:11:0x004a, B:12:0x0051, B:15:0x0059, B:17:0x005f, B:18:0x0065, B:20:0x006b, B:21:0x0071, B:23:0x0077, B:24:0x0085, B:26:0x008e, B:28:0x0096, B:31:0x009d, B:34:0x00a3, B:36:0x00b4, B:42:0x00a8, B:45:0x00ae), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // xsna.r7y
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void VKWebAppShowNewPostBoxInternal(p2y<ShowNewPostBox$Parameters> p2yVar) {
        String str;
        UserId userId;
        int i;
        boolean t;
        this.e.k(new JsMethod("VKWebAppShowNewPostBox"), p2yVar.b());
        try {
            ShowNewPostBox$Parameters a2 = p2yVar.a();
            Long g = a2.g();
            long longValue = g != null ? g.longValue() : 0L;
            gzs<s3q0> gzsVar = fkq0.a;
            UserId userId2 = new UserId(longValue);
            Long e = a2.e();
            UserId userId3 = new UserId(e != null ? e.longValue() : 0L);
            Integer k = a2.k();
            int intValue = k != null ? k.intValue() : 0;
            String c = a2.c();
            if (c == null) {
                c = "";
            }
            Boolean d = a2.d();
            boolean booleanValue = d != null ? d.booleanValue() : false;
            Integer f = a2.f();
            int intValue2 = f != null ? f.intValue() : 0;
            Integer j = a2.j();
            if (j != null) {
                i = j.intValue();
                str = c;
                userId = userId3;
            } else {
                str = c;
                userId = userId3;
                i = 0;
            }
            ihx0 ihx0Var = new ihx0(userId2, userId, intValue, str, booleanValue, intValue2, i);
            b9y h = a2.h();
            String b9yVar = h != null ? h.toString() : null;
            if (b9yVar != null && b9yVar.length() != 0) {
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                if (superappUiRouterBridge == null) {
                    superappUiRouterBridge = null;
                }
                t = superappUiRouterBridge.v(ihx0Var, b9yVar);
                if (t) {
                    L0().g(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), a2.i(), 1, null));
                    return;
                }
                return;
            }
            SuperappUiRouterBridge superappUiRouterBridge2 = e370.d;
            if (superappUiRouterBridge2 == null) {
                superappUiRouterBridge2 = null;
            }
            t = superappUiRouterBridge2.t(ihx0Var);
            if (t) {
            }
        } catch (Throwable th) {
            L0().g(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, th.getMessage(), new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), p2yVar.b(), 1, null));
        }
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
    @JavascriptInterface
    public void VKWebAppShowWallPostBoxInternal(p2y<ShowWallPostBox$Parameters> p2yVar) {
        this.e.k(new JsMethod("VKWebAppShowWallPostBox"), p2yVar.b());
        int i = 3;
        try {
            ShowWallPostBox$Parameters a2 = p2yVar.a();
            xwv0 xwv0Var = this.d;
            if (xwv0Var == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject(new Gson().toJson(a2));
            jSONObject.remove(CommonUrlParts.REQUEST_ID);
            if (!jSONObject.keys().hasNext()) {
                L0().l(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_MISSING_PARAMS, null, null, new Responses$ReasonMissingParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, 131062, null), a2.d(), 1, null));
                return;
            }
            if (!jSONObject.has("owner_id")) {
                wdx0 wdx0Var = e370.f;
                if (wdx0Var == null) {
                    wdx0Var = null;
                }
                int i2 = pgn0.a.a;
                jSONObject.put("owner_id", wdx0Var.c().b);
            }
            if (epx.f(jSONObject.get("owner_id"), 0)) {
                L0().l(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, "Owner ID cannot be equal to 0", null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), a2.d(), 1, null));
                return;
            }
            if (jSONObject.has("upload_attachments")) {
                String D = f370.D(jSONObject, "attachments");
                int max = Math.max(0, 10 - (D != null ? drm0.c0(D, new String[]{StringUtils.COMMA}, 0, 6) : EmptyList.b).size());
                if (max == 0) {
                    jSONObject.remove("upload_attachments");
                } else {
                    JSONArray jSONArray = jSONObject.getJSONArray("upload_attachments");
                    ArrayList arrayList = new ArrayList(jSONArray.length());
                    int length = jSONArray.length();
                    for (int i3 = 0; i3 < length; i3++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                        arrayList.add(new p9q0(jSONObject2.getString("type"), jSONObject2.getString("link")));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (epx.f(((p9q0) next).a, "photo")) {
                            arrayList2.add(next);
                        }
                    }
                    List H0 = j5g.H0(arrayList2, max);
                    List<p9q0> list = H0;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                    for (p9q0 p9q0Var : list) {
                        p9q0Var.getClass();
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", p9q0Var.a);
                        jSONObject3.put("url", p9q0Var.b);
                        arrayList3.add(jSONObject3);
                    }
                    jSONObject.put("upload_attachments", arrayList3);
                    jSONObject.put("upload_attachments_size", H0.size());
                }
            }
            JSONObject put = new JSONObject().put("params", jSONObject);
            io.reactivex.rxjava3.disposables.b D6 = xwv0Var.getView().D6();
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            D6.b(vdx0Var.d().Q(xwv0Var.getAppId()).subscribe(new afs(new rh6(xwv0Var, put, this, a2, 1), i)));
        } catch (Throwable th) {
            L0().l(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, th.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
        }
    }

    @Override // xsna.s7y, xsna.r7y
    @JavascriptInterface
    public void VKWebAppStoreRateDialog(String str) {
        s7y.a.VKWebAppStoreRateDialog(this, str);
    }

    @Override // xsna.r7y
    public final void W0(p2y<ShowSubscriptionBox$Parameters> p2yVar) {
        Boolean d;
        this.e.k(new JsMethod("VKWebAppShowSubscriptionBox"), p2yVar.b());
        try {
            ShowSubscriptionBox$Parameters a2 = p2yVar.a();
            xwv0 xwv0Var = this.d;
            WebApiApplication v = xwv0Var != null ? xwv0Var.v() : null;
            if (v == null) {
                L0().k(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), p2yVar.b(), 1, null));
                return;
            }
            boolean booleanValue = (!((Boolean) this.l.getValue()).booleanValue() || (d = a2.d()) == null) ? false : d.booleanValue();
            xwv0 xwv0Var2 = this.d;
            VkUiView view = xwv0Var2 != null ? xwv0Var2.getView() : null;
            if (!(view instanceof mxv0)) {
                L0().f(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), a2.f(), 1, null));
                return;
            }
            int i = a.$EnumSwitchMapping$1[a2.c().ordinal()];
            if (i == 1) {
                mxv0 mxv0Var = (mxv0) view;
                String f = a2.f();
                String e = a2.e();
                if (e != null) {
                    mxv0Var.xk(v, e, booleanValue);
                    return;
                } else {
                    L0().k(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), f, 1, null));
                    return;
                }
            }
            if (i == 2) {
                mxv0 mxv0Var2 = (mxv0) view;
                Integer g = a2.g();
                String f2 = a2.f();
                if (g != null) {
                    mxv0Var2.nn(v, g.intValue(), booleanValue);
                    return;
                } else {
                    L0().k(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), f2, 1, null));
                    return;
                }
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            mxv0 mxv0Var3 = (mxv0) view;
            Integer g2 = a2.g();
            String f3 = a2.f();
            if (g2 != null) {
                mxv0Var3.l9(v, g2.intValue());
            } else {
                L0().k(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), f3, 1, null));
            }
        } catch (JSONException e2) {
            L0().k(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, e2.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
        }
    }

    public final u1n0 X0() {
        return (u1n0) this.i.getValue();
    }

    @Override // xsna.r7y
    public final void b0(p2y<AllowMessagesFromGroup$Parameters> p2yVar) {
        this.e.k(new JsMethod("VKWebAppAllowMessagesFromGroup"), p2yVar.b());
        if (!(p2yVar.a instanceof p2y.a)) {
            qro0.c(new jl4(10, p2yVar, this));
            return;
        }
        L0().a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
    }

    @Override // xsna.r7y
    public final void c(p2y<ShowStoryBox$Parameters> p2yVar) {
        String str = p2yVar.b;
        JsMethod jsMethod = new JsMethod("VKWebAppShowStoryBox");
        com.vk.superapp.base.js.bridge.b bVar = this.e;
        if (bVar.j(jsMethod)) {
            return;
        }
        bpn0 bpn0Var = this.j;
        ojj0 ojj0Var = (ojj0) bpn0Var.getValue();
        if (!ojj0Var.e) {
            z6y z6yVar = ojj0Var.a;
            io.reactivex.rxjava3.internal.operators.observable.j1 b0 = fxv0.a.a.b0(hxv0.class);
            x6y x6yVar = z6yVar.a;
            io.reactivex.rxjava3.disposables.c subscribe = b0.subscribe(new amt(new xa9(x6yVar, 7), 4));
            fvv0 M = x6yVar.M();
            up2.j(subscribe, M != null ? M.getView() : null);
            ojj0Var.e = true;
        }
        bVar.k(new JsMethod("VKWebAppShowStoryBox"), p2yVar.b());
        if (str == null) {
            L0().j(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_MISSING_PARAMS, null, null, new Responses$ReasonMissingParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, 131062, null), p2yVar.b(), 1, null));
            return;
        }
        if (p2yVar.a instanceof p2y.a) {
            L0().j(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            return;
        }
        if (this.d == null) {
            return;
        }
        ojj0 ojj0Var2 = (ojj0) bpn0Var.getValue();
        pvp pvpVar = ojj0Var2.d;
        try {
            ShowStoryBox$Parameters a2 = p2yVar.a();
            xwv0 xwv0Var = (xwv0) ojj0Var2.b.invoke();
            if (xwv0Var == null) {
                return;
            }
            zhx0 zhx0Var = new zhx0(ojj0.a(a2, new JSONObject(str).optJSONArray("stickers"), str), xwv0Var.y(), Long.valueOf(xwv0Var.getAppId()), a2.h());
            if (xwv0Var.getView().Hb(zhx0Var)) {
                ojj0Var2.c.c(a2.h());
                return;
            }
            JSONObject j = cqm0.j(str);
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            if (superappUiRouterBridge == null) {
                superappUiRouterBridge = null;
            }
            io.reactivex.rxjava3.disposables.c I = superappUiRouterBridge.I(j, zhx0Var, new ufg0(3, ojj0Var2, a2));
            if (I != null) {
                xwv0Var.X(I);
            } else {
                pvpVar.j(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), a2.h(), 1, null));
            }
        } catch (Exception e) {
            String b = p2yVar.b();
            if (b == null) {
                b = "";
            }
            pvpVar.getClass();
            if (fco0.d(e)) {
                pvpVar.j(fco0.h(b, e));
            } else {
                pvpVar.i(fco0.g(e), b);
            }
        }
    }

    @Override // xsna.r7y
    public final void c1(p2y<JoinGroup$Parameters> p2yVar) {
        this.e.k(new JsMethod("VKWebAppJoinGroup"), p2yVar.b());
        if (this.d == null) {
            return;
        }
        String str = p2yVar.b;
        if (!(p2yVar.a instanceof p2y.a)) {
            JoinGroup$Parameters a2 = p2yVar.a();
            qro0.c(new lxj(a2.d(), a2, str, this));
        } else {
            L0().d(str, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0015, B:5:0x001f, B:7:0x002a, B:8:0x002c, B:10:0x003d, B:13:0x007e, B:18:0x0091, B:19:0x0096, B:20:0x0097, B:22:0x009b, B:23:0x00a1, B:25:0x00a5, B:27:0x00e6, B:29:0x00ec, B:32:0x0130, B:34:0x0149, B:36:0x0158, B:38:0x0175, B:41:0x0031, B:43:0x0035), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0015, B:5:0x001f, B:7:0x002a, B:8:0x002c, B:10:0x003d, B:13:0x007e, B:18:0x0091, B:19:0x0096, B:20:0x0097, B:22:0x009b, B:23:0x00a1, B:25:0x00a5, B:27:0x00e6, B:29:0x00ec, B:32:0x0130, B:34:0x0149, B:36:0x0158, B:38:0x0175, B:41:0x0031, B:43:0x0035), top: B:2:0x0015 }] */
    @Override // xsna.r7y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1(p2y<ShowGoodOrderBox$Parameters> p2yVar) {
        Long l;
        long appId;
        this.e.k(new JsMethod("VKWebAppShowGoodOrderBox"), p2yVar.b());
        try {
            ShowGoodOrderBox$Parameters a2 = p2yVar.a();
            xwv0 xwv0Var = this.d;
            WebApiApplication v = xwv0Var != null ? xwv0Var.v() : null;
            if (v != null) {
                appId = v.b;
            } else {
                xwv0 xwv0Var2 = this.d;
                if (xwv0Var2 == null) {
                    l = null;
                    if (l != null) {
                        L0().f(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), a2.d(), 1, null));
                        return;
                    }
                    int i = a.$EnumSwitchMapping$0[a2.e().ordinal()];
                    if (i != 1 && i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xwv0 xwv0Var3 = this.d;
                    VkUiView view = xwv0Var3 != null ? xwv0Var3.getView() : null;
                    if (!(view instanceof mxv0)) {
                        L0().f(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), a2.d(), 1, null));
                        return;
                    }
                    String c = a2.c();
                    if (c == null) {
                        L0().f(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), a2.d(), 1, null));
                        return;
                    }
                    if (v != null) {
                        ((mxv0) view).i7(v, new vu80(28, false, a2.e().toString(), false, c));
                        return;
                    } else if (((Boolean) this.m.getValue()).booleanValue()) {
                        ((mxv0) view).z7(l.longValue(), new vu80(28, false, a2.e().toString(), false, c));
                        return;
                    } else {
                        L0().f(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), a2.d(), 1, null));
                        return;
                    }
                }
                appId = xwv0Var2.getAppId();
            }
            l = Long.valueOf(appId);
            if (l != null) {
            }
        } catch (Throwable th) {
            L0().f(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, th.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
        }
    }

    @Override // xsna.r7y
    public final void o0(p2y<AddToCommunity$Parameters> p2yVar) {
        VkUiView view;
        this.e.k(new JsMethod("VKWebAppAddToCommunity"), p2yVar.b());
        xwv0 xwv0Var = this.d;
        if (xwv0Var == null || (view = xwv0Var.getView()) == null) {
            return;
        }
        view.ic();
    }

    @Override // xsna.s7y
    public final void q0(int i, long j) {
        com.vk.superapp.base.js.bridge.b.p(X0().a, new JsMethod("VKWebAppShowStoryBoxLoadFinish"), new ShowStoryBoxLoadFinish$Response(null, new ShowStoryBoxLoadFinish$Response.Data((int) j, i, null), null, 1, null), null, null, false, null, 60);
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
        this.d = xwv0Var;
    }

    @Override // xsna.npf0
    public final void release() {
        this.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.r7y
    public final void s(p2y<ShowCommunityWidgetPreviewBox$Parameters> p2yVar) {
        WebApiApplication v;
        VkUiView view;
        this.e.k(new JsMethod("VKWebAppShowCommunityWidgetPreviewBox"), p2yVar.b());
        xwv0 xwv0Var = this.d;
        if (xwv0Var == null || (v = xwv0Var.v()) == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new Gson().toJson(p2yVar.a()));
            jSONObject.put("app_id", v.b);
            jSONObject.put("app_name", v.c);
            jSONObject.put("app_icon", v.d.a((int) Math.floor(48 * Resources.getSystem().getDisplayMetrics().density)).b);
            xwv0 xwv0Var2 = this.d;
            if (xwv0Var2 == null || (view = xwv0Var2.getView()) == null) {
                return;
            }
            view.Og(jSONObject.toString());
        } catch (Throwable th) {
            pvp L0 = L0();
            Responses$ClientError responses$ClientError = new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, th.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null);
            com.vk.superapp.base.js.bridge.b.o(L0.a, new JsMethod("VKWebAppShowCommunityWidgetPreviewBox"), new ShowCommunityWidgetPreviewBox$Error(null, new ShowCommunityWidgetPreviewBox$Error.Data(ShowCommunityWidgetPreviewBox$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0015, B:5:0x001f, B:7:0x002a, B:8:0x002c, B:10:0x003d, B:13:0x007e, B:15:0x0086, B:17:0x00c8, B:19:0x00cc, B:20:0x00d2, B:22:0x00d6, B:24:0x0117, B:26:0x0125, B:28:0x012b, B:31:0x0136, B:33:0x013c, B:35:0x0144, B:37:0x0160, B:39:0x016f, B:41:0x0190, B:47:0x0031, B:49:0x0035), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0015, B:5:0x001f, B:7:0x002a, B:8:0x002c, B:10:0x003d, B:13:0x007e, B:15:0x0086, B:17:0x00c8, B:19:0x00cc, B:20:0x00d2, B:22:0x00d6, B:24:0x0117, B:26:0x0125, B:28:0x012b, B:31:0x0136, B:33:0x013c, B:35:0x0144, B:37:0x0160, B:39:0x016f, B:41:0x0190, B:47:0x0031, B:49:0x0035), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013c A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0015, B:5:0x001f, B:7:0x002a, B:8:0x002c, B:10:0x003d, B:13:0x007e, B:15:0x0086, B:17:0x00c8, B:19:0x00cc, B:20:0x00d2, B:22:0x00d6, B:24:0x0117, B:26:0x0125, B:28:0x012b, B:31:0x0136, B:33:0x013c, B:35:0x0144, B:37:0x0160, B:39:0x016f, B:41:0x0190, B:47:0x0031, B:49:0x0035), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0144 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0015, B:5:0x001f, B:7:0x002a, B:8:0x002c, B:10:0x003d, B:13:0x007e, B:15:0x0086, B:17:0x00c8, B:19:0x00cc, B:20:0x00d2, B:22:0x00d6, B:24:0x0117, B:26:0x0125, B:28:0x012b, B:31:0x0136, B:33:0x013c, B:35:0x0144, B:37:0x0160, B:39:0x016f, B:41:0x0190, B:47:0x0031, B:49:0x0035), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0160 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0015, B:5:0x001f, B:7:0x002a, B:8:0x002c, B:10:0x003d, B:13:0x007e, B:15:0x0086, B:17:0x00c8, B:19:0x00cc, B:20:0x00d2, B:22:0x00d6, B:24:0x0117, B:26:0x0125, B:28:0x012b, B:31:0x0136, B:33:0x013c, B:35:0x0144, B:37:0x0160, B:39:0x016f, B:41:0x0190, B:47:0x0031, B:49:0x0035), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0141  */
    @Override // xsna.r7y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u1(p2y<ShowOrderBox$Parameters> p2yVar) {
        Long l;
        long appId;
        boolean z;
        this.e.k(new JsMethod("VKWebAppShowOrderBox"), p2yVar.b());
        try {
            ShowOrderBox$Parameters a2 = p2yVar.a();
            xwv0 xwv0Var = this.d;
            WebApiApplication v = xwv0Var != null ? xwv0Var.v() : null;
            if (v != null) {
                appId = v.b;
            } else {
                xwv0 xwv0Var2 = this.d;
                if (xwv0Var2 != null) {
                    appId = xwv0Var2.getAppId();
                } else {
                    l = null;
                    if (l != null) {
                        L0().h(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), a2.f(), 1, null));
                        return;
                    }
                    if (a2.g() != ShowOrderBox$Parameters.Type.ITEM) {
                        L0().h(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), a2.f(), 1, null));
                        return;
                    }
                    xwv0 xwv0Var3 = this.d;
                    VkUiView view = xwv0Var3 != null ? xwv0Var3.getView() : null;
                    if (!(view instanceof mxv0)) {
                        L0().h(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), a2.f(), 1, null));
                        return;
                    }
                    if (((Boolean) this.l.getValue()).booleanValue()) {
                        Boolean d = a2.d();
                        if (d != null ? d.booleanValue() : false) {
                            z = true;
                            Boolean c = a2.c();
                            boolean booleanValue = c == null ? c.booleanValue() : false;
                            if (v == null) {
                                ((mxv0) view).Vf(v, new vu80(16, z, a2.g().toString(), booleanValue, a2.e()));
                                return;
                            }
                            boolean z2 = booleanValue;
                            if (((Boolean) this.m.getValue()).booleanValue()) {
                                ((mxv0) view).Ek(l.longValue(), new vu80(16, z, a2.g().toString(), z2, a2.e()));
                                return;
                            } else {
                                L0().h(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), a2.f(), 1, null));
                                return;
                            }
                        }
                    }
                    z = false;
                    Boolean c2 = a2.c();
                    if (c2 == null) {
                    }
                    if (v == null) {
                    }
                }
            }
            l = Long.valueOf(appId);
            if (l != null) {
            }
        } catch (Throwable th) {
            L0().h(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, th.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
        }
    }

    public final void w0(int i, List list, List list2, wh9 wh9Var) {
        VkUiView view;
        if (i > e43.h(list)) {
            wh9Var.invoke(list2);
            return;
        }
        WebGroupShortInfo webGroupShortInfo = (WebGroupShortInfo) list.get(i);
        if (webGroupShortInfo.d != 2) {
            w0(i + 1, list, j5g.v0(webGroupShortInfo, list2), wh9Var);
            return;
        }
        xwv0 xwv0Var = this.d;
        if (xwv0Var == null || (view = xwv0Var.getView()) == null) {
            return;
        }
        view.oh(webGroupShortInfo, new w7y(this, i, list, list2, webGroupShortInfo, wh9Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (r6.isEmpty() != false) goto L22;
     */
    @Override // xsna.r7y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x0(p2y<GetGroupInfo$Parameters> p2yVar) {
        ArrayList arrayList;
        VkUiView view;
        io.reactivex.rxjava3.disposables.b D6;
        JsMethod jsMethod = new JsMethod("VKWebAppGetGroupInfo");
        com.vk.superapp.base.js.bridge.b bVar = this.e;
        if (bVar.j(jsMethod)) {
            return;
        }
        bVar.k(new JsMethod("VKWebAppGetGroupInfo"), p2yVar.b());
        try {
            GetGroupInfo$Parameters a2 = p2yVar.a();
            Long d = a2.d();
            List singletonList = d != null ? Collections.singletonList(Long.valueOf(d.longValue())) : EmptyList.b;
            String e = a2.e();
            if (e != null) {
                List c0 = drm0.c0(e, new String[]{StringUtils.COMMA}, 0, 6);
                arrayList = new ArrayList();
                Iterator it = c0.iterator();
                while (it.hasNext()) {
                    Long n2 = arm0.n(drm0.p0((String) it.next()).toString());
                    if (n2 != null) {
                        arrayList.add(n2);
                    }
                }
            }
            arrayList = null;
            if (arrayList != null) {
                singletonList = arrayList;
            }
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            io.reactivex.rxjava3.disposables.c subscribe = vdx0Var.j().g(singletonList).subscribe(new b8v(new du0(14, this, a2), 3), new fu0(new hl1(18, this, a2), 28));
            xwv0 xwv0Var = this.d;
            if (xwv0Var == null || (view = xwv0Var.getView()) == null || (D6 = view.D6()) == null) {
                return;
            }
            D6.b(subscribe);
        } catch (Exception e2) {
            L0().c(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, e2.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
        }
    }

    @Override // xsna.s7y
    public final void z0(int i) {
        String b = defpackage.j0.b("VKWebAppShowStoryBox", this.e);
        if (i == -1) {
            X0().c(b);
        } else if (i != 0) {
            L0().j(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), b, 1, null));
        } else {
            L0().j(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), b, 1, null));
        }
    }

    @Override // xsna.r7y
    public final void A(p2y<GetFriends$Parameters> p2yVar) {
    }

    @Override // xsna.r7y
    public final void A0(p2y<GroupCreated$Parameters> p2yVar) {
    }

    @Override // xsna.r7y
    public final void G0(p2y<GetClientLogsAvailability$Parameters> p2yVar) {
    }

    @Override // xsna.r7y
    public final void H0(p2y<AudioUnpaused$Parameters> p2yVar) {
    }

    @Override // xsna.r7y
    public final void I0(p2y<DonutSubscriptionPaid$Parameters> p2yVar) {
    }

    @Override // xsna.r7y
    public final void J(p2y<StoreRateDialog$Parameters> p2yVar) {
    }

    @Override // xsna.r7y
    public final void K0(p2y<InstallBundle$Parameters> p2yVar) {
    }

    @Override // xsna.r7y
    public final void Q(p2y<DenyNotifications$Parameters> p2yVar) {
    }

    @Override // xsna.r7y
    public final void Q0(p2y<OpenP2P$Parameters> p2yVar) {
    }

    @Override // xsna.r7y
    public final void T0(p2y<AudioPaused$Parameters> p2yVar) {
    }

    @Override // xsna.r7y
    public final void X(p2y<OpenLiveCoverCamera$Parameters> p2yVar) {
    }

    @Override // xsna.r7y
    public final void c0(p2y<GetClientLogs$Parameters> p2yVar) {
    }

    @Override // xsna.r7y
    public final void g1(p2y<AudioStopped$Parameters> p2yVar) {
    }

    @Override // xsna.r7y
    public final void h(p2y<Logout$Parameters> p2yVar) {
    }

    @Override // xsna.r7y
    public final void i0(p2y<AudioTrackChanged$Parameters> p2yVar) {
    }

    @Override // xsna.r7y
    public final void n1(p2y<AllowNotifications$Parameters> p2yVar) {
    }

    @Override // xsna.r7y
    public final void o(p2y<FriendsSearch$Parameters> p2yVar) {
    }

    @Override // xsna.r7y
    public final void o1(p2y<ShowInviteBox$Parameters> p2yVar) {
    }

    @Override // xsna.r7y
    public final void q1(p2y<AddToFavorites$Parameters> p2yVar) {
    }
}
