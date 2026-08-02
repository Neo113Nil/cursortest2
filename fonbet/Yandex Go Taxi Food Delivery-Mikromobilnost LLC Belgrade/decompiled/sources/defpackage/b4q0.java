package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class b4q0 {
    public final nke a;
    public final List b;

    public b4q0(nke nkeVar, List list) {
        this.a = nkeVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4q0)) {
            return false;
        }
        b4q0 b4q0Var = (b4q0) obj;
        return jl40.l(this.a, b4q0Var.a) && jl40.l(this.b, b4q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SectionSnapshot(section=" + this.a + ", items=" + this.b + Extension.C_BRAKE;
    }
}
