package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class hkj0 implements ikj0 {
    public final nvi0 a;
    public final String b;
    public final CharSequence c;

    public hkj0(ovi0 ovi0Var, String str, CharSequence charSequence) {
        this.a = ovi0Var;
        this.b = str;
        this.c = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkj0)) {
            return false;
        }
        hkj0 hkj0Var = (hkj0) obj;
        return jl40.l(this.a, hkj0Var.a) && jl40.l(this.b, hkj0Var.b) && this.c.equals(hkj0Var.c);
    }

    public final int hashCode() {
        nvi0 nvi0Var = this.a;
        return this.c.hashCode() + unr0.b((nvi0Var == null ? 0 : nvi0Var.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextAndImageUiState(image=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return xvz.n(sb, this.c, Extension.C_BRAKE);
    }
}
