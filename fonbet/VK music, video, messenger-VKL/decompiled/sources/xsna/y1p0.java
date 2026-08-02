package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;
import org.json.JSONObject;

/* compiled from: TokenCreateResponse.kt */
/* loaded from: classes6.dex */
public final class y1p0 extends VkCheckoutResponse {
    public final String b;
    public final long c;

    public y1p0(JSONObject jSONObject) {
        super(jSONObject);
        this.b = jSONObject.optString("token");
        this.c = jSONObject.optLong("creation_time");
    }
}
