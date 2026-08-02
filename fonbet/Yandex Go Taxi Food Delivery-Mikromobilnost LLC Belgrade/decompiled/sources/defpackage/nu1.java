package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class nu1 implements ex1 {
    public final pex0 a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final su1 e;
    public final ppi f;
    public final ou1 g;
    public final boolean h;

    public nu1(pex0 pex0Var, String str, boolean z, boolean z2, su1 su1Var, ppi ppiVar, ou1 ou1Var) {
        this.a = pex0Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = su1Var;
        this.f = ppiVar;
        this.g = ou1Var;
        this.h = ppiVar != null;
    }

    @Override // defpackage.ex1
    public final pex0 a() {
        return this.a;
    }

    @Override // defpackage.ex1
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu1)) {
            return false;
        }
        nu1 nu1Var = (nu1) obj;
        return jl40.l(this.a, nu1Var.a) && jl40.l(this.b, nu1Var.b) && this.c == nu1Var.c && this.d == nu1Var.d && jl40.l(this.e, nu1Var.e) && jl40.l(this.f, nu1Var.f) && jl40.l(this.g, nu1Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + unr0.e(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        ppi ppiVar = this.f;
        int hashCode2 = (hashCode + (ppiVar == null ? 0 : ppiVar.hashCode())) * 31;
        ou1 ou1Var = this.g;
        return hashCode2 + (ou1Var != null ? ou1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltChoice(tariff=");
        sb.append(this.a);
        sb.append(", key=");
        sb.append(this.b);
        sb.append(", isPreselected=");
        nnm.v(", isAvailable=", ", listItem=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", deliveryIntervalListItem=");
        sb.append(this.f);
        sb.append(", bubbleOption=");
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
