package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class m9p0 implements p9p0 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;

    public m9p0(CharSequence charSequence, CharSequence charSequence2, String str) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9p0)) {
            return false;
        }
        m9p0 m9p0Var = (m9p0) obj;
        return jl40.l(this.a, m9p0Var.a) && jl40.l(this.b, m9p0Var.b) && jl40.l(this.c, m9p0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xvz.n(ly3.t(this.b, "Header(iconUrl=", this.a, ", title=", ", description="), this.c, Extension.C_BRAKE);
    }
}
