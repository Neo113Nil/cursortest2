package xsna;

import java.util.concurrent.locks.LockSupport;

/* compiled from: Builders.kt */
/* loaded from: classes11.dex */
public final class sf7<T> extends xd<T> {
    public final Thread e;
    public final c0q f;

    public sf7(kotlin.coroutines.d dVar, Thread thread, c0q c0qVar) {
        super(dVar, true, true);
        this.e = thread;
        this.f = c0qVar;
    }

    @Override // xsna.pyx
    public final void C(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.e;
        if (epx.f(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
