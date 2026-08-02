package xsna;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: LazyGridMeasureResult.kt */
/* loaded from: classes11.dex */
public final class mry implements kry, dp10 {
    public final ory a;
    public final int b;
    public final boolean c;
    public final float d;
    public final dp10 e;
    public final float f;
    public final boolean g;
    public final yvj h;
    public final azl i;
    public final int j;
    public final izs<Integer, List<Pair<Integer, o6j>>> k;
    public final izs<Integer, Integer> l;
    public final List<nry> m;
    public final int n;
    public final int o;
    public final int p;
    public final Orientation q;
    public final int r;
    public final int s;

    public mry(ory oryVar, int i, boolean z, float f, dp10 dp10Var, float f2, boolean z2, yvj yvjVar, azl azlVar, int i2, izs izsVar, izs izsVar2, List list, int i3, int i4, int i5, Orientation orientation, int i6, int i7) {
        this.a = oryVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = dp10Var;
        this.f = f2;
        this.g = z2;
        this.h = yvjVar;
        this.i = azlVar;
        this.j = i2;
        this.k = izsVar;
        this.l = izsVar2;
        this.m = list;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        this.q = orientation;
        this.r = i6;
        this.s = i7;
    }

    @Override // xsna.kry
    public final long a() {
        dp10 dp10Var = this.e;
        return (dp10Var.getWidth() << 32) | (dp10Var.getHeight() & 4294967295L);
    }

    @Override // xsna.kry
    public final int b() {
        return -this.n;
    }

    @Override // xsna.kry
    public final int c() {
        return this.r;
    }

    @Override // xsna.kry
    public final int d() {
        return this.p;
    }

    @Override // xsna.kry
    public final int e() {
        return this.s;
    }

    @Override // xsna.kry
    public final List<nry> f() {
        return this.m;
    }

    @Override // xsna.kry
    public final int g() {
        return this.n;
    }

    @Override // xsna.dp10
    public final int getHeight() {
        return this.e.getHeight();
    }

    @Override // xsna.kry
    public final Orientation getOrientation() {
        return this.q;
    }

    @Override // xsna.dp10
    public final int getWidth() {
        return this.e.getWidth();
    }

    @Override // xsna.kry
    public final int h() {
        return this.o;
    }

    public final mry i(int i, boolean z) {
        ory oryVar;
        int i2;
        long j;
        int i3;
        char c;
        int i4;
        if (this.g) {
            return null;
        }
        List<nry> list = this.m;
        if (list.isEmpty() || (oryVar = this.a) == null) {
            return null;
        }
        int i5 = oryVar.h;
        int i6 = this.b - i;
        if (i6 < 0 || i6 >= i5) {
            return null;
        }
        nry nryVar = (nry) j5g.Y(list);
        nry nryVar2 = (nry) j5g.i0(list);
        if (nryVar.x || nryVar2.x) {
            return null;
        }
        int i7 = this.o;
        int i8 = this.n;
        Orientation orientation = this.q;
        if (i < 0) {
            if (Math.min((wry.a(nryVar, orientation) + nryVar.p) - i8, (wry.a(nryVar2, orientation) + nryVar2.p) - i7) <= (-i)) {
                return null;
            }
        } else if (Math.min(i8 - wry.a(nryVar, orientation), i7 - wry.a(nryVar2, orientation)) <= i) {
            return null;
        }
        int size = list.size();
        int i9 = 0;
        while (i9 < size) {
            nry nryVar3 = list.get(i9);
            boolean z2 = nryVar3.c;
            if (nryVar3.x) {
                i2 = i9;
            } else {
                long j2 = nryVar3.u;
                long j3 = 4294967295L;
                int i10 = i9;
                char c2 = ' ';
                nryVar3.u = ((z2 ? (int) (j2 >> 32) : ((int) (j2 >> 32)) + i) << 32) | ((z2 ? ((int) (j2 & 4294967295L)) + i : (int) (j2 & 4294967295L)) & 4294967295L);
                if (z) {
                    int size2 = nryVar3.h.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        wsy a = nryVar3.k.a(i11, nryVar3.b);
                        if (a != null) {
                            long j4 = a.l;
                            if (z2) {
                                j = j3;
                                c = c2;
                                i4 = (int) (j4 >> c);
                            } else {
                                j = j3;
                                c = c2;
                                i4 = ((int) (j4 >> c)) + i;
                            }
                            i3 = i10;
                            a.l = (i4 << c) | ((z2 ? ((int) (j4 & j)) + i : (int) (j4 & j)) & j);
                        } else {
                            j = j3;
                            i3 = i10;
                        }
                        i11++;
                        i10 = i3;
                        j3 = j;
                        c2 = ' ';
                    }
                }
                i2 = i10;
            }
            i9 = i2 + 1;
        }
        return new mry(this.a, i6, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    @Override // xsna.dp10
    public final void j() {
        this.e.j();
    }

    @Override // xsna.dp10
    public final izs<srg0, s3q0> k() {
        return this.e.k();
    }

    @Override // xsna.dp10
    public final Map<gt1, Integer> q() {
        return this.e.q();
    }
}
