package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class fq5 {
    public final t0a0 a;
    public final z0a0 b;
    public final String c;

    public fq5(t0a0 t0a0Var, z0a0 z0a0Var, String str) {
        this.a = t0a0Var;
        this.b = z0a0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq5)) {
            return false;
        }
        fq5 fq5Var = (fq5) obj;
        return jl40.l(this.a, fq5Var.a) && this.b.equals(fq5Var.b) && jl40.l(this.c, fq5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentBlock(paymentIconInfo=");
        sb.append(this.a);
        sb.append(", paymentIconLoader=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
