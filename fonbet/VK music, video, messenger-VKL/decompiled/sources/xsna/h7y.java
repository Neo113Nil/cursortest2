package xsna;

import android.webkit.JavascriptInterface;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import org.json.JSONObject;
import xsna.bex0;
import xsna.fzu0;

/* compiled from: JsVkGameBridge.kt */
/* loaded from: classes6.dex */
public final class h7y extends r6y {
    public final bpn0 d0;

    public h7y(fzu0.a aVar) {
        super(aVar);
        this.d0 = new bpn0(new com.vk.movika.sdk.base.presenter.c(14, this, aVar));
    }

    @JavascriptInterface
    public final void VKWebAppGameInstalled(String str) {
        g4y Z = Z();
        if (Z.a.u(JsApiMethodType.GAME_INSTALLED, str)) {
            qro0.c(new mag(Z, 29));
        }
    }

    @JavascriptInterface
    public final void VKWebAppShowInviteBox(String str) {
        Z().delegateVKWebAppShowInviteBox(str);
    }

    @JavascriptInterface
    public final void VKWebAppShowLeaderBoardBox(String str) {
        Z().delegateVKWebAppShowLeaderBoardBox(str);
    }

    @JavascriptInterface
    public final void VKWebAppShowRequestBox(String str) {
        g4y Z = Z();
        x6y x6yVar = Z.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.SHOW_REQUEST_BOX;
        if (!x6yVar.t(jsApiMethodType) && x6yVar.u(jsApiMethodType, str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                long j = jSONObject.getLong("uid");
                gzs<s3q0> gzsVar = fkq0.a;
                qro0.c(new vw5(Z, new UserId(j), jSONObject.getString("message"), jSONObject.optString("requestKey"), 1));
            } catch (Throwable unused) {
                bex0.a.a(Z.a, JsApiMethodType.SHOW_REQUEST_BOX, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        }
    }

    @Override // xsna.r6y
    public final void X(fvv0 fvv0Var) {
        super.X(fvv0Var);
        g4y Z = Z();
        fzu0.a aVar = (fzu0.a) fvv0Var;
        Z.b = aVar;
        Z.c = aVar;
    }

    @Override // xsna.r6y
    public final void Y() {
        super.Y();
        g4y Z = Z();
        Z.b = null;
        Z.c = null;
    }

    public final g4y Z() {
        return (g4y) this.d0.getValue();
    }
}
