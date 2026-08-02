package defpackage;

/* loaded from: classes9.dex */
public final class etu0 implements b6x {
    public final String a;
    public final x4x b;

    public etu0(String str, x4x x4xVar) {
        this.a = str;
        this.b = x4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etu0)) {
            return false;
        }
        etu0 etu0Var = (etu0) obj;
        return jl40.l(this.a, etu0Var.a) && jl40.l(this.b, etu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StringEvaluator(name=" + this.a + ", code=" + this.b + ')';
    }
}
