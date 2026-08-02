package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class m2k0 implements fwi {
    public long A;
    public long B;
    public float C;
    public float D;
    public float E;
    public long F;
    public ehr0 G;
    public boolean H;
    public int I;
    public long J;
    public fwi K;
    public LayoutDirection L;
    public int M;
    public ix80 N;
    public int a;
    public float b = 1.0f;
    public float c = 1.0f;
    public float w = 1.0f;
    public float x;
    public float y;
    public float z;

    public m2k0() {
        long j = n0u.a;
        this.A = j;
        this.B = j;
        this.E = 8.0f;
        this.F = jw01.b;
        this.G = qke.q;
        this.I = 0;
        this.J = 9205357640488583168L;
        this.K = vng.a();
        this.L = LayoutDirection.Ltr;
        this.M = 3;
    }

    public final void A(long j) {
        if (ldc.c(this.B, j)) {
            return;
        }
        this.a |= 128;
        this.B = j;
    }

    public final void B(long j) {
        if (jw01.a(this.F, j)) {
            return;
        }
        this.a |= 4096;
        this.F = j;
    }

    public final void D(float f) {
        if (this.x == f) {
            return;
        }
        this.a |= 8;
        this.x = f;
    }

    public final void G(float f) {
        if (this.y == f) {
            return;
        }
        this.a |= 16;
        this.y = f;
    }

    public final void a() {
        u(1.0f);
        v(1.0f);
        b(1.0f);
        D(0.0f);
        G(0.0f);
        x(0.0f);
        long j = n0u.a;
        d(j);
        A(j);
        o(0.0f);
        q(0.0f);
        e(8.0f);
        B(jw01.b);
        y(qke.q);
        g(false);
        m(null);
        if (this.M != 3) {
            this.a |= 524288;
            this.M = 3;
        }
        j(0);
        this.J = 9205357640488583168L;
        this.N = null;
        this.a = 0;
    }

    public final void b(float f) {
        if (this.w == f) {
            return;
        }
        this.a |= 4;
        this.w = f;
    }

    public final void d(long j) {
        if (ldc.c(this.A, j)) {
            return;
        }
        this.a |= 64;
        this.A = j;
    }

    public final void e(float f) {
        if (this.E == f) {
            return;
        }
        this.a |= 2048;
        this.E = f;
    }

    public final void g(boolean z) {
        if (this.H != z) {
            this.a |= 16384;
            this.H = z;
        }
    }

    @Override // defpackage.fwi
    public final float getDensity() {
        return this.K.getDensity();
    }

    public final void j(int i) {
        if (this.I == i) {
            return;
        }
        this.a |= 32768;
        this.I = i;
    }

    public final void m(nja1 nja1Var) {
        if (jl40.l(null, nja1Var)) {
            return;
        }
        this.a |= 131072;
    }

    public final void o(float f) {
        if (this.C == f) {
            return;
        }
        this.a |= 256;
        this.C = f;
    }

    public final void q(float f) {
        if (this.D == f) {
            return;
        }
        this.a |= 1024;
        this.D = f;
    }

    public final void u(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    @Override // defpackage.fwi
    public final float u0() {
        return this.K.u0();
    }

    public final void v(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    public final void x(float f) {
        if (this.z == f) {
            return;
        }
        this.a |= 32;
        this.z = f;
    }

    public final void y(ehr0 ehr0Var) {
        if (jl40.l(this.G, ehr0Var)) {
            return;
        }
        this.a |= 8192;
        this.G = ehr0Var;
    }
}
