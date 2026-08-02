package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;

/* compiled from: TokenCreate.kt */
/* loaded from: classes6.dex */
public final class w1p0 extends b0l0 {
    public final VkCheckoutResponse.VkCheckoutResponseStatus b;
    public final String c;
    public final long d;

    public w1p0(VkCheckoutResponse.VkCheckoutResponseStatus vkCheckoutResponseStatus, String str, long j) {
        super(vkCheckoutResponseStatus);
        this.b = vkCheckoutResponseStatus;
        this.c = str;
        this.d = j;
    }

    @Override // xsna.b0l0
    public final VkCheckoutResponse.VkCheckoutResponseStatus a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1p0)) {
            return false;
        }
        w1p0 w1p0Var = (w1p0) obj;
        return this.b == w1p0Var.b && epx.f(this.c, w1p0Var.c) && this.d == w1p0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenCreate(status=");
        sb.append(this.b);
        sb.append(", token=");
        sb.append(this.c);
        sb.append(", creationTime=");
        return vu5.a(')', this.d, sb);
    }
}
