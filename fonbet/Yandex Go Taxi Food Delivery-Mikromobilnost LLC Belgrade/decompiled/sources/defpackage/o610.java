package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class o610 {
    public final List a;
    public final aq1 b;

    public o610(List list, aq1 aq1Var) {
        this.a = list;
        this.b = aq1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o610)) {
            return false;
        }
        o610 o610Var = (o610) obj;
        return jl40.l(this.a, o610Var.a) && this.b.equals(o610Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Match(modes=" + this.a + ", config=" + this.b + Extension.C_BRAKE;
    }
}
