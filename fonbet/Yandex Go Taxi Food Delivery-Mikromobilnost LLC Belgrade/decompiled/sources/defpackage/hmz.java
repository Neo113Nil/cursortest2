package defpackage;

/* loaded from: classes4.dex */
public final class hmz extends xlz {
    public final long a;
    public final long b;
    public boolean c;
    public long w;

    public hmz(long j, long j2, long j3) {
        this.a = j3;
        this.b = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.c = z;
        this.w = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // defpackage.xlz
    public final long nextLong() {
        long j = this.w;
        if (j != this.b) {
            this.w = this.a + j;
            return j;
        }
        if (this.c) {
            this.c = false;
            return j;
        }
        ny61.p();
        return 0L;
    }
}
