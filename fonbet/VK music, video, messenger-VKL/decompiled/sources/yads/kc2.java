package yads;

import java.nio.charset.Charset;
import java.util.Arrays;
import ru.ok.android.commons.nio.charset.CharsetEncoder;

/* loaded from: classes10.dex */
public final class kc2 {
    public byte[] a;
    public int b;
    public int c;

    public kc2() {
        this.a = mc3.f;
    }

    public final void a(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final int b() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        int i3 = i + 3;
        int i4 = i2 | ((bArr[i + 2] & 255) << 8);
        this.b = i + 4;
        return (bArr[i3] & 255) | i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r1 == r4) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String c() {
        int i = this.c;
        int i2 = this.b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.c) {
            byte b = this.a[i2];
            int i3 = mc3.a;
            if (b == 10 || b == 13) {
                break;
            }
            i2++;
        }
        int i4 = this.b;
        if (i2 - i4 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i4] == -17 && bArr[i4 + 1] == -69 && bArr[i4 + 2] == -65) {
                this.b = i4 + 3;
            }
        }
        byte[] bArr2 = this.a;
        int i5 = this.b;
        String a = mc3.a(bArr2, i5, i2 - i5);
        this.b = i2;
        int i6 = this.c;
        if (i2 != i6) {
            byte[] bArr3 = this.a;
            if (bArr3[i2] == 13) {
                int i7 = i2 + 1;
                this.b = i7;
            }
            int i8 = this.b;
            if (bArr3[i8] == 10) {
                this.b = i8 + 1;
            }
        }
        return a;
    }

    public final int d() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        int i3 = i + 3;
        int i4 = i2 | ((bArr[i + 2] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i3] & 255) << 24) | i4;
    }

    public final long e() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 7;
        long j = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        this.b = i + 8;
        return ((bArr[i2] & 255) << 56) | j;
    }

    public final short f() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final long g() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 3;
        long j = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i2] & 255) << 24) | j;
    }

    public final int h() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final long i() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        this.b = i + 8;
        return (bArr[i2] & 255) | j;
    }

    public final String j() {
        int i = this.c;
        int i2 = this.b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.c && this.a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.a;
        int i3 = this.b;
        String a = mc3.a(bArr, i3, i2 - i3);
        this.b = i2;
        if (i2 < this.c) {
            this.b = i2 + 1;
        }
        return a;
    }

    public final short k() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final int l() {
        return (m() << 21) | (m() << 14) | (m() << 7) | m();
    }

    public final int m() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final long n() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        this.b = i + 4;
        return (bArr[i2] & 255) | j;
    }

    public final int o() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 2;
        int i3 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
        this.b = i + 3;
        return (bArr[i2] & 255) | i3;
    }

    public final int p() {
        int b = b();
        if (b >= 0) {
            return b;
        }
        throw new IllegalStateException(nh2.a("Top bit not zero: ", b));
    }

    public final long q() {
        long i = i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException(defpackage.k0.a(i, "Top bit not zero: "));
    }

    public final int r() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public final long s() {
        int i;
        int i2;
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r6 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException(defpackage.k0.a(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i = 1; i < i2; i++) {
            if ((this.a[this.b + i] & 192) != 128) {
                throw new NumberFormatException(defpackage.k0.a(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | (r3 & CharsetEncoder.DEFAULT_REPLACEMENT);
        }
        this.b += i2;
        return j;
    }

    public final String b(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String a = mc3.a(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.b += i;
        return a;
    }

    public final void d(int i) {
        if (i < 0 || i > this.a.length) {
            throw new IllegalArgumentException();
        }
        this.c = i;
    }

    public final void e(int i) {
        if (i < 0 || i > this.c) {
            throw new IllegalArgumentException();
        }
        this.b = i;
    }

    public kc2(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public final byte[] a() {
        return this.a;
    }

    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public kc2(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        this.a = bArr;
        this.c = length;
        this.b = 0;
    }

    public kc2(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public final String a(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final void c(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }
}
