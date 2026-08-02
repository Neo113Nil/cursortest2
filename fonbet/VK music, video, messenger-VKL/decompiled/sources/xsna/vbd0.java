package xsna;

import java.io.InputStream;

/* compiled from: PriorityInputStream.kt */
/* loaded from: classes2.dex */
public final class vbd0 extends InputStream {
    public final InputStream b;
    public final wbd0 c;
    public final ckv d;
    public volatile boolean e;
    public volatile boolean f;

    public vbd0(InputStream inputStream, wbd0 wbd0Var, ckv ckvVar) {
        this.b = inputStream;
        this.c = wbd0Var;
        this.d = ckvVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        try {
            return this.b.available();
        } catch (Throwable th) {
            this.e = true;
            this.c.b(this.d);
            throw th;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            return;
        }
        try {
            this.b.close();
            this.f = true;
            if (!this.e) {
                this.e = true;
                this.c.b(this.d);
            }
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable th) {
            this.e = true;
            this.c.b(this.d);
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.b.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.b.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.e) {
            return -1;
        }
        try {
            this.c.c(this.d);
            int read = this.b.read();
            if (read == -1) {
            }
            return read;
        } finally {
            this.e = true;
            this.c.b(this.d);
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        try {
            this.b.reset();
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable th) {
            this.e = true;
            this.c.b(this.d);
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        try {
            this.c.c(this.d);
            return this.b.skip(j);
        } catch (Throwable th) {
            this.e = true;
            this.c.b(this.d);
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        if (this.e) {
            return -1;
        }
        try {
            this.c.c(this.d);
            int read = this.b.read(bArr);
            if (read == -1) {
            }
            return read;
        } finally {
            this.e = true;
            this.c.b(this.d);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.e) {
            return -1;
        }
        try {
            this.c.c(this.d);
            int read = this.b.read(bArr, i, i2);
            if (read == -1) {
            }
            return read;
        } finally {
            this.e = true;
            this.c.b(this.d);
        }
    }
}
