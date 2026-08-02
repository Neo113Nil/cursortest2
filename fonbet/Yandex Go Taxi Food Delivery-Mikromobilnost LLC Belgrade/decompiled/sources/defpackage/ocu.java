package defpackage;

/* loaded from: classes5.dex */
public final class ocu {
    public final lrb1 a;

    public ocu(lrb1 lrb1Var, int i) {
        this.a = (i & 1) != 0 ? null : lrb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ocu) && jl40.l(this.a, ((ocu) obj).a);
    }

    public final int hashCode() {
        lrb1 lrb1Var = this.a;
        return (lrb1Var == null ? 0 : lrb1Var.hashCode()) * 31;
    }

    public final String toString() {
        return "HeaderTrailModel(trailElement=" + this.a + ", accessibilityLabel=null)";
    }

    public ocu() {
        this(null, 3);
    }
}
