package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ar8 extends ye0 {
    public final String b;

    public ar8(String str) {
        super("care.insuranceWebViewOnPaymentFlowFinished");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar8) && this.b.equals(((ar8) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("InsuranceWebViewPaymentFlowFinished(type=", this.b, Extension.C_BRAKE);
    }
}
