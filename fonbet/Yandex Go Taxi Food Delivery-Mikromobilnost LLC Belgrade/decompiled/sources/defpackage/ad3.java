package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ad3 implements cd3 {
    public final String a;
    public final int b;
    public final int c;

    public ad3(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad3)) {
            return false;
        }
        ad3 ad3Var = (ad3) obj;
        return jl40.l(this.a, ad3Var.a) && this.b == ad3Var.b && this.c == ad3Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "LottieAnimation(url=", this.a, ", width=", ", height="));
    }
}
