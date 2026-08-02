package yads;

/* loaded from: classes10.dex */
public final class ky2 extends ly2 {
    public final long d;
    public final long e;

    public ky2(qm2 qm2Var, long j, long j2, long j3, long j4) {
        super(qm2Var, j, j2);
        this.d = j3;
        this.e = j4;
    }

    public final qm2 b() {
        long j = this.e;
        if (j <= 0) {
            return null;
        }
        return new qm2(null, this.d, j);
    }
}
