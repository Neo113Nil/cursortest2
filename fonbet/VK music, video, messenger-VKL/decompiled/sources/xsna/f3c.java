package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.ActionField;
import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;

/* compiled from: CheckoutCompleteActionItem.kt */
/* loaded from: classes18.dex */
public final class f3c implements k7r {
    public final FieldKey b;
    public final IslandPart c;
    public final String d;
    public final boolean e;
    public final ActionField.Type f;

    public f3c(FieldKey fieldKey, IslandPart islandPart, String str, boolean z, ActionField.Type type) {
        this.b = fieldKey;
        this.c = islandPart;
        this.d = str;
        this.e = z;
        this.f = type;
    }

    @Override // xsna.k7r
    public final IslandPart U0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3c)) {
            return false;
        }
        f3c f3cVar = (f3c) obj;
        return epx.f(this.b, f3cVar.b) && this.c == f3cVar.c && epx.f(this.d, f3cVar.d) && this.e == f3cVar.e && this.f == f3cVar.f;
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
        return this.f.hashCode() + qoy.b(urd0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "CheckoutCompleteActionItem(key=" + this.b + ", islandPart=" + this.c + ", title=" + this.d + ", isDisabled=" + this.e + ", type=" + this.f + ')';
    }
}
