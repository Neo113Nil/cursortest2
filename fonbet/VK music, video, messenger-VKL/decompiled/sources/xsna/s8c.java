package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;

/* compiled from: CheckoutSeparatorItem.kt */
/* loaded from: classes18.dex */
public final class s8c implements k7r {
    public final FieldKey b;
    public final IslandPart c;

    public s8c(FieldKey fieldKey, IslandPart islandPart) {
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
        if (!(obj instanceof s8c)) {
            return false;
        }
        s8c s8cVar = (s8c) obj;
        return epx.f(this.b, s8cVar.b) && this.c == s8cVar.c;
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
        return "CheckoutSeparatorItem(key=" + this.b + ", islandPart=" + this.c + ')';
    }
}
