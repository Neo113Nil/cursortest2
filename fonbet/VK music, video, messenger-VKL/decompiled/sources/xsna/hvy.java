package xsna;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import java.util.Map;

/* compiled from: LazyListMeasureResult.kt */
/* loaded from: classes11.dex */
public final class hvy implements fvy, dp10 {
    public final ivy a;
    public final int b;
    public final boolean c;
    public final float d;
    public final dp10 e;
    public final float f;
    public final boolean g;
    public final yvj h;
    public final azl i;
    public final long j;
    public final List<ivy> k;
    public final int l;
    public final int m;
    public final int n;
    public final Orientation o;
    public final int p;
    public final int q;

    public hvy() {
        throw null;
    }

    public hvy(ivy ivyVar, int i, boolean z, float f, dp10 dp10Var, float f2, boolean z2, yvj yvjVar, azl azlVar, long j, List list, int i2, int i3, int i4, Orientation orientation, int i5, int i6) {
        this.a = ivyVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = dp10Var;
        this.f = f2;
        this.g = z2;
        this.h = yvjVar;
        this.i = azlVar;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = orientation;
        this.p = i5;
        this.q = i6;
    }

    @Override // xsna.fvy
    public final long a() {
        dp10 dp10Var = this.e;
        return (dp10Var.getWidth() << 32) | (dp10Var.getHeight() & 4294967295L);
    }

    @Override // xsna.fvy
    public final int b() {
        return -this.l;
    }

    @Override // xsna.fvy
    public final int c() {
        return this.p;
    }

    @Override // xsna.fvy
    public final int d() {
        return this.n;
    }

    @Override // xsna.fvy
    public final int e() {
        return this.q;
    }

    @Override // xsna.fvy
    public final List<ivy> f() {
        return this.k;
    }

    @Override // xsna.fvy
    public final int g() {
        return this.l;
    }

    @Override // xsna.dp10
    public final int getHeight() {
        return this.e.getHeight();
    }

    @Override // xsna.fvy
    public final Orientation getOrientation() {
        return this.o;
    }

    @Override // xsna.dp10
    public final int getWidth() {
        return this.e.getWidth();
    }

    @Override // xsna.fvy
    public final int h() {
        return this.m;
    }

    @Override // xsna.fvy
    public final boolean i() {
        return false;
    }

    @Override // xsna.dp10
    public final void j() {
        this.e.j();
    }

    @Override // xsna.dp10
    public final izs<srg0, s3q0> k() {
        return this.e.k();
    }

    public final hvy l(int i, boolean z) {
        ivy ivyVar;
        int i2;
        int i3;
        int i4;
        if (this.g) {
            return null;
        }
        List<ivy> list = this.k;
        if (list.isEmpty() || (ivyVar = this.a) == null) {
            return null;
        }
        int i5 = ivyVar.r;
        int i6 = this.b - i;
        if (i6 < 0 || i6 >= i5) {
            return null;
        }
        ivy ivyVar2 = (ivy) j5g.Y(list);
        ivy ivyVar3 = (ivy) j5g.i0(list);
        if (ivyVar2.t || ivyVar3.t) {
            return null;
        }
        int i7 = this.m;
        int i8 = this.l;
        if (i < 0) {
            if (Math.min((ivyVar2.o + ivyVar2.r) - i8, (ivyVar3.o + ivyVar3.r) - i7) <= (-i)) {
                return null;
            }
        } else if (Math.min(i8 - ivyVar2.o, i7 - ivyVar3.o) <= i) {
            return null;
        }
        int size = list.size();
        int i9 = 0;
        while (i9 < size) {
            ivy ivyVar4 = list.get(i9);
            boolean z2 = ivyVar4.c;
            int[] iArr = ivyVar4.x;
            if (!ivyVar4.t) {
                ivyVar4.o += i;
                int length = iArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 & 1;
                    if ((z2 && i11 != 0) || (!z2 && i11 == 0)) {
                        iArr[i10] = iArr[i10] + i;
                    }
                }
                if (z) {
                    int size2 = ivyVar4.b.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        wsy a = ivyVar4.m.a(i12, ivyVar4.k);
                        if (a != null) {
                            long j = a.l;
                            if (z2) {
                                i2 = i9;
                                i3 = (int) (j >> 32);
                                i4 = ((int) (j & 4294967295L)) + i;
                            } else {
                                i2 = i9;
                                i3 = ((int) (j >> 32)) + i;
                                i4 = (int) (j & 4294967295L);
                            }
                            a.l = (i4 & 4294967295L) | (i3 << 32);
                        } else {
                            i2 = i9;
                        }
                        i12++;
                        i9 = i2;
                    }
                }
            }
            i9++;
        }
        return new hvy(this.a, i6, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    @Override // xsna.dp10
    public final Map<gt1, Integer> q() {
        return this.e.q();
    }
}
