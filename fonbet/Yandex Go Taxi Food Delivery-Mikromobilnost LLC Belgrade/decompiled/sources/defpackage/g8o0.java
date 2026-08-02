package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class g8o0 {
    public final CharSequence a;
    public final CharSequence b;
    public final List c;

    public g8o0(CharSequence charSequence, CharSequence charSequence2, List list) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8o0)) {
            return false;
        }
        g8o0 g8o0Var = (g8o0) obj;
        return jl40.l(this.a, g8o0Var.a) && jl40.l(this.b, g8o0Var.b) && jl40.l(this.c, g8o0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(vfc.r(this.a, this.b, "Details(title=", ", subtitle=", ", items="), this.c, Extension.C_BRAKE);
    }
}
