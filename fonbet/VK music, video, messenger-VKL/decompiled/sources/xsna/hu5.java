package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: AwaitingLock.kt */
/* loaded from: classes3.dex */
public final class hu5 {
    public final Handler a;
    public final ReentrantLock b;
    public final Condition c;
    public volatile boolean d;

    public hu5(Handler handler) {
        this.a = handler;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.b = reentrantLock;
        this.c = reentrantLock.newCondition();
    }

    public final void a(gzs<s3q0> gzsVar) throws InterruptedException {
        if (epx.f(Looper.myLooper(), this.a.getLooper())) {
            gzsVar.invoke();
            return;
        }
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.d = true;
            this.a.post(new hc3(3, gzsVar, this));
            s3q0 s3q0Var = s3q0.a;
            while (this.d) {
                this.c.await();
            }
            s3q0 s3q0Var2 = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
