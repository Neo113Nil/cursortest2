package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jgs0 {
    public final n0t0 a;

    public jgs0(n0t0 n0t0Var) {
        this.a = n0t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jgs0) && jl40.l(this.a, ((jgs0) obj).a);
    }

    public final int hashCode() {
        n0t0 n0t0Var = this.a;
        if (n0t0Var == null) {
            return 0;
        }
        return n0t0Var.hashCode();
    }

    public final String toString() {
        return n.i("SingleCardDetailsSnackbars(error2fa=", this.a, Extension.C_BRAKE);
    }
}
