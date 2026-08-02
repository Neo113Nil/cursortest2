package xsna;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: MainThreadDispatcher.kt */
/* loaded from: classes3.dex */
public final class fg00<Input> implements uic {
    public Input b;
    public ac3 c;
    public final fg00<Input>.a d = new a();
    public final ReentrantLock e = new ReentrantLock();

    /* compiled from: MainThreadDispatcher.kt */
    public final class a {
        public a() {
        }
    }

    @Override // xsna.uic
    public final void clear() {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            this.c = null;
            this.b = null;
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
