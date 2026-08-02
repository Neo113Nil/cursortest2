package xsna;

import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;

/* compiled from: ConfirmationItems.kt */
/* loaded from: classes6.dex */
public final class s1g0 implements hfz {
    public final sr90<? extends PayMethodData> b;

    public s1g0(sr90<? extends PayMethodData> sr90Var) {
        this.b = sr90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1g0) && epx.f(this.b, ((s1g0) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ReplenishCardSelectorItem(cardData=" + this.b + ')';
    }
}
