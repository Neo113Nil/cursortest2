package xsna;

/* compiled from: TintedPainter.kt */
/* loaded from: classes17.dex */
public final class azo0 {
    public final lg90 a;
    public final l5g b;

    public azo0(lg90 lg90Var, l5g l5gVar) {
        this.a = lg90Var;
        this.b = l5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azo0)) {
            return false;
        }
        azo0 azo0Var = (azo0) obj;
        return epx.f(this.a, azo0Var.a) && epx.f(this.b, azo0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        l5g l5gVar = this.b;
        return hashCode + (l5gVar == null ? 0 : Long.hashCode(l5gVar.a));
    }

    public final String toString() {
        return "TintedPainter(painter=" + this.a + ", tint=" + this.b + ')';
    }
}
