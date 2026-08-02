package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class p1p0 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;

    public p1p0(CharSequence charSequence, CharSequence charSequence2, String str) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1p0)) {
            return false;
        }
        p1p0 p1p0Var = (p1p0) obj;
        return jl40.l(this.a, p1p0Var.a) && jl40.l(this.b, p1p0Var.b) && this.c.equals(p1p0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xvz.n(ly3.t(this.b, "Item(iconTag=", this.a, ", title=", ", subtitle="), this.c, Extension.C_BRAKE);
    }
}
