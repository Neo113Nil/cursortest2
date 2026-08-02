package xsna;

/* compiled from: SearchQueryActionsDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class txh0 implements sxh0 {
    public final gzs<Boolean> a;
    public final gzs<s3q0> b;
    public final gzs<s3q0> c;
    public final gzs<s3q0> d;
    public final gzs<s3q0> e;
    public final gzs<s3q0> f;

    public txh0(gzs gzsVar, gzs gzsVar2, xzh0 xzh0Var, gzs gzsVar3, gzs gzsVar4, gzs gzsVar5, int i) {
        gzsVar = (i & 1) != 0 ? new c24(0) : gzsVar;
        gzsVar2 = (i & 2) != 0 ? null : gzsVar2;
        xzh0Var = (i & 4) != 0 ? null : xzh0Var;
        gzsVar3 = (i & 8) != 0 ? null : gzsVar3;
        gzsVar4 = (i & 16) != 0 ? null : gzsVar4;
        gzsVar5 = (i & 32) != 0 ? null : gzsVar5;
        this.a = gzsVar;
        this.b = gzsVar2;
        this.c = xzh0Var;
        this.d = gzsVar3;
        this.e = gzsVar4;
        this.f = gzsVar5;
    }

    @Override // xsna.sxh0
    public final void a() {
        gzs<s3q0> gzsVar = this.d;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // xsna.sxh0
    public final void b() {
        gzs<s3q0> gzsVar = this.e;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // xsna.sxh0
    public final boolean c() {
        gzs<Boolean> gzsVar = this.a;
        if (gzsVar != null) {
            return gzsVar.invoke().booleanValue();
        }
        return false;
    }

    @Override // xsna.sxh0
    public final void d() {
        gzs<s3q0> gzsVar = this.b;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // xsna.sxh0
    public final void f() {
        gzs<s3q0> gzsVar = this.c;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // xsna.sxh0
    public final void e() {
    }
}
