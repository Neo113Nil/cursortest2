package defpackage;

/* loaded from: classes8.dex */
public final class mqc0 {
    public final String a;
    public final skc0 b;

    public mqc0(String str, skc0 skc0Var) {
        this.a = str;
        this.b = skc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqc0)) {
            return false;
        }
        mqc0 mqc0Var = (mqc0) obj;
        return this.a.equals(mqc0Var.a) && this.b.equals(mqc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LeftBottomCorner(__typename=" + this.a + ", plaqueCorner=" + this.b + ')';
    }
}
