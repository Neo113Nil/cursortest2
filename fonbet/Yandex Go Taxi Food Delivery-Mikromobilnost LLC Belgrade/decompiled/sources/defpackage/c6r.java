package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class c6r {
    public final CharSequence a;
    public final kdc b;
    public final fr c;

    public c6r(CharSequence charSequence, kdc kdcVar, fr frVar) {
        this.a = charSequence;
        this.b = kdcVar;
        this.c = frVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6r)) {
            return false;
        }
        c6r c6rVar = (c6r) obj;
        return jl40.l(this.a, c6rVar.a) && this.b.equals(c6rVar.b) && jl40.l(this.c, c6rVar.c);
    }

    public final int hashCode() {
        int d = smw0.d(this.b, this.a.hashCode() * 31, 31);
        fr frVar = this.c;
        return d + (frVar == null ? 0 : frVar.hashCode());
    }

    public final String toString() {
        return "FiltersModalButton(title=" + ((Object) this.a) + ", backgroundColor=" + this.b + ", action=" + this.c + Extension.C_BRAKE;
    }
}
