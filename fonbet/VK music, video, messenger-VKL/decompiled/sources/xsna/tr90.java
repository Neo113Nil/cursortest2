package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.model.VkCheckoutPayMethod;
import com.vk.superapp.vkpay.checkout.api.dto.response.TransactionStatusResponse;
import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;

/* compiled from: PayOperation.kt */
/* loaded from: classes6.dex */
public final class tr90 extends b0l0 {
    public final VkCheckoutResponse.VkCheckoutResponseStatus b;
    public final TransactionStatusResponse.VkCheckoutTransactionStatus c;
    public final String d;
    public final VkCheckoutPayMethod e;
    public final int f;

    public tr90(VkCheckoutResponse.VkCheckoutResponseStatus vkCheckoutResponseStatus, TransactionStatusResponse.VkCheckoutTransactionStatus vkCheckoutTransactionStatus, String str, VkCheckoutPayMethod vkCheckoutPayMethod, int i) {
        super(vkCheckoutResponseStatus);
        this.b = vkCheckoutResponseStatus;
        this.c = vkCheckoutTransactionStatus;
        this.d = str;
        this.e = vkCheckoutPayMethod;
        this.f = i;
    }

    @Override // xsna.b0l0
    public final VkCheckoutResponse.VkCheckoutResponseStatus a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr90)) {
            return false;
        }
        tr90 tr90Var = (tr90) obj;
        return this.b == tr90Var.b && this.c == tr90Var.c && epx.f(this.d, tr90Var.d) && this.e == tr90Var.e && this.f == tr90Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ((this.e.hashCode() + urd0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PayOperation(status=");
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
