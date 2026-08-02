package xsna;

import android.view.ViewGroup;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: AdvertisementTypeController.kt */
/* loaded from: classes6.dex */
public abstract class e41 {
    public final Object b;
    public Object c;
    public Object d;

    public e41() {
        this.b = new ReentrantLock();
    }

    public df0 a() {
        qe0 qe0Var = (qe0) this.d;
        return new df0(qe0Var.a().a, qe0Var.a().d, qe0Var.a().b, qe0Var.a().c, qe0Var.isTestModeEnabled(), qe0Var.b());
    }

    public abstract void destroy();

    public abstract i330 e();

    public abstract wcw0 g();

    public abstract void h(Object obj, lm50 lm50Var);

    public abstract void m(Object obj);

    public void q(xcw0 xcw0Var) {
        ((io.reactivex.rxjava3.subjects.f) this.c).onNext(xcw0Var);
    }

    public void r(Object obj, lm50 lm50Var) {
        ReentrantLock reentrantLock = (ReentrantLock) this.b;
        reentrantLock.lock();
        try {
            if (((lm50) this.c) == null) {
                m(obj);
            }
            this.c = lm50Var;
            h(obj, lm50Var);
            this.d = obj;
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public e41(ViewGroup viewGroup) {
        this.b = viewGroup;
        this.c = new io.reactivex.rxjava3.subjects.f();
        new bpn0(new k5f0(16));
        this.d = new bpn0(new u7v0(this, 2));
    }

    public e41(r31 r31Var, vh0 vh0Var, qe0 qe0Var) {
        this.b = r31Var;
        this.c = vh0Var;
        this.d = qe0Var;
    }
}
