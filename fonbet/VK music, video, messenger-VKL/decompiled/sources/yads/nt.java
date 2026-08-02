package yads;

/* loaded from: classes10.dex */
public final class nt extends a63 implements Comparable {
    public long k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        nt ntVar = (nt) obj;
        if (b(4) != ntVar.b(4)) {
            return b(4) ? 1 : -1;
        }
        long j = this.f - ntVar.f;
        if (j == 0) {
            j = this.k - ntVar.k;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
