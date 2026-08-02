package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.model.a;
import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;
import java.util.List;

/* compiled from: Init.kt */
/* loaded from: classes6.dex */
public final class vww extends b0l0 {
    public final VkCheckoutResponse.VkCheckoutResponseStatus b;
    public final List<a.C1916a> c;
    public final a.b d;
    public final String e;

    /* JADX WARN: Multi-variable type inference failed */
    public vww(VkCheckoutResponse.VkCheckoutResponseStatus vkCheckoutResponseStatus, List<? extends a.C1916a> list, a.b bVar, String str) {
        super(vkCheckoutResponseStatus);
        this.b = vkCheckoutResponseStatus;
        this.c = list;
        this.d = bVar;
        this.e = str;
    }

    @Override // xsna.b0l0
    public final VkCheckoutResponse.VkCheckoutResponseStatus a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vww)) {
            return false;
        }
        vww vwwVar = (vww) obj;
        return this.b == vwwVar.b && epx.f(this.c, vwwVar.c) && epx.f(this.d, vwwVar.d) && epx.f(this.e, vwwVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + fw3.a(this.b.hashCode() * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Init(status=");
        sb.append(this.b);
        sb.append(", initPayMethods=");
        sb.append(this.c);
        sb.append(", wallet=");
        sb.append(this.d);
        sb.append(", title=");
        return ho8.a(sb, this.e, ')');
    }
}
