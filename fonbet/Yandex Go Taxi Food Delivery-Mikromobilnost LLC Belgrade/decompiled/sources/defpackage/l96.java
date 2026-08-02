package defpackage;

/* loaded from: classes9.dex */
public final class l96 implements b6x {
    public final String a;
    public final x4x b;

    public l96(String str, x4x x4xVar) {
        this.a = str;
        this.b = x4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l96)) {
            return false;
        }
        l96 l96Var = (l96) obj;
        return jl40.l(this.a, l96Var.a) && jl40.l(this.b, l96Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BooleanEvaluator(name=" + this.a + ", code=" + this.b + ')';
    }
}
