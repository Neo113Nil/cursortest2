package defpackage;

/* loaded from: classes9.dex */
public final class i5m implements xvf0, h3y {
    public static final Object c = new Object();
    public volatile xvf0 a;
    public volatile Object b = c;

    public i5m(xvf0 xvf0Var) {
        this.a = xvf0Var;
    }

    public static h3y a(xvf0 xvf0Var) {
        if (xvf0Var instanceof h3y) {
            return (h3y) xvf0Var;
        }
        xvf0Var.getClass();
        return new i5m(xvf0Var);
    }

    public static xvf0 b(xvf0 xvf0Var) {
        xvf0Var.getClass();
        return xvf0Var instanceof i5m ? xvf0Var : new i5m(xvf0Var);
    }

    public static xvf0 c(yvf0 yvf0Var) {
        return b(cma1.i(yvf0Var));
    }

    @Override // defpackage.yvf0
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.a.get();
                Object obj4 = this.b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }
}
