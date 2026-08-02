package xsna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableResultCode.java */
/* loaded from: classes8.dex */
public final class v7i {
    public static final v7i e;
    public static final v7i f;
    public Boolean a = null;
    public Throwable b = null;
    public final ArrayList c = new ArrayList();
    public final Object d = new Object();

    static {
        v7i v7iVar = new v7i();
        v7iVar.e();
        e = v7iVar;
        v7i v7iVar2 = new v7i();
        v7iVar2.a(null);
        f = v7iVar2;
    }

    public static v7i d(Collection<v7i> collection) {
        if (collection.isEmpty()) {
            return e;
        }
        v7i v7iVar = new v7i();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AtomicReference atomicReference = new AtomicReference();
        for (v7i v7iVar2 : collection) {
            v7iVar2.f(new pyc(v7iVar2, atomicBoolean, atomicReference, atomicInteger, v7iVar, 1));
        }
        return v7iVar;
    }

    public final void a(Throwable th) {
        synchronized (this.d) {
            try {
                if (this.a == null) {
                    this.a = Boolean.FALSE;
                    this.b = th;
                    Iterator it = this.c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.d) {
            try {
                Boolean bool = this.a;
                z = bool != null && bool.booleanValue();
            } finally {
            }
        }
        return z;
    }

    public final void c(long j, TimeUnit timeUnit) {
        boolean z;
        synchronized (this.d) {
            z = this.a != null;
        }
        if (z) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        f(new xq3(countDownLatch, 4));
        try {
            countDownLatch.await(j, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void e() {
        synchronized (this.d) {
            try {
                if (this.a == null) {
                    this.a = Boolean.TRUE;
                    Iterator it = this.c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Runnable runnable) {
        boolean z;
        synchronized (this.d) {
            if (this.a != null) {
                z = true;
            } else {
                this.c.add(runnable);
                z = false;
            }
        }
        if (z) {
            runnable.run();
        }
    }
}
