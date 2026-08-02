package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jp80 implements mp80 {
    public final List a;
    public final List b;
    public final boolean c;
    public final boolean d;

    public jp80(List list, List list2, boolean z, boolean z2) {
        this.a = list;
        this.b = list2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp80)) {
            return false;
        }
        jp80 jp80Var = (jp80) obj;
        return jl40.l(this.a, jp80Var.a) && jl40.l(this.b, jp80Var.b) && this.c == jp80Var.c && this.d == jp80Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return smw0.k(", shouldScrollToTop=", Extension.C_BRAKE, qv10.v("Content(items=", this.a, ", chips=", this.b, ", isShimmering="), this.c, this.d);
    }
}
