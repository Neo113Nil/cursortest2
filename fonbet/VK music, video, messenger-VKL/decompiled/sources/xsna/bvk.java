package xsna;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: DataSourceInputStream.java */
/* loaded from: classes12.dex */
public final class bvk extends InputStream {
    public final androidx.media3.datasource.a b;
    public final evk c;
    public boolean e = false;
    public boolean f = false;
    public final byte[] d = new byte[1];

    public bvk(androidx.media3.datasource.a aVar, evk evkVar) {
        this.b = aVar;
        this.c = evkVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f) {
            return;
        }
        this.b.close();
        this.f = true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.d;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        fxc0.z(!this.f);
        boolean z = this.e;
        androidx.media3.datasource.a aVar = this.b;
        if (!z) {
            aVar.open(this.c);
            this.e = true;
        }
        int read = aVar.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
