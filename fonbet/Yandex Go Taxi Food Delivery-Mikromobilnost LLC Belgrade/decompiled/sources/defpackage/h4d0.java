package defpackage;

import com.yandex.plus.home.api.PlusSdkComponentLifecycleEvent;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class h4d0 implements d40 {
    public final /* synthetic */ i4d0 a;

    public h4d0(i4d0 i4d0Var) {
        this.a = i4d0Var;
    }

    @Override // defpackage.d40
    public final void a() {
        ckd0 ckd0Var = this.a.h;
        ReentrantLock reentrantLock = ckd0Var.e;
        reentrantLock.lock();
        try {
            if (ckd0Var.d == 0) {
                ckd0Var.a.g(PlusSdkComponentLifecycleEvent.FIRST_COMPONENT_STARTED);
            }
            ckd0Var.d++;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.d40
    public final void b() {
        this.a.h.a();
    }

    @Override // defpackage.d40
    public final void onDestroy() {
        this.a.h.b();
    }

    @Override // defpackage.d40
    public final void onStop() {
        ckd0 ckd0Var = this.a.h;
        ReentrantLock reentrantLock = ckd0Var.e;
        reentrantLock.lock();
        try {
            if (ckd0Var.d > 0) {
                ckd0Var.d--;
                if (ckd0Var.d == 0) {
                    ckd0Var.a.g(PlusSdkComponentLifecycleEvent.LAST_COMPONENT_STOPPED);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
