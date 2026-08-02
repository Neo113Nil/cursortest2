package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class g2a0 {
    public final String a;
    public final String b;

    public g2a0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2a0)) {
            return false;
        }
        g2a0 g2a0Var = (g2a0) obj;
        return jl40.l(this.a, g2a0Var.a) && jl40.l(this.b, g2a0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("PaymentInfoModel(type=", this.a, ", id=", this.b, Extension.C_BRAKE);
    }
}
