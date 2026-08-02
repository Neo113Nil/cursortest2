package defpackage;

import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class p79 {
    public static final p79 c = new p79(a.N0(new o79().a), null);
    public final Set a;
    public final i79 b;

    public p79(Set set, i79 i79Var) {
        this.a = set;
        this.b = i79Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p79)) {
            return false;
        }
        p79 p79Var = (p79) obj;
        return p79Var.a.equals(this.a) && jl40.l(p79Var.b, this.b);
    }

    public final int hashCode() {
        int e = g8e.e(this.a, 1517, 41);
        i79 i79Var = this.b;
        return e + (i79Var != null ? i79Var.hashCode() : 0);
    }
}
