package defpackage;

/* loaded from: classes2.dex */
public final class h3k0 {
    public final String a;
    public final j4k0 b;

    public h3k0(String str, j4k0 j4k0Var) {
        this.a = str;
        this.b = j4k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3k0)) {
            return false;
        }
        h3k0 h3k0Var = (h3k0) obj;
        return this.a.equals(h3k0Var.a) && this.b.equals(h3k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Item(__typename=" + this.a + ", richTextItem=" + this.b + ')';
    }
}
