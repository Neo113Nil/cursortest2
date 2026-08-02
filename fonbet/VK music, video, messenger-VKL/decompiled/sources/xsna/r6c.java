package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;
import java.util.ArrayList;

/* compiled from: CheckoutOrderListItem.kt */
/* loaded from: classes18.dex */
public final class r6c implements k7r {
    public final FieldKey b;
    public final IslandPart c;
    public final ArrayList d;

    public r6c(FieldKey fieldKey, IslandPart islandPart, ArrayList arrayList) {
        this.b = fieldKey;
        this.c = islandPart;
        this.d = arrayList;
    }

    @Override // xsna.k7r
    public final IslandPart U0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6c)) {
            return false;
        }
        r6c r6cVar = (r6c) obj;
        return this.b.equals(r6cVar.b) && this.c == r6cVar.c && this.d.equals(r6cVar.d);
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
        StringBuilder sb = new StringBuilder("CheckoutOrderListItem(key=");
        sb.append(this.b);
        sb.append(", islandPart=");
        sb.append(this.c);
        sb.append(", productItemList=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
    }
}
