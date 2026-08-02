package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;

/* compiled from: CheckoutHeaderItem.kt */
/* loaded from: classes18.dex */
public final class m5c implements k7r {
    public final FieldKey b;
    public final IslandPart c;
    public final tlo0 d;
    public final String e;

    public m5c(FieldKey fieldKey, IslandPart islandPart, tlo0 tlo0Var, String str) {
        this.b = fieldKey;
        this.c = islandPart;
        this.d = tlo0Var;
        this.e = str;
    }

    @Override // xsna.k7r
    public final IslandPart U0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5c)) {
            return false;
        }
        m5c m5cVar = (m5c) obj;
        return epx.f(this.b, m5cVar.b) && this.c == m5cVar.c && epx.f(this.d, m5cVar.d) && epx.f(this.e, m5cVar.e);
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
        int a = com.vk.movika.sdk.base.model.history.b.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
        String str = this.e;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutHeaderItem(key=");
        sb.append(this.b);
        sb.append(", islandPart=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", description=");
        return ho8.a(sb, this.e, ')');
    }
}
