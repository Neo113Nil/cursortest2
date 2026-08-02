package xsna;

/* compiled from: SuggestionsResult.kt */
/* loaded from: classes18.dex */
public final class rdg0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public rdg0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdg0)) {
            return false;
        }
        rdg0 rdg0Var = (rdg0) obj;
        return epx.f(this.a, rdg0Var.a) && epx.f(this.b, rdg0Var.b) && epx.f(this.c, rdg0Var.c) && epx.f(this.d, rdg0Var.d) && epx.f(this.e, rdg0Var.e) && epx.f(this.f, rdg0Var.f) && epx.f(this.g, rdg0Var.g) && epx.f(this.h, rdg0Var.h);
    }

    public final int hashCode() {
        String str = this.a;
        int a = urd0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int hashCode = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        return hashCode5 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultAddress(refCode=");
        sb.append(this.a);
        sb.append(", fullAddressName=");
        sb.append(this.b);
        sb.append(", street=");
        sb.append(this.c);
        sb.append(", city=");
        sb.append(this.d);
        sb.append(", adminArea=");
        sb.append(this.e);
        sb.append(", building=");
        sb.append(this.f);
        sb.append(", postalIndex=");
        sb.append(this.g);
        sb.append(", subLocality=");
        return ho8.a(sb, this.h, ')');
    }
}
