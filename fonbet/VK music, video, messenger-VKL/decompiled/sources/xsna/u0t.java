package xsna;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import xsna.m930;

/* compiled from: Futures.java */
/* loaded from: classes13.dex */
public final class u0t<V> implements Runnable {
    public final Future<V> b;
    public final n0t<? super V> c;

    public u0t(ugz ugzVar, n0t n0tVar) {
        this.b = ugzVar;
        this.c = n0tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable a;
        Future<V> future = this.b;
        boolean z = future instanceof vgx;
        n0t<? super V> n0tVar = this.c;
        if (z && (a = ((vgx) future).a()) != null) {
            n0tVar.onFailure(a);
            return;
        }
        try {
            fxc0.y(future, "Future was expected to be done: %s", future.isDone());
            n0tVar.onSuccess((Object) hr80.y(future));
        } catch (ExecutionException e) {
            n0tVar.onFailure(e.getCause());
        } catch (Throwable th) {
            n0tVar.onFailure(th);
        }
    }

    public final String toString() {
        m930 m930Var = new m930(u0t.class.getSimpleName());
        m930.b bVar = new m930.b();
        m930Var.c.c = bVar;
        m930Var.c = bVar;
        bVar.b = this.c;
        return m930Var.toString();
    }
}
