package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pk10 {
    public final rr51 a;
    public final rr51 b;
    public final fxy0 c;

    public pk10(rr51 rr51Var, rr51 rr51Var2, fxy0 fxy0Var) {
        this.a = rr51Var;
        this.b = rr51Var2;
        this.c = fxy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk10)) {
            return false;
        }
        pk10 pk10Var = (pk10) obj;
        return jl40.l(this.a, pk10Var.a) && jl40.l(this.b, pk10Var.b) && jl40.l(this.c, pk10Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rr51 rr51Var = this.b;
        int hashCode2 = (hashCode + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        fxy0 fxy0Var = this.c;
        return hashCode2 + (fxy0Var != null ? fxy0Var.hashCode() : 0);
    }

    public final String toString() {
        return "MenuEntity(divData=" + this.a + ", toolbarDivData=" + this.b + ", toolbarBackgroundColor=" + this.c + Extension.C_BRAKE;
    }
}
