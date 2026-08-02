package defpackage;

import com.yandex.mobile.drive.wallet.PaymentMethodType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class lem {
    public final String a;
    public final PaymentMethodType b;

    public lem(String str, PaymentMethodType paymentMethodType) {
        this.a = str;
        this.b = paymentMethodType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lem)) {
            return false;
        }
        lem lemVar = (lem) obj;
        return this.a.equals(lemVar.a) && this.b == lemVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrivePaymentMethod(id=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}
