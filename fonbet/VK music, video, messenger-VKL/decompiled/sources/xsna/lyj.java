package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import xsna.bqg0;

/* compiled from: CountingDataInputStream.java */
/* loaded from: classes8.dex */
public final class lyj extends FilterInputStream {
    public final AtomicLong b;
    public bqg0.a c;
    public final AtomicBoolean d;

    public lyj(@NonNull BufferedInputStream bufferedInputStream, @Nullable bqg0.a aVar) {
        super(bufferedInputStream);
        this.b = new AtomicLong(0L);
        this.d = new AtomicBoolean(true);
        this.c = aVar;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        bqg0.a aVar = this.c;
        if (aVar != null) {
            bqg0.this.c.n();
        }
        this.c = null;
        super.close();
    }

    public final void h(long j) {
        if (j <= 0) {
            return;
        }
        bqg0.a aVar = this.c;
        this.b.addAndGet(j);
        if (this.d.compareAndSet(true, false) && aVar != null) {
            bqg0.this.c.p();
        }
        if (aVar != null) {
            bqg0.this.c.m((int) j);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        long read = super.read();
        h(read);
        return (int) read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long skip = super.skip(j);
        h(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        long read = super.read(bArr);
        h(read);
        return (int) read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long read = super.read(bArr, i, i2);
        h(read);
        return (int) read;
    }
}
