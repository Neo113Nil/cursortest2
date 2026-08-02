package defpackage;

import com.yandex.payment.sdk.core.data.PaymentPollingResult;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class nm0 extends sm0 {
    public final PaymentPollingResult a;

    public nm0(PaymentPollingResult paymentPollingResult) {
        this.a = paymentPollingResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nm0) && this.a == ((nm0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NONE(pollingResult=" + this.a + Extension.C_BRAKE;
    }
}
