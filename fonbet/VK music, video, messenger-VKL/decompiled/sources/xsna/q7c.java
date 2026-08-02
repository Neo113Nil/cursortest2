package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;

/* compiled from: CheckoutPromptItem.kt */
/* loaded from: classes18.dex */
public final class q7c implements k7r {
    public final FieldKey b;
    public final IslandPart c;
    public final String d;

    public q7c(FieldKey fieldKey, IslandPart islandPart, String str) {
        this.b = fieldKey;
        this.c = islandPart;
        this.d = str;
    }

    @Override // xsna.k7r
    public final IslandPart U0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7c)) {
            return false;
        }
        q7c q7cVar = (q7c) obj;
        return epx.f(this.b, q7cVar.b) && this.c == q7cVar.c && epx.f(this.d, q7cVar.d);
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
        StringBuilder sb = new StringBuilder("CheckoutPromptItem(key=");
        sb.append(this.b);
        sb.append(", islandPart=");
        sb.append(this.c);
        sb.append(", title=");
        return ho8.a(sb, this.d, ')');
    }
}
