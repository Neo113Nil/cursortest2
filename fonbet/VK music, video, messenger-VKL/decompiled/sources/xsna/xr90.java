package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.model.VkCheckoutPayMethod;
import com.vk.superapp.vkpay.checkout.api.dto.response.TransactionStatusResponse;
import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;
import org.json.JSONObject;

/* compiled from: PayOperationResponse.kt */
/* loaded from: classes6.dex */
public final class xr90 extends VkCheckoutResponse {
    public final JSONObject b;
    public final TransactionStatusResponse.VkCheckoutTransactionStatus c;
    public final String d;
    public final VkCheckoutPayMethod e;
    public final int f;

    public xr90(JSONObject jSONObject, TransactionStatusResponse.VkCheckoutTransactionStatus vkCheckoutTransactionStatus, String str, VkCheckoutPayMethod vkCheckoutPayMethod, int i) {
        super(jSONObject);
        this.b = jSONObject;
        this.c = vkCheckoutTransactionStatus;
        this.d = str;
        this.e = vkCheckoutPayMethod;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr90)) {
            return false;
        }
        xr90 xr90Var = (xr90) obj;
        return epx.f(this.b, xr90Var.b) && this.c == xr90Var.c && epx.f(this.d, xr90Var.d) && this.e == xr90Var.e && this.f == xr90Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ((this.e.hashCode() + urd0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PayOperationResponse(jsonObject=");
        sb.append(this.b);
        sb.append(", transactionStatus=");
        sb.append(this.c);
        sb.append(", transactionId=");
        sb.append(this.d);
        sb.append(", method=");
        sb.append(this.e);
        sb.append(", attemptsLeft=");
        return vu5.b(sb, this.f, ')');
    }
}
