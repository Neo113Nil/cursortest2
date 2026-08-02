package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class nse0 extends qse0 {
    public final k9s0 a;

    public nse0(k9s0 k9s0Var) {
        this.a = k9s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nse0) && this.a.equals(((nse0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SummaryWithScheduleRide(showSummaryParams=" + this.a + Extension.C_BRAKE;
    }
}
