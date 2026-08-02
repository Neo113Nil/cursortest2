package xsna;

/* compiled from: AutoValue_View.java */
/* loaded from: classes8.dex */
public final class fo5 extends ttt0 {
    public final x71 a;
    public final s770 b;
    public final int c;

    public fo5(x71 x71Var, u670 u670Var, int i) {
        if (x71Var == null) {
            throw new NullPointerException("Null aggregation");
        }
        this.a = x71Var;
        if (u670Var == null) {
            throw new NullPointerException("Null attributesProcessor");
        }
        this.b = u670Var;
        this.c = i;
    }

    @Override // xsna.ttt0
    public final x71 b() {
        return this.a;
    }

    @Override // xsna.ttt0
    public final s770 c() {
        return this.b;
    }

    @Override // xsna.ttt0
    public final int d() {
        return this.c;
    }

    @Override // xsna.ttt0
    public final String e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ttt0)) {
            return false;
        }
        ttt0 ttt0Var = (ttt0) obj;
        return ttt0Var.f() == null && ttt0Var.e() == null && this.a.equals(ttt0Var.b()) && this.b.equals(ttt0Var.c()) && this.c == ttt0Var.d();
    }

    @Override // xsna.ttt0
    public final String f() {
        return null;
    }

    public final int hashCode() {
        return this.c ^ ((((((1000003 * 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003);
    }
}
