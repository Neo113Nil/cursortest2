package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hj5 implements m1j {
    public final String a;
    public final String b;
    public final obm c;
    public final String d;
    public final String e;
    public final k911 f;
    public final String g;

    public hj5(String str, String str2, obm obmVar, String str3, String str4, k911 k911Var, String str5) {
        this.a = str;
        this.b = str2;
        this.c = obmVar;
        this.d = str3;
        this.e = str4;
        this.f = k911Var;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj5)) {
            return false;
        }
        hj5 hj5Var = (hj5) obj;
        return jl40.l(this.a, hj5Var.a) && this.b.equals(hj5Var.b) && jl40.l(this.c, hj5Var.c) && jl40.l(this.d, hj5Var.d) && this.e.equals(hj5Var.e) && this.f.equals(hj5Var.f) && jl40.l(this.g, hj5Var.g);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.g;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        obm obmVar = this.c;
        int hashCode = (b + (obmVar == null ? 0 : obmVar.a.hashCode())) * 31;
        String str = this.d;
        return this.g.hashCode() + smw0.e(this.f, unr0.b((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("BeginRouteSectionItem(title=", this.a, ", time=", this.b, ", icon=");
        v.append(this.c);
        v.append(", avatarUrl=");
        v.append(this.d);
        v.append(", contentDescription=");
        v.append(this.e);
        v.append(", transportType=");
        v.append(this.f);
        v.append(", id=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
