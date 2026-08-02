package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;

/* compiled from: CheckoutTextInfoItem.kt */
/* loaded from: classes18.dex */
public final class c9c implements k7r {
    public final FieldKey b;
    public final IslandPart c;
    public final CharSequence d;

    public c9c(FieldKey fieldKey, IslandPart islandPart, CharSequence charSequence) {
        this.b = fieldKey;
        this.c = islandPart;
        this.d = charSequence;
    }

    @Override // xsna.k7r
    public final IslandPart U0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9c)) {
            return false;
        }
        c9c c9cVar = (c9c) obj;
        return epx.f(this.b, c9cVar.b) && this.c == c9cVar.c && epx.f(this.d, c9cVar.d);
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
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutTextInfoItem(key=");
        sb.append(this.b);
        sb.append(", islandPart=");
        sb.append(this.c);
        sb.append(", info=");
        return thl0.a(sb, this.d, ')');
    }
}
