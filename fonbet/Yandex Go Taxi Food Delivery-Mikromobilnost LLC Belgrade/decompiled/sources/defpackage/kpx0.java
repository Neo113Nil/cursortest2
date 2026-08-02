package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kpx0 {
    public final String a;
    public final boolean b;

    public kpx0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpx0)) {
            return false;
        }
        kpx0 kpx0Var = (kpx0) obj;
        return jl40.l(this.a, kpx0Var.a) && this.b == kpx0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("Image(url=", this.a, ", isWithPlusBg=", this.b, Extension.C_BRAKE);
    }
}
