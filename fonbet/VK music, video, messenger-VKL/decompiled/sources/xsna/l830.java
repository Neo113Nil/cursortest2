package xsna;

/* compiled from: MonotonousAlgorithm.kt */
/* loaded from: classes15.dex */
public final class l830 implements tx5 {
    public final long a;
    public final long b;

    public l830(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // xsna.tx5
    public final long a(int i) {
        long j = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            j = (long) (j * 1.5f);
        }
        return Math.min(j, this.b);
    }
}
