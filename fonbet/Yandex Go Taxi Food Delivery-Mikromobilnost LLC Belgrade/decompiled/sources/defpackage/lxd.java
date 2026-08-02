package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class lxd {
    public final ovi0 a;
    public final CharSequence b;
    public final CharSequence c;

    public lxd(ovi0 ovi0Var, CharSequence charSequence, CharSequence charSequence2) {
        this.a = ovi0Var;
        this.b = charSequence;
        this.c = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxd)) {
            return false;
        }
        lxd lxdVar = (lxd) obj;
        return this.a.equals(lxdVar.a) && jl40.l(this.b, lxdVar.b) && jl40.l(this.c, lxdVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        return hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Condition(imageTag=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", subtitle=");
        return xvz.n(sb, this.c, Extension.C_BRAKE);
    }
}
