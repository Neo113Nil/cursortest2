package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nx00 {
    public final w3b1 a;
    public final String b;
    public final ldc c;
    public final String d;
    public final ldc e;
    public final v4v f;

    public nx00(w3b1 w3b1Var, String str, ldc ldcVar, String str2, ldc ldcVar2, v4v v4vVar) {
        this.a = w3b1Var;
        this.b = str;
        this.c = ldcVar;
        this.d = str2;
        this.e = ldcVar2;
        this.f = v4vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx00)) {
            return false;
        }
        nx00 nx00Var = (nx00) obj;
        return jl40.l(this.a, nx00Var.a) && jl40.l(this.b, nx00Var.b) && jl40.l(this.c, nx00Var.c) && jl40.l(this.d, nx00Var.d) && jl40.l(this.e, nx00Var.e) && jl40.l(this.f, nx00Var.f);
    }

    public final int hashCode() {
        w3b1 w3b1Var = this.a;
        int b = unr0.b((w3b1Var == null ? 0 : w3b1Var.hashCode()) * 31, 31, this.b);
        ldc ldcVar = this.c;
        int hashCode = (b + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ldc ldcVar2 = this.e;
        int hashCode3 = (hashCode2 + (ldcVar2 == null ? 0 : Long.hashCode(ldcVar2.a))) * 31;
        v4v v4vVar = this.f;
        return hashCode3 + (v4vVar != null ? v4vVar.hashCode() : 0);
    }

    public final String toString() {
        return "PanelLayout(background=" + this.a + ", title=" + this.b + ", titleColor=" + this.c + ", subtitle=" + this.d + ", subtitleColor=" + this.e + ", icon=" + this.f + Extension.C_BRAKE;
    }
}
