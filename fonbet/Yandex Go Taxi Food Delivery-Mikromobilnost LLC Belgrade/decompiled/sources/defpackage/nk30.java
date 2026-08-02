package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class nk30 {
    public final n26 a;
    public final a36 b;

    public nk30(n26 n26Var, a36 a36Var) {
        this.a = n26Var;
        this.b = a36Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk30)) {
            return false;
        }
        nk30 nk30Var = (nk30) obj;
        return jl40.l(this.a, nk30Var.a) && jl40.l(this.b, nk30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Payload(config=" + this.a + ", analyticsContext=" + this.b + Extension.C_BRAKE;
    }
}
