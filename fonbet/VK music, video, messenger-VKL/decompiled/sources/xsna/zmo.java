package xsna;

/* compiled from: DroppedFramesTracker.kt */
/* loaded from: classes8.dex */
public final class zmo {
    public ymo a = new ymo(0, 0, 0, 0, 0);
    public long b;
    public long c;
    public long d;
    public long e;
    public volatile g8l f;

    public final void a(g8l g8lVar) {
        long j;
        synchronized (g8lVar) {
        }
        long j2 = g8lVar.e;
        long j3 = g8lVar.g;
        long j4 = g8lVar.j;
        long j5 = g8lVar.f;
        long j6 = g8lVar.i;
        long j7 = j2 - this.b;
        if (j7 < 0) {
            j7 = 0;
            j = 0;
        } else {
            j = 0;
        }
        long j8 = j3 - this.c;
        if (j8 < j) {
            j8 = j;
        }
        long j9 = j7;
        long j10 = j4 - this.d;
        long j11 = j10 < j ? j : j10;
        long j12 = j5 - this.e;
        if (j12 >= j) {
            j = j12;
        }
        ymo ymoVar = this.a;
        long j13 = ymoVar.a + j9;
        long j14 = ymoVar.b + j8;
        long j15 = ymoVar.c + j11;
        long j16 = ymoVar.d + j;
        long max = Math.max(ymoVar.e, j6);
        ymoVar.getClass();
        this.a = new ymo(j13, j14, j15, j16, max);
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }
}
