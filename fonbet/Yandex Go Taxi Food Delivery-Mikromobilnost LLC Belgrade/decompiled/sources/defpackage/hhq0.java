package defpackage;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class hhq0 implements jhq0 {
    public final PaymentMethod a;

    public hhq0(PaymentMethod paymentMethod) {
        this.a = paymentMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hhq0) && jl40.l(this.a, ((hhq0) obj).a);
    }

    @Override // defpackage.jhq0
    public final PaymentMethod getMethod() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FromMethod(method=" + this.a + Extension.C_BRAKE;
    }
}
