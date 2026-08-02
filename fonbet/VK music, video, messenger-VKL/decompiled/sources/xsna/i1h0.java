package xsna;

import xsna.m1h0;

/* compiled from: RememberSaveable.kt */
/* loaded from: classes11.dex */
public final class i1h0<T> implements f2h0, huf0 {
    public e2h0<T, Object> b;
    public m1h0 c;
    public String d;
    public T e;
    public Object[] f;
    public m1h0.a g;
    public final kld0 h = new kld0(this, 6);

    public i1h0(e2h0<T, Object> e2h0Var, m1h0 m1h0Var, String str, T t, Object[] objArr) {
        this.b = e2h0Var;
        this.c = m1h0Var;
        this.d = str;
        this.e = t;
        this.f = objArr;
    }

    @Override // xsna.f2h0
    public final boolean a(Object obj) {
        m1h0 m1h0Var = this.c;
        return m1h0Var == null || m1h0Var.a(obj);
    }

    public final void b() {
        String j;
        m1h0 m1h0Var = this.c;
        if (this.g != null) {
            throw new IllegalArgumentException(("entry(" + this.g + ") is not null").toString());
        }
        if (m1h0Var != null) {
            kld0 kld0Var = this.h;
            Object invoke = kld0Var.invoke();
            if (invoke == null || m1h0Var.a(invoke)) {
                this.g = m1h0Var.b(this.d, kld0Var);
                return;
            }
            if (invoke instanceof yak0) {
                yak0 yak0Var = (yak0) invoke;
                if (yak0Var.d() == w65.e || yak0Var.d() == k0x.c || yak0Var.d() == hg10.g) {
                    j = "MutableState containing " + yak0Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    j = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                j = crx0.j(invoke);
            }
            throw new IllegalArgumentException(j);
        }
    }

    @Override // xsna.huf0
    public final void d() {
        m1h0.a aVar = this.g;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // xsna.huf0
    public final void e() {
        b();
    }

    @Override // xsna.huf0
    public final void f() {
        m1h0.a aVar = this.g;
        if (aVar != null) {
            aVar.a();
        }
    }
}
