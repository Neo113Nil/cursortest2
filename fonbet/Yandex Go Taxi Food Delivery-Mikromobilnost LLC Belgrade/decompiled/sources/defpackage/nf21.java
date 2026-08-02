package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class nf21 extends qf21 {
    public final a201 a;

    public nf21(a201 a201Var) {
        this.a = a201Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nf21) && jl40.l(this.a, ((nf21) obj).a);
    }

    public final int hashCode() {
        a201 a201Var = this.a;
        if (a201Var == null) {
            return 0;
        }
        return a201Var.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.a + Extension.C_BRAKE;
    }

    public nf21() {
        this(null);
    }
}
