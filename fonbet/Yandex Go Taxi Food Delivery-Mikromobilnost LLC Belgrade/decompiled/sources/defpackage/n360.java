package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class n360 {
    public final String a;
    public final int b;
    public final int c;

    public n360(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n360)) {
            return false;
        }
        n360 n360Var = (n360) obj;
        return jl40.l(this.a, n360Var.a) && this.b == n360Var.b && this.c == n360Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "NeuroPostcardLottie(url=", this.a, ", width=", ", height="));
    }
}
