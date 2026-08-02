package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jej0 {
    public final String a;
    public final zdj0 b;
    public final rdj0 c;
    public final aej0 d;
    public final iej0 e;
    public final String f;
    public final String g;

    public jej0(String str, zdj0 zdj0Var, rdj0 rdj0Var, aej0 aej0Var, iej0 iej0Var, String str2, String str3) {
        this.a = str;
        this.b = zdj0Var;
        this.c = rdj0Var;
        this.d = aej0Var;
        this.e = iej0Var;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jej0)) {
            return false;
        }
        jej0 jej0Var = (jej0) obj;
        return jl40.l(this.a, jej0Var.a) && jl40.l(this.b, jej0Var.b) && jl40.l(this.c, jej0Var.c) && jl40.l(this.d, jej0Var.d) && jl40.l(this.e, jej0Var.e) && jl40.l(this.f, jej0Var.f) && jl40.l(this.g, jej0Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.d.a.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        iej0 iej0Var = this.e;
        int b = unr0.b((hashCode + (iej0Var == null ? 0 : iej0Var.hashCode())) * 31, 31, this.f);
        String str = this.g;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequirementChipUiState(id=");
        sb.append(this.a);
        sb.append(", leadUiState=");
        sb.append(this.b);
        sb.append(", bodyUiState=");
        sb.append(this.c);
        sb.append(", trailUiState=");
        sb.append(this.d);
        sb.append(", action=");
        sb.append(this.e);
        sb.append(", contentDescription=");
        sb.append(this.f);
        sb.append(", clickActionLabel=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
