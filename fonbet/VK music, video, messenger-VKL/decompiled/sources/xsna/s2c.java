package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.ActionField;
import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;

/* compiled from: CheckoutActionItem.kt */
/* loaded from: classes18.dex */
public final class s2c implements k7r {
    public final FieldKey b;
    public final IslandPart c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final ActionField.Type g;

    public s2c(FieldKey fieldKey, IslandPart islandPart, String str, boolean z, boolean z2, ActionField.Type type) {
        this.b = fieldKey;
        this.c = islandPart;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = type;
    }

    @Override // xsna.k7r
    public final IslandPart U0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2c)) {
            return false;
        }
        s2c s2cVar = (s2c) obj;
        return epx.f(this.b, s2cVar.b) && this.c == s2cVar.c && epx.f(this.d, s2cVar.d) && this.e == s2cVar.e && this.f == s2cVar.f && this.g == s2cVar.g;
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
        return this.g.hashCode() + qoy.b(qoy.b(urd0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "CheckoutActionItem(key=" + this.b + ", islandPart=" + this.c + ", title=" + this.d + ", isPrimary=" + this.e + ", isDisabled=" + this.f + ", type=" + this.g + ')';
    }
}
