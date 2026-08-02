package xsna;

import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public abstract class ilz0 implements Runnable {
    public final /* synthetic */ jlz0 b;

    public /* synthetic */ ilz0(jlz0 jlz0Var) {
        this.b = jlz0Var;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        jlz0 jlz0Var = this.b;
        Lock lock = jlz0Var.b;
        Lock lock2 = jlz0Var.b;
        lock.lock();
        try {
            try {
            } catch (RuntimeException e) {
                zlz0 zlz0Var = jlz0Var.a.g;
                zlz0Var.sendMessage(zlz0Var.obtainMessage(2, e));
            }
            if (Thread.interrupted()) {
                return;
            }
            a();
        } finally {
            lock2.unlock();
        }
    }
}
