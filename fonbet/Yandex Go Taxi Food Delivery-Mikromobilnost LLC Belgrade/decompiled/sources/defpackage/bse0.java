package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class bse0 extends qse0 {
    public final k9s0 a;

    public bse0(k9s0 k9s0Var) {
        this.a = k9s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bse0) && this.a.equals(((bse0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Hub(showSummaryParams=" + this.a + Extension.C_BRAKE;
    }
}
