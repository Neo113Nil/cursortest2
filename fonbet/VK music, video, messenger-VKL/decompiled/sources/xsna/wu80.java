package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.model.VkOrderDescription;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkTransactionInfo;

/* compiled from: ConfirmationItems.kt */
/* loaded from: classes6.dex */
public final class wu80 implements hfz {
    public final VkOrderDescription b;
    public final VkTransactionInfo c;

    public wu80(VkOrderDescription vkOrderDescription, VkTransactionInfo vkTransactionInfo) {
        this.b = vkOrderDescription;
        this.c = vkTransactionInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu80)) {
            return false;
        }
        wu80 wu80Var = (wu80) obj;
        return epx.f(this.b, wu80Var.b) && epx.f(this.c, wu80Var.c);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OrderInfoItem(description=" + this.b + ", transactionInfo=" + this.c + ')';
    }
}
