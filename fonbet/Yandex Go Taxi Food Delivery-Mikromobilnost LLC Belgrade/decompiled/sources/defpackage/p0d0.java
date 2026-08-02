package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class p0d0 extends q0d0 {
    public final String b;
    public final boolean c;

    public p0d0(String str, boolean z) {
        super("url");
        this.b = str;
        this.c = z;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0d0)) {
            return false;
        }
        p0d0 p0d0Var = (p0d0) obj;
        return jl40.l(this.b, p0d0Var.b) && this.c == p0d0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("Url(url=", this.b, ", needAuthorization=", this.c, Extension.C_BRAKE);
    }
}
