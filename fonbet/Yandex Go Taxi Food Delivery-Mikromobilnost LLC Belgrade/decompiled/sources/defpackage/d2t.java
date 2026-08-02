package defpackage;

/* loaded from: classes9.dex */
public final class d2t {
    public final o9j0 a;
    public final p820 b;

    public d2t(o9j0 o9j0Var, p820 p820Var) {
        this.a = o9j0Var;
        this.b = p820Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d2t) {
            d2t d2tVar = (d2t) obj;
            return this.a.equals(d2tVar.a) && this.b == d2tVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
