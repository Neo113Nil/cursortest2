package xsna;

/* compiled from: Provider.kt */
/* loaded from: classes.dex */
public final class cpn0<T> {
    public static final Object e = new Object();
    public final gzs<T> a;
    public final cpn0 b = this;
    public volatile Object c = e;
    public volatile Throwable d;

    public cpn0(gzs gzsVar) {
        this.a = gzsVar;
    }

    public final T a() {
        T t;
        if (this.d != null) {
            throw new IllegalStateException("Provider value was destroyed!", this.d);
        }
        T t2 = (T) this.c;
        Object obj = e;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this.b) {
            t = (T) this.c;
            if (t == obj) {
                t = this.a.invoke();
                this.c = t;
            }
        }
        return t;
    }

    public final void b() {
        this.c = e;
        this.d = null;
    }
}
