package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;

/* compiled from: CheckoutRadioOptionItem.kt */
/* loaded from: classes18.dex */
public final class s7c implements k7r {
    public final FieldKey b;
    public final IslandPart c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final a i;

    /* compiled from: CheckoutRadioOptionItem.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Tooltip(title=");
            sb.append(this.a);
            sb.append(", text=");
            sb.append(this.b);
            sb.append(", dismissText=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public s7c(FieldKey fieldKey, IslandPart islandPart, String str, String str2, String str3, boolean z, boolean z2, a aVar) {
        this.b = fieldKey;
        this.c = islandPart;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = z2;
        this.i = aVar;
    }

    @Override // xsna.k7r
    public final IslandPart U0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7c)) {
            return false;
        }
        s7c s7cVar = (s7c) obj;
        return epx.f(this.b, s7cVar.b) && this.c == s7cVar.c && epx.f(this.d, s7cVar.d) && epx.f(this.e, s7cVar.e) && epx.f(this.f, s7cVar.f) && this.g == s7cVar.g && this.h == s7cVar.h && epx.f(this.i, s7cVar.i);
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
        int a2 = urd0.a(urd0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int b = qoy.b(qoy.b((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h);
        a aVar = this.i;
        return b + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "CheckoutRadioOptionItem(key=" + this.b + ", islandPart=" + this.c + ", type=" + this.d + ", title=" + this.e + ", description=" + this.f + ", isSelected=" + this.g + ", isEnabled=" + this.h + ", tooltip=" + this.i + ')';
    }
}
