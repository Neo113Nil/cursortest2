package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class of51 {
    public final pf51 a;
    public final qf51 b;

    public of51(pf51 pf51Var, qf51 qf51Var) {
        this.a = pf51Var;
        this.b = qf51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of51)) {
            return false;
        }
        of51 of51Var = (of51) obj;
        return this.a.equals(of51Var.a) && this.b.equals(of51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "YBCreditLimitSetSettingsRequest(settings=" + this.a + ", matchingData=" + this.b + Extension.C_BRAKE;
    }
}
