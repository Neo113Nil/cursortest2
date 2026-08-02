package yads;

/* loaded from: classes10.dex */
public final class pw1 {
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public final boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i2;
        this.b = qw1.a[3 - i3];
        int i7 = qw1.b[i5];
        this.d = i7;
        if (i2 == 2) {
            this.d = i7 / 2;
        } else if (i2 == 0) {
            this.d = i7 / 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalArgumentException();
                }
                i6 = 384;
            }
            i6 = 1152;
        } else {
            if (i2 != 3) {
                i6 = 576;
            }
            i6 = 1152;
        }
        this.g = i6;
        if (i3 == 3) {
            int i9 = i2 == 3 ? qw1.c[i4 - 1] : qw1.d[i4 - 1];
            this.f = i9;
            this.c = (((i9 * 12) / this.d) + i8) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? qw1.e[i4 - 1] : qw1.f[i4 - 1];
                this.f = i10;
                this.c = ((i10 * 144) / this.d) + i8;
            } else {
                int i11 = qw1.g[i4 - 1];
                this.f = i11;
                this.c = (((i3 == 1 ? 72 : 144) * i11) / this.d) + i8;
            }
        }
        this.e = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
