package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;
import org.json.JSONObject;

/* compiled from: PinForgotResponse.kt */
/* loaded from: classes6.dex */
public final class bma0 extends VkCheckoutResponse {
    public final String b;

    public bma0(JSONObject jSONObject) {
        super(jSONObject);
        this.b = jSONObject.optString("pin_forgot_id");
    }
}
