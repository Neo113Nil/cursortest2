package xsna;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* compiled from: CleanInputStream.java */
/* loaded from: classes13.dex */
public final class khc extends FilterInputStream {
    public int b;
    public int c;

    public khc(ByteArrayInputStream byteArrayInputStream) {
        super(byteArrayInputStream);
        this.b = -1;
        this.c = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int read = super.read();
        if (read == 3 && this.b == 0 && this.c == 0) {
            this.b = -1;
            this.c = -1;
            read = super.read();
        }
        this.b = this.c;
        this.c = read;
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int read = read();
        if (read == -1) {
            return -1;
        }
        bArr[i] = (byte) read;
        int i3 = 1;
        while (i3 < i2) {
            try {
                int read2 = read();
                if (read2 == -1) {
                    break;
                }
                bArr[i + i3] = (byte) read2;
                i3++;
            } catch (IOException unused) {
            }
        }
        return i3;
    }
}
