package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class oyz implements pyz {
    public final String a;
    public final PaymentMethod$Type b;

    public oyz(String str, PaymentMethod$Type paymentMethod$Type) {
        this.a = str;
        this.b = paymentMethod$Type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyz)) {
            return false;
        }
        oyz oyzVar = (oyz) obj;
        return this.a.equals(oyzVar.a) && this.b == oyzVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentRemoved(id=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}
