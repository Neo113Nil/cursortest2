package defpackage;

import com.yandex.go.payments.api.exception.PaymentChangeException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jda0 implements oda0 {
    public final PaymentChangeException a;

    public jda0(PaymentChangeException paymentChangeException) {
        this.a = paymentChangeException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jda0) && this.a == ((jda0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChangePaymentError(error=" + this.a + Extension.C_BRAKE;
    }
}
