package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes8.dex */
public abstract class k95 {
    public final ReentrantLock a = new ReentrantLock();
    public volatile String b;
    public volatile String c;

    public final void a(String str) {
        if (jl40.l(this.b, str)) {
            return;
        }
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (!jl40.l(this.b, str)) {
                this.b = str;
                this.c = null;
                try {
                    b();
                } catch (Throwable th) {
                    d5z0 d5z0Var = h5z0.a;
                    d5z0Var.t("Metrica8RtmConfigUpdater");
                    d5z0Var.d("Can't update config for RTM!", th);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract void b();
}
