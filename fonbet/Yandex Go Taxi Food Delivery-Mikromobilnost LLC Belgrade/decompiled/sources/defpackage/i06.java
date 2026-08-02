package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes10.dex */
public final class i06 extends gas {
    public final /* synthetic */ int b = 1;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i06(qq6 qq6Var, i0z0 i0z0Var) {
        super(qq6Var);
        this.c = i0z0Var;
    }

    @Override // defpackage.gas, defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        int i = this.b;
        y9t0 y9t0Var = this.a;
        switch (i) {
            case 0:
                try {
                    return y9t0Var.read(yp6Var, j);
                } catch (Exception e) {
                    this.c = e;
                    throw e;
                }
            default:
                try {
                    i0z0 i0z0Var = (i0z0) this.c;
                    if (j <= 0) {
                        i0z0Var.getClass();
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    ReentrantLock reentrantLock = i0z0Var.e;
                    reentrantLock.lock();
                    while (true) {
                        try {
                            long a = i0z0Var.a(System.nanoTime(), j);
                            if (a >= 0) {
                                reentrantLock.unlock();
                                return y9t0Var.read(yp6Var, a);
                            }
                            i0z0Var.f.awaitNanos(-a);
                        } catch (Throwable th) {
                            reentrantLock.unlock();
                            throw th;
                        }
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
        }
    }

    public /* synthetic */ i06(y9t0 y9t0Var) {
        super(y9t0Var);
    }
}
