package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: InputFieldsRowItem.kt */
/* loaded from: classes18.dex */
public final class x1x implements k7r {
    public final FieldKey b;
    public final IslandPart c;
    public final List<u1x> d;

    public x1x(FieldKey fieldKey, IslandPart islandPart, ListBuilder listBuilder) {
        this.b = fieldKey;
        this.c = islandPart;
        this.d = listBuilder;
    }

    @Override // xsna.k7r
    public final IslandPart U0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1x)) {
            return false;
        }
        x1x x1xVar = (x1x) obj;
        return epx.f(this.b, x1xVar.b) && this.c == x1xVar.c && epx.f(this.d, x1xVar.d);
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
        StringBuilder sb = new StringBuilder("InputFieldsRowItem(key=");
        sb.append(this.b);
        sb.append(", islandPart=");
        sb.append(this.c);
        sb.append(", inputFields=");
        return ms9.a(')', sb, this.d);
    }
}
