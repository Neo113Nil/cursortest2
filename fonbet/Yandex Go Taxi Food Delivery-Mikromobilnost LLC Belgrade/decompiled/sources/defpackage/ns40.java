package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ns40 implements zs40 {
    public final aw40 a;
    public final v3y0 b;

    public ns40(aw40 aw40Var, v3y0 v3y0Var) {
        this.a = aw40Var;
        this.b = v3y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns40)) {
            return false;
        }
        ns40 ns40Var = (ns40) obj;
        return jl40.l(this.a, ns40Var.a) && jl40.l(this.b, ns40Var.b);
    }

    public final int hashCode() {
        aw40 aw40Var = this.a;
        int hashCode = (aw40Var == null ? 0 : aw40Var.hashCode()) * 31;
        v3y0 v3y0Var = this.b;
        return hashCode + (v3y0Var != null ? v3y0Var.hashCode() : 0);
    }

    public final String toString() {
        return "BottonContainerClicked(action=" + this.a + ", taxiOrderPayload=" + this.b + Extension.C_BRAKE;
    }
}
