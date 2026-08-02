package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class p610 {
    public final List a;
    public final gs0 b;

    public p610(List list, gs0 gs0Var) {
        this.a = list;
        this.b = gs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p610)) {
            return false;
        }
        p610 p610Var = (p610) obj;
        return jl40.l(this.a, p610Var.a) && this.b.equals(p610Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Match(modes=" + this.a + ", config=" + this.b + Extension.C_BRAKE;
    }
}
