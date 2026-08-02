package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hu40 {
    public final String a;
    public final int b;
    public final Integer c;
    public final Double d;
    public final String e;
    public final String f;
    public final Integer g;
    public final Integer h;

    public hu40(String str, int i, Integer num, Double d, String str2, String str3, Integer num2, Integer num3) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = d;
        this.e = str2;
        this.f = str3;
        this.g = num2;
        this.h = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu40)) {
            return false;
        }
        hu40 hu40Var = (hu40) obj;
        return jl40.l(this.a, hu40Var.a) && this.b == hu40Var.b && jl40.l(this.c, hu40Var.c) && jl40.l(this.d, hu40Var.d) && jl40.l(this.e, hu40Var.e) && jl40.l(this.f, hu40Var.f) && jl40.l(this.g, hu40Var.g) && jl40.l(this.h, hu40Var.h);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.d;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.g;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.h;
        return hashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "MultimodalRouteOption(service=", this.a, ", routeDurationMin=", ", etaMin=");
        u.append(this.c);
        u.append(", price=");
        u.append(this.d);
        u.append(", tariff=");
        g8e.D(u, this.e, ", offerId=", this.f, ", walkDuration=");
        u.append(this.g);
        u.append(", transfers=");
        u.append(this.h);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
