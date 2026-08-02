package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class p2x {
    public final CharSequence a;
    public final CharSequence b;

    public p2x(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2x)) {
            return false;
        }
        p2x p2xVar = (p2x) obj;
        return jl40.l(this.a, p2xVar.a) && jl40.l(this.b, p2xVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "Title(text=", ", badge=", Extension.C_BRAKE);
    }
}
