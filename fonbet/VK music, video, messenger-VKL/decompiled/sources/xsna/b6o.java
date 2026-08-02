package xsna;

/* compiled from: DoubleCheck.java */
/* loaded from: classes.dex */
public final class b6o<T> implements e9e0<T>, zpy<T> {
    public static final Object d = new Object();
    public volatile e9e0<T> b;
    public volatile Object c = d;

    public b6o(e9e0<T> e9e0Var) {
        this.b = e9e0Var;
    }

    public static e9e0 a(vhq vhqVar) {
        return vhqVar instanceof b6o ? vhqVar : new b6o(vhqVar);
    }

    @Override // xsna.e9e0
    public final T get() {
        T t;
        T t2 = (T) this.c;
        Object obj = d;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.c;
                if (t == obj) {
                    t = this.b.get();
                    Object obj2 = this.c;
                    if (obj2 != obj && obj2 != t) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t + ". This is likely due to a circular dependency.");
                    }
                    this.c = t;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
