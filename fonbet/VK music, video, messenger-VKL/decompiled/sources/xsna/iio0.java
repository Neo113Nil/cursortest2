package xsna;

/* compiled from: TextIndent.kt */
/* loaded from: classes11.dex */
public final class iio0 {
    public static final iio0 c = new iio0(l2l0.l(0), l2l0.l(0));
    public final long a;
    public final long b;

    public iio0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iio0)) {
            return false;
        }
        iio0 iio0Var = (iio0) obj;
        return fno0.b(this.a, iio0Var.a) && fno0.b(this.b, iio0Var.b);
    }

    public final int hashCode() {
        gno0[] gno0VarArr = fno0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) fno0.f(this.a)) + ", restLine=" + ((Object) fno0.f(this.b)) + ')';
    }
}
