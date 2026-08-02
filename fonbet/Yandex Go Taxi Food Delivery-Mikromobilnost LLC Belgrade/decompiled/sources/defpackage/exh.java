package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class exh {
    public final CharSequence a;
    public final CharSequence b;
    public final boolean c;

    public exh(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exh)) {
            return false;
        }
        exh exhVar = (exh) obj;
        return jl40.l(this.a, exhVar.a) && jl40.l(this.b, exhVar.b) && this.c == exhVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }

    public final String toString() {
        return x4e.i(vfc.r(this.a, this.b, "ButtonState(title=", ", subtitle=", ", isHighlighted="), this.c, Extension.C_BRAKE);
    }
}
