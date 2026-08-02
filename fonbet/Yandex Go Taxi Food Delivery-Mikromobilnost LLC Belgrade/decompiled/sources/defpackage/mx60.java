package defpackage;

import android.content.res.TypedArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class mx60 {
    public boolean b;
    public final ArrayList a = new ArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public mx60(boolean z) {
        this.b = z;
    }

    public void c() {
    }

    public abstract void d();

    public void e(je4 je4Var) {
    }

    public void f(je4 je4Var) {
    }

    public final void g() {
        boolean isTerminated;
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                if (!(autoCloseable instanceof TypedArray)) {
                    w511.q();
                    return;
                }
                ((TypedArray) autoCloseable).recycle();
            }
        }
        copyOnWriteArrayList.clear();
        ArrayList arrayList = this.a;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((kx60) it2.next()).f();
        }
        arrayList.clear();
    }

    public final void h(boolean z) {
        this.b = z;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            kx60 kx60Var = (kx60) it.next();
            kx60Var.g(kx60Var.e && z);
        }
    }
}
