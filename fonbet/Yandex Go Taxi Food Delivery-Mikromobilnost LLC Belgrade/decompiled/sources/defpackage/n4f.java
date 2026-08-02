package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes5.dex */
public final class n4f {
    public final PaymentMethod$Type a;
    public final String b;
    public final ArrayList c;

    public n4f(PaymentMethod$Type paymentMethod$Type, String str, ArrayList arrayList) {
        this.a = paymentMethod$Type;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4f)) {
            return false;
        }
        n4f n4fVar = (n4f) obj;
        return this.a == n4fVar.a && jl40.l(this.b, n4fVar.b) && this.c.equals(n4fVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentInfoSnapshot(paymentMethodType=");
        sb.append(this.a);
        sb.append(", paymentMethodId=");
        sb.append(this.b);
        sb.append(", complements=");
        return b64.n(Extension.C_BRAKE, sb, this.c);
    }
}
