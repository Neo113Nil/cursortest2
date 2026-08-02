package xsna;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: VideoAutoplayTimer.kt */
/* loaded from: classes7.dex */
public final class i4s0 {
    public y37 a;
    public io.reactivex.rxjava3.disposables.c c;
    public boolean f;
    public boolean g;
    public final io.reactivex.rxjava3.internal.operators.observable.e1 b = io.reactivex.rxjava3.core.q.P(0, 1, TimeUnit.SECONDS);
    public final long d = 7;
    public long e = 7;
    public final ReentrantLock h = new ReentrantLock();

    public final void a() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            this.e = this.d;
            io.reactivex.rxjava3.disposables.c cVar = this.c;
            if (cVar != null) {
                cVar.dispose();
            }
            this.c = null;
            this.a = null;
            this.f = false;
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            y37 y37Var = this.a;
            if (y37Var != null) {
                y37Var.invoke();
            }
            a();
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
