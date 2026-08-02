package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class k611 implements h711 {
    public final String a;
    public final String b;
    public final obm c;
    public final String d;
    public final ib11 e;
    public final String f;
    public final i911 g;
    public final String h;

    public k611(String str, String str2, obm obmVar, String str3, ib11 ib11Var, String str4, i911 i911Var, String str5) {
        this.a = str;
        this.b = str2;
        this.c = obmVar;
        this.d = str3;
        this.e = ib11Var;
        this.f = str4;
        this.g = i911Var;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k611)) {
            return false;
        }
        k611 k611Var = (k611) obj;
        return this.a.equals(k611Var.a) && jl40.l(this.b, k611Var.b) && jl40.l(this.c, k611Var.c) && this.d.equals(k611Var.d) && this.e.equals(k611Var.e) && this.f.equals(k611Var.f) && this.g.equals(k611Var.g) && this.h.equals(k611Var.h);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.h;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 961, this.b);
        obm obmVar = this.c;
        return this.h.hashCode() + ((this.g.hashCode() + unr0.b((this.e.hashCode() + unr0.b((b + (obmVar == null ? 0 : obmVar.a.hashCode())) * 31, 31, this.d)) * 31, 31, this.f)) * 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.g;
    }

    public final String toString() {
        return "BeginUndergroundSection(title=" + ((Object) this.a) + ", time=" + this.b + ", iconRes=null, iconDrawableState=" + this.c + ", contentDescription=" + this.d + ", variant=" + this.e + ", undergroundSubtitle=" + this.f + ", transportType=" + this.g + ", id=" + this.h + Extension.C_BRAKE;
    }
}
