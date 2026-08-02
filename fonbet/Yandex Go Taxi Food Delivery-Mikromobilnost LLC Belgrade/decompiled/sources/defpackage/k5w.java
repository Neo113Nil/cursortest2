package defpackage;

/* loaded from: classes9.dex */
public final class k5w implements b6x {
    public final String a;
    public final x4x b;

    public k5w(String str, x4x x4xVar) {
        this.a = str;
        this.b = x4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5w)) {
            return false;
        }
        k5w k5wVar = (k5w) obj;
        return jl40.l(this.a, k5wVar.a) && jl40.l(this.b, k5wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Int64Evaluator(name=" + this.a + ", code=" + this.b + ')';
    }
}
