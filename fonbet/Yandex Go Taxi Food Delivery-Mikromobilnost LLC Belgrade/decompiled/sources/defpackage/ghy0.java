package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ghy0 {
    public final kao a;
    public final lhy0 b;
    public final hhy0 c;

    public ghy0(kao kaoVar, lhy0 lhy0Var, hhy0 hhy0Var) {
        this.a = kaoVar;
        this.b = lhy0Var;
        this.c = hhy0Var;
    }

    public static ghy0 a(ghy0 ghy0Var, kao kaoVar, lhy0 lhy0Var, hhy0 hhy0Var, int i) {
        if ((i & 1) != 0) {
            kaoVar = ghy0Var.a;
        }
        if ((i & 2) != 0) {
            lhy0Var = ghy0Var.b;
        }
        if ((i & 4) != 0) {
            hhy0Var = ghy0Var.c;
        }
        ghy0Var.getClass();
        return new ghy0(kaoVar, lhy0Var, hhy0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghy0)) {
            return false;
        }
        ghy0 ghy0Var = (ghy0) obj;
        return jl40.l(this.a, ghy0Var.a) && jl40.l(this.b, ghy0Var.b) && jl40.l(this.c, ghy0Var.c);
    }

    public final int hashCode() {
        kao kaoVar = this.a;
        int hashCode = (kaoVar == null ? 0 : kaoVar.hashCode()) * 31;
        lhy0 lhy0Var = this.b;
        int hashCode2 = (hashCode + (lhy0Var == null ? 0 : lhy0Var.hashCode())) * 31;
        hhy0 hhy0Var = this.c;
        return hashCode2 + (hhy0Var != null ? hhy0Var.hashCode() : 0);
    }

    public final String toString() {
        return "TestPaymentState(errorState=" + this.a + ", paymentStatusEntity=" + this.b + ", timeoutState=" + this.c + Extension.C_BRAKE;
    }

    public ghy0() {
        this(null, null, null);
    }
}
