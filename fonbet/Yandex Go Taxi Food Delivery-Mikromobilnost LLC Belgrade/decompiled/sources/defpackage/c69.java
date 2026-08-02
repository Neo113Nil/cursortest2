package defpackage;

/* loaded from: classes10.dex */
public final class c69 extends k2v0 implements Comparable {
    public long C;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c69 c69Var = (c69) obj;
        if (b(4) != c69Var.b(4)) {
            return b(4) ? 1 : -1;
        }
        long j = this.y - c69Var.y;
        if (j == 0) {
            j = this.C - c69Var.C;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
