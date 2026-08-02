package defpackage;

/* loaded from: classes.dex */
public final class lax0 implements vg2 {
    public final f531 a;
    public final gl11 b;
    public final Object c;
    public final Object d;
    public final sj2 e;
    public final sj2 f;
    public final sj2 g;
    public long h;
    public sj2 i;

    public lax0(jj2 jj2Var, gl11 gl11Var, Object obj, Object obj2, sj2 sj2Var) {
        this.a = jj2Var.a(gl11Var);
        this.b = gl11Var;
        this.c = obj2;
        this.d = obj;
        this.e = (sj2) gl11Var.a.invoke(obj);
        tls tlsVar = gl11Var.a;
        this.f = (sj2) tlsVar.invoke(obj2);
        this.g = sj2Var != null ? ooc.i(sj2Var) : ((sj2) tlsVar.invoke(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.vg2
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.vg2
    public final long d() {
        if (this.h < 0) {
            this.h = this.a.e(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // defpackage.vg2
    public final gl11 e() {
        return this.b;
    }

    @Override // defpackage.vg2
    public final Object f(long j) {
        if (c(j)) {
            return this.c;
        }
        sj2 n = this.a.n(j, this.e, this.f, this.g);
        int b = n.b();
        for (int i = 0; i < b; i++) {
            if (Float.isNaN(n.a(i))) {
                mhe0.b("AnimationVector cannot contain a NaN. " + n + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.invoke(n);
    }

    @Override // defpackage.vg2
    public final Object g() {
        return this.c;
    }

    @Override // defpackage.vg2
    public final sj2 h(long j) {
        if (!c(j)) {
            return this.a.k(j, this.e, this.f, this.g);
        }
        sj2 sj2Var = this.i;
        if (sj2Var != null) {
            return sj2Var;
        }
        sj2 i = this.a.i(this.e, this.f, this.g);
        this.i = i;
        return i;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + fxa1.b(this) + " ms,animationSpec: " + this.a;
    }
}
