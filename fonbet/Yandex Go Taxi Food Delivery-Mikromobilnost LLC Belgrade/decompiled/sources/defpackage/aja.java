package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class aja implements bja {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;

    public aja(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aja)) {
            return false;
        }
        aja ajaVar = (aja) obj;
        return jl40.l(this.a, ajaVar.a) && jl40.l(this.b, ajaVar.b) && jl40.l(this.c, ajaVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return this.c.hashCode() + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }

    public final String toString() {
        return xvz.n(vfc.r(this.a, this.b, "Success(title=", ", subtitle=", ", buttonText="), this.c, Extension.C_BRAKE);
    }
}
