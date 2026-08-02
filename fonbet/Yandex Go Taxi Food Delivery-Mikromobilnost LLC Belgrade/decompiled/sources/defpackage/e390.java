package defpackage;

import java.io.OutputStream;

/* loaded from: classes11.dex */
public final class e390 extends OutputStream {
    public final byte[] a;
    public int b;

    public e390(int i) {
        this.a = new byte[i];
    }

    public final void a(byte b) {
        int i = this.b;
        byte[] bArr = this.a;
        if (i >= bArr.length) {
            ny61.v("stream was teared");
        } else {
            bArr[i] = b;
            this.b = i + 1;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        a((byte) ((i >> 24) & 255));
        a((byte) ((i >> 16) & 255));
        a((byte) ((i >> 8) & 255));
        a((byte) (i & 255));
    }

    public e390() {
        this(42);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        while (i < i2) {
            a(bArr[i]);
            i++;
        }
    }
}
