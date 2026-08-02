package xsna;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import java.util.Map;

/* compiled from: LazyStaggeredGridMeasureResult.kt */
/* loaded from: classes11.dex */
public final class lxy implements cxy, dp10 {
    public final int[] a;
    public final int[] b;
    public final float c;
    public final dp10 d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final sxy i;
    public final b1y j;
    public final azl k;
    public final int l;
    public final List<nxy> m;
    public final long n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final yvj t;
    public final Orientation u;

    public lxy() {
        throw null;
    }

    public lxy(int[] iArr, int[] iArr2, float f, dp10 dp10Var, float f2, boolean z, boolean z2, boolean z3, sxy sxyVar, b1y b1yVar, azl azlVar, int i, List list, long j, int i2, int i3, int i4, int i5, int i6, yvj yvjVar) {
        this.a = iArr;
        this.b = iArr2;
        this.c = f;
        this.d = dp10Var;
        this.e = f2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = sxyVar;
        this.j = b1yVar;
        this.k = azlVar;
        this.l = i;
        this.m = list;
        this.n = j;
        this.o = i2;
        this.p = i3;
        this.q = i4;
        this.r = i5;
        this.s = i6;
        this.t = yvjVar;
        this.u = z2 ? Orientation.Vertical : Orientation.Horizontal;
    }

    @Override // xsna.cxy
    public final long a() {
        return this.n;
    }

    @Override // xsna.cxy
    public final int b() {
        return this.q;
    }

    @Override // xsna.cxy
    public final int c() {
        return this.r;
    }

    @Override // xsna.cxy
    public final int d() {
        return this.l;
    }

    @Override // xsna.cxy
    public final int e() {
        return this.s;
    }

    @Override // xsna.cxy
    public final List<nxy> f() {
        return this.m;
    }

    public final lxy g(int i, boolean z) {
        long j;
        int i2;
        if (this.h) {
            return null;
        }
        List<nxy> list = this.m;
        if (list.isEmpty() || this.a.length == 0) {
            return null;
        }
        int[] iArr = this.b;
        if (iArr.length == 0) {
            return null;
        }
        int i3 = this.r;
        int i4 = this.p;
        int i5 = i4 - i3;
        List<nxy> list2 = list;
        int size = list2.size();
        for (int i6 = 0; i6 < size; i6++) {
            nxy nxyVar = list.get(i6);
            boolean z2 = nxyVar.r;
            int i7 = nxyVar.n;
            if (z2) {
                return null;
            }
            if ((nxyVar.m() <= 0) != (nxyVar.m() + i <= 0)) {
                return null;
            }
            int m = nxyVar.m();
            int i8 = this.o;
            if (m <= i8) {
                if (i < 0) {
                    if ((nxyVar.m() + i7) - i8 <= (-i)) {
                        return null;
                    }
                } else if (i8 - nxyVar.m() <= i) {
                    return null;
                }
            }
            if (nxyVar.m() + i7 >= i5) {
                if (i < 0) {
                    if ((nxyVar.m() + i7) - i4 <= (-i)) {
                        return null;
                    }
                } else if (i4 - nxyVar.m() <= i) {
                    return null;
                }
            }
        }
        int size2 = list2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            nxy nxyVar2 = list.get(i9);
            boolean z3 = nxyVar2.d;
            if (!nxyVar2.r) {
                long j2 = nxyVar2.t;
                long j3 = 4294967295L;
                nxyVar2.t = ((z3 ? ((int) (j2 & 4294967295L)) + i : (int) (j2 & 4294967295L)) & 4294967295L) | ((z3 ? (int) (j2 >> 32) : ((int) (j2 >> 32)) + i) << 32);
                if (z) {
                    int size3 = nxyVar2.c.size();
                    int i10 = 0;
                    while (i10 < size3) {
                        wsy a = nxyVar2.j.a(i10, nxyVar2.b);
                        if (a != null) {
                            long j4 = a.l;
                            if (z3) {
                                j = j3;
                                i2 = (int) (j4 >> 32);
                            } else {
                                j = j3;
                                i2 = ((int) (j4 >> 32)) + i;
                            }
                            a.l = ((z3 ? ((int) (j4 & j)) + i : (int) (j4 & j)) & j) | (i2 << 32);
                        } else {
                            j = j3;
                        }
                        i10++;
                        j3 = j;
                    }
                }
            }
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr2[i11] = iArr[i11] - i;
        }
        return new lxy(this.a, iArr2, i, this.d, this.e, this.f || i > 0, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t);
    }

    @Override // xsna.dp10
    public final int getHeight() {
        return this.d.getHeight();
    }

    @Override // xsna.cxy
    public final Orientation getOrientation() {
        return this.u;
    }

    @Override // xsna.dp10
    public final int getWidth() {
        return this.d.getWidth();
    }

    @Override // xsna.dp10
    public final void j() {
        this.d.j();
    }

    @Override // xsna.dp10
    public final izs<srg0, s3q0> k() {
        return this.d.k();
    }

    @Override // xsna.dp10
    public final Map<gt1, Integer> q() {
        return this.d.q();
    }
}
