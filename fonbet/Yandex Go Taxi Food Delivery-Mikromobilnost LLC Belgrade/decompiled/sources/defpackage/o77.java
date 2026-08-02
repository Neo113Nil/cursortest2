package defpackage;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes11.dex */
public final class o77 extends FilterInputStream {
    public final /* synthetic */ int a = 1;
    public long b;
    public long c;

    public o77(InputStream inputStream) {
        super(inputStream);
        this.c = -1L;
        this.b = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.a) {
            case 0:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.b);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.a) {
            case 0:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.c = this.b;
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                long j = this.b;
                if (j == 0) {
                    return -1;
                }
                int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
                if (read != -1) {
                    this.b -= read;
                }
                return read;
            default:
                int read2 = super.read(bArr, i, i2);
                if (read2 != -1) {
                    this.c += read2;
                }
                return read2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        switch (this.a) {
            case 0:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.c == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.b = this.c;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        switch (this.a) {
            case 0:
                long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.b));
                this.b -= skip;
                return skip;
            default:
                return super.skip(j);
        }
    }

    public o77(BufferedInputStream bufferedInputStream, long j) {
        super(bufferedInputStream);
        this.b = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        switch (this.a) {
            case 0:
                if (this.b == 0) {
                    return -1;
                }
                int read = ((FilterInputStream) this).in.read();
                if (read != -1) {
                    this.b--;
                }
                return read;
            default:
                int read2 = super.read();
                if (read2 != -1) {
                    this.c++;
                }
                return read2;
        }
    }
}
