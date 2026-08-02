package defpackage;

import java.util.ArrayList;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class cw5 {
    public Thread a;
    public Thread b;
    public int c;
    public final ArrayList d = new ArrayList();
    public final Object e = new Object();

    public static void b(f1k f1kVar) {
        if (f1kVar instanceof bw5) {
            ((bw5) f1kVar).close();
        } else {
            kbs.f(f1kVar, "Incorrect entrance handle: ");
        }
    }

    public final bw5 a() {
        do {
            synchronized (this.e) {
                try {
                    Thread thread = this.a;
                    if (thread == null) {
                        thread = Thread.currentThread();
                    }
                    Thread thread2 = this.b;
                    if (thread2 == null) {
                        this.b = thread;
                        this.a = null;
                        this.c = 1;
                        return new bw5(this);
                    }
                    if (thread2.equals(thread)) {
                        this.c++;
                        return new bw5(this);
                    }
                    if (!this.d.contains(thread)) {
                        this.d.add(thread);
                    }
                    LockSupport.park();
                    synchronized (this.e) {
                        this.d.remove(Thread.currentThread());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (!Thread.interrupted());
        Thread.currentThread().interrupt();
        throw new InterruptedException();
    }

    public final void c(Thread thread) {
        synchronized (this.e) {
            this.a = thread;
        }
    }

    public final void d() {
        synchronized (this.e) {
            this.b = Thread.currentThread();
        }
    }
}
