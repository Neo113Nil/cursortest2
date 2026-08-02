package yads;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;

/* loaded from: classes10.dex */
public final class tg0 extends FilterInputStream {
    public final long a;
    public long b;

    public tg0(BufferedInputStream bufferedInputStream, long j) {
        super(bufferedInputStream);
        this.a = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
