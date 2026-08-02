package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class mre0 implements rre0 {
    public final dre0 a;
    public final k9s0 b;

    public mre0(dre0 dre0Var, k9s0 k9s0Var) {
        this.a = dre0Var;
        this.b = k9s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mre0) {
            mre0 mre0Var = (mre0) obj;
            if (this.a == mre0Var.a && jl40.l(this.b, mre0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        k9s0 k9s0Var = this.b;
        return hashCode + (k9s0Var == null ? 0 : k9s0Var.hashCode());
    }

    public final String toString() {
        return "SummaryFromParams(preorderParams=" + this.a + ", showSummaryParams=" + this.b + Extension.C_BRAKE;
    }
}
