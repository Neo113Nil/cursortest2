package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class nj4 {
    public final CharSequence a;
    public final kdc b;

    public nj4(CharSequence charSequence, kdc kdcVar) {
        this.a = charSequence;
        this.b = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj4)) {
            return false;
        }
        nj4 nj4Var = (nj4) obj;
        return jl40.l(this.a, nj4Var.a) && jl40.l(this.b, nj4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Badge(title=" + ((Object) this.a) + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
