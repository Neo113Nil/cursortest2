package defpackage;

/* loaded from: classes10.dex */
public final class k531 {
    public final sj2 a;
    public final rbn b;

    public k531(sj2 sj2Var, rbn rbnVar) {
        this.a = sj2Var;
        this.b = rbnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k531)) {
            return false;
        }
        k531 k531Var = (k531) obj;
        return jl40.l(this.a, k531Var.a) && jl40.l(this.b, k531Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
