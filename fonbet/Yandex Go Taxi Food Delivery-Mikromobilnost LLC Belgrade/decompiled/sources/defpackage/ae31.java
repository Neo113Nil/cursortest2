package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ae31 implements ge31 {
    public final lv90 a;

    public ae31(lv90 lv90Var) {
        this.a = lv90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ae31) && jl40.l(this.a, ((ae31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenSummaryPaymentMethods(payment=" + this.a + Extension.C_BRAKE;
    }
}
