package defpackage;

/* loaded from: classes9.dex */
public final class aul extends u0x implements u7u, s7u, xdu0, a2t0, uvr {
    public final xvl a;
    public final x1q0 b;
    public final syp0 c;
    public final a5t0 d;
    public final aeu0 e;
    public final boolean f;
    public final d2t0 g;
    public final d2t0 h;
    public final t1t0 i;
    public final u3r j;
    public final xk7 k;
    public final String l;
    public final ztl m;
    public final String n;
    public final String o;
    public final mw5 p;

    public aul(xvl xvlVar, x1q0 x1q0Var, syp0 syp0Var, a5t0 a5t0Var, aeu0 aeu0Var, boolean z, d2t0 d2t0Var, d2t0 d2t0Var2, t1t0 t1t0Var, c4t0 c4t0Var, xk7 xk7Var, String str, ztl ztlVar, String str2, String str3, mw5 mw5Var, jx81 jx81Var) {
        this.a = xvlVar;
        this.b = x1q0Var;
        this.c = syp0Var;
        this.d = a5t0Var;
        this.e = aeu0Var;
        this.f = z;
        this.g = d2t0Var;
        this.h = d2t0Var2;
        this.i = t1t0Var;
        this.j = c4t0Var;
        this.k = xk7Var;
        this.l = str;
        this.m = ztlVar;
        this.n = str2;
        this.o = str3;
        this.p = mw5Var;
    }

    @Override // defpackage.uvr
    public final String a() {
        return this.a.a;
    }

    @Override // defpackage.a2t0
    public final d2t0 b() {
        return this.h;
    }

    @Override // defpackage.a2t0
    public final d2t0 c() {
        return this.g;
    }

    @Override // defpackage.a2t0
    public final boolean d() {
        return this.f;
    }

    @Override // defpackage.a2t0
    public final t1t0 e() {
        return this.i;
    }

    @Override // defpackage.xdu0
    public final aeu0 f() {
        return this.e;
    }

    @Override // defpackage.s7u
    public final Object getItemId() {
        return this.a.a;
    }

    @Override // defpackage.u7u
    public final Object getModel() {
        return this.a;
    }

    public final ilt0 h() {
        int i = this.d.a;
        x1q0 x1q0Var = this.b;
        if (i == 0) {
            i = x1q0Var.d;
        }
        int i2 = x1q0Var.d;
        int i3 = 60;
        int i4 = i * 60;
        if (i4 % i2 != 0) {
            System.out.getClass();
        }
        int i5 = i4 / i2;
        if (i5 > 60) {
            System.out.getClass();
        } else {
            i3 = i5;
        }
        return new ilt0(i3);
    }
}
