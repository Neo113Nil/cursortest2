package xsna;

import xsna.wq2;

/* compiled from: Animation.kt */
/* loaded from: classes11.dex */
public final class w3o0<T, V extends wq2> implements rm2<T, V> {
    public final tlr0<V> a;
    public final itp0<T, V> b;
    public final T c;
    public final T d;
    public final V e;
    public final V f;
    public final V g;
    public long h;
    public V i;

    public w3o0() {
        throw null;
    }

    public w3o0(iq2<T> iq2Var, itp0<T, V> itp0Var, T t, T t2, V v) {
        this.a = iq2Var.a(itp0Var);
        this.b = itp0Var;
        this.c = t2;
        this.d = t;
        this.e = itp0Var.a().invoke(t);
        this.f = itp0Var.a().invoke(t2);
        this.g = v != null ? (V) sua.f(v) : (V) itp0Var.a().invoke(t).c();
        this.h = -1L;
    }

    @Override // xsna.rm2
    public final boolean a() {
        return this.a.a();
    }

    @Override // xsna.rm2
    public final long b() {
        if (this.h < 0) {
            this.h = this.a.c(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // xsna.rm2
    public final itp0<T, V> d() {
        return this.b;
    }

    @Override // xsna.rm2
    public final T e(long j) {
        if (c(j)) {
            return this.c;
        }
        V g = this.a.g(j, this.e, this.f, this.g);
        int b = g.b();
        for (int i = 0; i < b; i++) {
            if (Float.isNaN(g.a(i))) {
                ixc0.b("AnimationVector cannot contain a NaN. " + g + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b().invoke(g);
    }

    @Override // xsna.rm2
    public final T f() {
        return this.c;
    }

    @Override // xsna.rm2
    public final V g(long j) {
        if (!c(j)) {
            return this.a.d(j, this.e, this.f, this.g);
        }
        V v = this.i;
        if (v != null) {
            return v;
        }
        V e = this.a.e(this.e, this.f, this.g);
        this.i = e;
        return e;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
