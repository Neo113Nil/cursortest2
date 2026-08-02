package xsna;

import android.app.Activity;
import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import com.google.android.gms.common.GoogleApiAvailability;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.PaymentType;
import com.vk.external.miniapp.net.app.AppFields;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.api.dto.clips.WebClipBox;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonAccessDenied;
import com.vk.superapp.base.js.bridge.Responses$ReasonActionCantUseInBackground;
import com.vk.superapp.base.js.bridge.Responses$ReasonAlreadyInProgress;
import com.vk.superapp.base.js.bridge.Responses$ReasonConnectionLost;
import com.vk.superapp.base.js.bridge.Responses$ReasonCustom;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonMissingParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonNeedUserPermission;
import com.vk.superapp.base.js.bridge.Responses$ReasonNoAds;
import com.vk.superapp.base.js.bridge.Responses$ReasonNoDevicePermission;
import com.vk.superapp.base.js.bridge.Responses$ReasonRequestsLimitReached;
import com.vk.superapp.base.js.bridge.Responses$ReasonUninitializedApp;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnsupportedPlatform;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import com.vk.superapp.bridges.SuperappPurchasesBridge$PurchaseResult;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.MiniAppPaymentType;
import com.vk.superapp.bridges.dto.tapandpay.VkTokenizationNetworkName;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.js.bridge.events.AddToFavorites$Error;
import com.vk.superapp.js.bridge.events.AddToHomeScreen$Error;
import com.vk.superapp.js.bridge.events.EventNames;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.sdk.SharedKt;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.bex0;
import xsna.c5y;
import xsna.cfx0;
import xsna.zen0;

/* compiled from: JsVkBrowserBridge.kt */
/* loaded from: classes6.dex */
public class r6y extends x6y implements h8y, i8y, d8y, c7y {
    public final bpn0 D;
    public final bpn0 E;
    public final bpn0 F;
    public final bpn0 G;
    public final bpn0 H;
    public final bpn0 I;
    public final bpn0 J;
    public final bpn0 K;
    public final bpn0 L;
    public final bpn0 M;
    public final bpn0 N;
    public final bpn0 O;
    public final bpn0 P;
    public final bpn0 Q;
    public final bpn0 R;
    public final bpn0 S;
    public final bpn0 T;
    public final bpn0 U;
    public final bpn0 V;
    public final bpn0 W;
    public final bpn0 X;
    public final bpn0 Y;
    public final bpn0 Z;
    public final bpn0 a0;
    public final bpn0 b0;
    public final bpn0 c0;

    /* compiled from: JsVkBrowserBridge.kt */
    public static final class a implements fvp {
        @Override // xsna.fvp
        public final EventNames b() {
            return EventNames.AddToFavorites;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.fvp
        public final com.vk.superapp.base.js.bridge.a c(Responses$ClientError responses$ClientError) {
            return new AddToFavorites$Error(null, responses$ClientError, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: JsVkBrowserBridge.kt */
    public static final class b implements fvp {
        @Override // xsna.fvp
        public final EventNames b() {
            return EventNames.AddToHomeScreen;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.fvp
        public final com.vk.superapp.base.js.bridge.a c(Responses$ClientError responses$ClientError) {
            return new AddToHomeScreen$Error(null, responses$ClientError, 1, 0 == true ? 1 : 0);
        }
    }

    public r6y(fvv0 fvv0Var) {
        super(fvv0Var);
        this.D = new bpn0(new ubw(this, 2));
        this.E = new bpn0(new k6k(this, 24));
        this.F = new bpn0(new ufk(this, 10));
        this.G = new bpn0(new bih(this, 23));
        this.H = new bpn0(new h1j(this, 19));
        this.I = new bpn0(new l1i(this, 10));
        this.J = new bpn0(new ecm(this, 17));
        this.K = new bpn0(new hn9(14, this, fvv0Var));
        this.L = new bpn0(new l9h(this, 25));
        this.M = new bpn0(new fgm(this, 19));
        this.N = new bpn0(new t2l(this, 16));
        this.O = new bpn0(new yce(this, 28));
        this.P = new bpn0(new n7w(this, 4));
        this.Q = new bpn0(new z34(this));
        this.R = new bpn0(new com.vk.movika.sdk.base.ui.i(18, this, fvv0Var));
        this.S = new bpn0(new dp0(11, this, fvv0Var));
        this.T = new bpn0(new qbj(this, 22));
        this.U = new bpn0(new tvj(this, 18));
        this.V = new bpn0(new qzg(this, 28));
        this.W = new bpn0(new cvs(this, 11));
        this.X = new bpn0(new odm(this, 20));
        this.Y = new bpn0(new akh(this, 28));
        this.Z = new bpn0(new xyh(this, 25));
        this.a0 = new bpn0(new p6y(this, 0));
        this.b0 = new bpn0(new dgm(this, 16));
        this.c0 = new bpn0(new ek(14));
    }

    public final f1y Q() {
        return (f1y) this.V.getValue();
    }

    public final k3y R() {
        return (k3y) this.X.getValue();
    }

    public final boolean T() {
        return ((Boolean) this.c0.getValue()).booleanValue();
    }

    public final m4y U() {
        return (m4y) this.Z.getValue();
    }

    public d5y V() {
        return (d5y) this.Y.getValue();
    }

    @Override // xsna.x6y, xsna.q2y, xsna.m7y
    @JavascriptInterface
    public void VKWebAppAddCard(String str) {
        gvv0 view;
        Activity B0;
        gvv0 view2;
        p7y W = W();
        W.getClass();
        JsApiMethodType jsApiMethodType = JsApiMethodType.ADD_CARD;
        if (W.a(jsApiMethodType) && W.a.u(jsApiMethodType, str)) {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("cardholder_name");
            String string2 = jSONObject.getString("last_digits");
            byte[] bytes = jSONObject.getString("opc").getBytes(emb.b);
            VkTokenizationNetworkName d = p7y.d(jSONObject);
            synchronized (W.c) {
                try {
                    fvv0 fvv0Var = W.b;
                    if (fvv0Var != null && (view2 = fvv0Var.getView()) != null) {
                        view2.D1(W.e);
                    }
                    osv0 osv0Var = new osv0(new nsv0(string, string2, d), bytes);
                    fvv0 fvv0Var2 = W.b;
                    if (fvv0Var2 != null && (view = fvv0Var2.getView()) != null && (B0 = view.B0()) != null) {
                        k0x k0xVar = W.d;
                        k0xVar.a(W.a.l);
                        k0xVar.getClass();
                        mcc0 mcc0Var = k0x.e;
                        if (mcc0Var != null) {
                            mcc0Var.j(B0, osv0Var);
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.s2y
    @JavascriptInterface
    public void VKWebAppAddToChat(String str) {
        w2y w2yVar = (w2y) this.R.getValue();
        x6y x6yVar = w2yVar.a;
        x6y x6yVar2 = w2yVar.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.ADD_MINI_APP_SNIPPET_TO_CHAT;
        if (x6yVar.u(jsApiMethodType, str)) {
            JSONObject jSONObject = str != null ? new JSONObject(str) : null;
            fvv0 fvv0Var = w2yVar.b;
            Long valueOf = fvv0Var != null ? Long.valueOf(fvv0Var.getAppId()) : null;
            if (jgn0.c()) {
                bex0.a.a(x6yVar2, jsApiMethodType, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                return;
            }
            if (epx.f(w2yVar.c, Boolean.FALSE)) {
                bex0.a.a(x6yVar2, jsApiMethodType, VkAppsErrors.Client.ACCESS_DENIED, null, null, null, 60);
                return;
            }
            if (jSONObject != null && jSONObject.has("action_title") && valueOf != null) {
                if (valueOf.longValue() != uhx.a().a) {
                    long longValue = valueOf.longValue();
                    t2y t2yVar = new t2y(w2yVar, new co0(longValue, f370.x(jSONObject, "icon_id"), jSONObject.getString("action_title"), f370.D(jSONObject, "description"), jSONObject.optString("hash")), jSONObject.optBoolean("close_app", false));
                    Boolean bool = w2yVar.c;
                    if (bool != null) {
                        t2yVar.invoke(bool);
                        return;
                    }
                    vdx0 vdx0Var = e370.e;
                    if (vdx0Var == null) {
                        vdx0Var = null;
                    }
                    io.reactivex.rxjava3.disposables.c subscribe = zen0.a.b(vdx0Var.d(), longValue, null, e43.l(AppFields.ID, AppFields.TITLE, AppFields.TYPE, AppFields.IS_IM_ACTIONS_SUPPORTED), null, null, 26).subscribe(new np3(new np5(12, w2yVar, t2yVar), 26), new pp3(new e2s(w2yVar, 6), 25));
                    fvv0 fvv0Var2 = w2yVar.b;
                    up2.j(subscribe, fvv0Var2 != null ? fvv0Var2.getView() : null);
                    return;
                }
            }
            bex0.a.a(x6yVar2, jsApiMethodType, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.h3y
    @JavascriptInterface
    public void VKWebAppAddToCommunity(String str) {
        K().VKWebAppAddToCommunity(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppAddToFavorites(String str) {
        if (v(str, new a())) {
            qro0.c(new gbh(this, 28));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppAddToHomeScreen(String str) {
        if (v(str, new b())) {
            Context context = this.l;
            int i = 1;
            if (context != null && fhj0.a.b(context)) {
                qro0.c(new flu(this, 9));
                return;
            }
            EventNames eventNames = EventNames.AddToHomeScreen;
            int i2 = uyp.a;
            Responses$ReasonUnknownError responses$ReasonUnknownError = null;
            Responses$ReasonMissingParams responses$ReasonMissingParams = null;
            Responses$ReasonConnectionLost responses$ReasonConnectionLost = null;
            Responses$ReasonUserDenied responses$ReasonUserDenied = null;
            Responses$ReasonInvalidParams responses$ReasonInvalidParams = null;
            Responses$ReasonNoDevicePermission responses$ReasonNoDevicePermission = null;
            Responses$ReasonNeedUserPermission responses$ReasonNeedUserPermission = null;
            Responses$ReasonActionCantUseInBackground responses$ReasonActionCantUseInBackground = null;
            Responses$ReasonRequestsLimitReached responses$ReasonRequestsLimitReached = null;
            Responses$ReasonAccessDenied responses$ReasonAccessDenied = null;
            Responses$ReasonUninitializedApp responses$ReasonUninitializedApp = null;
            Responses$ReasonCustom responses$ReasonCustom = null;
            Responses$ReasonNoAds responses$ReasonNoAds = null;
            Responses$ReasonAlreadyInProgress responses$ReasonAlreadyInProgress = null;
            Object[] objArr = 0 == true ? 1 : 0;
            String str2 = null;
            w(eventNames, new AddToHomeScreen$Error(0 == true ? 1 : 0, new Responses$ClientError(str2, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, objArr, responses$ReasonUnknownError, responses$ReasonMissingParams, responses$ReasonConnectionLost, responses$ReasonUserDenied, responses$ReasonInvalidParams, new Responses$ReasonUnsupportedPlatform(0, null, 3, 0 == true ? 1 : 0), responses$ReasonNoDevicePermission, responses$ReasonNeedUserPermission, responses$ReasonActionCantUseInBackground, responses$ReasonRequestsLimitReached, responses$ReasonAccessDenied, responses$ReasonUninitializedApp, responses$ReasonCustom, responses$ReasonNoAds, responses$ReasonAlreadyInProgress, 130942, null), this.h.get(eventNames), 1, null), i, 0 == true ? 1 : 0));
        }
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppAddToHomeScreenInfo(String str) {
        JsApiMethodType jsApiMethodType = JsApiMethodType.ADD_TO_HOME_SCREEN_INFO;
        if (u(jsApiMethodType, str)) {
            Context context = this.l;
            if (context == null) {
                bex0.a.a(this, jsApiMethodType, VkAppsErrors.Client.UNKNOWN_ERROR, null, null, null, 60);
                return;
            }
            JSONObject put = new JSONObject().put("is_feature_supported", fhj0.a.b(context));
            fvv0 M = M();
            bex0.a.b(this, jsApiMethodType, put.put("is_added_to_home_screen", wgj0.a(context, M != null ? M.t().b : -1L, null)), null, 12);
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.h3y
    @JavascriptInterface
    public void VKWebAppAllowMessagesFromGroup(String str) {
        K().VKWebAppAllowMessagesFromGroup(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.h3y
    @JavascriptInterface
    public void VKWebAppAllowNotifications(String str) {
        if (u(JsApiMethodType.ALLOW_NOTIFICATIONS, str)) {
            d4y d4yVar = (d4y) this.I.getValue();
            x6y x6yVar = d4yVar.a;
            qro0.c(new tvj(d4yVar, 17));
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppAskWorkoutsPermissions(String str) {
        if (T()) {
            U().VKWebAppAskWorkoutsPermissions(str);
        } else if (u(JsApiMethodType.ASK_WORKOUT_PERMISSIONS, str)) {
            try {
                qro0.c(new l49(5, this, new JSONObject(str == null ? "" : str).optBoolean("use_health_connect", false) ? VkUiCommand.ASK_HEALTH_CONNECT_WORKOUT_PERMISSIONS : VkUiCommand.ASK_GOOGLE_FIT_WORKOUT_PERMISSIONS, str));
            } catch (JSONException unused) {
                bex0.a.a(this, JsApiMethodType.GET_WORKOUT_PERMISSIONS, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppBecameInteractive(String str) {
        R().VKWebAppBecameInteractive(str);
    }

    @JavascriptInterface
    public final void VKWebAppCallAPIMethod(String str) {
        R().VKWebAppCallAPIMethod(str);
    }

    @Override // xsna.c7y
    @JavascriptInterface
    public void VKWebAppCallGetStatus(String str) {
        WebApiApplication v;
        r2y r2yVar = (r2y) this.K.getValue();
        r2yVar.getClass();
        q19 q19Var = q19.a;
        x6y x6yVar = r2yVar.a;
        q19.b = x6yVar;
        JsApiMethodType jsApiMethodType = JsApiMethodType.CALL_GET_STATUS;
        if (x6yVar.u(jsApiMethodType, str)) {
            fvv0 fvv0Var = r2yVar.b;
            if (!((fvv0Var == null || (v = fvv0Var.v()) == null) ? false : v.Z)) {
                bex0.a.a(r2yVar.a, jsApiMethodType, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
                return;
            }
            fvv0 fvv0Var2 = r2yVar.b;
            if (fvv0Var2 != null) {
                long appId = fvv0Var2.getAppId();
                JSONObject jSONObject = new JSONObject();
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                if (superappUiRouterBridge == null) {
                    superappUiRouterBridge = null;
                }
                jSONObject.put("is_active", superappUiRouterBridge.b(appId));
                jSONObject.put("result", true);
                bex0.a.b(r2yVar.a, jsApiMethodType, jSONObject, null, 12);
            }
        }
    }

    @Override // xsna.c7y
    @JavascriptInterface
    public void VKWebAppCallJoin(String str) {
        WebApiApplication v;
        r2y r2yVar = (r2y) this.K.getValue();
        r2yVar.getClass();
        q19 q19Var = q19.a;
        q19.b = r2yVar.a;
        fvv0 fvv0Var = r2yVar.b;
        Long valueOf = fvv0Var != null ? Long.valueOf(fvv0Var.getAppId()) : null;
        if (valueOf != null) {
            x6y x6yVar = r2yVar.a;
            JsApiMethodType jsApiMethodType = JsApiMethodType.CALL_JOIN;
            if (x6yVar.u(jsApiMethodType, str)) {
                fvv0 fvv0Var2 = r2yVar.b;
                if (!((fvv0Var2 == null || (v = fvv0Var2.v()) == null) ? false : v.Z)) {
                    bex0.a.a(r2yVar.a, jsApiMethodType, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
                    return;
                }
                String optString = str != null ? new JSONObject(str).optString(ApiProtocol.KEY_JOIN_LINK) : null;
                if (optString == null || optString.length() == 0) {
                    bex0.a.a(r2yVar.a, jsApiMethodType, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
                    return;
                }
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                if (superappUiRouterBridge == null) {
                    superappUiRouterBridge = null;
                }
                if (superappUiRouterBridge.p()) {
                    bex0.a.a(r2yVar.a, jsApiMethodType, VkAppsErrors.Client.CUSTOM_ERROR, null, null, null, 60);
                } else {
                    SuperappUiRouterBridge superappUiRouterBridge2 = e370.d;
                    (superappUiRouterBridge2 != null ? superappUiRouterBridge2 : null).K(new mk(11, valueOf, optString), new maj(r2yVar, 25));
                }
            }
        }
    }

    @Override // xsna.c7y
    @JavascriptInterface
    public void VKWebAppCallStart(String str) {
        WebApiApplication v;
        r2y r2yVar = (r2y) this.K.getValue();
        x6y x6yVar = r2yVar.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.CALL_START;
        if (x6yVar.u(jsApiMethodType, str)) {
            fvv0 fvv0Var = r2yVar.b;
            if (!((fvv0Var == null || (v = fvv0Var.v()) == null) ? false : v.Z)) {
                bex0.a.a(r2yVar.a, jsApiMethodType, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
                return;
            }
            try {
                fvv0 fvv0Var2 = r2yVar.b;
                gvv0 view = fvv0Var2 != null ? fvv0Var2.getView() : null;
                fvv0 fvv0Var3 = r2yVar.b;
                Long valueOf = fvv0Var3 != null ? Long.valueOf(fvv0Var3.getAppId()) : null;
                if (view != null && valueOf != null) {
                    vdx0 vdx0Var = e370.e;
                    (vdx0Var != null ? vdx0Var : null).d().e(valueOf.longValue()).subscribe(new l50(new ebx(r2yVar, 1), 29), new hms(new s6k(r2yVar, 26), 6));
                }
            } catch (JSONException e) {
                r2yVar.a.z(JsApiMethodType.CALL_START, e);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.m7y
    @JavascriptInterface
    public void VKWebAppCanAddVirtualCard(String str) {
        p7y W = W();
        W.getClass();
        k0x k0xVar = W.d;
        x6y x6yVar = W.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.CAN_ADD_VIRTUAL_CARD_EVENT_NAME;
        if (W.a(jsApiMethodType) && x6yVar.u(jsApiMethodType, str)) {
            JSONObject jSONObject = new JSONObject(str);
            String[] G = dz5.G(jSONObject.getJSONArray("device_tokens"));
            if (G != null) {
                for (String str2 : G) {
                    if (str2 == null) {
                        throw new IllegalArgumentException("null element found in " + G + JwtParser.SEPARATOR_CHAR);
                    }
                }
            } else {
                G = new String[0];
            }
            VkTokenizationNetworkName d = p7y.d(jSONObject);
            wcj wcjVar = new wcj(new JSONObject(), 18);
            k0xVar.a(x6yVar.l);
            k0xVar.getClass();
            mcc0 mcc0Var = k0x.e;
            io.reactivex.rxjava3.core.b0 k = mcc0Var != null ? mcc0Var.k(G, d) : io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
            k0xVar.a(x6yVar.l);
            mcc0 mcc0Var2 = k0x.e;
            io.reactivex.rxjava3.core.x p = mcc0Var2 != null ? mcc0Var2.p() : io.reactivex.rxjava3.core.x.k("");
            k0xVar.a(x6yVar.l);
            mcc0 mcc0Var3 = k0x.e;
            io.reactivex.rxjava3.disposables.c subscribe = io.reactivex.rxjava3.core.x.A(k, p, mcc0Var3 != null ? mcc0Var3.o() : io.reactivex.rxjava3.core.x.k(""), new e05(new wg2(wcjVar, 1), 28)).q(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new o7y(new srg(W, 24), 0), new ew(new udo(W, 20), 26));
            fvv0 fvv0Var = W.b;
            up2.j(subscribe, fvv0Var != null ? fvv0Var.getView() : null);
        }
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppCanShowAltPayMethod(String str) {
        ((f6y) this.b0.getValue()).VKWebAppCanShowAltPayMethod(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppCaptureProtection(String str) {
        ((y3y) this.U.getValue()).VKWebAppCaptureProtection(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppCheckAllowedScopes(String str) {
        i2y i2yVar = (i2y) this.D.getValue();
        x6y x6yVar = i2yVar.a;
        x6y x6yVar2 = i2yVar.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.CHECK_ALLOWED_SCOPES;
        if (x6yVar.u(jsApiMethodType, str)) {
            fvv0 M = x6yVar.M();
            WebApiApplication v = M != null ? M.v() : null;
            if (v == null) {
                bex0.a.a(x6yVar2, jsApiMethodType, VkAppsErrors.Client.UNKNOWN_ERROR, null, null, null, 60);
                return;
            }
            try {
                if (str == null) {
                    str = "";
                }
                List c0 = drm0.c0(new JSONObject(str).optString(SharedKt.PARAM_SCOPES), new String[]{StringUtils.COMMA}, 0, 6);
                ArrayList arrayList = new ArrayList(c5g.u(c0, 10));
                Iterator it = c0.iterator();
                while (it.hasNext()) {
                    arrayList.add(drm0.p0((String) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!drm0.N((String) next)) {
                        arrayList2.add(next);
                    }
                }
                vdx0 vdx0Var = e370.e;
                (vdx0Var != null ? vdx0Var : null).d().Y(v.b, arrayList2).subscribe(new c2y(new ayo(i2yVar, 12), 0), new f40(new d2y(i2yVar, 0), 25));
            } catch (JSONException unused) {
                bex0.a.a(x6yVar2, JsApiMethodType.CHECK_ALLOWED_SCOPES, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.e1y
    @JavascriptInterface
    public void VKWebAppCheckBannerAd(String str) {
        Q().VKWebAppCheckBannerAd(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.e1y
    @JavascriptInterface
    public void VKWebAppCheckNativeAds(String str) {
        Q().VKWebAppCheckNativeAds(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppClose(String str) {
        ((d6y) this.N.getValue()).a(str);
        ((w1y) this.O.getValue()).a(str);
        R().VKWebAppClose(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppConversionHit(String str) {
        J().VKWebAppConversionHit(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppCopyText(String str) {
        if (u(JsApiMethodType.COPY_TEXT, str)) {
            qro0.c(new u14(11, this, str));
        }
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppCreateHash(String str) {
        y2y y2yVar = (y2y) this.G.getValue();
        x6y x6yVar = y2yVar.a;
        if (x6yVar.u(JsApiMethodType.CREATE_HASH, str)) {
            try {
                String optString = new JSONObject(str).optString("payload");
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                zen0 d = vdx0Var.d();
                fvv0 M = x6yVar.M();
                io.reactivex.rxjava3.disposables.c subscribe = d.J((M != null ? Long.valueOf(M.getAppId()) : null).longValue(), optString).subscribe(new h60(new fju(y2yVar, 3), 29), new tts(new o3w(y2yVar, 3), 8));
                fvv0 M2 = x6yVar.M();
                up2.j(subscribe, M2 != null ? M2.getView() : null);
            } catch (JSONException unused) {
                bex0.a.a(y2yVar.a, JsApiMethodType.CREATE_HASH, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.h3y
    @JavascriptInterface
    public void VKWebAppDenyNotifications(String str) {
        d4y d4yVar = (d4y) this.I.getValue();
        if (d4yVar.a.u(JsApiMethodType.DENY_NOTIFICATIONS, str)) {
            qro0.c(new qzg(d4yVar, 27));
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppFlashGetInfo(String str) {
        gvv0 view;
        d4y d4yVar = (d4y) this.I.getValue();
        x6y x6yVar = d4yVar.a;
        if (x6yVar.u(JsApiMethodType.FLASH_GET_INFO, str)) {
            try {
                fvv0 M = x6yVar.M();
                if (M == null || (view = M.getView()) == null) {
                    return;
                }
                view.Qm();
            } catch (Throwable unused) {
                bex0.a.a(d4yVar.a, JsApiMethodType.FLASH_GET_INFO, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppFlashSetLevel(String str) {
        gvv0 view;
        d4y d4yVar = (d4y) this.I.getValue();
        x6y x6yVar = d4yVar.a;
        x6y x6yVar2 = d4yVar.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.FLASH_SET_LEVEL;
        if (x6yVar.u(jsApiMethodType, str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("level")) {
                    bex0.a.a(x6yVar2, jsApiMethodType, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
                    return;
                }
                boolean z = jSONObject.getDouble("level") > ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                fvv0 M = x6yVar.M();
                if (M == null || (view = M.getView()) == null) {
                    return;
                }
                view.e8(z, new cvs(d4yVar, 10));
            } catch (Throwable unused) {
                bex0.a.a(x6yVar2, JsApiMethodType.FLASH_SET_LEVEL, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppForceHideHints(String str) {
        J().VKWebAppForceHideHints(str);
    }

    @Override // xsna.v1y, xsna.f7y
    @JavascriptInterface
    public void VKWebAppGetAuthToken(String str) {
        I().VKWebAppGetAuthToken(str);
    }

    @JavascriptInterface
    public final void VKWebAppGetClientVersion(String str) {
        k3y R = R();
        String string = jgn0.a().getString(R.string.vk_effects_version);
        int length = string.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (string.charAt(i) == '-') {
                    string = string.substring(0, i);
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        arm0.m(10, brm0.y(string, ".", ""));
        R.U0();
        R().VKWebAppGetClientVersion(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.h3y
    @JavascriptInterface
    public void VKWebAppGetCommunityAuthToken(String str) {
        i3y i3yVar = (i3y) this.F.getValue();
        x6y x6yVar = i3yVar.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.GET_COMMUNITY_AUTH_TOKEN;
        if (x6yVar.u(jsApiMethodType, str)) {
            i3yVar.b.b(jsApiMethodType, str);
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.h3y
    @JavascriptInterface
    public void VKWebAppGetCommunityToken(String str) {
        i3y i3yVar = (i3y) this.F.getValue();
        x6y x6yVar = i3yVar.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.GET_COMMUNITY_TOKEN;
        if (x6yVar.u(jsApiMethodType, str)) {
            if (str == null) {
                bex0.a.a(i3yVar.a, JsApiMethodType.GET_GROUP_INFO, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
            } else {
                i3yVar.b.b(jsApiMethodType, str);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppGetConfig(String str) {
        R().VKWebAppGetConfig(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.z2y
    @JavascriptInterface
    public void VKWebAppGetEmail(String str) {
        fvv0 M;
        y2y y2yVar = (y2y) this.G.getValue();
        x6y x6yVar = y2yVar.a;
        if (x6yVar.u(JsApiMethodType.GET_EMAIL, str) && (M = x6yVar.M()) != null) {
            qro0.c(new fy0(13, y2yVar, M));
        }
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppGetFriends(String str) {
        JsApiMethodType jsApiMethodType = JsApiMethodType.GET_FRIENDS;
        if (!t(jsApiMethodType) && u(jsApiMethodType, str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                final boolean optBoolean = jSONObject.optBoolean("multi", false);
                final boolean optBoolean2 = jSONObject.optBoolean("lists", false);
                qro0.c(new gzs() { // from class: xsna.q6y
                    @Override // xsna.gzs
                    public final Object invoke() {
                        gvv0 view;
                        fvv0 M = r6y.this.M();
                        if (M != null && (view = M.getView()) != null) {
                            view.W7(optBoolean, optBoolean2);
                        }
                        return s3q0.a;
                    }
                });
            } catch (JSONException unused) {
                bex0.a.a(this, JsApiMethodType.GET_FRIENDS, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.i5y
    @JavascriptInterface
    public void VKWebAppGetGeodata(String str) {
        V().VKWebAppGetGeodata(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.i5y
    @JavascriptInterface
    public void VKWebAppGetGeodataPermission(String str) {
        c5y c5yVar = (c5y) this.M.getValue();
        x6y x6yVar = c5yVar.a;
        x6y x6yVar2 = c5yVar.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.CHECK_LOCATION_PERMISSION;
        if (x6yVar.u(jsApiMethodType, str)) {
            Context context = x6yVar2.l;
            if (context == null) {
                bex0.a.a(x6yVar2, jsApiMethodType, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                return;
            }
            PermissionHelper.a.getClass();
            if (PermissionHelper.b(context, PermissionHelper.h)) {
                bex0.a.b(x6yVar2, jsApiMethodType, new JSONObject().put("result", c5y.a.GRANTED.h()), null, 12);
            } else {
                bex0.a.b(x6yVar2, jsApiMethodType, new JSONObject().put("result", c5y.a.DISABLED.h()), null, 12);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppGetGrantedPermissions(String str) {
        ((w5y) this.P.getValue()).VKWebAppGetGrantedPermissions(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.h3y
    @JavascriptInterface
    public void VKWebAppGetGroupInfo(String str) {
        K().VKWebAppGetGroupInfo(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppGetHealthConnectInfo(String str) {
        if (T()) {
            U().VKWebAppGetHealthConnectInfo(str);
        } else if (u(JsApiMethodType.GET_HEALTH_CONNECT_INFO, str)) {
            qro0.c(new uk(12, this, str));
        }
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppGetLaunchParams(String str) {
        R().VKWebAppGetLaunchParams(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.m7y
    @JavascriptInterface
    public void VKWebAppGetMyTrackerId(String str) {
        io.reactivex.rxjava3.core.x q;
        p7y W = W();
        x6y x6yVar = W.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.MY_TRACKER_ID;
        if (W.a(jsApiMethodType) && x6yVar.u(jsApiMethodType, str)) {
            Context context = x6yVar.l;
            if (context == null) {
                q = sn.b("No activity associated.");
            } else {
                udx0 udx0Var = e370.i;
                if (udx0Var == null) {
                    udx0Var = null;
                }
                udx0Var.getClass();
                q = new io.reactivex.rxjava3.internal.operators.single.v(new os2(context, 6)).q(asu0.a.c());
            }
            io.reactivex.rxjava3.disposables.c subscribe = q.m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new i22(new z8f(W, 22), 29), new y00(new n1d(W, 26), 25));
            if (subscribe != null) {
                fvv0 fvv0Var = W.b;
                up2.j(subscribe, fvv0Var != null ? fvv0Var.getView() : null);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppGetPermissions(String str) {
        ((y3y) this.U.getValue()).VKWebAppGetPermissions(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppGetPersonalCard(String str) {
        gvv0 view;
        JsApiMethodType jsApiMethodType = JsApiMethodType.GET_PERSONAL_CARD;
        if (u(jsApiMethodType, str)) {
            try {
                fvv0 M = M();
                if (M != null && (view = M.getView()) != null) {
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.has("type")) {
                        bex0.a.a(this, jsApiMethodType, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArray = jSONObject.getJSONArray("type");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = jSONArray.getString(i);
                        if (string != null) {
                            int hashCode = string.hashCode();
                            if (hashCode == -1147692044) {
                                if (!string.equals(RTCStatsConstants.KEY_ADDRESS)) {
                                }
                                arrayList.add(string);
                            } else if (hashCode != 96619420) {
                                if (hashCode == 106642798) {
                                    if (!string.equals("phone")) {
                                    }
                                    arrayList.add(string);
                                }
                            } else if (string.equals("email")) {
                                arrayList.add(string);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        bex0.a.a(this, JsApiMethodType.GET_PERSONAL_CARD, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                        return;
                    }
                    vdx0 vdx0Var = e370.e;
                    if (vdx0Var == null) {
                        vdx0Var = null;
                    }
                    up2.j(vdx0Var.k().i().subscribe(new f40(new v53(14, this, arrayList), 26), new bw(new r3h(this, 19), 29)), view);
                }
            } catch (JSONException unused) {
                bex0.a.a(this, JsApiMethodType.GET_PERSONAL_CARD, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.z2y
    @JavascriptInterface
    public void VKWebAppGetPhoneNumber(String str) {
        fvv0 M;
        y2y y2yVar = (y2y) this.G.getValue();
        x6y x6yVar = y2yVar.a;
        if (x6yVar.u(JsApiMethodType.GET_PHONE_NUMBER, str) && (M = x6yVar.M()) != null) {
            qro0.c(new com.vk.movika.tools.controls.seekbar.f(13, y2yVar, M));
        }
    }

    @JavascriptInterface
    public void VKWebAppGetPurchaseBundles(String str) {
        Object failure;
        ArrayList arrayList;
        ArrayList arrayList2;
        y2y y2yVar = (y2y) this.G.getValue();
        x6y x6yVar = y2yVar.a;
        x6y x6yVar2 = y2yVar.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.GET_PRODUCT_INFO;
        if (x6yVar.u(jsApiMethodType, str)) {
            cfx0 cfx0Var = e370.o;
            if (cfx0Var == null) {
                cfx0Var = null;
            }
            List<Long> a2 = cfx0Var.a();
            fvv0 M = x6yVar.M();
            if (!j5g.P(a2, M != null ? Long.valueOf(M.getAppId()) : null)) {
                bex0.a.a(x6yVar2, jsApiMethodType, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
                return;
            }
            try {
                if (str == null) {
                    str = "";
                }
                JSONObject jSONObject = new JSONObject(str);
                ArrayList H = dz5.H(jSONObject.optJSONArray("item_ids"));
                if (H != null) {
                    arrayList = new ArrayList();
                    Iterator it = H.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((String) next).length() > 0) {
                            arrayList.add(next);
                        }
                    }
                } else {
                    arrayList = null;
                }
                ArrayList H2 = dz5.H(jSONObject.optJSONArray("subs_ids"));
                if (H2 != null) {
                    arrayList2 = new ArrayList();
                    Iterator it2 = H2.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (((String) next2).length() > 0) {
                            arrayList2.add(next2);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if ((arrayList != null && !arrayList.isEmpty()) || (arrayList2 != null && !arrayList2.isEmpty())) {
                cfx0 cfx0Var2 = e370.o;
                (cfx0Var2 != null ? cfx0Var2 : null).b(arrayList, arrayList2, new x2y(y2yVar, 0));
                failure = s3q0.a;
                Throwable a3 = Result.a(failure);
                if (a3 != null) {
                    if (!(a3 instanceof JSONException)) {
                        throw a3;
                    }
                    bex0.a.a(x6yVar2, JsApiMethodType.GET_PRODUCT_INFO, VkAppsErrors.Client.INVALID_PARAMS, "JSONException", null, null, 56);
                    return;
                }
                return;
            }
            bex0.a.a(x6yVar2, JsApiMethodType.GET_PRODUCT_INFO, VkAppsErrors.Client.INVALID_PARAMS, "Both item_ids and subs_ids are empty", null, null, 56);
        }
    }

    @Override // xsna.v1y, xsna.f7y
    @JavascriptInterface
    public void VKWebAppGetSilentToken(String str) {
        I().VKWebAppGetSilentToken(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppGetSteps(String str) {
        if (T()) {
            U().VKWebAppGetSteps(str);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str == null ? "" : str);
            JsApiMethodType jsApiMethodType = JsApiMethodType.GET_STEPS;
            if (t(jsApiMethodType)) {
                bex0.a.a(this, jsApiMethodType, VkAppsErrors.Client.ALREADY_IN_PROGRESS, null, null, jSONObject.optString(CommonUrlParts.REQUEST_ID), 44);
            } else if (u(jsApiMethodType, str)) {
                qro0.c(new grb(this, ((e370.s != null) && jSONObject.optBoolean("use_health_connect", false)) ? VkUiCommand.GET_HEALTH_CONNECT_STEPS : VkUiCommand.GET_STEPS, str, 6));
            }
        } catch (JSONException unused) {
            bex0.a.a(this, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppGetStepsPermissions(String str) {
        if (T()) {
            U().VKWebAppGetStepsPermissions(str);
        } else if (u(JsApiMethodType.GET_STEPS_PERMISSIONS, str)) {
            try {
                qro0.c(new h84(this, ((e370.s != null) && new JSONObject(str == null ? "" : str).optBoolean("use_health_connect", false)) ? VkUiCommand.GET_HEALTH_CONNECT_STEPS_PERMISSIONS : VkUiCommand.GET_GOOGLE_FIT_STEPS_PERMISSIONS, str, 1));
            } catch (JSONException unused) {
                bex0.a.a(this, JsApiMethodType.GET_STEPS_PERMISSIONS, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.z2y
    @JavascriptInterface
    public void VKWebAppGetUserInfo(String str) {
        J().VKWebAppGetUserInfo(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppGetWorkouts(String str) {
        if (T()) {
            U().VKWebAppGetWorkouts(str);
        } else if (u(JsApiMethodType.GET_WORKOUTS, str)) {
            try {
                qro0.c(new yb3(this, new JSONObject(str == null ? "" : str).optBoolean("use_health_connect", false) ? VkUiCommand.GET_HEALTH_CONNECT_WORKOUTS : VkUiCommand.GET_GOOGLE_FIT_WORKOUTS, str, 4));
            } catch (JSONException unused) {
                bex0.a.a(this, JsApiMethodType.GET_WORKOUTS, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppGetWorkoutsPermissions(String str) {
        if (T()) {
            U().VKWebAppGetWorkoutsPermissions(str);
        } else if (u(JsApiMethodType.GET_WORKOUT_PERMISSIONS, str)) {
            try {
                qro0.c(new jg(this, new JSONObject(str == null ? "" : str).optBoolean("use_health_connect", false) ? VkUiCommand.GET_HEALTH_CONNECT_WORKOUT_PERMISSIONS : VkUiCommand.GET_GOOGLE_FIT_WORKOUT_PERMISSIONS, str, 2));
            } catch (JSONException unused) {
                bex0.a.a(this, JsApiMethodType.GET_WORKOUT_PERMISSIONS, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.e1y
    @JavascriptInterface
    public void VKWebAppHideBannerAd(String str) {
        Q().VKWebAppHideBannerAd(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppInit(String str) {
        R().VKWebAppInit(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.h3y
    @JavascriptInterface
    public void VKWebAppJoinGroup(String str) {
        K().VKWebAppJoinGroup(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppKeepScreenOn(String str) {
        if (str != null && u(JsApiMethodType.KEEP_SCREEN_ON, str)) {
            qro0.c(new ig1(16, this, str));
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.h3y
    @JavascriptInterface
    public void VKWebAppLeaveGroup(String str) {
        K().VKWebAppLeaveGroup(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppLocalStorageDelete(String str) {
        ((x4y) this.a0.getValue()).VKWebAppLocalStorageDelete(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppLocalStorageGetMeta(String str) {
        ((x4y) this.a0.getValue()).VKWebAppLocalStorageGetMeta(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppLocalStorageGetState(String str) {
        ((x4y) this.a0.getValue()).VKWebAppLocalStorageGetState(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppLocalStorageRead(String str) {
        ((x4y) this.a0.getValue()).VKWebAppLocalStorageRead(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppLocalStorageWrite(String str) {
        ((x4y) this.a0.getValue()).VKWebAppLocalStorageWrite(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009b A[Catch: Exception -> 0x0130, TryCatch #0 {Exception -> 0x0130, blocks: (B:15:0x0044, B:21:0x006d, B:23:0x0075, B:25:0x008f, B:27:0x009b, B:29:0x00a3, B:31:0x00a9, B:33:0x00b3, B:36:0x00b9, B:40:0x00c7, B:43:0x00ce, B:46:0x00d5, B:49:0x0108, B:52:0x0115, B:57:0x012a, B:58:0x012f, B:59:0x0079, B:61:0x0081, B:62:0x0084, B:64:0x008c), top: B:14:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3 A[Catch: Exception -> 0x0130, TryCatch #0 {Exception -> 0x0130, blocks: (B:15:0x0044, B:21:0x006d, B:23:0x0075, B:25:0x008f, B:27:0x009b, B:29:0x00a3, B:31:0x00a9, B:33:0x00b3, B:36:0x00b9, B:40:0x00c7, B:43:0x00ce, B:46:0x00d5, B:49:0x0108, B:52:0x0115, B:57:0x012a, B:58:0x012f, B:59:0x0079, B:61:0x0081, B:62:0x0084, B:64:0x008c), top: B:14:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void VKWebAppMakeInAppPurchase(String str) {
        MiniAppPaymentType miniAppPaymentType;
        gvv0 view;
        final Activity B0;
        y2y y2yVar = (y2y) this.G.getValue();
        x6y x6yVar = y2yVar.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.IN_APP_PURCHASE;
        if (x6yVar.u(jsApiMethodType, str)) {
            cfx0 cfx0Var = e370.o;
            if (cfx0Var == null) {
                cfx0Var = null;
            }
            List<Long> a2 = cfx0Var.a();
            fvv0 M = x6yVar.M();
            if (!j5g.P(a2, M != null ? Long.valueOf(M.getAppId()) : null)) {
                bex0.a.a(y2yVar.a, jsApiMethodType, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                final String string = jSONObject.getString("merchant_product_id");
                MiniAppPaymentType.a aVar = MiniAppPaymentType.Companion;
                String string2 = jSONObject.getString("purchase_type");
                aVar.getClass();
                int hashCode = string2.hashCode();
                if (hashCode == 755725433) {
                    if (string2.equals("mini_app_subs")) {
                        miniAppPaymentType = MiniAppPaymentType.Subs;
                        final MiniAppPaymentType miniAppPaymentType2 = miniAppPaymentType;
                        final Integer x = f370.x(jSONObject, "purchase_product_id");
                        fvv0 M2 = x6yVar.M();
                        if (M2 != null) {
                        }
                        if (view == null) {
                        }
                    }
                    throw new NoSuchElementException();
                }
                if (hashCode == 1126340310) {
                    if (string2.equals("mini_app_balance")) {
                        miniAppPaymentType = MiniAppPaymentType.Balance;
                        final MiniAppPaymentType miniAppPaymentType22 = miniAppPaymentType;
                        final Integer x2 = f370.x(jSONObject, "purchase_product_id");
                        fvv0 M22 = x6yVar.M();
                        if (M22 != null) {
                        }
                        if (view == null) {
                            return;
                        } else {
                            return;
                        }
                    }
                    throw new NoSuchElementException();
                }
                if (hashCode == 1943207254 && string2.equals("mini_app_inapp")) {
                    miniAppPaymentType = MiniAppPaymentType.Inapp;
                    final MiniAppPaymentType miniAppPaymentType222 = miniAppPaymentType;
                    final Integer x22 = f370.x(jSONObject, "purchase_product_id");
                    fvv0 M222 = x6yVar.M();
                    view = M222 != null ? M222.getView() : null;
                    if (view == null || (B0 = view.B0()) == null) {
                        return;
                    }
                    if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(B0) == 0) {
                        cfx0 cfx0Var2 = e370.o;
                        if (cfx0Var2 == null) {
                            cfx0Var2 = null;
                        }
                        cfx0Var2.getClass();
                        if (vx2.d.o()) {
                            if (string != null && string.length() != 0) {
                                cfx0 cfx0Var3 = e370.o;
                                final cfx0 cfx0Var4 = cfx0Var3 != null ? cfx0Var3 : null;
                                cfx0Var4.getClass();
                                new io.reactivex.rxjava3.internal.operators.single.b(new io.reactivex.rxjava3.core.a0() { // from class: xsna.bfx0
                                    @Override // io.reactivex.rxjava3.core.a0
                                    public final void subscribe(io.reactivex.rxjava3.core.y yVar) {
                                        PaymentType paymentType;
                                        cfx0 cfx0Var5 = cfx0.this;
                                        String str2 = string;
                                        MiniAppPaymentType miniAppPaymentType3 = miniAppPaymentType222;
                                        Integer num = x22;
                                        Activity activity = B0;
                                        try {
                                            com.vk.core.utils.newtork.b.a.getClass();
                                            if (!com.vk.core.utils.newtork.b.d()) {
                                                yVar.onSuccess(new mhn0(SuperappPurchasesBridge$PurchaseResult.CONNECTION_LOST, null));
                                                return;
                                            }
                                            eq20 eq20Var = cfx0Var5.a;
                                            int i = cfx0.a.$EnumSwitchMapping$1[miniAppPaymentType3.ordinal()];
                                            if (i == 1) {
                                                paymentType = PaymentType.Inapp;
                                            } else if (i == 2) {
                                                paymentType = PaymentType.Subs;
                                            } else {
                                                if (i != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                paymentType = PaymentType.Balance;
                                            }
                                            eq20Var.c = eq20Var.b.d(activity, new fq20(eq20Var, new wwq(yVar, 3)), new dq20(str2, paymentType, num));
                                        } catch (Exception e) {
                                            yVar.onError(e);
                                        }
                                    }
                                }).q(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new um0(new h2s(y2yVar, 7), 28), new wf1(new v4w(y2yVar, 3), 29));
                                return;
                            }
                            bex0.a.a(y2yVar.a, jsApiMethodType, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                            return;
                        }
                    }
                    bex0.a.a(y2yVar.a, jsApiMethodType, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, new Pair("is_google_services_unavailable", Boolean.TRUE), null, 52);
                    return;
                }
                throw new NoSuchElementException();
            } catch (Exception unused) {
                bex0.a.a(y2yVar.a, JsApiMethodType.IN_APP_PURCHASE, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppNavigateToSettings(String str) {
        ((y3y) this.U.getValue()).VKWebAppNavigateToSettings(str);
    }

    @Override // xsna.v1y, xsna.f7y
    @JavascriptInterface
    public void VKWebAppOAuthActivate(String str) {
        I().VKWebAppOAuthActivate(str);
    }

    @Override // xsna.v1y, xsna.f7y
    @JavascriptInterface
    public void VKWebAppOAuthDeactivate(String str) {
        I().VKWebAppOAuthDeactivate(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppOpenApp(String str) {
        J().VKWebAppOpenApp(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.o5y
    @JavascriptInterface
    public void VKWebAppOpenCodeReader(String str) {
        J().VKWebAppOpenCodeReader(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.o5y
    @JavascriptInterface
    public void VKWebAppOpenContacts(String str) {
        q5y q5yVar = (q5y) this.H.getValue();
        x6y x6yVar = q5yVar.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.OPEN_CONTACTS;
        if (!x6yVar.t(jsApiMethodType) && x6yVar.u(jsApiMethodType, str)) {
            qro0.c(new p5y(q5yVar, 0));
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.o5y
    @JavascriptInterface
    public void VKWebAppOpenExternalLink(String str) {
        super.VKWebAppOpenExternalLink(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.o5y
    @JavascriptInterface
    public void VKWebAppOpenPackage(String str) {
        super.VKWebAppOpenPackage(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppOpenReportForm(String str) {
        J().VKWebAppOpenReportForm(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppPrivacyEditSuccess(String str) {
        ovv0 J;
        dvv0 a2;
        JsApiMethodType jsApiMethodType = JsApiMethodType.PRIVACY_EDIT_SUCCESS;
        if (u(jsApiMethodType, str)) {
            if (str == null) {
                str = "";
            }
            if (epx.f(new JSONObject(str).optString("setting_key"), "followers_mode")) {
                fvv0 M = ((f4y) this.J.getValue()).a.M();
                if (M != null && (J = M.J()) != null && (a2 = J.a(VkUiCommand.UPDATE_FOLLOWERS_MODE)) != null) {
                    a2.a(null);
                }
                bex0.a.b(this, jsApiMethodType, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true), null, 12);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppRecommend(String str) {
        if (u(JsApiMethodType.RECOMMEND_APP, str)) {
            qro0.c(new wzh(this, 17));
        }
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppRedirect(String str) {
        if (u(JsApiMethodType.REDIRECT, str)) {
            try {
                String string = new JSONObject(str).getString("url");
                if (drm0.N(string) || !URLUtil.isNetworkUrl(string)) {
                    return;
                }
                qro0.c(new com.vk.movika.sdk.base.presenter.c(13, this, string));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppResizeWindow(String str) {
        JsApiMethodType jsApiMethodType = JsApiMethodType.RESIZE_WINDOW;
        if (u(jsApiMethodType, str)) {
            bex0.a.a(this, jsApiMethodType, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
        }
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppRetargetingPixel(String str) {
        J().VKWebAppRetargetingPixel(str);
    }

    @JavascriptInterface
    public final void VKWebAppScroll(String str) {
        J().VKWebAppScroll(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.m7y
    @JavascriptInterface
    public void VKWebAppSecureTokenGet(String str) {
        gvv0 view;
        Activity B0;
        p7y W = W();
        x6y x6yVar = W.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.SECURE_TOKEN_GET;
        if (x6yVar.u(jsApiMethodType, str)) {
            fvv0 fvv0Var = W.b;
            if (fvv0Var == null || (view = fvv0Var.getView()) == null || (B0 = view.B0()) == null) {
                x6yVar.B(jsApiMethodType, jsApiMethodType.h(), VkAppsErrors.Client.i(VkAppsErrors.Client.UNKNOWN_ERROR, null, null, 7), null, null);
            } else {
                qro0.c(new com.vk.movika.sdk.base.flow.binding.l(10, B0, W));
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.m7y
    @JavascriptInterface
    public void VKWebAppSecureTokenGetInfo(String str) {
        p7y W = W();
        if (W.a.u(JsApiMethodType.SECURE_TOKEN_GET_INFO, str)) {
            qro0.c(new p6y(W, 1));
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.m7y
    @JavascriptInterface
    public void VKWebAppSecureTokenRemove(String str) {
        fvv0 fvv0Var;
        gvv0 view;
        Activity B0;
        p7y W = W();
        if (!W.a.u(JsApiMethodType.SECURE_TOKEN_REMOVE, str) || (fvv0Var = W.b) == null || (view = fvv0Var.getView()) == null || (B0 = view.B0()) == null) {
            return;
        }
        qro0.c(new com.vk.movika.sdk.base.flow.binding.j(14, B0, W));
    }

    @Override // xsna.x6y, xsna.q2y, xsna.m7y
    @JavascriptInterface
    public void VKWebAppSecureTokenRequestAccess(String str) {
        fvv0 fvv0Var;
        gvv0 view;
        Activity B0;
        p7y W = W();
        if (!W.a.u(JsApiMethodType.SECURE_TOKEN_REQUEST_ACCESS, str) || (fvv0Var = W.b) == null || (view = fvv0Var.getView()) == null || (B0 = view.B0()) == null) {
            return;
        }
        qro0.c(new qg1(13, B0, W));
    }

    @Override // xsna.x6y, xsna.q2y, xsna.m7y
    @JavascriptInterface
    public void VKWebAppSecureTokenSet(String str) {
        gvv0 view;
        Activity B0;
        p7y W = W();
        x6y x6yVar = W.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.SECURE_TOKEN_SET;
        if (x6yVar.u(jsApiMethodType, str)) {
            if (str == null || !new JSONObject(str).has("token")) {
                x6yVar.B(jsApiMethodType, jsApiMethodType.h(), VkAppsErrors.Client.i(VkAppsErrors.Client.INVALID_PARAMS, null, null, 7), null, null);
                return;
            }
            String string = new JSONObject(str).getString("token");
            fvv0 fvv0Var = W.b;
            if (fvv0Var == null || (view = fvv0Var.getView()) == null || (B0 = view.B0()) == null) {
                return;
            }
            qro0.c(new hgq(B0, W, string, 1));
        }
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppSendCustomEvent(String str) {
        R().VKWebAppSendCustomEvent(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.h3y
    @JavascriptInterface
    public void VKWebAppSendPayload(String str) {
        JsApiMethodType jsApiMethodType = JsApiMethodType.SEND_PAYLOAD;
        if (u(jsApiMethodType, str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("group_id") && jSONObject.has("payload")) {
                    final fvv0 M = M();
                    if (M != null) {
                        final long optLong = jSONObject.optLong("group_id");
                        final String optString = jSONObject.optString("payload");
                        if (optLong <= 0) {
                            bex0.a.a(this, jsApiMethodType, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                            return;
                        } else {
                            qro0.c(new gzs() { // from class: xsna.o6y
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    fvv0 fvv0Var = fvv0.this;
                                    fvv0Var.getView().f7(fvv0Var.getAppId(), optLong, optString);
                                    return s3q0.a;
                                }
                            });
                            return;
                        }
                    }
                    return;
                }
                bex0.a.a(this, jsApiMethodType, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
            } catch (JSONException unused) {
                bex0.a.a(this, JsApiMethodType.SEND_PAYLOAD, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.i5y
    @JavascriptInterface
    public void VKWebAppSetLocation(String str) {
        J().VKWebAppSetLocation(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppSetViewSettings(String str) {
        R().VKWebAppSetViewSettings(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.o5y
    @JavascriptInterface
    public void VKWebAppShare(String str) {
        J().VKWebAppShare(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.e1y
    @JavascriptInterface
    public void VKWebAppShowBannerAd(String str) {
        Q().VKWebAppShowBannerAd(str);
    }

    @Override // xsna.d8y
    @JavascriptInterface
    public void VKWebAppShowClipBox(String str) {
        a3y a3yVar = (a3y) this.E.getValue();
        x6y x6yVar = a3yVar.a;
        x6y x6yVar2 = a3yVar.a;
        fvv0 M = x6yVar.M();
        if (M == null) {
            return;
        }
        int i = 1;
        if (!a3yVar.b) {
            up2.j(fxv0.a.a.b0(dxv0.class).subscribe(new nex(new a2a(1, a3yVar, a3y.class, "handleEvents", "handleEvents(Lcom/vk/superapp/browser/utils/VkUiRxClipEvent;)V", 0, 9), i)), M.getView());
            a3yVar.b = true;
        }
        if (a3yVar.c) {
            return;
        }
        JsApiMethodType jsApiMethodType = JsApiMethodType.SHOW_CLIP_BOX;
        if (x6yVar.u(jsApiMethodType, str)) {
            if (str == null) {
                bex0.a.a(x6yVar2, jsApiMethodType, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString(CommonUrlParts.REQUEST_ID);
                Serializer.c<WebClipBox> cVar = WebClipBox.CREATOR;
                WebClipBox a2 = WebClipBox.a.a(jSONObject);
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                s3q0 s3q0Var = null;
                if (superappUiRouterBridge == null) {
                    superappUiRouterBridge = null;
                }
                io.reactivex.rxjava3.disposables.c m0 = superappUiRouterBridge.m0(a2, Long.valueOf(M.getAppId()), optString);
                if (m0 != null) {
                    up2.j(m0, M.getView());
                    try {
                        VkBridgeAnalytics E = M.E();
                        if (E != null) {
                            E.i(jsApiMethodType.i(), null, null);
                            s3q0Var = s3q0.a;
                        }
                    } catch (Throwable unused) {
                    }
                    if (s3q0Var != null) {
                        a3yVar.c = true;
                    }
                }
                bex0.a.a(x6yVar2, JsApiMethodType.SHOW_CLIP_BOX, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
            } catch (JSONException e) {
                x6yVar2.z(JsApiMethodType.SHOW_CLIP_BOX, e);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.h3y
    @JavascriptInterface
    public void VKWebAppShowCommunityWidgetPreviewBox(String str) {
        K().VKWebAppShowCommunityWidgetPreviewBox(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.o5y
    @JavascriptInterface
    public void VKWebAppShowImages(String str) {
        super.VKWebAppShowImages(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppShowInAppReviewDialog(String str) {
        if (u(JsApiMethodType.SHOW_IN_APP_REVIEW_DIALOG, str)) {
            qro0.c(new enh(this, 23));
        }
    }

    @Override // xsna.x6y, xsna.q2y, xsna.e1y
    @JavascriptInterface
    public void VKWebAppShowNativeAds(String str) {
        Q().VKWebAppShowNativeAds(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppShowNewPostBox(String str) {
        K().VKWebAppShowNewPostBox(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppShowSlidesSheet(String str) {
        J().VKWebAppShowSlidesSheet(str);
    }

    @Override // xsna.h8y
    @JavascriptInterface
    public void VKWebAppShowStoryBox(String str) {
        K().VKWebAppShowStoryBox(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.h3y
    @JavascriptInterface
    public void VKWebAppShowWallPostBox(String str) {
        K().VKWebAppShowWallPostBox(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppStopStepsPermissions(String str) {
        U().VKWebAppStopStepsPermissions(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.z2y
    @JavascriptInterface
    public void VKWebAppStorageGet(String str) {
        R().VKWebAppStorageGet(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppStorageGetKeys(String str) {
        J().VKWebAppStorageGetKeys(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.z2y
    @JavascriptInterface
    public void VKWebAppStorageSet(String str) {
        R().VKWebAppStorageSet(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppTapticImpactOccurred(String str) {
        ((l6y) this.T.getValue()).VKWebAppTapticImpactOccurred(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppTapticNotificationOccurred(String str) {
        ((l6y) this.T.getValue()).VKWebAppTapticNotificationOccurred(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppTapticSelectionChanged(String str) {
        ((l6y) this.T.getValue()).VKWebAppTapticSelectionChanged(str);
    }

    @Override // xsna.x6y, xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppTrackEvent(String str) {
        ((r1y) this.W.getValue()).VKWebAppTrackEvent(str);
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppTranslate(String str) {
        ArrayList arrayList;
        gvv0 view;
        io.reactivex.rxjava3.disposables.b D6;
        j6y j6yVar = (j6y) this.L.getValue();
        r6y r6yVar = j6yVar.a;
        r6y r6yVar2 = j6yVar.a;
        if (str == null) {
            bex0.a.a(r6yVar, JsApiMethodType.TRANSLATE, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
            return;
        }
        JsApiMethodType jsApiMethodType = JsApiMethodType.TRANSLATE;
        if (r6yVar.u(jsApiMethodType, str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Object obj = jSONObject.get("texts");
                if (obj instanceof JSONArray) {
                    arrayList = f370.O((JSONArray) obj);
                } else {
                    if (!(obj instanceof String)) {
                        bex0.a.a(r6yVar2, jsApiMethodType, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                        return;
                    }
                    List c0 = drm0.c0((CharSequence) obj, new String[]{StringUtils.COMMA}, 0, 6);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : c0) {
                        if (((String) obj2).length() > 0) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = arrayList2;
                }
                String string = jSONObject.getString("translation_language");
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                vdx0Var.getClass();
                io.reactivex.rxjava3.disposables.c subscribe = ((tfn0) vdx0.D.getValue()).a(string, arrayList).subscribe(new oz(new wje(j6yVar, 29), 21), new qz(new sop(j6yVar, 20), 25));
                fvv0 M = r6yVar.M();
                if (M == null || (view = M.getView()) == null || (D6 = view.D6()) == null) {
                    return;
                }
                D6.b(subscribe);
            } catch (Exception e) {
                bex0.a.a(r6yVar2, JsApiMethodType.TRANSLATE, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                xgx0.a.getClass();
                xgx0.d(e);
            }
        }
    }

    @Override // xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppVmojiUploadPhoto(String str) {
        q5y q5yVar = (q5y) this.H.getValue();
        if (q5yVar.a.u(JsApiMethodType.VMOJI_UPLOAD_PHOTO, str)) {
            qro0.c(new ew3(11, q5yVar, str));
        }
    }

    public final p7y W() {
        return (p7y) this.S.getValue();
    }

    public void X(fvv0 fvv0Var) {
        O(fvv0Var);
        r2y r2yVar = (r2y) this.K.getValue();
        r2yVar.getClass();
        q19.b = this;
        r2yVar.b = fvv0Var;
        r2yVar.a = this;
        bpn0 bpn0Var = this.R;
        if (bpn0Var.isInitialized()) {
            ((mpf0) bpn0Var.getValue()).b(fvv0Var);
        }
        bpn0 bpn0Var2 = this.S;
        if (bpn0Var2.isInitialized()) {
            ((mpf0) bpn0Var2.getValue()).b(fvv0Var);
        }
        sua.q(this.z, fvv0Var);
        sua.q(this.V, fvv0Var);
        sua.q(this.x, fvv0Var);
        sua.q(this.y, fvv0Var);
        sua.q(this.T, fvv0Var);
        sua.q(this.X, fvv0Var);
        sua.q(this.W, fvv0Var);
        sua.q(this.Y, fvv0Var);
        sua.q(this.Z, fvv0Var);
        sua.q(this.a0, fvv0Var);
        sua.q(this.b0, fvv0Var);
    }

    public void Y() {
        this.v = null;
        O(null);
        G(null);
        sua.r(this.z);
        sua.r(this.x);
        sua.r(this.y);
        synchronized (t5y.e) {
            t5y.f = null;
        }
        this.p = null;
        ((r2y) this.K.getValue()).b = null;
        bpn0 bpn0Var = this.R;
        if (bpn0Var.isInitialized()) {
            ((mpf0) bpn0Var.getValue()).release();
        }
        bpn0 bpn0Var2 = this.S;
        if (bpn0Var2.isInitialized()) {
            ((mpf0) bpn0Var2.getValue()).release();
        }
        sua.r(this.V);
        sua.r(this.T);
        sua.r(this.X);
        sua.r(this.W);
        sua.r(this.Y);
        sua.r(this.Z);
        sua.r(this.a0);
        sua.r(this.b0);
    }

    @Override // com.vk.superapp.base.js.bridge.b
    public final void l(kmk kmkVar) {
        VkBridgeAnalytics E;
        try {
            fvv0 M = M();
            if (M == null || (E = M.E()) == null) {
                return;
            }
            E.c(new cnk(kmkVar.a, kmkVar.b, kmkVar.c, kmkVar.d, kmkVar.e, kmkVar.f, kmkVar.g));
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }

    @Override // com.vk.superapp.base.js.bridge.b
    public final void m(String str, String str2, JSONObject jSONObject) {
        VkBridgeAnalytics E;
        try {
            fvv0 M = M();
            if (M == null || (E = M.E()) == null) {
                return;
            }
            E.i(str, str2, jSONObject);
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }

    @Override // xsna.i8y
    @JavascriptInterface
    public void VKWebAppVoiceAssistantPerformEvent(String str) {
    }
}
