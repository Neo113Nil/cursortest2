package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class fum0 {
    public final String a;
    public final boolean b;
    public final cum0 c;
    public final aum0 d;
    public final xtm0 e;
    public final CharSequence f;
    public final utm0 g;
    public final utm0 h;
    public final vtm0 i;
    public final eum0 j;

    public fum0(String str, boolean z, cum0 cum0Var, aum0 aum0Var, xtm0 xtm0Var, CharSequence charSequence, utm0 utm0Var, utm0 utm0Var2, vtm0 vtm0Var, eum0 eum0Var) {
        this.a = str;
        this.b = z;
        this.c = cum0Var;
        this.d = aum0Var;
        this.e = xtm0Var;
        this.f = charSequence;
        this.g = utm0Var;
        this.h = utm0Var2;
        this.i = vtm0Var;
        this.j = eum0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fum0)) {
            return false;
        }
        fum0 fum0Var = (fum0) obj;
        return jl40.l(this.a, fum0Var.a) && this.b == fum0Var.b && jl40.l(this.c, fum0Var.c) && jl40.l(this.d, fum0Var.d) && jl40.l(this.e, fum0Var.e) && jl40.l(this.f, fum0Var.f) && jl40.l(this.g, fum0Var.g) && jl40.l(this.h, fum0Var.h) && jl40.l(this.i, fum0Var.i) && jl40.l(this.j, fum0Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + smw0.b((this.e.hashCode() + unr0.c((this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d.a)) * 31, 31, this.f)) * 31;
        utm0 utm0Var = this.h;
        int hashCode2 = (hashCode + (utm0Var == null ? 0 : utm0Var.hashCode())) * 31;
        vtm0 vtm0Var = this.i;
        int hashCode3 = (hashCode2 + (vtm0Var == null ? 0 : vtm0Var.hashCode())) * 31;
        eum0 eum0Var = this.j;
        return hashCode3 + (eum0Var != null ? eum0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("ScootersActivePassesV3UiState(activePassId=", this.a, ", inProgress=", ", titleGroup=", this.b);
        l.append(this.c);
        l.append(", termsGroup=");
        l.append(this.d);
        l.append(", renewGroup=");
        l.append(this.e);
        l.append(", description=");
        l.append((Object) this.f);
        l.append(", closeButton=");
        l.append(this.g);
        l.append(", unfreezeButton=");
        l.append(this.h);
        l.append(", legalTerms=");
        l.append(this.i);
        l.append(", upsaleLongestPass=");
        l.append(this.j);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
