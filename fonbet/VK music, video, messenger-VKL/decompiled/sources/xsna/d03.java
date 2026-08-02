package xsna;

import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;

/* compiled from: ApiResultAddress.kt */
/* loaded from: classes18.dex */
public final class d03 {
    public final String a;
    public final Coordinates b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public d03(String str, Coordinates coordinates, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = str;
        this.b = coordinates;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d03)) {
            return false;
        }
        d03 d03Var = (d03) obj;
        return this.a.equals(d03Var.a) && this.b.equals(d03Var.b) && epx.f(this.c, d03Var.c) && epx.f(this.d, d03Var.d) && epx.f(this.e, d03Var.e) && epx.f(this.f, d03Var.f) && epx.f(this.g, d03Var.g) && epx.f(this.h, d03Var.h) && epx.f(this.i, d03Var.i) && epx.f(this.j, d03Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 961;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.j;
        return hashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApiResultAddress(fullAddressName=");
        sb.append(this.a);
        sb.append(", coordinates=");
        sb.append(this.b);
        sb.append(", country=");
        sb.append(this.c);
        sb.append(", countryCode=null, street=");
        sb.append(this.d);
        sb.append(", sublocality=");
        sb.append(this.e);
        sb.append(", city=");
        sb.append(this.f);
        sb.append(", adminArea=");
        sb.append(this.g);
        sb.append(", building=");
        sb.append(this.h);
        sb.append(", postalIndex=");
        sb.append(this.i);
        sb.append(", isoCode=");
        return ho8.a(sb, this.j, ')');
    }
}
