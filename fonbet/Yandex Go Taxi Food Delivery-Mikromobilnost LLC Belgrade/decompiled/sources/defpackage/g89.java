package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class g89 {
    public final nke a;
    public final f0q0 b;
    public final List c;
    public final boolean d;

    public g89(nke nkeVar, f0q0 f0q0Var, List list, boolean z) {
        this.a = nkeVar;
        this.b = f0q0Var;
        this.c = list;
        this.d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [f0q0] */
    public static g89 a(g89 g89Var, qwg qwgVar, List list, int i) {
        nke nkeVar = g89Var.a;
        qwg qwgVar2 = qwgVar;
        if ((i & 2) != 0) {
            qwgVar2 = g89Var.b;
        }
        if ((i & 4) != 0) {
            list = g89Var.c;
        }
        return new g89(nkeVar, qwgVar2, list, (i & 8) != 0 ? g89Var.d : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g89)) {
            return false;
        }
        g89 g89Var = (g89) obj;
        return jl40.l(this.a, g89Var.a) && jl40.l(this.b, g89Var.b) && jl40.l(this.c, g89Var.c) && this.d == g89Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Segment(section=" + this.a + ", controller=" + this.b + ", items=" + this.c + ", hasMoreItems=" + this.d + Extension.C_BRAKE;
    }
}
