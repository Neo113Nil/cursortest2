package defpackage;

import com.yandex.plus.core.graphql.type.OFFER_VENDOR_TYPE;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pe70 {
    public final String a;
    public final String b;
    public final ne70 c;
    public final String d;
    public final String e;
    public final String f;
    public final me70 g;
    public final Object h;
    public final ArrayList i;
    public final OFFER_VENDOR_TYPE j;
    public final Map k;

    public pe70(String str, String str2, ne70 ne70Var, String str3, String str4, String str5, me70 me70Var, Object obj, ArrayList arrayList, OFFER_VENDOR_TYPE offer_vendor_type, Map map) {
        this.a = str;
        this.b = str2;
        this.c = ne70Var;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = me70Var;
        this.h = obj;
        this.i = arrayList;
        this.j = offer_vendor_type;
        this.k = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe70)) {
            return false;
        }
        pe70 pe70Var = (pe70) obj;
        return this.a.equals(pe70Var.a) && this.b.equals(pe70Var.b) && this.c.equals(pe70Var.c) && jl40.l(this.d, pe70Var.d) && jl40.l(this.e, pe70Var.e) && jl40.l(this.f, pe70Var.f) && this.g.equals(pe70Var.g) && this.h.equals(pe70Var.h) && this.i.equals(pe70Var.i) && this.j == pe70Var.j && jl40.l(this.k, pe70Var.k);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c.a);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode3 = (this.j.hashCode() + ly3.b(smw0.c((this.g.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.h), 31, this.i)) * 31;
        Map map = this.k;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OptionOffer(name=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", option=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", text=");
        sb.append(this.e);
        sb.append(", additionText=");
        sb.append(this.f);
        sb.append(", commonPrice=");
        sb.append(this.g);
        sb.append(", commonPeriod=");
        sb.append(this.h);
        sb.append(", plans=");
        sb.append(this.i);
        sb.append(", offerVendorType=");
        sb.append(this.j);
        sb.append(", payload=");
        return smw0.n(sb, this.k, ')');
    }
}
