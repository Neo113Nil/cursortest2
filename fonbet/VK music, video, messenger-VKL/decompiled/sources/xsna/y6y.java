package xsna;

import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import org.json.JSONObject;
import xsna.bex0;
import xsna.x6y;

/* compiled from: JsVkBrowserCoreBridge.kt */
/* loaded from: classes6.dex */
public final class y6y implements cm90 {
    public final /* synthetic */ x6y a;
    public final /* synthetic */ x6y.a b;

    public y6y(x6y x6yVar, x6y.a aVar) {
        this.a = x6yVar;
        this.b = aVar;
    }

    @Override // xsna.cm90
    public final void a(Exception exc) {
        this.a.A(JsApiMethodType.REGISTER_PASSKEY, VkAppsErrors.Client.i(VkAppsErrors.Client.CUSTOM_ERROR, exc.getMessage(), null, 5));
        x6y.a.a(this.b);
    }

    @Override // xsna.cm90
    public final void onCancel() {
        bex0.a.a(this.a, JsApiMethodType.REGISTER_PASSKEY, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
        x6y.a.a(this.b);
    }

    @Override // xsna.cm90
    public final void onSuccess(String str) {
        JsApiMethodType jsApiMethodType = JsApiMethodType.REGISTER_PASSKEY;
        JSONObject d = yq.d("passkey_data", str);
        s3q0 s3q0Var = s3q0.a;
        bex0.a.b(this.a, jsApiMethodType, d, null, 12);
        x6y.a.a(this.b);
    }
}
