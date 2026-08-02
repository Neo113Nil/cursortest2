package defpackage;

/* loaded from: classes10.dex */
public final class fkf0 {
    public final float a;
    public final gkp b;

    public fkf0(float f, gkp gkpVar) {
        this.a = f;
        this.b = gkpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkf0)) {
            return false;
        }
        fkf0 fkf0Var = (fkf0) obj;
        return Float.compare(this.a, fkf0Var.a) == 0 && jl40.l(this.b, fkf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ProgressableFeature(progress=" + this.a + ", feature=" + this.b + ')';
    }
}
