package defpackage;

/* loaded from: classes13.dex */
public final class mg80 {
    public final Object a = new Object();
    public final x43 b = new x43();

    public final lg80 a() {
        lg80 lg80Var;
        synchronized (this.a) {
            lg80Var = (lg80) this.b.f();
            if (lg80Var == null) {
                lg80Var = cg80.b;
            }
        }
        return lg80Var;
    }

    public final void b() {
        synchronized (this.a) {
        }
    }
}
