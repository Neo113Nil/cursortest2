package xsna;

/* compiled from: DoubleCheck.java */
/* loaded from: classes8.dex */
public final class c6o<T> implements d9e0<T>, bqy<T> {
    public static final Object d = new Object();
    public volatile d9e0<T> b;
    public volatile Object c = d;

    public c6o(d9e0<T> d9e0Var) {
        this.b = d9e0Var;
    }

    public static <T> bqy<T> a(d9e0<T> d9e0Var) {
        if (d9e0Var instanceof bqy) {
            return (bqy) d9e0Var;
        }
        d9e0Var.getClass();
        return new c6o(d9e0Var);
    }

    public static <T> d9e0<T> b(d9e0<T> d9e0Var) {
        d9e0Var.getClass();
        return d9e0Var instanceof c6o ? d9e0Var : new c6o(d9e0Var);
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
        }
        return t;
    }
}
