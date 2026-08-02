package xsna;

import android.os.Looper;

/* compiled from: BackgroundThreadStateHandler.java */
/* loaded from: classes12.dex */
public final class nx5<T> {
    public final otu a;
    public final otu b;
    public final a<T> c;
    public T d;
    public T e;
    public int f;

    /* compiled from: BackgroundThreadStateHandler.java */
    public interface a<T> {
        void a(T t, T t2);
    }

    public nx5(T t, Looper looper, Looper looper2, dvf dvfVar, a<T> aVar) {
        this.a = dvfVar.createHandler(looper, null);
        this.b = dvfVar.createHandler(looper2, null);
        this.d = t;
        this.e = t;
        this.c = aVar;
    }

    public final T a() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == this.b.getLooper()) {
            return this.d;
        }
        fxc0.z(myLooper == this.a.getLooper());
        return this.e;
    }

    public final void b(Runnable runnable) {
        otu otuVar = this.a;
        if (otuVar.getLooper().getThread().isAlive()) {
            otuVar.post(runnable);
        }
    }

    public final void c(T t) {
        T t2 = this.d;
        this.d = t;
        if (t2.equals(t)) {
            return;
        }
        this.c.a(t2, t);
    }
}
