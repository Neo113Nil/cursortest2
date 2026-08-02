package xsna;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PooledByteArrayBufferedInputStream.java */
/* loaded from: classes12.dex */
public final class jvb0 extends InputStream {
    public final InputStream b;
    public final byte[] c;
    public final zag0<byte[]> d;
    public int e;
    public int f;
    public boolean g;

    public jvb0(InputStream inputStream, byte[] bArr, zag0<byte[]> zag0Var) {
        this.b = inputStream;
        bArr.getClass();
        this.c = bArr;
        zag0Var.getClass();
        this.d = zag0Var;
        this.e = 0;
        this.f = 0;
        this.g = false;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        sex0.f(this.f <= this.e);
        m();
        return this.b.available() + (this.e - this.f);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.g) {
            return;
        }
        this.g = true;
        this.d.a(this.c);
        super.close();
    }

    public final void finalize() throws Throwable {
        if (!this.g) {
            ahq.d("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    public final void m() throws IOException {
        if (this.g) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        sex0.f(this.f <= this.e);
        m();
        int i = this.f;
        int i2 = this.e;
        byte[] bArr = this.c;
        if (i >= i2) {
            int read = this.b.read(bArr);
            if (read <= 0) {
                return -1;
            }
            this.e = read;
            this.f = 0;
        }
        int i3 = this.f;
        this.f = i3 + 1;
        return bArr[i3] & 255;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        sex0.f(this.f <= this.e);
        m();
        int i = this.e;
        int i2 = this.f;
        long j2 = i - i2;
        if (j2 >= j) {
            this.f = (int) (i2 + j);
            return j;
        }
        this.f = i;
        return this.b.skip(j - j2) + j2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        sex0.f(this.f <= this.e);
        m();
        int i3 = this.f;
        int i4 = this.e;
        byte[] bArr2 = this.c;
        if (i3 >= i4) {
            int read = this.b.read(bArr2);
            if (read <= 0) {
                return -1;
            }
            this.e = read;
            this.f = 0;
        }
        int min = Math.min(this.e - this.f, i2);
        System.arraycopy(bArr2, this.f, bArr, i, min);
        this.f += min;
        return min;
    }
}
