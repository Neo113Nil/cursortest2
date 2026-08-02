package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mbf0 {
    public final kbf0 a;
    public final kbf0 b;

    public mbf0(kbf0 kbf0Var, kbf0 kbf0Var2) {
        this.a = kbf0Var;
        this.b = kbf0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbf0)) {
            return false;
        }
        mbf0 mbf0Var = (mbf0) obj;
        return jl40.l(this.a, mbf0Var.a) && jl40.l(this.b, mbf0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kbf0 kbf0Var = this.b;
        return hashCode + (kbf0Var == null ? 0 : kbf0Var.hashCode());
    }

    public final String toString() {
        return "ProductsV4GradientEntity(headerGradient=" + this.a + ", footerGradient=" + this.b + Extension.C_BRAKE;
    }
}
