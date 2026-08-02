package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class b3m0 {
    public final a3m0 a;
    public final a3m0 b;

    public b3m0(a3m0 a3m0Var, a3m0 a3m0Var2) {
        this.a = a3m0Var;
        this.b = a3m0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3m0)) {
            return false;
        }
        b3m0 b3m0Var = (b3m0) obj;
        return this.a.equals(b3m0Var.a) && jl40.l(this.b, b3m0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a3m0 a3m0Var = this.b;
        return hashCode + (a3m0Var == null ? 0 : a3m0Var.hashCode());
    }

    public final String toString() {
        return "SavingsAccountButtonGroupEntity(firstButton=" + this.a + ", secondButton=" + this.b + Extension.C_BRAKE;
    }
}
