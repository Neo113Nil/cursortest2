package defpackage;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.xplat.payment.sdk.NewCard;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ihq0 implements jhq0 {
    public final PaymentMethod a;
    public final NewCard b;

    public ihq0(PaymentMethod paymentMethod, NewCard newCard) {
        this.a = paymentMethod;
        this.b = newCard;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihq0)) {
            return false;
        }
        ihq0 ihq0Var = (ihq0) obj;
        return jl40.l(this.a, ihq0Var.a) && jl40.l(this.b, ihq0Var.b);
    }

    @Override // defpackage.jhq0
    public final PaymentMethod getMethod() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        NewCard newCard = this.b;
        return hashCode + (newCard == null ? 0 : newCard.hashCode());
    }

    public final String toString() {
        return "FromNewCard(method=" + this.a + ", card=" + this.b + Extension.C_BRAKE;
    }
}
