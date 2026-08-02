package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;

/* compiled from: CardIdStatused.kt */
/* loaded from: classes6.dex */
public final class gt9 extends b0l0 {
    public final VkCheckoutResponse.VkCheckoutResponseStatus b;
    public final String c;

    public gt9(VkCheckoutResponse.VkCheckoutResponseStatus vkCheckoutResponseStatus, String str) {
        super(vkCheckoutResponseStatus);
        this.b = vkCheckoutResponseStatus;
        this.c = str;
    }

    @Override // xsna.b0l0
    public final VkCheckoutResponse.VkCheckoutResponseStatus a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt9)) {
            return false;
        }
        gt9 gt9Var = (gt9) obj;
        return this.b == gt9Var.b && epx.f(this.c, gt9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardIdStatused(status=");
        sb.append(this.b);
        sb.append(", cardId=");
        return ho8.a(sb, this.c, ')');
    }
}
