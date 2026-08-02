package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class d3p0 implements e3p0 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final boolean d;

    public d3p0(CharSequence charSequence, CharSequence charSequence2, String str, boolean z) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3p0)) {
            return false;
        }
        d3p0 d3p0Var = (d3p0) obj;
        return jl40.l(this.a, d3p0Var.a) && jl40.l(this.b, d3p0Var.b) && jl40.l(this.c, d3p0Var.c) && this.d == d3p0Var.d;
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        return Boolean.hashCode(this.d) + ((b + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "TextBlock(iconUrl=", this.a, ", title=", ", subtitle=");
        t.append((Object) this.c);
        t.append(", withBottomDivider=");
        t.append(this.d);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
