package xsna;

/* compiled from: AutoValue_RegisteredView.java */
/* loaded from: classes8.dex */
public final class pn5 extends mqf0 {
    public final o8x a;
    public final ttt0 b;
    public final s770 c;
    public final int d;
    public final ngk0 e;

    public pn5(o8x o8xVar, ttt0 ttt0Var, s770 s770Var, int i, ngk0 ngk0Var) {
        if (o8xVar == null) {
            throw new NullPointerException("Null instrumentSelector");
        }
        this.a = o8xVar;
        if (ttt0Var == null) {
            throw new NullPointerException("Null view");
        }
        this.b = ttt0Var;
        this.c = s770Var;
        this.d = i;
        if (ngk0Var == null) {
            throw new NullPointerException("Null viewSourceInfo");
        }
        this.e = ngk0Var;
    }

    @Override // xsna.mqf0
    public final int a() {
        return this.d;
    }

    @Override // xsna.mqf0
    public final o8x b() {
        return this.a;
    }

    @Override // xsna.mqf0
    public final ttt0 c() {
        return this.b;
    }

    @Override // xsna.mqf0
    public final s770 d() {
        return this.c;
    }

    @Override // xsna.mqf0
    public final ngk0 e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mqf0)) {
            return false;
        }
        mqf0 mqf0Var = (mqf0) obj;
        return this.a.equals(mqf0Var.b()) && this.b.equals(mqf0Var.c()) && this.c.equals(mqf0Var.d()) && this.d == mqf0Var.a() && this.e.equals(mqf0Var.e());
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }
}
