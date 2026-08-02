package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;

/* compiled from: CheckoutBannerItem.kt */
/* loaded from: classes18.dex */
public final class x2c implements k7r {
    public final FieldKey b;
    public final IslandPart c;
    public final String d;
    public final String e;
    public final boolean f;

    public x2c(FieldKey fieldKey, IslandPart islandPart, String str, String str2, boolean z) {
        this.b = fieldKey;
        this.c = islandPart;
        this.d = str;
        this.e = str2;
        this.f = z;
    }

    @Override // xsna.k7r
    public final IslandPart U0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2c)) {
            return false;
        }
        x2c x2cVar = (x2c) obj;
        return this.b.equals(x2cVar.b) && this.c == x2cVar.c && epx.f(this.d, x2cVar.d) && epx.f(this.e, x2cVar.e) && this.f == x2cVar.f;
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
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        String str = this.d;
        return Boolean.hashCode(this.f) + urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutBannerItem(key=");
        sb.append(this.b);
        sb.append(", islandPart=");
        sb.append(this.c);
        sb.append(", secondaryText=");
        sb.append(this.d);
        sb.append(", foldablePrimaryText=");
        sb.append(this.e);
        sb.append(", isFolded=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
