package defpackage;

/* loaded from: classes10.dex */
public final class na6 {
    public u92 a;
    public s72 b;
    public k28 c;
    public jb2 d;

    public na6(int i) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na6)) {
            return false;
        }
        na6 na6Var = (na6) obj;
        return jl40.l(this.a, na6Var.a) && jl40.l(this.b, na6Var.b) && jl40.l(this.c, na6Var.c) && jl40.l(this.d, na6Var.d);
    }

    public final int hashCode() {
        u92 u92Var = this.a;
        int hashCode = (u92Var == null ? 0 : u92Var.hashCode()) * 31;
        s72 s72Var = this.b;
        int hashCode2 = (hashCode + (s72Var == null ? 0 : s72Var.hashCode())) * 31;
        k28 k28Var = this.c;
        int hashCode3 = (hashCode2 + (k28Var == null ? 0 : k28Var.hashCode())) * 31;
        jb2 jb2Var = this.d;
        return hashCode3 + (jb2Var != null ? jb2Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }

    public na6() {
        this(0);
    }
}
