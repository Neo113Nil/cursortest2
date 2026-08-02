package xsna;

import java.math.RoundingMode;
import xsna.n3i0;

/* compiled from: ChunkReader.java */
/* loaded from: classes12.dex */
public final class hcc {
    public final lt5 a;
    public final rgp0 b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public hcc(int i, lt5 lt5Var, rgp0 rgp0Var) {
        int i2 = lt5Var.d;
        this.a = lt5Var;
        int a = lt5Var.a();
        boolean z = true;
        if (a != 1 && a != 2) {
            z = false;
        }
        fxc0.p(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (a == 2 ? 1667497984 : 1651965952) | i3;
        long j = lt5Var.b * 1000000;
        long j2 = lt5Var.c;
        String str = y2r0.a;
        this.e = y2r0.d0(i2, j, j2, RoundingMode.DOWN);
        this.b = rgp0Var;
        this.d = a == 2 ? i3 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i2;
    }

    public final p3i0 a(int i) {
        return new p3i0(((this.e * 1) / this.f) * this.n[i], this.m[i]);
    }

    public final n3i0.a b(long j) {
        if (this.k == 0) {
            p3i0 p3i0Var = new p3i0(0L, this.l);
            return new n3i0.a(p3i0Var, p3i0Var);
        }
        int i = (int) (j / ((this.e * 1) / this.f));
        int e = y2r0.e(this.n, i, true, true);
        if (this.n[e] == i) {
            p3i0 a = a(e);
            return new n3i0.a(a, a);
        }
        p3i0 a2 = a(e);
        int i2 = e + 1;
        return i2 < this.m.length ? new n3i0.a(a2, a(i2)) : new n3i0.a(a2, a2);
    }
}
