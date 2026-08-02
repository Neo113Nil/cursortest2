package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;

/* compiled from: CheckoutSelectItem.kt */
/* loaded from: classes18.dex */
public final class q8c implements k7r {
    public final FieldKey b;
    public final IslandPart c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public q8c(FieldKey fieldKey, IslandPart islandPart, boolean z, String str, String str2, String str3, String str4) {
        this.b = fieldKey;
        this.c = islandPart;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    @Override // xsna.k7r
    public final IslandPart U0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8c)) {
            return false;
        }
        q8c q8cVar = (q8c) obj;
        return epx.f(this.b, q8cVar.b) && this.c == q8cVar.c && this.d == q8cVar.d && epx.f(this.e, q8cVar.e) && epx.f(this.f, q8cVar.f) && epx.f(this.g, q8cVar.g) && epx.f(this.h, q8cVar.h);
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
        int a = urd0.a(qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutSelectItem(key=");
        sb.append(this.b);
        sb.append(", islandPart=");
        sb.append(this.c);
        sb.append(", isRequired=");
        sb.append(this.d);
        sb.append(", subhead=");
        sb.append(this.e);
        sb.append(", placeholder=");
        sb.append(this.f);
        sb.append(", value=");
        sb.append(this.g);
        sb.append(", error=");
        return ho8.a(sb, this.h, ')');
    }
}
