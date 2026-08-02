package defpackage;

/* loaded from: classes.dex */
public final class h5m implements wvf0 {
    public static final Object c = new Object();
    public volatile wvf0 a;
    public volatile Object b;

    public static wvf0 a(wvf0 wvf0Var) {
        wvf0Var.getClass();
        if (wvf0Var instanceof h5m) {
            return wvf0Var;
        }
        h5m h5mVar = new h5m();
        h5mVar.b = c;
        h5mVar.a = wvf0Var;
        return h5mVar;
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
