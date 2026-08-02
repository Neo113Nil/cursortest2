package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class iu3 implements ku3 {
    public final h5a0 a;

    public iu3(h5a0 h5a0Var) {
        this.a = h5a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iu3) && jl40.l(this.a, ((iu3) obj).a);
    }

    public final int hashCode() {
        h5a0 h5a0Var = this.a;
        if (h5a0Var == null) {
            return 0;
        }
        return h5a0Var.hashCode();
    }

    public final String toString() {
        return "SavingsNotice(newSelectedMethod=" + this.a + Extension.C_BRAKE;
    }

    public iu3() {
        this(null);
    }
}
