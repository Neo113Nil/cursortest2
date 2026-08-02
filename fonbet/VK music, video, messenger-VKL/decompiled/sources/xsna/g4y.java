package xsna;

import android.webkit.JavascriptInterface;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import org.json.JSONObject;
import xsna.bex0;
import xsna.fzu0;

/* compiled from: JsGamesDelegate.kt */
/* loaded from: classes6.dex */
public final class g4y {
    public final x6y a;
    public fvv0 b;
    public fzu0.a c;

    public g4y(x6y x6yVar, fvv0 fvv0Var, fzu0.a aVar) {
        this.a = x6yVar;
        this.b = fvv0Var;
        this.c = aVar;
    }

    @JavascriptInterface
    public final void delegateVKWebAppShowInviteBox(String str) {
        long optLong;
        JsApiMethodType jsApiMethodType = JsApiMethodType.SHOW_INVITE_BOX;
        x6y x6yVar = this.a;
        if (!x6yVar.t(jsApiMethodType) && x6yVar.u(jsApiMethodType, str)) {
            if (str != null) {
                try {
                    optLong = new JSONObject(str).optLong("friend_id");
                } catch (Throwable unused) {
                    bex0.a.a(x6yVar, JsApiMethodType.SHOW_INVITE_BOX, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                    return;
                }
            } else {
                optLong = 0;
            }
            qro0.c(new t9s(optLong, this, str != null ? f370.A("requestKey", new JSONObject(str)) : null));
        }
    }

    @JavascriptInterface
    public final void delegateVKWebAppShowLeaderBoardBox(String str) {
        int i;
        fvv0 fvv0Var;
        fzu0.a aVar;
        fzu0 view;
        JsApiMethodType jsApiMethodType = JsApiMethodType.SHOW_LEADER_BOARD_BOX;
        x6y x6yVar = this.a;
        if (!x6yVar.t(jsApiMethodType) && x6yVar.u(jsApiMethodType, str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i2 = jSONObject.getInt("user_result");
                int optInt = jSONObject.optInt("global");
                if (optInt == 0) {
                    if (jSONObject.optBoolean("global")) {
                        i = 1;
                        if (i != 0 && i != 1) {
                            bex0.a.a(x6yVar, jsApiMethodType, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                        }
                        fvv0Var = this.b;
                        if (fvv0Var != null || (aVar = this.c) == null || (view = aVar.getView()) == null) {
                            return;
                        }
                        view.Z8(fvv0Var.t(), i2, i);
                        return;
                    }
                    optInt = 0;
                }
                i = optInt;
                if (i != 0) {
                    bex0.a.a(x6yVar, jsApiMethodType, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                }
                fvv0Var = this.b;
                if (fvv0Var != null) {
                }
            } catch (Throwable unused) {
                bex0.a.a(x6yVar, JsApiMethodType.SHOW_LEADER_BOARD_BOX, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        }
    }
}
