package xsna;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: ParamsRepository.kt */
/* loaded from: classes15.dex */
public final class ei90 {
    public final naa0 a;
    public volatile paa0 b;
    public volatile String d;
    public volatile String c = "";
    public final ReentrantLock e = new ReentrantLock();

    public ei90(naa0 naa0Var) {
        this.a = naa0Var;
    }

    public final String a() {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            return this.c;
        } finally {
            reentrantLock.unlock();
        }
    }
}
