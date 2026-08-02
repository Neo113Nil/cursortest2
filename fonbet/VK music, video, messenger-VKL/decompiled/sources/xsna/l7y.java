package xsna;

import android.content.Intent;
import android.webkit.JavascriptInterface;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vk.superapp.core.errors.VkAppsErrors;
import org.json.JSONObject;
import xsna.bex0;
import xsna.txv0;

/* compiled from: JsVkPayBridge.kt */
/* loaded from: classes6.dex */
public final class l7y extends r6y {
    public final txv0.a d0;
    public final bpn0 e0;

    public l7y(txv0.a aVar) {
        super(aVar);
        this.d0 = aVar;
        this.e0 = new bpn0(new tzv(this, 4));
    }

    @Override // xsna.r6y
    public final d5y V() {
        return (d5y) this.e0.getValue();
    }

    @JavascriptInterface
    public final void VKWebAppActionDone(String str) {
        txv0 view;
        if (u(JsApiMethodType.ACTION_DONE, str)) {
            Intent intent = new Intent();
            intent.putExtra("vk_pay_result", str);
            txv0.a aVar = this.d0;
            if (aVar == null || (view = aVar.getView()) == null) {
                return;
            }
            view.Mf(-1, intent);
        }
    }

    @Override // xsna.r6y, xsna.x6y, xsna.q2y, xsna.o5y
    @JavascriptInterface
    public void VKWebAppOpenContacts(String str) {
        txv0.a aVar;
        if (u(JsApiMethodType.OPEN_CONTACTS, str) && (aVar = this.d0) != null) {
            aVar.A();
        }
    }

    @JavascriptInterface
    public final void VKWebAppOpenQR(String str) {
        fvv0 fvv0Var;
        ovv0 J;
        dvv0 a;
        if (!u(JsApiMethodType.OPEN_QR, str) || (fvv0Var = this.p) == null || (J = fvv0Var.J()) == null || (a = J.a(VkUiCommand.OPEN_QR)) == null) {
            return;
        }
        a.a("from_vk_pay");
    }

    @JavascriptInterface
    public final void VKWebAppSetPaymentToken(String str) {
        JsApiMethodType jsApiMethodType = JsApiMethodType.SET_PAYMENT_TOKEN;
        if (u(jsApiMethodType, str)) {
            try {
                try {
                    String string = new JSONObject(str).getString("token");
                    txv0.a aVar = this.d0;
                    if (aVar != null) {
                        aVar.y1(string);
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("result", true);
                    bex0.a.b(this, jsApiMethodType, jSONObject, null, 12);
                } catch (Throwable unused) {
                    bex0.a.a(this, JsApiMethodType.SET_PAYMENT_TOKEN, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                }
            } catch (Throwable unused2) {
                bex0.a.a(this, JsApiMethodType.SET_PAYMENT_TOKEN, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        }
    }

    @Override // xsna.r6y
    public final void X(fvv0 fvv0Var) {
        super.X(fvv0Var);
        sua.q(this.e0, fvv0Var);
    }
}
