package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class cu40 implements eu40 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final nvi0 d;

    public cu40(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, ovi0 ovi0Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = ovi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu40)) {
            return false;
        }
        cu40 cu40Var = (cu40) obj;
        return jl40.l(this.a, cu40Var.a) && jl40.l(this.b, cu40Var.b) && jl40.l(this.c, cu40Var.c) && jl40.l(this.d, cu40Var.d);
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int hashCode = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        nvi0 nvi0Var = this.d;
        return hashCode + (nvi0Var != null ? nvi0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "Content(title=", ", buttonText=", ", subtitle=");
        r.append((Object) this.c);
        r.append(", image=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
