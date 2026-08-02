package defpackage;

/* loaded from: classes9.dex */
public final class g2t {
    public final v6r a;
    public final p820 b;
    public final r0t c;

    public g2t(v6r v6rVar, p820 p820Var, r0t r0tVar) {
        this.a = v6rVar;
        this.b = p820Var;
        this.c = r0tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g2t) {
            g2t g2tVar = (g2t) obj;
            if (jl40.l(this.a, g2tVar.a) && this.b == g2tVar.b && this.c.equals(g2tVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
