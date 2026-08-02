package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class k1p0 {
    public final CharSequence a;
    public final CharSequence b;
    public final j1p0 c;

    public k1p0(CharSequence charSequence, CharSequence charSequence2, j1p0 j1p0Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = j1p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1p0)) {
            return false;
        }
        k1p0 k1p0Var = (k1p0) obj;
        return jl40.l(this.a, k1p0Var.a) && jl40.l(this.b, k1p0Var.b) && jl40.l(this.c, k1p0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        j1p0 j1p0Var = this.c;
        return hashCode2 + (j1p0Var != null ? j1p0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "ConfirmButton(title=", ", subtitle=", ", legal=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
