package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class lt3 {
    public final lv90 a;
    public final lv90 b;

    public lt3(lv90 lv90Var, lv90 lv90Var2) {
        this.a = lv90Var;
        this.b = lv90Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt3)) {
            return false;
        }
        lt3 lt3Var = (lt3) obj;
        return jl40.l(this.a, lt3Var.a) && jl40.l(this.b, lt3Var.b);
    }

    public final int hashCode() {
        lv90 lv90Var = this.a;
        int hashCode = (lv90Var == null ? 0 : lv90Var.hashCode()) * 31;
        lv90 lv90Var2 = this.b;
        return hashCode + (lv90Var2 != null ? lv90Var2.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentTransition(prev=" + this.a + ", new=" + this.b + Extension.C_BRAKE;
    }
}
