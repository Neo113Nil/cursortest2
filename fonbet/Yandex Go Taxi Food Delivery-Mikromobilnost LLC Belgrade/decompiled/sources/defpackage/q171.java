package defpackage;

/* loaded from: classes7.dex */
public final class q171 extends du81 implements Comparable {
    public long B;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q171 q171Var = (q171) obj;
        if (c(4) != q171Var.c(4)) {
            return c(4) ? 1 : -1;
        }
        long j = this.x - q171Var.x;
        if (j == 0) {
            j = this.B - q171Var.B;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
