package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.feature.state.PaymentInfoField;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;

/* compiled from: CheckoutTooltipTextInfoItem.kt */
/* loaded from: classes18.dex */
public final class f9c implements k7r {
    public final String b;
    public final PaymentInfoField.a c;
    public final FieldKey d;
    public final IslandPart e;

    public f9c(String str, PaymentInfoField.a aVar, FieldKey fieldKey, IslandPart islandPart) {
        this.b = str;
        this.c = aVar;
        this.d = fieldKey;
        this.e = islandPart;
    }

    @Override // xsna.k7r
    public final IslandPart U0() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9c)) {
            return false;
        }
        f9c f9cVar = (f9c) obj;
        return epx.f(this.b, f9cVar.b) && epx.f(this.c, f9cVar.c) && epx.f(this.d, f9cVar.d) && this.e == f9cVar.e;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    @Override // xsna.k7r
    public final FieldKey getKey() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        PaymentInfoField.a aVar = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "CheckoutTooltipTextInfoItem(title=" + this.b + ", tooltip=" + this.c + ", key=" + this.d + ", islandPart=" + this.e + ')';
    }
}
