package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;

/* compiled from: CheckoutCheckBoxItem.kt */
/* loaded from: classes18.dex */
public final class c3c implements k7r {
    public final FieldKey b;
    public final IslandPart c;
    public final String d;
    public final boolean e;

    public c3c(FieldKey fieldKey, IslandPart islandPart, String str, boolean z) {
        this.b = fieldKey;
        this.c = islandPart;
        this.d = str;
        this.e = z;
    }

    @Override // xsna.k7r
    public final IslandPart U0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3c)) {
            return false;
        }
        c3c c3cVar = (c3c) obj;
        return epx.f(this.b, c3cVar.b) && this.c == c3cVar.c && epx.f(this.d, c3cVar.d) && this.e == c3cVar.e;
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
        return Boolean.hashCode(this.e) + urd0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutCheckBoxItem(key=");
        sb.append(this.b);
        sb.append(", islandPart=");
        sb.append(this.c);
        sb.append(", label=");
        sb.append(this.d);
        sb.append(", isChecked=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
