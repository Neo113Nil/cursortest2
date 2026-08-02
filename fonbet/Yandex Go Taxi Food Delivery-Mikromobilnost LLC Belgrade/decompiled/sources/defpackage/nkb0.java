package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nkb0 {
    public final String a;
    public final String b;

    public nkb0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkb0)) {
            return false;
        }
        nkb0 nkb0Var = (nkb0) obj;
        return jl40.l(this.a, nkb0Var.a) && jl40.l(this.b, nkb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PhotocommentModel(path=", this.a, ", downloadUrl=", this.b, Extension.C_BRAKE);
    }
}
