package defpackage;

/* loaded from: classes.dex */
public final class j5m implements yvf0 {
    public static final Object c = new Object();
    public volatile yvf0 a;
    public volatile Object b;

    public static yvf0 a(yvf0 yvf0Var) {
        yvf0Var.getClass();
        if (yvf0Var instanceof j5m) {
            return yvf0Var;
        }
        j5m j5mVar = new j5m();
        j5mVar.b = c;
        j5mVar.a = yvf0Var;
        return j5mVar;
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
            try {
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
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
