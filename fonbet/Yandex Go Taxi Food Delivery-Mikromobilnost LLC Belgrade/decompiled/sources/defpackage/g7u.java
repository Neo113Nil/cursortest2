package defpackage;

/* loaded from: classes10.dex */
public final class g7u implements rxr {
    public final hi6 a;
    public final mf1 b;
    public final bg1 c;

    public g7u(hi6 hi6Var, mf1 mf1Var, bg1 bg1Var) {
        this.a = hi6Var;
        this.b = mf1Var;
        this.c = bg1Var;
        if (hi6Var.b() == 0 && hi6Var.a() == 0) {
            ny61.g("Bounds must be non zero");
            throw null;
        }
        if (hi6Var.a == 0 || hi6Var.b == 0) {
            return;
        }
        ny61.g("Bounding rectangle must start at the top or left window edge for folding features");
        throw null;
    }

    public final boolean a() {
        mf1 mf1Var = mf1.F;
        mf1 mf1Var2 = this.b;
        return mf1Var2 == mf1Var || (mf1Var2 == mf1.E && this.c == bg1.C);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (g7u.class.equals(obj != null ? obj.getClass() : null)) {
            g7u g7uVar = (g7u) obj;
            return this.a.equals(g7uVar.a) && this.b == g7uVar.b && this.c == g7uVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return g7u.class.getSimpleName() + " { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
