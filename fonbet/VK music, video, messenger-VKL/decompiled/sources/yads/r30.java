package yads;

import java.io.InputStream;

/* loaded from: classes10.dex */
public final class r30 extends InputStream {
    public final p30 a;
    public final u30 b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public r30(v43 v43Var, u30 u30Var) {
        this.a = v43Var;
        this.b = u30Var;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.a.close();
        this.e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (!this.e) {
            if (!this.d) {
                this.a.a(this.b);
                this.d = true;
            }
            int read = this.a.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            return read;
        }
        throw new IllegalStateException();
    }
}
