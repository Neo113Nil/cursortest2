package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pu3 implements su3 {
    public final thq0 a;

    public pu3(thq0 thq0Var) {
        this.a = thq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pu3) && jl40.l(this.a, ((pu3) obj).a);
    }

    public final int hashCode() {
        thq0 thq0Var = this.a;
        if (thq0Var == null) {
            return 0;
        }
        return thq0Var.hashCode();
    }

    public final String toString() {
        return "SavingsNotice(newSelectedMethod=" + this.a + Extension.C_BRAKE;
    }

    public pu3() {
        this(null);
    }
}
