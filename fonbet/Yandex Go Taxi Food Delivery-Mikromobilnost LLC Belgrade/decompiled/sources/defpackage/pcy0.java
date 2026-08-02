package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class pcy0 extends InputStream {
    public final InputStream a;
    public final OutputStream b;

    public pcy0(InputStream inputStream, OutputStream outputStream) {
        this.a = inputStream;
        this.b = outputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        this.b.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.a.read();
        if (read >= 0) {
            this.b.write(read);
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read > 0) {
            this.b.write(bArr, i, read);
        }
        return read;
    }
}
