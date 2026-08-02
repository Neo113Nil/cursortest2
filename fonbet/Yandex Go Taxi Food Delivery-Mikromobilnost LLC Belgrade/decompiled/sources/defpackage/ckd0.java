package defpackage;

import com.yandex.plus.home.api.PlusSdkComponentLifecycleEvent;
import com.yandex.plus.home.common.utils.c;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class ckd0 {
    public final n0 a;
    public final eci0 b;
    public volatile int c;
    public volatile int d;
    public final ReentrantLock e;

    public ckd0() {
        n0 a = c.a();
        this.a = a;
        this.b = e.c(a);
        this.e = new ReentrantLock();
    }

    public final void a() {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (this.c == 0) {
                this.a.g(PlusSdkComponentLifecycleEvent.FIRST_COMPONENT_CREATED);
            }
            this.c++;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (this.c > 0) {
                this.c--;
                if (this.c == 0) {
                    this.a.g(PlusSdkComponentLifecycleEvent.LAST_COMPONENT_DESTROYED);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
