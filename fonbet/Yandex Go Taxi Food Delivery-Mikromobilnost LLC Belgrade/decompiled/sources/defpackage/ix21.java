package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes8.dex */
public final class ix21 extends InputStream {
    public volatile boolean a;

    public final void a() {
        if (this.a) {
            ny61.v("Stream closed");
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        a();
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        smw0.r(i, i2, bArr.length);
        if (i2 == 0) {
            return 0;
        }
        a();
        return -1;
    }

    @Override // java.io.InputStream
    public final byte[] readAllBytes() {
        a();
        return new byte[0];
    }

    @Override // java.io.InputStream
    public final byte[] readNBytes(int i) {
        if (i >= 0) {
            a();
            return new byte[0];
        }
        ny61.g("len < 0");
        return null;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        a();
        return 0L;
    }

    @Override // java.io.InputStream
    public final long transferTo(OutputStream outputStream) {
        a();
        return 0L;
    }

    @Override // java.io.InputStream
    public final int read() {
        a();
        return -1;
    }

    @Override // java.io.InputStream
    public final int readNBytes(byte[] bArr, int i, int i2) {
        smw0.r(i, i2, bArr.length);
        a();
        return 0;
    }
}
