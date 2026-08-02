package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: GraphicsLayerScope.kt */
/* loaded from: classes11.dex */
public final class sfg0 implements tdu {
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e = 1.0f;
    public float f;
    public float g;
    public float h;
    public long i;
    public long j;
    public float k;
    public float l;
    public float m;
    public float n;
    public long o;
    public r5j0 p;
    public boolean q;
    public int r;
    public long s;
    public azl t;
    public LayoutDirection u;
    public gyf0 v;
    public int w;
    public androidx.compose.ui.graphics.c x;

    public sfg0() {
        long j = udu.a;
        this.i = j;
        this.j = j;
        this.n = 8.0f;
        this.o = lkp0.b;
        this.p = androidx.compose.ui.graphics.e.a;
        this.r = 0;
        this.s = 9205357640488583168L;
        this.t = d370.k();
        this.u = LayoutDirection.Ltr;
        this.w = 3;
    }

    @Override // xsna.tdu
    public final void A(float f) {
        if (this.c == f) {
            return;
        }
        this.b |= 1;
        this.c = f;
    }

    @Override // xsna.tdu
    public final void B(float f) {
        if (this.d == f) {
            return;
        }
        this.b |= 2;
        this.d = f;
    }

    @Override // xsna.tdu
    public final void Q0(int i) {
        if (this.r == i) {
            return;
        }
        this.b |= 32768;
        this.r = i;
    }

    @Override // xsna.tdu
    public final void X(r5j0 r5j0Var) {
        if (epx.f(this.p, r5j0Var)) {
            return;
        }
        this.b |= 8192;
        this.p = r5j0Var;
    }

    @Override // xsna.tdu
    public final void Y0(long j) {
        if (lkp0.a(this.o, j)) {
            return;
        }
        this.b |= 4096;
        this.o = j;
    }

    @Override // xsna.tdu
    public final void b(float f) {
        if (this.e == f) {
            return;
        }
        this.b |= 4;
        this.e = f;
    }

    public final void c() {
        A(1.0f);
        B(1.0f);
        b(1.0f);
        o(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        long j = udu.a;
        m(j);
        r(j);
        g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        u(8.0f);
        Y0(lkp0.b);
        X(androidx.compose.ui.graphics.e.a);
        f(false);
        s(null);
        l(3);
        Q0(0);
        this.s = 9205357640488583168L;
        this.x = null;
        this.b = 0;
    }

    @Override // xsna.tdu
    public final long d() {
        return this.s;
    }

    @Override // xsna.tdu
    public final void f(boolean z) {
        if (this.q != z) {
            this.b |= 16384;
            this.q = z;
        }
    }

    @Override // xsna.tdu
    public final void g(float f) {
        if (this.k == f) {
            return;
        }
        this.b |= 256;
        this.k = f;
    }

    @Override // xsna.azl
    public final float getDensity() {
        return this.t.getDensity();
    }

    @Override // xsna.azl
    public final float getFontScale() {
        return this.t.getFontScale();
    }

    @Override // xsna.tdu
    public final void h(float f) {
        if (this.l == f) {
            return;
        }
        this.b |= 512;
        this.l = f;
    }

    @Override // xsna.tdu
    public final void i(float f) {
        if (this.h == f) {
            return;
        }
        this.b |= 32;
        this.h = f;
    }

    @Override // xsna.tdu
    public final void j(float f) {
        if (this.m == f) {
            return;
        }
        this.b |= 1024;
        this.m = f;
    }

    @Override // xsna.tdu
    public final void l(int i) {
        if (this.w == i) {
            return;
        }
        this.b |= 524288;
        this.w = i;
    }

    @Override // xsna.tdu
    public final void m(long j) {
        if (l5g.d(this.i, j)) {
            return;
        }
        this.b |= 64;
        this.i = j;
    }

    @Override // xsna.tdu
    public final void n(float f) {
        if (this.g == f) {
            return;
        }
        this.b |= 16;
        this.g = f;
    }

    @Override // xsna.tdu
    public final void o(float f) {
        if (this.f == f) {
            return;
        }
        this.b |= 8;
        this.f = f;
    }

    @Override // xsna.tdu
    public final void r(long j) {
        if (l5g.d(this.j, j)) {
            return;
        }
        this.b |= 128;
        this.j = j;
    }

    @Override // xsna.tdu
    public final void s(gyf0 gyf0Var) {
        if (epx.f(this.v, gyf0Var)) {
            return;
        }
        this.b |= 131072;
        this.v = gyf0Var;
    }

    @Override // xsna.tdu
    public final void u(float f) {
        if (this.n == f) {
            return;
        }
        this.b |= 2048;
        this.n = f;
    }

    @Override // xsna.tdu
    public final void t() {
    }
}
