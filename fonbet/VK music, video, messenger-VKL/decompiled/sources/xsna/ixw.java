package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import java.util.List;

/* compiled from: InitCheckout.kt */
/* loaded from: classes6.dex */
public final class ixw extends b0l0 {
    public final VkCheckoutResponse.VkCheckoutResponseStatus b;
    public final String c;
    public final List<PayMethodData> d;

    /* JADX WARN: Multi-variable type inference failed */
    public ixw(VkCheckoutResponse.VkCheckoutResponseStatus vkCheckoutResponseStatus, String str, List<? extends PayMethodData> list) {
        super(vkCheckoutResponseStatus);
        this.b = vkCheckoutResponseStatus;
        this.c = str;
        this.d = list;
    }

    @Override // xsna.b0l0
    public final VkCheckoutResponse.VkCheckoutResponseStatus a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixw)) {
            return false;
        }
        ixw ixwVar = (ixw) obj;
        return this.b == ixwVar.b && epx.f(this.c, ixwVar.c) && epx.f(this.d, ixwVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InitCheckout(status=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", paymentMethods=");
        return ms9.a(')', sb, this.d);
    }
}
