package xsna;

/* compiled from: TimestampHelper.kt */
/* loaded from: classes3.dex */
public final class byo0 {
    public long a;
    public boolean b;

    public final long a(long j) {
        if (this.b) {
            long nanoTime = System.nanoTime();
            this.a = nanoTime;
            return nanoTime;
        }
        if (j > 0) {
            long j2 = this.a;
            if (j2 > 0) {
                long j3 = (j - j2) / 1000000;
            }
        }
        if (j == 0) {
            j = System.nanoTime();
        }
        this.a = j;
        return j;
    }
}
