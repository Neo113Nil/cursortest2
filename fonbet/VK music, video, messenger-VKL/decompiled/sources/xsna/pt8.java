package xsna;

import java.io.OutputStream;
import java.util.LinkedList;

/* compiled from: ByteArrayBuilder.java */
/* loaded from: classes12.dex */
public final class pt8 extends OutputStream {
    public static final byte[] f = new byte[0];
    public final LinkedList<byte[]> b = new LinkedList<>();
    public int c;
    public byte[] d;
    public int e;

    public pt8(byte[] bArr, int i) {
        this.d = bArr;
        this.e = i;
    }

    public final void m() {
        int length = this.c + this.d.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.c = length;
        int max = Math.max(length >> 1, 1000);
        if (max > 131072) {
            max = 131072;
        }
        this.b.add(this.d);
        this.d = new byte[max];
        this.e = 0;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        if (this.e >= this.d.length) {
            m();
        }
        byte[] bArr = this.d;
        int i2 = this.e;
        this.e = i2 + 1;
        bArr[i2] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        while (true) {
            int min = Math.min(this.d.length - this.e, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, this.d, this.e, min);
                i += min;
                this.e += min;
                i2 -= min;
            }
            if (i2 <= 0) {
                return;
            } else {
                m();
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
