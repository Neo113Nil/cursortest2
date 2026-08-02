package yads;

import java.util.List;

/* loaded from: classes10.dex */
public final class hy2 extends gy2 {
    public final List j;

    public hy2(qm2 qm2Var, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(qm2Var, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // yads.gy2
    public final long a(long j) {
        return this.j.size();
    }

    @Override // yads.gy2
    public final boolean b() {
        return true;
    }

    @Override // yads.gy2
    public final qm2 a(long j, mp2 mp2Var) {
        return (qm2) this.j.get((int) (j - this.d));
    }
}
