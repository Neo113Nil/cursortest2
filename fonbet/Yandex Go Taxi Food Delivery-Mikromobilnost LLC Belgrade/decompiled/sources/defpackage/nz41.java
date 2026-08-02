package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class nz41 {
    public final itz0 a;
    public final byi b;
    public final ql90 c;
    public final pl90 d;

    public nz41(itz0 itz0Var, byi byiVar, ql90 ql90Var, pl90 pl90Var) {
        this.a = itz0Var;
        this.b = byiVar;
        this.c = ql90Var;
        this.d = pl90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz41)) {
            return false;
        }
        nz41 nz41Var = (nz41) obj;
        return jl40.l(this.a, nz41Var.a) && jl40.l(this.b, nz41Var.b) && jl40.l(this.c, nz41Var.c) && jl40.l(this.d, nz41Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.a.hashCode() * 31, 31, this.b.a)) * 31);
    }

    public final String toString() {
        return "WhoRidePaneUiState(toolbarUiState=" + this.a + ", descriptionUiState=" + this.b + ", yourselfUiState=" + this.c + ", anotherPassengerUiState=" + this.d + Extension.C_BRAKE;
    }
}
