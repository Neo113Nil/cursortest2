package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hsm0 {
    public final gsm0 a;
    public final fsm0 b;
    public final dsm0 c;

    public hsm0(gsm0 gsm0Var, fsm0 fsm0Var, dsm0 dsm0Var) {
        this.a = gsm0Var;
        this.b = fsm0Var;
        this.c = dsm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsm0)) {
            return false;
        }
        hsm0 hsm0Var = (hsm0) obj;
        return jl40.l(this.a, hsm0Var.a) && jl40.l(this.b, hsm0Var.b) && jl40.l(this.c, hsm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        return "ScootersActivePassesV3RenewDisablingUiState(title=" + this.a + ", hintsGroup=" + this.b + ", bottomGroup=" + this.c + Extension.C_BRAKE;
    }
}
