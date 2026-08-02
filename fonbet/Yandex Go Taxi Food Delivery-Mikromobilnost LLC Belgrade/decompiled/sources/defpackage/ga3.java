package defpackage;

/* loaded from: classes10.dex */
public final class ga3 extends ha3 {
    public final pa90 a;
    public final u3v0 b;

    public ga3(pa90 pa90Var, u3v0 u3v0Var) {
        this.a = pa90Var;
        this.b = u3v0Var;
    }

    @Override // defpackage.ha3
    public final pa90 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga3)) {
            return false;
        }
        ga3 ga3Var = (ga3) obj;
        return this.a.equals(ga3Var.a) && this.b.equals(ga3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.b + ')';
    }
}
