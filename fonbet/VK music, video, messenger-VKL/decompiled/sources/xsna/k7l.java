package xsna;

import xsna.wq2;

/* compiled from: Animation.kt */
/* loaded from: classes11.dex */
public final class k7l<T, V extends wq2> implements rm2<T, V> {
    public final zlr0 a;
    public final itp0<T, V> b;
    public final T c;
    public final V d;
    public final V e;
    public final V f;
    public final T g;
    public final long h;

    public k7l(l7l<T> l7lVar, itp0<T, V> itp0Var, T t, V v) {
        zlr0 a = l7lVar.a();
        this.a = a;
        this.b = itp0Var;
        this.c = t;
        V invoke = itp0Var.a().invoke(t);
        this.d = invoke;
        this.e = (V) sua.f(v);
        this.g = (T) itp0Var.b().invoke(a.b(invoke, v));
        if (a.c == null) {
            a.c = (V) invoke.c();
        }
        V v2 = a.c;
        int b = (v2 == null ? null : v2).b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            eqr eqrVar = a.a;
            invoke.getClass();
            j = Math.max(j, eqrVar.a(v.a(i)));
        }
        this.h = j;
        V v3 = (V) sua.f(a.c(j, invoke, v));
        this.f = v3;
        int b2 = v3.b();
        for (int i2 = 0; i2 < b2; i2++) {
            V v4 = this.f;
            v4.e(swe0.f(v4.a(i2), -this.a.a(), this.a.a()), i2);
        }
    }

    @Override // xsna.rm2
    public final boolean a() {
        return false;
    }

    @Override // xsna.rm2
    public final long b() {
        return this.h;
    }

    @Override // xsna.rm2
    public final itp0<T, V> d() {
        return this.b;
    }

    @Override // xsna.rm2
    public final T e(long j) {
        if (c(j)) {
            return this.g;
        }
        izs<V, T> b = this.b.b();
        zlr0 zlr0Var = this.a;
        V v = zlr0Var.b;
        V v2 = this.d;
        if (v == null) {
            zlr0Var.b = (V) v2.c();
        }
        V v3 = zlr0Var.b;
        if (v3 == null) {
            v3 = null;
        }
        int b2 = v3.b();
        for (int i = 0; i < b2; i++) {
            V v4 = zlr0Var.b;
            if (v4 == null) {
                v4 = null;
            }
            v4.e(zlr0Var.a.d(j, v2.a(i), this.e.a(i)), i);
        }
        V v5 = zlr0Var.b;
        return b.invoke(v5 != null ? v5 : null);
    }

    @Override // xsna.rm2
    public final T f() {
        return this.g;
    }

    @Override // xsna.rm2
    public final V g(long j) {
        if (c(j)) {
            return this.f;
        }
        return (V) this.a.c(j, this.d, this.e);
    }
}
