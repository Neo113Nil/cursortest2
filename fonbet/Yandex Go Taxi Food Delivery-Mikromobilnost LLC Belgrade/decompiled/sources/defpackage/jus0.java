package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jus0 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final boolean e;

    public jus0(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jus0)) {
            return false;
        }
        jus0 jus0Var = (jus0) obj;
        return jl40.l(this.a, jus0Var.a) && jl40.l(this.b, jus0Var.b) && jl40.l(this.c, jus0Var.c) && jl40.l(this.d, jus0Var.d) && this.e == jus0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + smw0.b(smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "SlotState(id=", this.a, ", pickup=", ", delivery=");
        vfc.A(t, this.c, ", price=", this.d, ", hasChevron=");
        return x4e.i(t, this.e, Extension.C_BRAKE);
    }
}
