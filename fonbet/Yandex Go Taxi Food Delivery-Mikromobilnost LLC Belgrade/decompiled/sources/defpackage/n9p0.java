package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class n9p0 implements p9p0 {
    public final CharSequence a;
    public final CharSequence b;
    public final boolean c;

    public n9p0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9p0)) {
            return false;
        }
        n9p0 n9p0Var = (n9p0) obj;
        return jl40.l(this.a, n9p0Var.a) && this.b.equals(n9p0Var.b) && this.c == n9p0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + smw0.b(this.a.hashCode() * 961, 31, this.b);
    }

    public final String toString() {
        return x4e.i(vfc.r(this.a, this.b, "Info(title=", ", subtitle=null, value=", ", withTopDivider="), this.c, Extension.C_BRAKE);
    }
}
