package xsna;

/* compiled from: BaseConsumer.java */
/* loaded from: classes12.dex */
public abstract class ac6<T> implements l7j<T> {
    public boolean a = false;

    public static boolean d(int i) {
        return (i & 1) == 1;
    }

    public static boolean e(int i) {
        return !d(i);
    }

    public static boolean k(int i, int i2) {
        return (i & i2) == i2;
    }

    @Override // xsna.l7j
    public final synchronized void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        try {
            f();
        } catch (Exception e) {
            j(e);
        }
    }

    @Override // xsna.l7j
    public final synchronized void b(int i, Object obj) {
        if (this.a) {
            return;
        }
        this.a = d(i);
        try {
            h(i, obj);
        } catch (Exception e) {
            j(e);
        }
    }

    @Override // xsna.l7j
    public final synchronized void c(float f) {
        if (this.a) {
            return;
        }
        try {
            i(f);
        } catch (Exception e) {
            j(e);
        }
    }

    public abstract void f();

    public abstract void g(Throwable th);

    public abstract void h(int i, Object obj);

    public abstract void i(float f);

    public final void j(Exception exc) {
        Class<?> cls = getClass();
        if (ahq.a.a(6)) {
            bhq.c(6, cls.getSimpleName(), "unhandled exception", exc);
        }
    }

    @Override // xsna.l7j
    public final synchronized void onFailure(Throwable th) {
        if (this.a) {
            return;
        }
        this.a = true;
        try {
            g(th);
        } catch (Exception e) {
            j(e);
        }
    }
}
