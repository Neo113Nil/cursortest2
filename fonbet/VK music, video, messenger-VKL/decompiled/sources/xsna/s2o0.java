package xsna;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: TailAppendingInputStream.java */
/* loaded from: classes12.dex */
public final class s2o0 extends FilterInputStream {
    public final byte[] b;
    public int c;
    public int d;

    public s2o0(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.b = bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i);
            this.d = this.c;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            return read;
        }
        int i = this.c;
        byte[] bArr = this.b;
        if (i >= bArr.length) {
            return -1;
        }
        this.c = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.c = this.d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i4 < i2) {
            int i5 = this.c;
            byte[] bArr2 = this.b;
            if (i5 >= bArr2.length) {
                i3 = -1;
            } else {
                this.c = i5 + 1;
                i3 = bArr2[i5] & 255;
            }
            if (i3 == -1) {
                break;
            }
            bArr[i + i4] = (byte) i3;
            i4++;
        }
        if (i4 > 0) {
            return i4;
        }
        return -1;
    }
}
