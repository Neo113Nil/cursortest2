package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jdq0 extends ldq0 {
    public final saf a;

    public jdq0(saf safVar) {
        this.a = safVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jdq0) && this.a.equals(((jdq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreditPaymentItemType(paymentItem=" + this.a + Extension.C_BRAKE;
    }
}
