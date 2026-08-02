package xsna;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BlockingConditionLock.kt */
/* loaded from: classes3.dex */
public final class rf7 {
    public final FunctionReferenceImpl a;
    public final ReentrantLock b;
    public volatile boolean c;
    public final Condition d;

    /* JADX WARN: Multi-variable type inference failed */
    public rf7(gzs<Boolean> gzsVar) {
        this.a = (FunctionReferenceImpl) gzsVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.b = reentrantLock;
        this.d = reentrantLock.newCondition();
    }

    public final void a() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.c = true;
            this.d.signal();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
