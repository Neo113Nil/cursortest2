package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class nh0 implements xh0 {
    public final boolean a;
    public final PaymentMethod$Type b;
    public final String c;
    public final String d;

    public nh0(boolean z, PaymentMethod$Type paymentMethod$Type, String str, String str2) {
        this.a = z;
        this.b = paymentMethod$Type;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.xh0
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh0)) {
            return false;
        }
        nh0 nh0Var = (nh0) obj;
        return this.a == nh0Var.a && this.b == nh0Var.b && jl40.l(this.c, nh0Var.c) && jl40.l(this.d, nh0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(isFullscreen=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", title=");
        return g8e.r(sb, this.c, ", subtitle=", this.d, Extension.C_BRAKE);
    }
}
