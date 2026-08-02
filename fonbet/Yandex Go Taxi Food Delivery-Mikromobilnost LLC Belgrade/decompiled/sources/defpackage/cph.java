package defpackage;

import java.io.InputStream;

/* loaded from: classes4.dex */
public final class cph extends ufy {
    public static final byte[] x = new byte[0];
    public final int c;
    public int w;

    public cph(InputStream inputStream, int i, int i2) {
        super(i2, inputStream);
        if (i <= 0) {
            if (i < 0) {
                ny61.g("negative lengths not allowed");
                throw null;
            }
            a();
        }
        this.c = i;
        this.w = i;
    }

    public final byte[] c() {
        int i = this.w;
        if (i == 0) {
            return x;
        }
        int i2 = this.b;
        if (i >= i2) {
            xfo.d(this.w, i2, " >= ", "corrupted stream - out of bounds length found: ");
            return null;
        }
        byte[] bArr = new byte[i];
        int a = i - zru0.a(this.a, bArr, 0, i);
        this.w = a;
        if (a == 0) {
            a();
            return bArr;
        }
        xfo.c(this.c, this.w);
        return null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.w;
        if (i3 == 0) {
            return -1;
        }
        int read = this.a.read(bArr, i, Math.min(i2, i3));
        if (read < 0) {
            xfo.c(this.c, this.w);
            return 0;
        }
        int i4 = this.w - read;
        this.w = i4;
        if (i4 == 0) {
            a();
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.w == 0) {
            return -1;
        }
        int read = this.a.read();
        if (read < 0) {
            xfo.c(this.c, this.w);
            return 0;
        }
        int i = this.w - 1;
        this.w = i;
        if (i == 0) {
            a();
        }
        return read;
    }
}
