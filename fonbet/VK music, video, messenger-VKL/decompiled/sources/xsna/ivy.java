package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.dt1;
import xsna.tra0;

/* compiled from: LazyListMeasuredItem.kt */
/* loaded from: classes11.dex */
public final class ivy implements xuy, rty {
    public final int a;
    public final List<tra0> b;
    public final boolean c;
    public final dt1.b d;
    public final dt1.c e;
    public final LayoutDirection f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final Object k;
    public final Object l;
    public final bty<ivy> m;
    public final long n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public final int[] x;

    public ivy() {
        throw null;
    }

    public ivy(int i, List list, boolean z, dt1.b bVar, dt1.c cVar, LayoutDirection layoutDirection, int i2, int i3, int i4, long j, Object obj, Object obj2, bty btyVar, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = bVar;
        this.e = cVar;
        this.f = layoutDirection;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = j;
        this.k = obj;
        this.l = obj2;
        this.m = btyVar;
        this.n = j2;
        this.q = 1;
        this.u = Integer.MIN_VALUE;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            tra0 tra0Var = (tra0) list.get(i7);
            boolean z2 = this.c;
            i5 += z2 ? tra0Var.c : tra0Var.b;
            i6 = Math.max(i6, !z2 ? tra0Var.c : tra0Var.b);
        }
        this.p = i5;
        int i8 = i5 + this.i;
        this.r = i8 >= 0 ? i8 : 0;
        this.s = i6;
        this.x = new int[this.b.size() * 2];
    }

    public final int a(long j) {
        return (int) (this.c ? j & 4294967295L : j >> 32);
    }

    @Override // xsna.rty
    public final int b() {
        return this.b.size();
    }

    @Override // xsna.rty
    public final int c() {
        return 0;
    }

    @Override // xsna.rty
    public final void d(int i, int i2, int i3, int i4) {
        i(i, i3, i4);
    }

    public final void e(tra0.a aVar, boolean z) {
        mdu mduVar;
        if (this.u == Integer.MIN_VALUE) {
            xzw.a("position() should be called first");
        }
        List<tra0> list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            tra0 tra0Var = list.get(i);
            int i2 = this.v;
            boolean z2 = this.c;
            int i3 = i2 - (z2 ? tra0Var.c : tra0Var.b);
            int i4 = this.w;
            long o = o(i);
            wsy a = this.m.a(i, this.k);
            if (a != null) {
                if (z) {
                    a.r = o;
                } else {
                    if (!h9x.b(a.r, wsy.s)) {
                        o = a.r;
                    }
                    long d = h9x.d(o, ((h9x) ((zak0) a.q).getValue()).a);
                    if ((a(o) <= i3 && a(d) <= i3) || (a(o) >= i4 && a(d) >= i4)) {
                        a.b();
                    }
                    o = d;
                }
                mduVar = a.n;
            } else {
                mduVar = null;
            }
            long d2 = h9x.d(o, this.j);
            if (!z && a != null) {
                a.m = d2;
            }
            if (z2) {
                if (mduVar != null) {
                    aVar.getClass();
                    tra0.a.c(aVar, tra0Var);
                    tra0Var.q0(h9x.d(d2, tra0Var.f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, mduVar);
                } else {
                    tra0.a.L(aVar, tra0Var, d2);
                }
            } else if (mduVar != null) {
                tra0.a.F(aVar, tra0Var, d2, mduVar);
            } else {
                tra0.a.D(aVar, tra0Var, d2);
            }
        }
    }

    @Override // xsna.rty
    public final long f() {
        return this.n;
    }

    @Override // xsna.rty
    public final boolean g() {
        return this.t;
    }

    @Override // xsna.xuy, xsna.rty
    public final int getIndex() {
        return this.a;
    }

    @Override // xsna.xuy, xsna.rty
    public final Object getKey() {
        return this.k;
    }

    @Override // xsna.xuy
    public final int getOffset() {
        return this.o;
    }

    @Override // xsna.xuy
    public final int getSize() {
        return this.p;
    }

    @Override // xsna.rty
    public final boolean h() {
        return this.c;
    }

    public final void i(int i, int i2, int i3) {
        int i4;
        this.o = i;
        boolean z = this.c;
        this.u = z ? i3 : i2;
        List<tra0> list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            tra0 tra0Var = list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.x;
            if (z) {
                dt1.b bVar = this.d;
                if (bVar == null) {
                    throw jq.f("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = bVar.a(tra0Var.b, i2, this.f);
                iArr[i6 + 1] = i;
                i4 = tra0Var.c;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                dt1.c cVar = this.e;
                if (cVar == null) {
                    throw jq.f("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = cVar.a(tra0Var.c, i3);
                i4 = tra0Var.b;
            }
            i += i4;
        }
        this.v = -this.g;
        this.w = this.u + this.h;
    }

    @Override // xsna.rty
    public final int j() {
        return this.r;
    }

    @Override // xsna.rty
    public final void k() {
        this.t = true;
    }

    @Override // xsna.rty
    public final int l() {
        return this.q;
    }

    @Override // xsna.rty
    public final Object n(int i) {
        return this.b.get(i).c();
    }

    @Override // xsna.rty
    public final long o(int i) {
        if (i == 0 && this.b.size() == 0) {
            if (this.c) {
                return (4294967295L & this.o) | (0 << 32);
            }
            return (4294967295L & 0) | (this.o << 32);
        }
        int[] iArr = this.x;
        return (4294967295L & iArr[r7 + 1]) | (iArr[i * 2] << 32);
    }
}
