package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;

/* compiled from: CheckoutOrderListLoadingItem.kt */
/* loaded from: classes18.dex */
public final class w6c implements k7r {
    public final FieldKey b;
    public final IslandPart c;

    public w6c(FieldKey fieldKey, IslandPart islandPart) {
        this.b = fieldKey;
        this.c = islandPart;
    }

    @Override // xsna.k7r
    public final IslandPart U0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6c)) {
            return false;
        }
        w6c w6cVar = (w6c) obj;
        return epx.f(this.b, w6cVar.b) && this.c == w6cVar.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    @Override // xsna.k7r
    public final FieldKey getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "CheckoutOrderListLoadingItem(key=" + this.b + ", islandPart=" + this.c + ')';
    }
}
