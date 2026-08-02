package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class f611 implements h711 {
    public final String a;
    public final String b;
    public final obm c;
    public final v1u d;
    public final String e;
    public final String f;
    public final h911 g;
    public final String h;

    public f611(String str, String str2, obm obmVar, v1u v1uVar, String str3, String str4, h911 h911Var, String str5) {
        this.a = str;
        this.b = str2;
        this.c = obmVar;
        this.d = v1uVar;
        this.e = str3;
        this.f = str4;
        this.g = h911Var;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f611)) {
            return false;
        }
        f611 f611Var = (f611) obj;
        return this.a.equals(f611Var.a) && jl40.l(this.b, f611Var.b) && jl40.l(this.c, f611Var.c) && this.d.equals(f611Var.d) && this.e.equals(f611Var.e) && this.f.equals(f611Var.f) && this.g.equals(f611Var.g) && this.h.equals(f611Var.h);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.h;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 961, this.b);
        obm obmVar = this.c;
        return this.h.hashCode() + ((this.g.hashCode() + unr0.b(unr0.b((this.d.hashCode() + ((b + (obmVar == null ? 0 : obmVar.a.hashCode())) * 31)) * 31, 31, this.e), 31, this.f)) * 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.g;
    }

    public final String toString() {
        StringBuilder v = b64.v("BeginGroundSectionItem(title=", this.a, ", time=", this.b, ", iconRes=null, iconDrawableState=");
        v.append(this.c);
        v.append(", subtitleState=");
        v.append(this.d);
        v.append(", contentDescription=");
        g8e.D(v, this.e, ", v2ContentDescription=", this.f, ", transportType=");
        v.append(this.g);
        v.append(", id=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
