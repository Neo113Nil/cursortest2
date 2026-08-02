package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class o9p0 implements p9p0 {
    public final CharSequence a;
    public final CharSequence b;

    public o9p0(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9p0)) {
            return false;
        }
        o9p0 o9p0Var = (o9p0) obj;
        return jl40.l(this.a, o9p0Var.a) && jl40.l(this.b, o9p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "LearnMore(title=", ", subtitle=", Extension.C_BRAKE);
    }
}
