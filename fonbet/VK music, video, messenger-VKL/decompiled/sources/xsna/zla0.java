package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;

/* compiled from: PinForgot.kt */
/* loaded from: classes6.dex */
public final class zla0 extends b0l0 {
    public final VkCheckoutResponse.VkCheckoutResponseStatus b;
    public final String c;

    public zla0(VkCheckoutResponse.VkCheckoutResponseStatus vkCheckoutResponseStatus, String str) {
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
        if (!(obj instanceof zla0)) {
            return false;
        }
        zla0 zla0Var = (zla0) obj;
        return this.b == zla0Var.b && epx.f(this.c, zla0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PinForgot(status=");
        sb.append(this.b);
        sb.append(", forgotId=");
        return ho8.a(sb, this.c, ')');
    }
}
