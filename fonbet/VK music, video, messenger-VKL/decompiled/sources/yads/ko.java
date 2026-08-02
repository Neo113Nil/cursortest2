package yads;

/* loaded from: classes10.dex */
public abstract class ko implements zk1 {
    public final long b;
    public final long c;
    public long d;

    public ko(long j, long j2) {
        this.b = j;
        this.c = j2;
        c();
    }

    public final void c() {
        this.d = this.b - 1;
    }

    @Override // yads.zk1
    public final boolean next() {
        long j = this.d + 1;
        this.d = j;
        return !(j > this.c);
    }
}
