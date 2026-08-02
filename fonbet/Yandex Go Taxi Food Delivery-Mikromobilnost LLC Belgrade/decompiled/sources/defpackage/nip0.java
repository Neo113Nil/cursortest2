package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class nip0 {
    public static final nip0 c = new nip0("", true);
    public final String a;
    public final boolean b;

    public nip0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nip0)) {
            return false;
        }
        nip0 nip0Var = (nip0) obj;
        return jl40.l(this.a, nip0Var.a) && this.b == nip0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("ScrollState(tariffClass=", this.a, ", isScrolled=", this.b, Extension.C_BRAKE);
    }
}
