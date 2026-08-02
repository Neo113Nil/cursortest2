package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.tra0;

/* compiled from: LazyGridMeasuredItem.kt */
/* loaded from: classes11.dex */
public final class nry implements xqy, rty {
    public final int a;
    public final Object b;
    public final boolean c;
    public final int d;
    public final LayoutDirection e;
    public final int f;
    public final int g;
    public final List<tra0> h;
    public final long i;
    public final Object j;
    public final bty<nry> k;
    public final long l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public int q;
    public int r;
    public int s;
    public final long t;
    public long u;
    public int v;
    public int w;
    public boolean x;

    public nry() {
        throw null;
    }

    public nry(int i, Object obj, boolean z, int i2, int i3, LayoutDirection layoutDirection, int i4, int i5, List list, long j, Object obj2, bty btyVar, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = z;
        this.d = i2;
        this.e = layoutDirection;
        this.f = i4;
        this.g = i5;
        this.h = list;
        this.i = j;
        this.j = obj2;
        this.k = btyVar;
        this.l = j2;
        this.m = i6;
        this.n = i7;
        this.q = Integer.MIN_VALUE;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            tra0 tra0Var = (tra0) list.get(i9);
            i8 = Math.max(i8, this.c ? tra0Var.c : tra0Var.b);
        }
        this.o = i8;
        int i10 = i3 + i8;
        this.p = i10 >= 0 ? i10 : 0;
        this.t = this.c ? (i8 & 4294967295L) | (this.d << 32) : (this.d & 4294967295L) | (i8 << 32);
        this.u = 0L;
        this.v = -1;
        this.w = -1;
    }

    @Override // xsna.xqy
    public final long a() {
        return this.t;
    }

    @Override // xsna.rty
    public final int b() {
        return this.h.size();
    }

    @Override // xsna.rty
    public final int c() {
        return this.m;
    }

    @Override // xsna.rty
    public final void d(int i, int i2, int i3, int i4) {
        r(i, i2, i3, i4, -1, -1);
    }

    @Override // xsna.xqy
    public final long e() {
        return this.u;
    }

    @Override // xsna.rty
    public final long f() {
        return this.l;
    }

    @Override // xsna.rty
    public final boolean g() {
        return this.x;
    }

    @Override // xsna.xqy, xsna.rty
    public final int getIndex() {
        return this.a;
    }

    @Override // xsna.xqy, xsna.rty
    public final Object getKey() {
        return this.b;
    }

    @Override // xsna.rty
    public final boolean h() {
        return this.c;
    }

    @Override // xsna.xqy
    public final int i() {
        return this.w;
    }

    @Override // xsna.rty
    public final int j() {
        return this.p;
    }

    @Override // xsna.rty
    public final void k() {
        this.x = true;
    }

    @Override // xsna.rty
    public final int l() {
        return this.n;
    }

    @Override // xsna.xqy
    public final int m() {
        return this.v;
    }

    @Override // xsna.rty
    public final Object n(int i) {
        return this.h.get(i).c();
    }

    @Override // xsna.rty
    public final long o(int i) {
        return this.u;
    }

    public final int p(long j) {
        return (int) (this.c ? j & 4294967295L : j >> 32);
    }

    public final void q(tra0.a aVar, boolean z) {
        mdu mduVar;
        if (this.q == Integer.MIN_VALUE) {
            xzw.a("position() should be called first");
        }
        List<tra0> list = this.h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            tra0 tra0Var = list.get(i);
            int i2 = this.r;
            boolean z2 = this.c;
            int i3 = i2 - (z2 ? tra0Var.c : tra0Var.b);
            int i4 = this.s;
            long j = this.u;
            wsy a = this.k.a(i, this.b);
            if (a != null) {
                if (z) {
                    a.r = j;
                } else {
                    long d = h9x.d(!h9x.b(a.r, wsy.s) ? a.r : j, ((h9x) ((zak0) a.q).getValue()).a);
                    if ((p(j) <= i3 && p(d) <= i3) || (p(j) >= i4 && p(d) >= i4)) {
                        a.b();
                    }
                    j = d;
                }
                mduVar = a.n;
            } else {
                mduVar = null;
            }
            long d2 = h9x.d(j, this.i);
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

    public final void r(int i, int i2, int i3, int i4, int i5, int i6) {
        long j;
        long j2;
        boolean z = this.c;
        int i7 = z ? i4 : i3;
        this.q = i7;
        if (!z) {
            i3 = i4;
        }
        if (z && this.e == LayoutDirection.Rtl) {
            i2 = (i3 - i2) - this.d;
        }
        if (z) {
            j = i2 << 32;
            j2 = i;
        } else {
            j = i << 32;
            j2 = i2;
        }
        this.u = (j2 & 4294967295L) | j;
        this.v = i5;
        this.w = i6;
        this.r = -this.f;
        this.s = i7 + this.g;
    }
}
