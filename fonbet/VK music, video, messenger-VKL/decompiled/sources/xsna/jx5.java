package xsna;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: BackgroundSyncLocker.kt */
/* loaded from: classes2.dex */
public final class jx5 {
    public final ReentrantLock a;
    public final Condition b;
    public a400 c;
    public boolean d;

    public jx5() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        this.b = reentrantLock.newCondition();
        this.d = true;
    }
}
