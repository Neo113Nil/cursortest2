package xsna;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;

/* compiled from: MarkEnforcingInputStream.java */
/* loaded from: classes12.dex */
public final class wn00 extends FilterInputStream {
    public int b;

    public wn00(@NonNull p1q p1qVar) {
        super(p1qVar);
        this.b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i = this.b;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final long h(long j) {
        int i = this.b;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    public final void i(long j) {
        int i = this.b;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.b = (int) (i - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.b = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (h(1L) == -1) {
            return -1;
        }
        int read = super.read();
        i(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        super.reset();
        this.b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long h = h(j);
        if (h == -1) {
            return 0L;
        }
        long skip = super.skip(h);
        i(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int h = (int) h(i2);
        if (h == -1) {
            return -1;
        }
        int read = super.read(bArr, i, h);
        i(read);
        return read;
    }
}
