package defpackage;

import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class a8c {
    public final qzb0 a;
    public final float b;
    public final Object c;
    public final h041 d;
    public final Set e;
    public final List f;

    public a8c(qzb0 qzb0Var, float f, Object obj, h041 h041Var, Set set, List list) {
        this.a = qzb0Var;
        this.b = f;
        this.c = obj;
        this.d = h041Var;
        this.e = set;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8c)) {
            return false;
        }
        a8c a8cVar = (a8c) obj;
        return this.a.equals(a8cVar.a) && Float.compare(this.b, a8cVar.b) == 0 && jl40.l(this.c, a8cVar.c) && this.d.equals(a8cVar.d) && this.e.equals(a8cVar.e) && this.f.equals(a8cVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + g8e.e(this.e, (this.d.hashCode() + smw0.c(g8e.c(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31, 31);
    }

    public final String toString() {
        return "ClusterNode(seed=" + this.a + ", z=" + this.b + ", anchor=" + this.c + ", position=" + this.d + ", leafIds=" + this.e + ", children=" + this.f + Extension.C_BRAKE;
    }
}
