package defpackage;

/* loaded from: classes4.dex */
public class d000 {
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int j;
    public final byte[] a = new byte[4];
    public int b = 0;
    public final int[] i = new int[80];

    public d000() {
        c();
    }

    public final void a() {
        int[] iArr;
        int i = 16;
        while (true) {
            iArr = this.i;
            if (i >= 80) {
                break;
            }
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
            i++;
        }
        int i3 = this.d;
        int i4 = this.e;
        int i5 = this.f;
        int i6 = this.g;
        int i7 = this.h;
        int i8 = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            int D = x4e.D(((i4 & i5) | ((~i4) & i6)) + ((i3 << 5) | (i3 >>> 27)), iArr[i8], 1518500249, i7);
            int i10 = (i4 >>> 2) | (i4 << 30);
            int D2 = x4e.D(((i3 & i10) | ((~i3) & i5)) + ((D << 5) | (D >>> 27)), iArr[i8 + 1], 1518500249, i6);
            int i11 = (i3 >>> 2) | (i3 << 30);
            int D3 = x4e.D(((D & i11) | ((~D) & i10)) + ((D2 << 5) | (D2 >>> 27)), iArr[i8 + 2], 1518500249, i5);
            i7 = (D >>> 2) | (D << 30);
            int i12 = i8 + 4;
            i4 = x4e.D(((D2 & i7) | ((~D2) & i11)) + ((D3 << 5) | (D3 >>> 27)), iArr[i8 + 3], 1518500249, i10);
            i6 = (D2 >>> 2) | (D2 << 30);
            i8 += 5;
            i3 = x4e.D(((D3 & i6) | ((~D3) & i7)) + ((i4 << 5) | (i4 >>> 27)), iArr[i12], 1518500249, i11);
            i5 = (D3 >>> 2) | (D3 << 30);
        }
        for (int i13 = 0; i13 < 4; i13++) {
            int D4 = x4e.D(((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6), iArr[i8], 1859775393, i7);
            int i14 = (i4 >>> 2) | (i4 << 30);
            int D5 = x4e.D(((D4 << 5) | (D4 >>> 27)) + ((i3 ^ i14) ^ i5), iArr[i8 + 1], 1859775393, i6);
            int i15 = (i3 >>> 2) | (i3 << 30);
            int D6 = x4e.D(((D5 << 5) | (D5 >>> 27)) + ((D4 ^ i15) ^ i14), iArr[i8 + 2], 1859775393, i5);
            i7 = (D4 >>> 2) | (D4 << 30);
            int i16 = i8 + 4;
            i4 = x4e.D(((D6 << 5) | (D6 >>> 27)) + ((D5 ^ i7) ^ i15), iArr[i8 + 3], 1859775393, i14);
            i6 = (D5 >>> 2) | (D5 << 30);
            i8 += 5;
            i3 = x4e.D(((i4 << 5) | (i4 >>> 27)) + ((D6 ^ i6) ^ i7), iArr[i16], 1859775393, i15);
            i5 = (D6 >>> 2) | (D6 << 30);
        }
        for (int i17 = 0; i17 < 4; i17++) {
            int D7 = x4e.D((((i5 | i6) & i4) | (i5 & i6)) + ((i3 << 5) | (i3 >>> 27)), iArr[i8], -1894007588, i7);
            int i18 = (i4 >>> 2) | (i4 << 30);
            int D8 = x4e.D((((i18 | i5) & i3) | (i18 & i5)) + ((D7 << 5) | (D7 >>> 27)), iArr[i8 + 1], -1894007588, i6);
            int i19 = (i3 >>> 2) | (i3 << 30);
            int D9 = x4e.D((((i19 | i18) & D7) | (i19 & i18)) + ((D8 << 5) | (D8 >>> 27)), iArr[i8 + 2], -1894007588, i5);
            i7 = (D7 >>> 2) | (D7 << 30);
            int i20 = i8 + 4;
            i4 = x4e.D((((i7 | i19) & D8) | (i7 & i19)) + ((D9 << 5) | (D9 >>> 27)), iArr[i8 + 3], -1894007588, i18);
            i6 = (D8 >>> 2) | (D8 << 30);
            i8 += 5;
            i3 = x4e.D((((i6 | i7) & D9) | (i6 & i7)) + ((i4 << 5) | (i4 >>> 27)), iArr[i20], -1894007588, i19);
            i5 = (D9 >>> 2) | (D9 << 30);
        }
        for (int i21 = 0; i21 <= 3; i21++) {
            int D10 = x4e.D(((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6), iArr[i8], -899497514, i7);
            int i22 = (i4 >>> 2) | (i4 << 30);
            int D11 = x4e.D(((D10 << 5) | (D10 >>> 27)) + ((i3 ^ i22) ^ i5), iArr[i8 + 1], -899497514, i6);
            int i23 = (i3 >>> 2) | (i3 << 30);
            int D12 = x4e.D(((D11 << 5) | (D11 >>> 27)) + ((D10 ^ i23) ^ i22), iArr[i8 + 2], -899497514, i5);
            i7 = (D10 >>> 2) | (D10 << 30);
            int i24 = i8 + 4;
            i4 = x4e.D(((D12 << 5) | (D12 >>> 27)) + ((D11 ^ i7) ^ i23), iArr[i8 + 3], -899497514, i22);
            i6 = (D11 >>> 2) | (D11 << 30);
            i8 += 5;
            i3 = x4e.D(((i4 << 5) | (i4 >>> 27)) + ((D12 ^ i6) ^ i7), iArr[i24], -899497514, i23);
            i5 = (D12 >>> 2) | (D12 << 30);
        }
        this.d += i3;
        this.e += i4;
        this.f += i5;
        this.g += i6;
        this.h += i7;
        this.j = 0;
        for (int i25 = 0; i25 < 16; i25++) {
            iArr[i25] = 0;
        }
    }

    public final void b(int i, byte[] bArr) {
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int i3 = this.j;
        this.i[i3] = i2;
        int i4 = i3 + 1;
        this.j = i4;
        if (i4 == 16) {
            a();
        }
    }

    public final void c() {
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
        this.d = 1732584193;
        this.e = -271733879;
        this.f = -1732584194;
        this.g = 271733878;
        this.h = -1009589776;
        this.j = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.i;
            if (i2 == iArr.length) {
                return;
            }
            iArr[i2] = 0;
            i2++;
        }
    }

    public final void d(byte b) {
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte[] bArr = this.a;
        bArr[i] = b;
        if (i2 == bArr.length) {
            b(0, bArr);
            this.b = 0;
        }
        this.c++;
    }
}
