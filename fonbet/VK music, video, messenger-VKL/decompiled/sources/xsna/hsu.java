package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* compiled from: H264BitStreamReader.java */
/* loaded from: classes3.dex */
public final class hsu {
    public static final int[] e = {255, 127, 63, 31, 15, 7, 3, 1};
    public static final int[] f = {0, 128, PsExtractor.AUDIO_STREAM, 224, PsExtractor.VIDEO_STREAM_MASK, 248, 252, 254, 255};
    public final byte[] a;
    public final int b;
    public int c = 0;
    public int d = 0;

    /* compiled from: H264BitStreamReader.java */
    public static class a extends Exception {
    }

    public hsu(byte[] bArr, int i) {
        this.a = bArr;
        this.b = i;
    }

    public final void a(int i) {
        int i2 = (i / 8) + this.c;
        int i3 = (i % 8) + this.d;
        this.c = (i3 / 8) + i2;
        this.d = i3 % 8;
    }

    public final int b() throws a {
        if (!g(1)) {
            throw new a();
        }
        int i = (this.a[this.c] >> (7 - this.d)) & 1;
        a(1);
        return i;
    }

    public final int c() throws a {
        int e2 = e();
        if (e2 == 0) {
            return 0;
        }
        int i = e2 / 2;
        return (e2 & 1) == 0 ? -i : i + 1;
    }

    public final int d() throws a {
        if (!g(8)) {
            throw new a();
        }
        int i = this.c;
        byte[] bArr = this.a;
        byte b = bArr[i];
        int i2 = this.d;
        if (i2 == 0) {
            this.c = i + 1;
            return b;
        }
        int i3 = (b & e[i2]) << i2;
        int i4 = (bArr[i + 1] & f[i2]) >> (8 - i2);
        this.c = i + 1;
        return i4 | i3;
    }

    public final int e() throws a {
        int i;
        int b = b();
        int i2 = 0;
        int i3 = 0;
        while (b == 0 && i3 <= 31) {
            b = b();
            i3++;
        }
        if (b == 0 || i3 > 31) {
            throw new a();
        }
        int i4 = i3;
        while (i4 >= 8) {
            i2 += d() << (i4 - 8);
            i4 -= 8;
        }
        if (i4 > 0) {
            if (!g(i4)) {
                throw new a();
            }
            int i5 = this.c;
            byte[] bArr = this.a;
            byte b2 = bArr[i5];
            int i6 = this.d;
            int[] iArr = f;
            if (i6 != 0) {
                int i7 = 8 - i6;
                int[] iArr2 = e;
                if (i4 > i7) {
                    int i8 = i4 - i7;
                    i = ((b2 & iArr2[i6]) << i8) + ((bArr[i5 + 1] & iArr[i8]) >> (8 - i8));
                    a(i4);
                } else {
                    i = ((iArr2[i6] & b2) & iArr[i6 + i4]) >> (i7 - i4);
                    a(i4);
                }
            } else {
                i = (iArr[i4] & b2) >> (8 - i4);
                a(i4);
            }
            i2 += i;
        }
        return ((1 << i3) + i2) - 1;
    }

    public final void f(int i) throws a {
        if (!g(i)) {
            throw new a();
        }
        a(i);
    }

    public final boolean g(int i) {
        if (i <= 0) {
            return false;
        }
        int i2 = (i / 8) + this.c;
        int i3 = this.d;
        int i4 = (((i % 8) + i3) / 8) + i2;
        int i5 = this.b;
        if (i4 > i5) {
            return false;
        }
        return i4 < i5 || i3 == 0;
    }
}
