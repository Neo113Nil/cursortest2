package defpackage;

/* loaded from: classes8.dex */
public final class pqc0 {
    public final String a;
    public final skc0 b;

    public pqc0(String str, skc0 skc0Var) {
        this.a = str;
        this.b = skc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqc0)) {
            return false;
        }
        pqc0 pqc0Var = (pqc0) obj;
        return this.a.equals(pqc0Var.a) && this.b.equals(pqc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RightTopCorner(__typename=" + this.a + ", plaqueCorner=" + this.b + ')';
    }
}
