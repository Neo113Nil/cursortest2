package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class j611 implements h711 {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;
    public final boolean d;
    public final obm e;
    public final String f;
    public final CharSequence g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final u611 l;
    public final h911 m;
    public final String n;

    public j611(CharSequence charSequence, CharSequence charSequence2, String str, boolean z, obm obmVar, String str2, CharSequence charSequence3, String str3, String str4, String str5, String str6, u611 u611Var, h911 h911Var, String str7) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = str;
        this.d = z;
        this.e = obmVar;
        this.f = str2;
        this.g = charSequence3;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = u611Var;
        this.m = h911Var;
        this.n = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j611)) {
            return false;
        }
        j611 j611Var = (j611) obj;
        return jl40.l(this.a, j611Var.a) && this.b.equals(j611Var.b) && jl40.l(this.c, j611Var.c) && this.d == j611Var.d && jl40.l(this.e, j611Var.e) && this.f.equals(j611Var.f) && jl40.l(this.g, j611Var.g) && jl40.l(this.h, j611Var.h) && jl40.l(this.i, j611Var.i) && jl40.l(this.j, j611Var.j) && jl40.l(this.k, j611Var.k) && jl40.l(this.l, j611Var.l) && this.m.equals(j611Var.m) && this.n.equals(j611Var.n);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.n;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 961, this.d);
        obm obmVar = this.e;
        int b = unr0.b((e + (obmVar == null ? 0 : obmVar.a.hashCode())) * 31, 31, this.f);
        CharSequence charSequence = this.g;
        int hashCode = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        u611 u611Var = this.l;
        return this.n.hashCode() + ((this.m.hashCode() + ((hashCode5 + (u611Var != null ? u611Var.hashCode() : 0)) * 31)) * 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.m;
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "BeginTaxiSection(title=", ", subtitle=", ", time=");
        tse0.y(this.c, ", hasFeedbackSection=", ", iconRes=null, iconDrawableState=", r, this.d);
        r.append(this.e);
        r.append(", contentDescription=");
        r.append(this.f);
        r.append(", v2TariffName=");
        r.append((Object) this.g);
        r.append(", v2TariffIconTag=");
        r.append(this.h);
        r.append(", v2Price=");
        g8e.D(r, this.i, ", v2Eta=", this.j, ", v2DurationText=");
        r.append(this.k);
        r.append(", v2Feedback=");
        r.append(this.l);
        r.append(", transportType=");
        r.append(this.m);
        r.append(", id=");
        r.append(this.n);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
