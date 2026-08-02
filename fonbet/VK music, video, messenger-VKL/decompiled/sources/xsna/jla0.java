package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;
import org.json.JSONObject;

/* compiled from: PinCheckCodeResponse.kt */
/* loaded from: classes6.dex */
public final class jla0 extends VkCheckoutResponse {
    public final JSONObject b;

    public jla0(JSONObject jSONObject) {
        super(jSONObject);
        this.b = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jla0) && epx.f(this.b, ((jla0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PinCheckCodeResponse(json=" + this.b + ')';
    }
}
