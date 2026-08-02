package defpackage;

/* loaded from: classes10.dex */
public final class a69 {
    public final /* synthetic */ int a;
    public byte[] b;
    public int c;
    public int d;
    public int e;

    public a69(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 3:
                this.c = i;
                this.d = i2;
                this.b = new byte[(i2 * 2) - 1];
                this.e = 0;
                break;
            default:
                this.c = i;
                this.d = i2;
                this.b = new byte[(i2 * 2) - 1];
                this.e = 0;
                break;
        }
    }

    public int a(int i) {
        int i2 = this.d;
        int min = Math.min(i, 8 - this.e);
        byte[] bArr = this.b;
        int i3 = i2 + 1;
        int i4 = ((bArr[i2] & 255) >> this.e) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (bArr[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        f(i);
        return i5;
    }

    public void b() {
        int i = this.d;
        if (i >= 0) {
            int i2 = this.c;
            if (i < i2) {
                return;
            }
            if (i == i2 && this.e == 0) {
                return;
            }
        }
        ny61.k();
    }

    public boolean c() {
        boolean z = (((this.b[this.d] & 255) >> this.e) & 1) == 1;
        f(1);
        return z;
    }

    public void d() {
        int i;
        int i2 = this.d;
        d6z.x(i2 >= 0 && (i2 < (i = this.c) || (i2 == i && this.e == 0)));
    }

    public int e(int i) {
        int i2;
        this.e += i;
        int i3 = 0;
        while (true) {
            i2 = this.e;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.e = i4;
            byte[] bArr = this.b;
            int i5 = this.d;
            i3 |= (bArr[i5] & 255) << i4;
            if (!h(i5 + 1)) {
                r3 = 1;
            }
            this.d = i5 + r3;
        }
        byte[] bArr2 = this.b;
        int i6 = this.d;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.e = 0;
            this.d = i6 + (h(i6 + 1) ? 2 : 1);
        }
        b();
        return i7;
    }

    public void f(int i) {
        int i2 = i / 8;
        int i3 = this.d + i2;
        this.d = i3;
        int i4 = (i - (i2 * 8)) + this.e;
        this.e = i4;
        if (i4 > 7) {
            this.d = i3 + 1;
            this.e = i4 - 8;
        }
        int i5 = this.d;
        if (i5 >= 0) {
            int i6 = this.c;
            if (i5 < i6) {
                return;
            }
            if (i5 == i6 && this.e == 0) {
                return;
            }
        }
        ny61.k();
    }

    public boolean g() {
        boolean z = (this.b[this.d] & (128 >> this.e)) != 0;
        n();
        return z;
    }

    public boolean h(int i) {
        if (2 > i || i >= this.c) {
            return false;
        }
        byte[] bArr = this.b;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    public boolean i(int i) {
        int i2 = this.d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.e + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.c) {
                break;
            }
            if (s(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.c;
        return i4 < i6 || (i4 == i6 && i5 == 0);
    }

    public boolean j() {
        int i = this.d;
        int i2 = this.e;
        int i3 = 0;
        while (this.d < this.c && !o()) {
            i3++;
        }
        boolean z = this.d == this.c;
        this.d = i;
        this.e = i2;
        return !z && i((i3 * 2) + 1);
    }

    public int k() {
        int i = 0;
        while (!g()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? e(i) : 0);
    }

    public void l(int i) {
        int i2 = this.d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.d = i4;
        int i5 = (i - (i3 * 8)) + this.e;
        this.e = i5;
        if (i5 > 7) {
            this.d = i4 + 1;
            this.e = i5 - 8;
        }
        while (true) {
            int i6 = i2 + 1;
            if (i6 > this.d) {
                b();
                return;
            } else if (h(i6)) {
                this.d++;
                i2 += 3;
            } else {
                i2 = i6;
            }
        }
    }

    public int m() {
        int k = k();
        return ((k + 1) / 2) * (k % 2 == 0 ? -1 : 1);
    }

    public void n() {
        int i = this.e + 1;
        this.e = i;
        if (i == 8) {
            this.e = 0;
            int i2 = this.d;
            this.d = i2 + (h(i2 + 1) ? 2 : 1);
        }
        b();
    }

    public boolean o() {
        switch (this.a) {
            case 1:
                boolean z = (this.b[this.d] & (128 >> this.e)) != 0;
                t();
                return z;
            default:
                boolean z2 = (((this.b[this.d] & 255) >> this.e) & 1) == 1;
                u(1);
                return z2;
        }
    }

    public int p(int i) {
        switch (this.a) {
            case 1:
                this.e += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.e;
                    if (i3 <= 8) {
                        byte[] bArr = this.b;
                        int i4 = this.d;
                        int i5 = ((-1) >>> (32 - i)) & (((255 & bArr[i4]) >> (8 - i3)) | i2);
                        if (i3 == 8) {
                            this.e = 0;
                            this.d = i4 + (s(i4 + 1) ? 2 : 1);
                        }
                        d();
                        return i5;
                    }
                    int i6 = i3 - 8;
                    this.e = i6;
                    byte[] bArr2 = this.b;
                    int i7 = this.d;
                    i2 |= (bArr2[i7] & 255) << i6;
                    if (s(i7 + 1)) {
                        r6 = 2;
                    }
                    this.d = i7 + r6;
                }
            default:
                int i8 = this.d;
                int min = Math.min(i, 8 - this.e);
                byte[] bArr3 = this.b;
                int i9 = i8 + 1;
                int i10 = ((bArr3[i8] & 255) >> this.e) & (255 >> (8 - min));
                while (min < i) {
                    i10 |= (bArr3[i9] & 255) << min;
                    min += 8;
                    i9++;
                }
                int i11 = i10 & ((-1) >>> (32 - i));
                u(i);
                return i11;
        }
    }

    public int q() {
        int i = 0;
        while (!o()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? p(i) : 0);
    }

    public int r() {
        int q = q();
        return ((q + 1) / 2) * (q % 2 == 0 ? -1 : 1);
    }

    public boolean s(int i) {
        if (2 > i || i >= this.c) {
            return false;
        }
        byte[] bArr = this.b;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    public void t() {
        int i = this.e + 1;
        this.e = i;
        if (i == 8) {
            this.e = 0;
            int i2 = this.d;
            this.d = i2 + (s(i2 + 1) ? 2 : 1);
        }
        d();
    }

    public void u(int i) {
        int i2;
        switch (this.a) {
            case 1:
                int i3 = this.d;
                int i4 = i / 8;
                int i5 = i3 + i4;
                this.d = i5;
                int i6 = (i - (i4 * 8)) + this.e;
                this.e = i6;
                if (i6 > 7) {
                    this.d = i5 + 1;
                    this.e = i6 - 8;
                }
                while (true) {
                    i3++;
                    if (i3 > this.d) {
                        d();
                        break;
                    } else if (s(i3)) {
                        this.d++;
                        i3 += 2;
                    }
                }
            default:
                int i7 = i / 8;
                int i8 = this.d + i7;
                this.d = i8;
                int i9 = (i - (i7 * 8)) + this.e;
                this.e = i9;
                boolean z = true;
                if (i9 > 7) {
                    this.d = i8 + 1;
                    this.e = i9 - 8;
                }
                int i10 = this.d;
                if (i10 < 0 || (i10 >= (i2 = this.c) && (i10 != i2 || this.e != 0))) {
                    z = false;
                }
                d6z.x(z);
                break;
        }
    }

    public a69(byte[] bArr, int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.b = bArr;
                this.c = bArr.length;
                break;
            default:
                this.b = bArr;
                this.c = bArr.length;
                break;
        }
    }

    public a69(int i, int i2, int i3, byte[] bArr) {
        this.a = i3;
        switch (i3) {
            case 5:
                this.b = bArr;
                this.d = i;
                this.c = i2;
                this.e = 0;
                b();
                break;
            default:
                this.b = bArr;
                this.d = i;
                this.c = i2;
                this.e = 0;
                d();
                break;
        }
    }
}
