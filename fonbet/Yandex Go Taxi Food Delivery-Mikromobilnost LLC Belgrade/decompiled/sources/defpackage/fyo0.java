package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class fyo0 implements hyo0 {
    public final eyo0 a;

    public final boolean equals(Object obj) {
        if (obj instanceof fyo0) {
            return jl40.l(this.a, ((fyo0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        eyo0 eyo0Var = this.a;
        if (eyo0Var == null) {
            return 0;
        }
        return eyo0Var.hashCode();
    }

    public final String toString() {
        return "Error(window=" + this.a + Extension.C_BRAKE;
    }
}
