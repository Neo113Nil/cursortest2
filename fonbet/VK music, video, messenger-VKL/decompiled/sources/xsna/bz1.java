package xsna;

/* compiled from: AnchoredClock.java */
/* loaded from: classes8.dex */
public final class bz1 {
    public final cvf a;
    public final long b;
    public final long c;

    public bz1(cvf cvfVar, long j, long j2) {
        this.a = cvfVar;
        this.b = j;
        this.c = j2;
    }

    public final long a() {
        ((gcd0) this.a).getClass();
        return this.b + (System.nanoTime() - this.c);
    }
}
