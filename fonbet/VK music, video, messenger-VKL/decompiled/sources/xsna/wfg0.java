package xsna;

import com.vk.search.params.api.domain.model.geo.Coordinate;

/* compiled from: ReverseGeocodeResult.kt */
/* loaded from: classes5.dex */
public final class wfg0 {
    public final String a;
    public final Coordinate b;
    public final Integer c;
    public final a d;

    /* compiled from: ReverseGeocodeResult.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = str9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i);
        }

        public final int hashCode() {
            int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.g;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.h;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.i;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AddressDetails(isocode=");
            sb.append(this.a);
            sb.append(", country=");
            sb.append(this.b);
            sb.append(", region=");
            sb.append(this.c);
            sb.append(", subregion=");
            sb.append(this.d);
            sb.append(", locality=");
            sb.append(this.e);
            sb.append(", suburb=");
            sb.append(this.f);
            sb.append(", sublocality=");
            sb.append(this.g);
            sb.append(", street=");
            sb.append(this.h);
            sb.append(", building=");
            return ho8.a(sb, this.i, ')');
        }
    }

    public wfg0(String str, Coordinate coordinate, Integer num, a aVar) {
        this.a = str;
        this.b = coordinate;
        this.c = num;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfg0)) {
            return false;
        }
        wfg0 wfg0Var = (wfg0) obj;
        return epx.f(this.a, wfg0Var.a) && epx.f(this.b, wfg0Var.b) && epx.f(this.c, wfg0Var.c) && epx.f(this.d, wfg0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        a aVar = this.d;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "ReverseGeocodeResult(address=" + this.a + ", coordinate=" + this.b + ", cityId=" + this.c + ", addressDetails=" + this.d + ')';
    }
}
