package xsna;

import com.vk.superapp.bridges.dto.tapandpay.VkTokenizationNetworkName;

/* compiled from: VkTokenizationCard.kt */
/* loaded from: classes6.dex */
public final class nsv0 {
    public final String a;
    public final String b;
    public final VkTokenizationNetworkName c;

    public nsv0(String str, String str2, VkTokenizationNetworkName vkTokenizationNetworkName) {
        this.a = str;
        this.b = str2;
        this.c = vkTokenizationNetworkName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsv0)) {
            return false;
        }
        nsv0 nsv0Var = (nsv0) obj;
        return epx.f(this.a, nsv0Var.a) && epx.f(this.b, nsv0Var.b) && this.c == nsv0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "VkTokenizationCard(cardHolderName=" + this.a + ", lastDigits=" + this.b + ", networkName=" + this.c + ')';
    }
}
