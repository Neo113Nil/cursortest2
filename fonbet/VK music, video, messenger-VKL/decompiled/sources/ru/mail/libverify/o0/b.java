package ru.mail.libverify.o0;

import android.annotation.SuppressLint;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes9.dex */
public final class b {
    static final int[] n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private long c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int m;
    private final byte[] a = new byte[4];
    private int b = 0;
    private int[] l = new int[64];

    public b() {
        d();
    }

    private static int a(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    private static int b(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(byte[] bArr, int i) {
        int i2 = 0;
        int max = Math.max(0, i);
        if (this.b != 0) {
            int i3 = 0;
            while (true) {
                if (i3 >= max) {
                    i2 = i3;
                    break;
                }
                byte[] bArr2 = this.a;
                int i4 = this.b;
                int i5 = i4 + 1;
                this.b = i5;
                int i6 = i3 + 1;
                bArr2[i4] = bArr[i3];
                if (i5 == 4) {
                    a(bArr2, 0);
                    this.b = 0;
                    i2 = i6;
                    break;
                }
                i3 = i6;
            }
        }
        int i7 = ((max - i2) & (-4)) + i2;
        while (i2 < i7) {
            a(bArr, i2);
            i2 += 4;
        }
        while (i2 < max) {
            byte[] bArr3 = this.a;
            int i8 = this.b;
            this.b = i8 + 1;
            bArr3[i8] = bArr[i2];
            i2++;
        }
        this.c += max;
    }

    public final void d() {
        this.c = 0L;
        this.b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.d = 1779033703;
        this.e = -1150833019;
        this.f = 1013904242;
        this.g = -1521486534;
        this.h = 1359893119;
        this.i = -1694144372;
        this.j = 528734635;
        this.k = 1541459225;
        this.m = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.l;
            if (i2 == iArr.length) {
                return;
            }
            iArr[i2] = 0;
            i2++;
        }
    }

    private static int a(int i, int i2, int i3) {
        return ((i & i3) ^ (i & i2)) ^ (i2 & i3);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a() {
        long j = this.c << 3;
        a(Byte.MIN_VALUE);
        while (this.b != 0) {
            a((byte) 0);
        }
        if (this.m > 14) {
            c();
        }
        int[] iArr = this.l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
        c();
    }

    public void a(byte b) {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            a(bArr, 0);
            this.b = 0;
        }
        this.c++;
    }

    public final void a(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.l;
        int i3 = this.m;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.m = i4;
        if (i4 == 16) {
            c();
        }
    }

    public final void c() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.l;
            int i2 = iArr[i - 2];
            int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
        }
        int i5 = this.d;
        int i6 = this.e;
        int i7 = this.f;
        int i8 = this.g;
        int i9 = this.h;
        int i10 = this.i;
        int i11 = this.j;
        int i12 = this.k;
        int i13 = 0;
        for (int i14 = 0; i14 < 8; i14++) {
            int b = b(i9) + (((~i9) & i11) ^ (i9 & i10));
            int[] iArr2 = n;
            int i15 = b + iArr2[i13] + this.l[i13] + i12;
            int i16 = i8 + i15;
            int a = a(i5) + a(i5, i6, i7) + i15;
            int i17 = i13 + 1;
            int b2 = b(i16) + ((i16 & i9) ^ ((~i16) & i10)) + iArr2[i17] + this.l[i17] + i11;
            int i18 = i7 + b2;
            int a2 = a(a) + a(a, i5, i6) + b2;
            int i19 = i13 + 2;
            int b3 = b(i18) + (((~i18) & i9) ^ (i18 & i16)) + iArr2[i19] + this.l[i19] + i10;
            int i20 = i6 + b3;
            int a3 = a(a2) + a(a2, a, i5) + b3;
            int i21 = i13 + 3;
            int b4 = b(i20) + ((i20 & i18) ^ ((~i20) & i16)) + iArr2[i21] + this.l[i21] + i9;
            int i22 = i5 + b4;
            int a4 = a(a3) + a(a3, a2, a) + b4;
            int i23 = i13 + 4;
            int b5 = b(i22) + ((i22 & i20) ^ ((~i22) & i18)) + iArr2[i23] + this.l[i23] + i16;
            i12 = a + b5;
            i8 = a(a4) + a(a4, a3, a2) + b5;
            int i24 = i13 + 5;
            int b6 = b(i12) + ((i12 & i22) ^ ((~i12) & i20)) + iArr2[i24] + this.l[i24] + i18;
            i11 = a2 + b6;
            i7 = a(i8) + a(i8, a4, a3) + b6;
            int i25 = i13 + 6;
            int b7 = b(i11) + ((i11 & i12) ^ ((~i11) & i22)) + iArr2[i25] + this.l[i25] + i20;
            i10 = a3 + b7;
            i6 = a(i7) + a(i7, i8, a4) + b7;
            int i26 = i13 + 7;
            int b8 = b(i10) + ((i10 & i11) ^ ((~i10) & i12)) + iArr2[i26] + this.l[i26] + i22;
            i9 = a4 + b8;
            i5 = a(i6) + a(i6, i7, i8) + b8;
            i13 += 8;
        }
        this.d += i5;
        this.e += i6;
        this.f += i7;
        this.g += i8;
        this.h += i9;
        this.i += i10;
        this.j += i11;
        this.k += i12;
        this.m = 0;
        for (int i27 = 0; i27 < 16; i27++) {
            this.l[i27] = 0;
        }
    }

    public static byte[] a(byte[] bArr) {
        b bVar = new b();
        bVar.b(bArr, bArr.length);
        byte[] bArr2 = new byte[32];
        bVar.a();
        a.a(bArr2, bVar.d, 0);
        a.a(bArr2, bVar.e, 4);
        a.a(bArr2, bVar.f, 8);
        a.a(bArr2, bVar.g, 12);
        a.a(bArr2, bVar.h, 16);
        a.a(bArr2, bVar.i, 20);
        a.a(bArr2, bVar.j, 24);
        a.a(bArr2, bVar.k, 28);
        bVar.d();
        return bArr2;
    }
}
