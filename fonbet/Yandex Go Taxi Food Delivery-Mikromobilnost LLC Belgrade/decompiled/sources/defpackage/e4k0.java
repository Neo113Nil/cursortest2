package defpackage;

/* loaded from: classes2.dex */
public final class e4k0 {
    public final String a;
    public final y3k0 b;

    public e4k0(String str, y3k0 y3k0Var) {
        this.a = str;
        this.b = y3k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4k0)) {
            return false;
        }
        e4k0 e4k0Var = (e4k0) obj;
        return this.a.equals(e4k0Var.a) && this.b.equals(e4k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnCheckoutTitleColorItem(text=" + this.a + ", color=" + this.b + ')';
    }
}
