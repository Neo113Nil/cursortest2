package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class gq5 {
    public final eq5 a;
    public final bq5 b;
    public final cq5 c;
    public final dq5 d;
    public final fq5 e;

    public gq5(eq5 eq5Var, bq5 bq5Var, cq5 cq5Var, dq5 dq5Var, fq5 fq5Var) {
        this.a = eq5Var;
        this.b = bq5Var;
        this.c = cq5Var;
        this.d = dq5Var;
        this.e = fq5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq5)) {
            return false;
        }
        gq5 gq5Var = (gq5) obj;
        return jl40.l(this.a, gq5Var.a) && jl40.l(this.b, gq5Var.b) && jl40.l(this.c, gq5Var.c) && jl40.l(this.d, gq5Var.d) && jl40.l(this.e, gq5Var.e);
    }

    public final int hashCode() {
        int b = unr0.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d.a);
        fq5 fq5Var = this.e;
        return b + (fq5Var == null ? 0 : fq5Var.hashCode());
    }

    public final String toString() {
        return "BidsDriveCardUiState(driversProgress=" + this.a + ", addressBlock=" + this.b + ", autoAccept=" + this.c + ", cancelButton=" + this.d + ", paymentBlock=" + this.e + Extension.C_BRAKE;
    }
}
