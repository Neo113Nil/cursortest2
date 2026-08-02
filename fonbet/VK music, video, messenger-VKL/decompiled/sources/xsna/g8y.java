package xsna;

import android.app.Activity;
import android.content.Context;
import android.webkit.JavascriptInterface;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vkontakte.android.R;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: JsWebInternalBridge.kt */
/* loaded from: classes6.dex */
public interface g8y extends c8y, f8y {
    @JavascriptInterface
    default void VKWebAppAlert(String str) {
        qgx0 g = g();
        onx onxVar = g.a;
        if (onxVar.u(JsApiMethodType.APP_ALERT, str)) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(TtmlNode.TAG_STYLE);
            rgx0 rgx0Var = new rgx0(onxVar);
            if (epx.f(optString, "alert")) {
                pro0.f(new kad(g, jSONObject, rgx0Var, 4));
            } else {
                pro0.f(new zwc(g, jSONObject, rgx0Var, 4));
            }
        }
    }

    @Override // xsna.c8y
    @JavascriptInterface
    /* bridge */ /* synthetic */ default void VKWebAppAudioGetStatus(String str) {
        super.VKWebAppAudioGetStatus(str);
    }

    @Override // xsna.c8y
    @JavascriptInterface
    /* bridge */ /* synthetic */ default void VKWebAppAudioPause(String str) {
        super.VKWebAppAudioPause(str);
    }

    @Override // xsna.c8y
    @JavascriptInterface
    /* bridge */ /* synthetic */ default void VKWebAppAudioPlay(String str) {
        super.VKWebAppAudioPlay(str);
    }

    @Override // xsna.c8y
    @JavascriptInterface
    /* bridge */ /* synthetic */ default void VKWebAppAudioSetPosition(String str) {
        super.VKWebAppAudioSetPosition(str);
    }

    @Override // xsna.c8y
    @JavascriptInterface
    /* bridge */ /* synthetic */ default void VKWebAppAudioStop(String str) {
        super.VKWebAppAudioStop(str);
    }

    @Override // xsna.c8y
    @JavascriptInterface
    /* bridge */ /* synthetic */ default void VKWebAppAudioUnpause(String str) {
        super.VKWebAppAudioUnpause(str);
    }

    @JavascriptInterface
    default void VKWebAppChangePassword(String str) {
        qgx0 g = g();
        if (g.a.u(JsApiMethodType.CHANGE_PASSWORD, str)) {
            pro0.f(new fcs0(g, 13));
        }
    }

    @JavascriptInterface
    default void VKWebAppFriendsSearch(String str) {
        fvv0 M;
        ovv0 J;
        dvv0 a;
        onx onxVar = g().a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.FRIENDS_SEARCH;
        if (onxVar.t(jsApiMethodType) || !onxVar.u(jsApiMethodType, str) || (M = onxVar.M()) == null || (J = M.J()) == null || (a = J.a(VkUiCommand.FRIENDS_SEARCH)) == null) {
            return;
        }
        a.a(str);
    }

    @JavascriptInterface
    default void VKWebAppGetClientLogs(String str) {
        qgx0 g = g();
        onx onxVar = g.a;
        if (onxVar.u(JsApiMethodType.GET_CLIENT_LOGS, str)) {
            PermissionHelper permissionHelper = PermissionHelper.a;
            Context context = onxVar.l;
            permissionHelper.getClass();
            permissionHelper.d(context, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, new m84(23, g, str), new c4q0(g, 12));
        }
    }

    @JavascriptInterface
    default void VKWebAppGetClientLogsAvailability(String str) {
        onx onxVar = g().a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.GET_CLIENT_LOGS_AVAILABILITY;
        if (onxVar.u(jsApiMethodType, str)) {
            JSONObject jSONObject = new JSONObject();
            L l = L.a;
            LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
            l.getClass();
            bex0.a.b(onxVar, jsApiMethodType, jSONObject.put("result", !L.m(loggerOutputTarget)), null, 12);
        }
    }

    @Override // xsna.f8y
    @JavascriptInterface
    /* bridge */ /* synthetic */ default void VKWebAppGroupCreated(String str) {
        super.VKWebAppGroupCreated(str);
    }

    @Override // xsna.f8y
    @JavascriptInterface
    /* bridge */ /* synthetic */ default void VKWebAppGroupInviteLinkCreated(String str) {
        super.VKWebAppGroupInviteLinkCreated(str);
    }

    @Override // xsna.f8y
    @JavascriptInterface
    /* bridge */ /* synthetic */ default void VKWebAppGroupInviteLinkDeleted(String str) {
        super.VKWebAppGroupInviteLinkDeleted(str);
    }

    @JavascriptInterface
    default void VKWebAppInstallBundle(String str) {
        qgx0 g = g();
        if (g.a.u(JsApiMethodType.INSTALL_BUNDLE, str)) {
            pro0.f(new yk(16, g, str));
        }
    }

    @JavascriptInterface
    default void VKWebAppLogout(String str) {
        Activity B0;
        qgx0 g = g();
        if (g.a.u(JsApiMethodType.APP_LOGOUT, str) && (B0 = g.b.getView().B0()) != null) {
            pro0.f(new h8n0(B0, 21));
        }
    }

    @JavascriptInterface
    default void VKWebAppMarketItemEdit(String str) {
        fvv0 M;
        ovv0 J;
        dvv0 a;
        onx onxVar = g().a;
        if (!onxVar.u(JsApiMethodType.MARKET_ITEM_EDIT, str) || (M = onxVar.M()) == null || (J = M.J()) == null || (a = J.a(VkUiCommand.UPDATE_MARKET_ITEM)) == null) {
            return;
        }
        a.a(str);
    }

    @Override // xsna.f8y
    @JavascriptInterface
    /* bridge */ /* synthetic */ default void VKWebAppOpenInviteFriendsModal(String str) {
        super.VKWebAppOpenInviteFriendsModal(str);
    }

    @JavascriptInterface
    default void VKWebAppOpenLiveCoverCamera(String str) {
        qgx0 g = g();
        if (g.a.u(JsApiMethodType.OPEN_LIVE_COVER_CAMERA, str)) {
            pro0.f(new wmd0(g, 28));
        }
    }

    @JavascriptInterface
    default void VKWebAppOpenP2P(String str) {
        qgx0 g = g();
        if (g.a.u(JsApiMethodType.OPEN_P2P, str)) {
            g.c.d(new JSONObject(str).getString("url"));
        }
    }

    @JavascriptInterface
    default void VKWebAppProfileEditSuccess(String str) {
        qgx0 g = g();
        if (g.a.u(JsApiMethodType.PROFILE_EDIT_SUCCESS, str)) {
            pro0.f(new uho0(g, 22));
        }
    }

    @Override // xsna.f8y
    @JavascriptInterface
    /* bridge */ /* synthetic */ default void VKWebAppUpdateCommunityPage(String str) {
        super.VKWebAppUpdateCommunityPage(str);
    }

    @JavascriptInterface
    default void VKWebAppUpdatePostPromotionStatus(String str) {
        if (g().a.u(JsApiMethodType.UPDATE_POST_PROMOTION_STATUS, str)) {
            ce60.b.getClass();
            p870.f().e(111, new JSONObject(str));
        }
    }

    qgx0 g();
}
