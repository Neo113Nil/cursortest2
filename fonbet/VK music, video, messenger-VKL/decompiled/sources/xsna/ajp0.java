package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.response.TransactionStatusResponse;
import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;

/* compiled from: TransactionStatus.kt */
/* loaded from: classes6.dex */
public final class ajp0 extends b0l0 {
    public final VkCheckoutResponse.VkCheckoutResponseStatus b;
    public final TransactionStatusResponse.VkCheckoutTransactionStatus c;
    public final String d;
    public final xou0 e;

    public ajp0(VkCheckoutResponse.VkCheckoutResponseStatus vkCheckoutResponseStatus, TransactionStatusResponse.VkCheckoutTransactionStatus vkCheckoutTransactionStatus, String str, xou0 xou0Var) {
        super(vkCheckoutResponseStatus);
        this.b = vkCheckoutResponseStatus;
        this.c = vkCheckoutTransactionStatus;
        this.d = str;
        this.e = xou0Var;
    }

    @Override // xsna.b0l0
    public final VkCheckoutResponse.VkCheckoutResponseStatus a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajp0)) {
            return false;
        }
        ajp0 ajp0Var = (ajp0) obj;
        return this.b == ajp0Var.b && this.c == ajp0Var.c && epx.f(this.d, ajp0Var.d) && epx.f(this.e, ajp0Var.e);
    }

    public final int hashCode() {
        int a = urd0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
        xou0 xou0Var = this.e;
        return a + (xou0Var == null ? 0 : xou0Var.hashCode());
    }

    public final String toString() {
        return "TransactionStatus(status=" + this.b + ", transactionStatus=" + this.c + ", acsUrl=" + this.d + ", data3ds=" + this.e + ')';
    }
}
