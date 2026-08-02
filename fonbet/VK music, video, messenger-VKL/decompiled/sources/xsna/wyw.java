package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.model.VkPayWallet;
import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;
import org.json.JSONObject;

/* compiled from: InitResponse.kt */
/* loaded from: classes6.dex */
public final class wyw extends VkCheckoutResponse {
    public final mhu0 b;
    public final VkPayWallet c;
    public final String d;

    public wyw(JSONObject jSONObject) {
        super(jSONObject);
        this.b = new mhu0(jSONObject.optJSONArray("bind_list"));
        JSONObject optJSONObject = jSONObject.optJSONObject("wallet");
        this.c = optJSONObject != null ? new VkPayWallet(optJSONObject) : null;
        this.d = jSONObject.optString("merchant_name");
    }
}
