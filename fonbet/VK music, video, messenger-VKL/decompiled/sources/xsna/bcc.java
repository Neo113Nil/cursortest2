package xsna;

/* compiled from: Chunk.kt */
/* loaded from: classes8.dex */
public final class bcc {
    public final long a;
    public final long b;
    public long c;
    public boolean d;

    public bcc(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final void a() {
        if (this.b != this.c) {
            throw new IllegalStateException("Try confirm not completed chunk");
        }
        this.d = true;
    }

    public final void b(long j) {
        long j2 = this.c + j;
        this.c = j2;
        if (j2 > this.b) {
            throw new IllegalStateException("Chunk.bytesWritten > Chunk.len");
        }
    }

    public final String toString() {
        return efz.b(this.b, " }", fp.b(this.a, "Chunk { offset: ", ", len: "));
    }
}
