package xsna;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: MergedStream.java */
/* loaded from: classes12.dex */
public final class h920 extends InputStream {
    public final tnv b;
    public final InputStream c;
    public byte[] d;
    public int e;
    public final int f;

    public h920(tnv tnvVar, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.b = tnvVar;
        this.c = inputStream;
        this.d = bArr;
        this.e = i;
        this.f = i2;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.d != null ? this.f - this.e : this.c.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m();
        this.c.close();
    }

    public final void m() {
        byte[] bArr = this.d;
        if (bArr != null) {
            this.d = null;
            tnv tnvVar = this.b;
            if (tnvVar != null) {
                tnvVar.b(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        if (this.d == null) {
            this.c.mark(i);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.d == null && this.c.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.d;
        if (bArr == null) {
            return this.c.read();
        }
        int i = this.e;
        int i2 = i + 1;
        this.e = i2;
        int i3 = bArr[i] & 255;
        if (i2 >= this.f) {
            m();
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (this.d == null) {
            this.c.reset();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2;
        if (this.d != null) {
            int i = this.e;
            j2 = this.f - i;
            if (j2 > j) {
                this.e = i + ((int) j);
                return j;
            }
            m();
            j -= j2;
        } else {
            j2 = 0;
        }
        return j > 0 ? this.c.skip(j) + j2 : j2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.d;
        if (bArr2 != null) {
            int i3 = this.e;
            int i4 = this.f;
            int i5 = i4 - i3;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(bArr2, i3, bArr, i, i2);
            int i6 = this.e + i2;
            this.e = i6;
            if (i6 >= i4) {
                m();
            }
            return i2;
        }
        return this.c.read(bArr, i, i2);
    }
}
