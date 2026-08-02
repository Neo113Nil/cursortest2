package xsna;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import xsna.f8f0;

/* compiled from: Dispatcher.kt */
/* loaded from: classes11.dex */
public final class qcn {
    public int a;
    public int b;
    public Runnable c;
    public ExecutorService d;
    public final ArrayDeque<f8f0.a> e;
    public final ArrayDeque<f8f0.a> f;
    public final ArrayDeque<f8f0> g;

    public qcn() {
        this.a = 64;
        this.b = 5;
        this.e = new ArrayDeque<>();
        this.f = new ArrayDeque<>();
        this.g = new ArrayDeque<>();
    }

    public final synchronized ExecutorService a() {
        try {
            if (this.d == null) {
                this.d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new o2r0(x2r0.h + " Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.d;
    }

    public final void b(ArrayDeque arrayDeque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.c;
            s3q0 s3q0Var = s3q0.a;
        }
        if (d() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final void c(f8f0.a aVar) {
        aVar.c().decrementAndGet();
        b(this.f, aVar);
    }

    public final boolean d() {
        int i;
        boolean z;
        byte[] bArr = x2r0.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<f8f0.a> it = this.e.iterator();
                while (it.hasNext()) {
                    f8f0.a next = it.next();
                    if (this.f.size() >= this.a) {
                        break;
                    }
                    if (next.c().get() < this.b) {
                        it.remove();
                        next.c().incrementAndGet();
                        arrayList.add(next);
                        this.f.add(next);
                    }
                }
                z = e() > 0;
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((f8f0.a) arrayList.get(i)).a(a());
        }
        return z;
    }

    public final synchronized int e() {
        return this.f.size() + this.g.size();
    }

    public qcn(ExecutorService executorService) {
        this();
        this.d = executorService;
    }
}
