package yads;

/* loaded from: classes10.dex */
public final class oy2 implements Comparable {
    public final long b;
    public final u30 c;

    public oy2(long j, u30 u30Var) {
        this.b = j;
        this.c = u30Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.b;
        long j2 = ((oy2) obj).b;
        int i = mc3.a;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }
}
