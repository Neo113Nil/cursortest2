package xsna;

/* compiled from: Provider.kt */
/* loaded from: classes.dex */
public class g9e0<T> {
    public final gzs<T> a;
    public T b;
    public Throwable c;

    /* JADX WARN: Multi-variable type inference failed */
    public g9e0(gzs<? extends T> gzsVar) {
        this.a = gzsVar;
    }

    public final void a() {
        this.b = null;
        this.c = new Throwable();
    }

    public T b() {
        if (this.c != null) {
            throw new IllegalStateException("Provider value was destroyed!", this.c);
        }
        if (this.b == null) {
            this.b = this.a.invoke();
        }
        return this.b;
    }

    public final boolean c() {
        return this.b != null;
    }

    public final void d() {
        this.b = null;
        this.c = null;
    }
}
