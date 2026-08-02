package defpackage;

/* loaded from: classes.dex */
public final class g1m0 implements dui0 {
    public m2m0 a;
    public l1m0 b;
    public String c;
    public Object w;
    public Object[] x;
    public k1m0 y;
    public final csf0 z = new csf0(18, this);

    public g1m0(m2m0 m2m0Var, l1m0 l1m0Var, String str, Object obj, Object[] objArr) {
        this.a = m2m0Var;
        this.b = l1m0Var;
        this.c = str;
        this.w = obj;
        this.x = objArr;
    }

    public final void a() {
        String w;
        l1m0 l1m0Var = this.b;
        if (this.y != null) {
            yci0.x("entry(", this.y, ") is not null");
            return;
        }
        if (l1m0Var != null) {
            csf0 csf0Var = this.z;
            Object invoke = csf0Var.invoke();
            if (invoke == null || l1m0Var.d(invoke)) {
                this.y = l1m0Var.c(csf0Var, this.c);
                return;
            }
            if (invoke instanceof b3t0) {
                b3t0 b3t0Var = (b3t0) invoke;
                if (b3t0Var.getPolicy() == x4c.Q || b3t0Var.getPolicy() == ngd0.F || b3t0Var.getPolicy() == xw91.D) {
                    w = "MutableState containing " + b3t0Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    w = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                w = cvw.w(invoke);
            }
            throw new IllegalArgumentException(w);
        }
    }

    @Override // defpackage.dui0
    public final void b() {
        a();
    }

    @Override // defpackage.dui0
    public final void d() {
        k1m0 k1m0Var = this.y;
        if (k1m0Var != null) {
            ((jb7) k1m0Var).x();
        }
    }

    @Override // defpackage.dui0
    public final void e() {
        k1m0 k1m0Var = this.y;
        if (k1m0Var != null) {
            ((jb7) k1m0Var).x();
        }
    }
}
