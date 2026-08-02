package xsna;

import java.util.List;

/* compiled from: LazyStaggeredGridMeasure.kt */
/* loaded from: classes11.dex */
public final class nxy implements twy, rty {
    public final int a;
    public final Object b;
    public final List<tra0> c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final Object i;
    public final bty<nxy> j;
    public final long k;
    public boolean l;
    public final int m;
    public final int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public final long s;
    public long t;

    public nxy() {
        throw null;
    }

    public nxy(int i, Object obj, List list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, bty btyVar, long j) {
        int i7;
        long j2;
        long j3;
        this.a = i;
        this.b = obj;
        this.c = list;
        this.d = z;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = obj2;
        this.j = btyVar;
        this.k = j;
        int i8 = 1;
        this.l = true;
        int i9 = 0;
        if (list.isEmpty()) {
            i7 = 0;
        } else {
            tra0 tra0Var = (tra0) list.get(0);
            i7 = z ? tra0Var.c : tra0Var.b;
            int h = e43.h(list);
            if (1 <= h) {
                int i10 = 1;
                while (true) {
                    tra0 tra0Var2 = (tra0) list.get(i10);
                    int i11 = this.d ? tra0Var2.c : tra0Var2.b;
                    i7 = i11 > i7 ? i11 : i7;
                    if (i10 == h) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        this.m = i7;
        int i12 = i7 + i2;
        this.n = i12 < 0 ? 0 : i12;
        List<tra0> list2 = this.c;
        if (!list2.isEmpty()) {
            tra0 tra0Var3 = list2.get(0);
            int i13 = this.d ? tra0Var3.b : tra0Var3.c;
            int h2 = e43.h(list2);
            if (1 <= h2) {
                while (true) {
                    tra0 tra0Var4 = list2.get(i8);
                    int i14 = this.d ? tra0Var4.b : tra0Var4.c;
                    i13 = i14 > i13 ? i14 : i13;
                    if (i8 == h2) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            i9 = i13;
        }
        this.o = Integer.MIN_VALUE;
        if (this.d) {
            j2 = i9 << 32;
            j3 = this.m;
        } else {
            j2 = this.m << 32;
            j3 = i9;
        }
        this.s = (j3 & 4294967295L) | j2;
        this.t = 0L;
    }

    @Override // xsna.twy
    public final long a() {
        return this.s;
    }

    @Override // xsna.rty
    public final int b() {
        return this.c.size();
    }

    @Override // xsna.twy, xsna.rty
    public final int c() {
        return this.e;
    }

    @Override // xsna.rty
    public final void d(int i, int i2, int i3, int i4) {
        if (this.d) {
            i3 = i4;
        }
        p(i, i2, i3);
    }

    @Override // xsna.twy
    public final long e() {
        return this.t;
    }

    @Override // xsna.rty
    public final long f() {
        return this.k;
    }

    @Override // xsna.rty
    public final boolean g() {
        return this.r;
    }

    @Override // xsna.twy, xsna.rty
    public final int getIndex() {
        return this.a;
    }

    @Override // xsna.rty
    public final Object getKey() {
        return this.b;
    }

    @Override // xsna.rty
    public final boolean h() {
        return this.d;
    }

    public final int i(long j) {
        return (int) (this.d ? j & 4294967295L : j >> 32);
    }

    @Override // xsna.rty
    public final int j() {
        return this.n;
    }

    @Override // xsna.rty
    public final void k() {
        this.r = true;
    }

    @Override // xsna.rty
    public final int l() {
        return this.f;
    }

    public final int m() {
        return (int) (!this.d ? this.t >> 32 : this.t & 4294967295L);
    }

    @Override // xsna.rty
    public final Object n(int i) {
        return this.c.get(i).c();
    }

    @Override // xsna.rty
    public final long o(int i) {
        return this.t;
    }

    public final void p(int i, int i2, int i3) {
        long j;
        this.o = i3;
        this.p = -this.g;
        this.q = i3 + this.h;
        if (this.d) {
            j = (i2 << 32) | (4294967295L & i);
        } else {
            j = (i2 & 4294967295L) | (i << 32);
        }
        this.t = j;
    }
}
