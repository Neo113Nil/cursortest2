package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ju3 implements ku3 {
    public final h5a0 a;

    public ju3(h5a0 h5a0Var) {
        this.a = h5a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ju3) && jl40.l(this.a, ((ju3) obj).a);
    }

    public final int hashCode() {
        h5a0 h5a0Var = this.a;
        if (h5a0Var == null) {
            return 0;
        }
        return h5a0Var.hashCode();
    }

    public final String toString() {
        return "SelectPaymentOption(newSelectedMethod=" + this.a + Extension.C_BRAKE;
    }

    public ju3() {
        this(null);
    }
}
