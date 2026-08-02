package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class lbx0 implements nbx0 {
    public final m1a0 a;

    public lbx0(m1a0 m1a0Var) {
        this.a = m1a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lbx0) && this.a.equals(((lbx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PaymentSelection(paymentInfo=" + this.a + Extension.C_BRAKE;
    }
}
