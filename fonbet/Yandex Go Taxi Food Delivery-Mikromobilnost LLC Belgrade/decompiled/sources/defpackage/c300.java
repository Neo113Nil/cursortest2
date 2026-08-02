package defpackage;

/* loaded from: classes2.dex */
public final class c300 {
    public final String a;
    public final b300 b;

    public c300(String str, b300 b300Var) {
        this.a = str;
        this.b = b300Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c300)) {
            return false;
        }
        c300 c300Var = (c300) obj;
        return jl40.l(this.a, c300Var.a) && jl40.l(this.b, c300Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b300 b300Var = this.b;
        return hashCode + (b300Var == null ? 0 : b300Var.hashCode());
    }

    public final String toString() {
        return "Part(__typename=" + this.a + ", onDecoratedTextReferencePartHighlight=" + this.b + ')';
    }
}
