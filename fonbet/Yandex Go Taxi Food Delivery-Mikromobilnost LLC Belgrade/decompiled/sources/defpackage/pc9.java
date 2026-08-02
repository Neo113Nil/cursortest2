package defpackage;

import com.yandex.go.payments.api.exception.PaymentChangeException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class pc9 extends rc9 {
    public final PaymentChangeException a;

    public pc9(PaymentChangeException paymentChangeException) {
        this.a = paymentChangeException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pc9) && this.a == ((pc9) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(error=" + this.a + Extension.C_BRAKE;
    }
}
