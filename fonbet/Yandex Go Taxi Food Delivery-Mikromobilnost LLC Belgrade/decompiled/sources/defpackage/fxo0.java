package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class fxo0 {
    public final dxo0 a;
    public final exo0 b;

    public fxo0(dxo0 dxo0Var, exo0 exo0Var) {
        this.a = dxo0Var;
        this.b = exo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxo0)) {
            return false;
        }
        fxo0 fxo0Var = (fxo0) obj;
        return jl40.l(this.a, fxo0Var.a) && jl40.l(this.b, fxo0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        exo0 exo0Var = this.b;
        return hashCode + (exo0Var == null ? 0 : exo0Var.hashCode());
    }

    public final String toString() {
        return "Toggle(enabledBookingButton=" + this.a + ", enabledLegalInfo=" + this.b + Extension.C_BRAKE;
    }
}
