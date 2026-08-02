package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class n611 implements h711 {
    public final String a;
    public final String b;
    public final Integer c;
    public final obm d;
    public final String e;
    public final k911 f;
    public final String g;

    public n611(String str, String str2, Integer num, obm obmVar, String str3, k911 k911Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = obmVar;
        this.e = str3;
        this.f = k911Var;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n611)) {
            return false;
        }
        n611 n611Var = (n611) obj;
        return jl40.l(this.a, n611Var.a) && jl40.l(this.b, n611Var.b) && jl40.l(this.c, n611Var.c) && jl40.l(this.d, n611Var.d) && jl40.l(this.e, n611Var.e) && jl40.l(this.f, n611Var.f) && jl40.l(this.g, n611Var.g);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.g;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        obm obmVar = this.d;
        return this.g.hashCode() + smw0.e(this.f, unr0.b((hashCode + (obmVar != null ? obmVar.a.hashCode() : 0)) * 31, 31, this.e), 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.f;
    }

    public final String toString() {
        StringBuilder v = b64.v("FinishSection(title=", this.a, ", time=", this.b, ", iconRes=");
        v.append(this.c);
        v.append(", iconDrawableState=");
        v.append(this.d);
        v.append(", contentDescription=");
        v.append(this.e);
        v.append(", transportType=");
        v.append(this.f);
        v.append(", id=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
