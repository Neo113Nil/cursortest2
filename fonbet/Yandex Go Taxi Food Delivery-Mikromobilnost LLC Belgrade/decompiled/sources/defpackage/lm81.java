package defpackage;

/* loaded from: classes7.dex */
public abstract class lm81 extends lg81 {
    public final long j;
    public final long k;
    public final long l;
    public gr81 m;
    public int[] n;

    public lm81(u871 u871Var, no71 no71Var, qd81 qd81Var, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(u871Var, no71Var, 1, qd81Var, i, obj, j, j2);
        qd81Var.getClass();
        this.j = j5;
        this.k = j3;
        this.l = j4;
    }

    public final int a(int i) {
        int[] iArr = this.n;
        if (iArr != null) {
            return iArr[i];
        }
        ny61.k();
        return 0;
    }

    public long c() {
        long j = this.j;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public abstract boolean d();
}
