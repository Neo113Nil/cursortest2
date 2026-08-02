package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class n4z0 extends mcu {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;

    public n4z0(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4z0)) {
            return false;
        }
        n4z0 n4z0Var = (n4z0) obj;
        return jl40.l(this.a, n4z0Var.a) && jl40.l(this.b, n4z0Var.b) && jl40.l(this.c, n4z0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        return hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return xvz.n(vfc.r(this.a, this.b, "TileAttributedHeaderState(title=", ", subtitle=", ", trailTitle="), this.c, Extension.C_BRAKE);
    }
}
