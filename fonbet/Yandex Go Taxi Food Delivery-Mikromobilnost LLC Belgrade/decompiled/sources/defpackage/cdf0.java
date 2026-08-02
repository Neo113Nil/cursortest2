package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class cdf0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public cdf0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdf0)) {
            return false;
        }
        cdf0 cdf0Var = (cdf0) obj;
        return this.a.equals(cdf0Var.a) && this.b == cdf0Var.b && this.c == cdf0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(oo31.l("DefaultRatingAttrs(rating=", this.a, ", hasPhoto=", ", hasName=", this.b), this.c, Extension.C_BRAKE);
    }
}
