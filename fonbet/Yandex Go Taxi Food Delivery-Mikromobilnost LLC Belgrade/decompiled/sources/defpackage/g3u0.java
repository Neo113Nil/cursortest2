package defpackage;

/* loaded from: classes11.dex */
public final class g3u0 {
    public static final g3u0 f = new g3u0(cnz0.b, 0, 0, 0);
    public final int a;
    public final cnz0 b;
    public final int c;
    public final int d;
    public final int e;

    public g3u0(cnz0 cnz0Var, int i, int i2, int i3) {
        this.b = cnz0Var;
        this.a = i;
        this.c = i2;
        this.d = i3;
        this.e = i2 > 62 ? 21 : i2 > 31 ? 20 : i2 > 0 ? 10 : 0;
    }

    public final g3u0 a(int i) {
        cnz0 cnz0Var = this.b;
        int i2 = this.a;
        int i3 = this.d;
        if (i2 == 4 || i2 == 2) {
            int[] iArr = fju.b[i2];
            i2 = 0;
            int i4 = iArr[0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            cnz0Var.getClass();
            i3 += i6;
            cnz0Var = new afs0(cnz0Var, i5, i6);
        }
        int i7 = this.c;
        int i8 = (i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8;
        int i9 = i7 + 1;
        g3u0 g3u0Var = new g3u0(cnz0Var, i2, i9, i3 + i8);
        return i9 == 2078 ? g3u0Var.b(i + 1) : g3u0Var;
    }

    public final g3u0 b(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return this;
        }
        cnz0 cnz0Var = this.b;
        cnz0Var.getClass();
        return new g3u0(new cu5(cnz0Var, i - i2, i2), this.a, 0, this.d);
    }

    public final boolean c(g3u0 g3u0Var) {
        int i = this.d + (fju.b[this.a][g3u0Var.a] >> 16);
        int i2 = g3u0Var.c;
        int i3 = this.c;
        if (i3 < i2) {
            i += g3u0Var.e - this.e;
        } else if (i3 > i2 && i2 > 0) {
            i += 10;
        }
        return i <= g3u0Var.d;
    }

    public final g3u0 d(int i, int i2) {
        int i3 = this.d;
        cnz0 cnz0Var = this.b;
        int i4 = this.a;
        if (i != i4) {
            int i5 = fju.b[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            cnz0Var.getClass();
            i3 += i7;
            cnz0Var = new afs0(cnz0Var, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        cnz0Var.getClass();
        return new g3u0(new afs0(cnz0Var, i2, i8), i, 0, i3 + i8);
    }

    public final g3u0 e(int i, int i2) {
        int i3 = this.a;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = fju.d[i3][i];
        cnz0 cnz0Var = this.b;
        cnz0Var.getClass();
        return new g3u0(new afs0(new afs0(cnz0Var, i5, i4), i2, 5), i3, 0, this.d + i4 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", fju.a[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
