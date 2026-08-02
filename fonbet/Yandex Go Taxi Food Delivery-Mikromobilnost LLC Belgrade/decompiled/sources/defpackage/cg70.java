package defpackage;

/* loaded from: classes.dex */
public final class cg70 implements zvf0 {
    public static final vg10 c = new vg10(21);
    public static final l1d d = new l1d(5);
    public moh a;
    public volatile zvf0 b;

    public cg70(vg10 vg10Var, zvf0 zvf0Var) {
        this.a = vg10Var;
        this.b = zvf0Var;
    }

    public final void a(moh mohVar) {
        zvf0 zvf0Var;
        zvf0 zvf0Var2;
        zvf0 zvf0Var3 = this.b;
        l1d l1dVar = d;
        if (zvf0Var3 != l1dVar) {
            mohVar.f(zvf0Var3);
            return;
        }
        synchronized (this) {
            zvf0Var = this.b;
            if (zvf0Var != l1dVar) {
                zvf0Var2 = zvf0Var;
            } else {
                this.a = new e89(6, this.a, mohVar);
                zvf0Var2 = null;
            }
        }
        if (zvf0Var2 != null) {
            mohVar.f(zvf0Var);
        }
    }

    @Override // defpackage.zvf0
    public final Object get() {
        return this.b.get();
    }
}
