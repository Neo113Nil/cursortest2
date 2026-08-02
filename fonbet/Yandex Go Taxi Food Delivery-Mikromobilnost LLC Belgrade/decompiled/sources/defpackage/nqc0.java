package defpackage;

/* loaded from: classes8.dex */
public final class nqc0 {
    public final String a;
    public final skc0 b;

    public nqc0(String str, skc0 skc0Var) {
        this.a = str;
        this.b = skc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqc0)) {
            return false;
        }
        nqc0 nqc0Var = (nqc0) obj;
        return this.a.equals(nqc0Var.a) && this.b.equals(nqc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LeftTopCorner(__typename=" + this.a + ", plaqueCorner=" + this.b + ')';
    }
}
