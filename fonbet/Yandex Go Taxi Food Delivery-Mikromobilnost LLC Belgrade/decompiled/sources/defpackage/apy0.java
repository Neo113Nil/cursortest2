package defpackage;

/* loaded from: classes.dex */
public final class apy0 {
    public static final apy0 c = new apy0(uh6.E(0), uh6.E(0));
    public final long a;
    public final long b;

    public apy0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apy0)) {
            return false;
        }
        apy0 apy0Var = (apy0) obj;
        return sty0.a(this.a, apy0Var.a) && sty0.a(this.b, apy0Var.b);
    }

    public final int hashCode() {
        tty0[] tty0VarArr = sty0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) sty0.e(this.a)) + ", restLine=" + ((Object) sty0.e(this.b)) + ')';
    }
}
