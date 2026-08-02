package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class dce0 {
    public final String a;
    public final PaymentMethod$Type b;
    public final String c;
    public final String d;

    public dce0(String str, String str2, String str3, PaymentMethod$Type paymentMethod$Type) {
        this.a = str;
        this.b = paymentMethod$Type;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dce0)) {
            return false;
        }
        dce0 dce0Var = (dce0) obj;
        return this.a.equals(dce0Var.a) && this.b == dce0Var.b && jl40.l(this.c, dce0Var.c) && jl40.l(this.d, dce0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PorttechPaymentMethod(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", imageBase64=");
        return g8e.r(sb, this.c, ", title=", this.d, Extension.C_BRAKE);
    }
}
