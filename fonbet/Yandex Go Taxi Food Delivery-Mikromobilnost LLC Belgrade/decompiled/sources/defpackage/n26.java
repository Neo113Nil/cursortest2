package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class n26 {
    public final r26 a;

    public n26(r26 r26Var, int i) {
        this.a = (i & 4) != 0 ? null : r26Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n26) && jl40.l(this.a, ((n26) obj).a);
    }

    public final int hashCode() {
        r26 r26Var = this.a;
        if (r26Var == null) {
            return 0;
        }
        return r26Var.hashCode();
    }

    public final String toString() {
        return "BlePaymentFlowConfig(log=null, uri=null, sections=" + this.a + Extension.C_BRAKE;
    }

    public n26() {
        this(null, 7);
    }
}
