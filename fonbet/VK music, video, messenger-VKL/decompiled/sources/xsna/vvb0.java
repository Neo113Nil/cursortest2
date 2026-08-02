package xsna;

/* compiled from: Pools.kt */
/* loaded from: classes.dex */
public class vvb0<T> extends tvb0<T> {
    public final Object c;

    public vvb0(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // xsna.tvb0, xsna.svb0
    public final boolean a(T t) {
        boolean a;
        synchronized (this.c) {
            a = super.a(t);
        }
        return a;
    }

    @Override // xsna.tvb0, xsna.svb0
    public T c() {
        T t;
        synchronized (this.c) {
            t = (T) super.c();
        }
        return t;
    }
}
