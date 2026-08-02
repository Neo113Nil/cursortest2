package defpackage;

/* loaded from: classes9.dex */
public final class dhs0 implements xvf0 {
    public static final Object c = new Object();
    public volatile xvf0 a;
    public volatile Object b;

    public static xvf0 a(xvf0 xvf0Var) {
        if ((xvf0Var instanceof dhs0) || (xvf0Var instanceof i5m)) {
            return xvf0Var;
        }
        xvf0Var.getClass();
        dhs0 dhs0Var = new dhs0();
        dhs0Var.b = c;
        dhs0Var.a = xvf0Var;
        return dhs0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        xvf0 xvf0Var = this.a;
        if (xvf0Var == null) {
            return this.b;
        }
        Object obj2 = xvf0Var.get();
        this.b = obj2;
        this.a = null;
        return obj2;
    }
}
