package defpackage;

/* loaded from: classes10.dex */
public abstract class a45 implements jb10 {
    public final long a;
    public final long b;
    public long c;

    public a45(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = j - 1;
    }

    public final void b() {
        long j = this.c;
        if (j < this.a || j > this.b) {
            ny61.p();
        }
    }

    @Override // defpackage.jb10
    public final boolean next() {
        long j = this.c + 1;
        this.c = j;
        return !(j > this.b);
    }
}
