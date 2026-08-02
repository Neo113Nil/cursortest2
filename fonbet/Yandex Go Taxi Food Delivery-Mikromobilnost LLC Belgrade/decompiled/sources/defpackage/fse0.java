package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class fse0 extends qse0 {
    public final k9s0 a;

    public fse0(k9s0 k9s0Var) {
        this.a = k9s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fse0) && jl40.l(this.a, ((fse0) obj).a);
    }

    public final int hashCode() {
        k9s0 k9s0Var = this.a;
        if (k9s0Var == null) {
            return 0;
        }
        return k9s0Var.hashCode();
    }

    public final String toString() {
        return "PaymentMethods(showSummaryParams=" + this.a + Extension.C_BRAKE;
    }
}
