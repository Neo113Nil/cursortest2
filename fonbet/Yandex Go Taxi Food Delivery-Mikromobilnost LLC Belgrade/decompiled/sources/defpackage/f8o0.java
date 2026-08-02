package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class f8o0 {
    public final CharSequence a;
    public final CharSequence b;
    public final nvi0 c;

    public f8o0(ovi0 ovi0Var, CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = ovi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8o0)) {
            return false;
        }
        f8o0 f8o0Var = (f8o0) obj;
        return jl40.l(this.a, f8o0Var.a) && jl40.l(this.b, f8o0Var.b) && jl40.l(this.c, f8o0Var.c);
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        nvi0 nvi0Var = this.c;
        return b + (nvi0Var == null ? 0 : nvi0Var.hashCode());
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "Item(title=", ", subtitle=", ", image=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
