package yads;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class iu {
    public final q83 a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public iu(int i, int i2, long j, int i3, q83 q83Var) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        ni.a(z);
        this.d = j;
        this.e = i3;
        this.a = q83Var;
        this.b = a(i, i2 == 2 ? 1667497984 : 1651965952);
        this.c = i2 == 2 ? a(i, 1650720768) : -1;
        this.k = new long[512];
        this.l = new int[512];
    }

    public final void a(long j) {
        if (this.j == this.l.length) {
            long[] jArr = this.k;
            this.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.l;
            this.l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.k;
        int i = this.j;
        jArr2[i] = j;
        this.l[i] = this.i;
        this.j = i + 1;
    }

    public final xx2 b(long j) {
        long j2 = 1;
        int i = (int) (j / ((this.d * j2) / this.e));
        int a = mc3.a(this.l, i, true, true);
        int i2 = this.l[a];
        if (i2 == i) {
            by2 by2Var = new by2(((this.d * j2) / this.e) * i2, this.k[a]);
            return new xx2(by2Var, by2Var);
        }
        long j3 = i2;
        long j4 = (this.d * j2) / this.e;
        long[] jArr = this.k;
        by2 by2Var2 = new by2(j3 * j4, jArr[a]);
        int i3 = a + 1;
        return i3 < jArr.length ? new xx2(by2Var2, new by2(j4 * r0[i3], jArr[i3])) : new xx2(by2Var2, by2Var2);
    }

    public final void a() {
        this.k = Arrays.copyOf(this.k, this.j);
        this.l = Arrays.copyOf(this.l, this.j);
    }

    public static int a(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }
}
