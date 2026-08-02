package defpackage;

/* loaded from: classes10.dex */
public final class o96 extends z9b1 {
    public final xd4 a;

    public o96(xd4 xd4Var) {
        this.a = xd4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o96) && this.a.equals(((o96) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Element(value=" + this.a + ')';
    }
}
