package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nhp {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;

    public nhp(CharSequence charSequence, CharSequence charSequence2, String str) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhp)) {
            return false;
        }
        nhp nhpVar = (nhp) obj;
        return jl40.l(this.a, nhpVar.a) && jl40.l(this.b, nhpVar.b) && jl40.l(this.c, nhpVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        return hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return xvz.n(vfc.r(this.a, this.b, "Header(title=", ", subtitle=", ", badgeText="), this.c, Extension.C_BRAKE);
    }
}
