package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class e110 {
    public final String a;
    public final Double b;
    public final Double c;
    public final String d;
    public final String e;
    public final String f;

    public e110(String str, Double d, Double d2, String str2, String str3, String str4) {
        this.a = str;
        this.b = d;
        this.c = d2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final Double a() {
        return this.b;
    }

    public final Double b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e110)) {
            return false;
        }
        e110 e110Var = (e110) obj;
        return this.a.equals(e110Var.a) && jl40.l(this.b, e110Var.b) && jl40.l(this.c, e110Var.c) && jl40.l(this.d, e110Var.d) && jl40.l(this.e, e110Var.e) && jl40.l(this.f, e110Var.f);
    }

    public final String f() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Double d = this.b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MassTransitStopDeeplink(stopId=");
        sb.append(this.a);
        sb.append(", lat=");
        sb.append(this.b);
        sb.append(", lon=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", utmSource=");
        return g8e.r(sb, this.e, ", utmMedium=", this.f, Extension.C_BRAKE);
    }
}
