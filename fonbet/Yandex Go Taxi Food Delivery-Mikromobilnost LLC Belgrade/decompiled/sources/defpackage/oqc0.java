package defpackage;

/* loaded from: classes8.dex */
public final class oqc0 {
    public final String a;
    public final skc0 b;

    public oqc0(String str, skc0 skc0Var) {
        this.a = str;
        this.b = skc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqc0)) {
            return false;
        }
        oqc0 oqc0Var = (oqc0) obj;
        return this.a.equals(oqc0Var.a) && this.b.equals(oqc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RightBottomCorner(__typename=" + this.a + ", plaqueCorner=" + this.b + ')';
    }
}
