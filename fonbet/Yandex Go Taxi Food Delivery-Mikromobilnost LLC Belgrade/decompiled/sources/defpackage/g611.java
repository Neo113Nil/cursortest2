package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class g611 implements h711 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;
    public final String h;
    public final String i;
    public final h911 j;
    public final String k;

    public g611(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, h911 h911Var, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = num;
        this.h = str7;
        this.i = str8;
        this.j = h911Var;
        this.k = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g611)) {
            return false;
        }
        g611 g611Var = (g611) obj;
        return this.a.equals(g611Var.a) && jl40.l(this.b, g611Var.b) && jl40.l(this.c, g611Var.c) && jl40.l(this.d, g611Var.d) && jl40.l(this.e, g611Var.e) && jl40.l(this.f, g611Var.f) && jl40.l(this.g, g611Var.g) && jl40.l(this.h, g611Var.h) && this.i.equals(g611Var.i) && this.j.equals(g611Var.j) && this.k.equals(g611Var.k);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.k;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.g;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.h;
        return this.k.hashCode() + ((this.j.hashCode() + unr0.b((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.i)) * 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BeginScooterSection(title=");
        sb.append((Object) this.a);
        sb.append(", time=");
        sb.append(this.b);
        sb.append(", travelTime=");
        g8e.D(sb, this.c, ", reservationBadge=", this.d, ", reservationIconTag=");
        g8e.D(sb, this.e, ", price=", this.f, ", scootersAmount=");
        tse0.w(this.g, ", vehicleLabel=", this.h, ", contentDescription=", sb);
        sb.append(this.i);
        sb.append(", transportType=");
        sb.append(this.j);
        sb.append(", id=");
        return oyr.t(sb, this.k, Extension.C_BRAKE);
    }
}
