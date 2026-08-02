package xsna;

/* compiled from: Lazy.java */
/* loaded from: classes.dex */
public final class cqy<T> implements f9e0<T> {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile f9e0<T> b;

    public cqy(f9e0<T> f9e0Var) {
        this.b = f9e0Var;
    }

    @Override // xsna.f9e0
    public final T get() {
        T t;
        T t2 = (T) this.a;
        Object obj = c;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.a;
                if (t == obj) {
                    t = this.b.get();
                    this.a = t;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
