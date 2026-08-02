package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class pcw0 {
    public final ocw0 a;
    public final icw0 b;

    public pcw0(ocw0 ocw0Var, icw0 icw0Var) {
        this.a = ocw0Var;
        this.b = icw0Var;
    }

    public static pcw0 a(pcw0 pcw0Var, ocw0 ocw0Var, int i) {
        if ((i & 1) != 0) {
            ocw0Var = pcw0Var.a;
        }
        icw0 icw0Var = (i & 2) != 0 ? pcw0Var.b : fcw0.a;
        pcw0Var.getClass();
        return new pcw0(ocw0Var, icw0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcw0)) {
            return false;
        }
        pcw0 pcw0Var = (pcw0) obj;
        return jl40.l(this.a, pcw0Var.a) && jl40.l(this.b, pcw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SuperappMainScreenState(loadingState=" + this.a + ", contentSource=" + this.b + Extension.C_BRAKE;
    }
}
