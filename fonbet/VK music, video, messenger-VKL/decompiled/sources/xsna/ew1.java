package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.model.VkTransactionInfo;

/* compiled from: ConfirmationItems.kt */
/* loaded from: classes6.dex */
public final class ew1 implements hki0 {
    public final int b;
    public final VkTransactionInfo.Currency c;

    public ew1(int i, VkTransactionInfo.Currency currency) {
        this.b = i;
        this.c = currency;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew1)) {
            return false;
        }
        ew1 ew1Var = (ew1) obj;
        return this.b == ew1Var.b && this.c == ew1Var.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    @Override // xsna.hki0, xsna.jjv0
    public final int n1(int i) {
        return 2;
    }

    @Override // xsna.jjv0
    public final int t(int i) {
        return 0;
    }

    public final String toString() {
        return "AmountToReplenishItem(extraAmount=" + this.b + ", currency=" + this.c + ')';
    }
}
