package xsna;

import java.util.NoSuchElementException;

/* compiled from: BaseMediaChunkIterator.java */
/* loaded from: classes12.dex */
public abstract class sg6 implements bq10 {
    public final long b;
    public final long c;
    public long d;

    public sg6(long j, long j2) {
        this.b = j;
        this.c = j2;
        this.d = j - 1;
    }

    public final void c() {
        long j = this.d;
        if (j < this.b || j > this.c) {
            throw new NoSuchElementException();
        }
    }

    @Override // xsna.bq10
    public final boolean next() {
        long j = this.d + 1;
        this.d = j;
        return !(j > this.c);
    }
}
