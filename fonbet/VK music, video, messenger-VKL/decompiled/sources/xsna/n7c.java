package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;

/* compiled from: CheckoutPriceInfoItem.kt */
/* loaded from: classes18.dex */
public final class n7c implements k7r {
    public final FieldKey b;
    public final IslandPart c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public n7c(FieldKey fieldKey, IslandPart islandPart, String str, String str2, String str3, boolean z, boolean z2) {
        this.b = fieldKey;
        this.c = islandPart;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = z2;
    }

    @Override // xsna.k7r
    public final IslandPart U0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7c)) {
            return false;
        }
        n7c n7cVar = (n7c) obj;
        return epx.f(this.b, n7cVar.b) && this.c == n7cVar.c && epx.f(this.d, n7cVar.d) && epx.f(this.e, n7cVar.e) && epx.f(this.f, n7cVar.f) && this.g == n7cVar.g && this.h == n7cVar.h;
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
        return Boolean.hashCode(this.h) + qoy.b(urd0.a(urd0.a(urd0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutPriceInfoItem(key=");
        sb.append(this.b);
        sb.append(", islandPart=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", price=");
        sb.append(this.f);
        sb.append(", isDiscount=");
        sb.append(this.g);
        sb.append(", isAccent=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
