package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class i611 implements h711 {
    public final String a;
    public final String b;
    public final obm c;
    public final String d;
    public final ib11 e;
    public final String f;
    public final h911 g;
    public final String h;

    public i611(String str, String str2, obm obmVar, String str3, ib11 ib11Var, String str4, h911 h911Var, String str5) {
        this.a = str;
        this.b = str2;
        this.c = obmVar;
        this.d = str3;
        this.e = ib11Var;
        this.f = str4;
        this.g = h911Var;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i611)) {
            return false;
        }
        i611 i611Var = (i611) obj;
        return this.a.equals(i611Var.a) && jl40.l(this.b, i611Var.b) && jl40.l(this.c, i611Var.c) && this.d.equals(i611Var.d) && this.e.equals(i611Var.e) && jl40.l(this.f, i611Var.f) && this.g.equals(i611Var.g) && this.h.equals(i611Var.h);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.h;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 961, 961, this.b);
        obm obmVar = this.c;
        return this.h.hashCode() + ((this.g.hashCode() + unr0.b((this.e.hashCode() + unr0.b((b + (obmVar == null ? 0 : obmVar.a.hashCode())) * 31, 31, this.d)) * 31, 31, this.f)) * 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.g;
    }

    public final String toString() {
        return "BeginSuburbanSection(title=" + ((Object) this.a) + ", subtitle=, time=" + this.b + ", iconRes=null, iconDrawableState=" + this.c + ", contentDescription=" + this.d + ", variant=" + this.e + ", suburbanSubtitle=" + this.f + ", transportType=" + this.g + ", id=" + this.h + Extension.C_BRAKE;
    }
}
