package defpackage;

import com.ybsdk.feature.autotopup.api.domain.model.PaymentMethodType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class l5a0 {
    public final String a;
    public final PaymentMethodType b;

    public l5a0(String str, PaymentMethodType paymentMethodType) {
        this.a = str;
        this.b = paymentMethodType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5a0)) {
            return false;
        }
        l5a0 l5a0Var = (l5a0) obj;
        return jl40.l(this.a, l5a0Var.a) && this.b == l5a0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentMethodId(id=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}
