package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dp6 {
    public final q8u0 a;
    public final qp6 b;

    public dp6(q8u0 q8u0Var, qp6 qp6Var) {
        this.a = q8u0Var;
        this.b = qp6Var;
    }

    public static dp6 a(dp6 dp6Var, qp6 qp6Var) {
        q8u0 q8u0Var = dp6Var.a;
        dp6Var.getClass();
        return new dp6(q8u0Var, qp6Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp6)) {
            return false;
        }
        dp6 dp6Var = (dp6) obj;
        return this.a.equals(dp6Var.a) && this.b.equals(dp6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BudgetChargesSearchStatusSuccessState(timeoutInfo=" + this.a + ", statusInfo=" + this.b + Extension.C_BRAKE;
    }
}
