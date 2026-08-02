package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class evx0 implements fvx0 {
    public final z611 a;
    public final int b;

    public evx0(z611 z611Var, int i) {
        this.a = z611Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evx0)) {
            return false;
        }
        evx0 evx0Var = (evx0) obj;
        return jl40.l(this.a, evx0Var.a) && this.b == evx0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TipsTapped(tipChoice=" + this.a + ", index=" + this.b + Extension.C_BRAKE;
    }
}
