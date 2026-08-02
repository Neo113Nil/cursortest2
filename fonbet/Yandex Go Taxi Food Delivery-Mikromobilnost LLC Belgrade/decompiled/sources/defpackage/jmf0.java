package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jmf0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public jmf0(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmf0)) {
            return false;
        }
        jmf0 jmf0Var = (jmf0) obj;
        return jl40.l(this.a, jmf0Var.a) && jl40.l(this.b, jmf0Var.b) && this.c == jmf0Var.c && this.d == jmf0Var.d && this.e == jmf0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("PromoCodeError(code=", this.a, ", description=", this.b, ", isCardRequired=");
        nnm.v(", isCardOnly=", ", isExpired=", v, this.c, this.d);
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
