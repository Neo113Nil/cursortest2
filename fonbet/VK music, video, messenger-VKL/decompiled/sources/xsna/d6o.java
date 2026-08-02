package xsna;

/* compiled from: DoubleCheck.java */
/* loaded from: classes.dex */
public final class d6o<T> implements e9e0<T> {
    public static final Object d = new Object();
    public volatile xhq b;
    public volatile Object c;

    public static e9e0 a(xhq xhqVar) {
        if (xhqVar instanceof d6o) {
            return xhqVar;
        }
        d6o d6oVar = new d6o();
        d6oVar.c = d;
        d6oVar.b = xhqVar;
        return d6oVar;
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
