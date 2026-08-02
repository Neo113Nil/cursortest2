package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class pbc0 {
    public final i5t0 a;
    public final g5t0 b;

    public pbc0(i5t0 i5t0Var, g5t0 g5t0Var) {
        this.a = i5t0Var;
        this.b = g5t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbc0)) {
            return false;
        }
        pbc0 pbc0Var = (pbc0) obj;
        return jl40.l(this.a, pbc0Var.a) && this.b.equals(pbc0Var.b);
    }

    public final int hashCode() {
        i5t0 i5t0Var = this.a;
        return this.b.hashCode() + ((i5t0Var == null ? 0 : i5t0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "SuspendKeepingSelectedResult(updateInfo=" + this.a + ", selectInfo=" + this.b + Extension.C_BRAKE;
    }
}
