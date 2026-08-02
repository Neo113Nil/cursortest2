package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dk11 {
    public final z630 a;
    public final z630 b;

    public dk11(z630 z630Var, z630 z630Var2) {
        this.a = z630Var;
        this.b = z630Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk11)) {
            return false;
        }
        dk11 dk11Var = (dk11) obj;
        return jl40.l(this.a, dk11Var.a) && jl40.l(this.b, dk11Var.b);
    }

    public final int hashCode() {
        z630 z630Var = this.a;
        int hashCode = (z630Var == null ? 0 : z630Var.hashCode()) * 31;
        z630 z630Var2 = this.b;
        return hashCode + (z630Var2 != null ? z630Var2.hashCode() : 0);
    }

    public final String toString() {
        return "TwicePerMonth(monthToMoney1=" + this.a + ", monthToMoney2=" + this.b + Extension.C_BRAKE;
    }
}
