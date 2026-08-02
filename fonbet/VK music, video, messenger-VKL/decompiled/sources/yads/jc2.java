package yads;

import java.nio.charset.Charset;

/* loaded from: classes10.dex */
public final class jc2 {
    public byte[] a;
    public int b;
    public int c;
    public int d;

    public jc2() {
        this.a = mc3.f;
    }

    public final void a() {
        int i = this.b;
        if (i >= 0) {
            int i2 = this.d;
            if (i < i2) {
                return;
            }
            if (i == i2 && this.c == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final int b() {
        return ((this.d - this.b) * 8) - this.c;
    }

    public final int c() {
        if (this.c == 0) {
            return this.b;
        }
        throw new IllegalStateException();
    }

    public final int d() {
        return (this.b * 8) + this.c;
    }

    public final boolean e() {
        boolean z = (this.a[this.b] & (128 >> this.c)) != 0;
        g();
        return z;
    }

    public final long f() {
        int a = a(4);
        int a2 = a(32);
        int i = mc3.a;
        return ((a & 4294967295L) << 32) | (a2 & 4294967295L);
    }

    public final void g() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.b++;
        }
        a();
    }

    public final void b(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 * 8);
        a();
    }

    public final void d(int i) {
        if (this.c != 0) {
            throw new IllegalStateException();
        }
        this.b += i;
        a();
    }

    public jc2(int i, byte[] bArr) {
        this.a = bArr;
        this.d = i;
    }

    public final int a(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.c = i4;
            byte[] bArr = this.a;
            int i5 = this.b;
            this.b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.a;
        int i6 = this.b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.c = 0;
            this.b = i6 + 1;
        }
        a();
        return i7;
    }

    public final void c(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = (i - (i2 * 8)) + this.c;
        this.c = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.c = i4 - 8;
        }
        a();
    }

    public jc2(byte[] bArr) {
        this(bArr.length, bArr);
    }

    public final void a(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.a;
            int i4 = this.b;
            int i5 = i4 + 1;
            this.b = i5;
            byte b = bArr2[i4];
            int i6 = this.c;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.c;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.a;
            int i9 = this.b;
            this.b = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.c = i8 - 8;
        }
        int i10 = this.c + i7;
        this.c = i10;
        byte[] bArr4 = this.a;
        int i11 = this.b;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.c = 0;
            this.b = i11 + 1;
        }
        a();
    }

    public final String a(int i, Charset charset) {
        byte[] bArr = new byte[i];
        if (this.c == 0) {
            System.arraycopy(this.a, this.b, bArr, 0, i);
            this.b += i;
            a();
            return new String(bArr, charset);
        }
        throw new IllegalStateException();
    }

    public final void a(int i, byte[] bArr) {
        this.a = bArr;
        this.b = 0;
        this.c = 0;
        this.d = i;
    }
}
