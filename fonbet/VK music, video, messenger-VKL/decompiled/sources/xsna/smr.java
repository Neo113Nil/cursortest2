package xsna;

import java.util.concurrent.ThreadFactory;

/* compiled from: FixSwallowedInterruptionsThread.kt */
/* loaded from: classes5.dex */
public final class smr implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new rmr(runnable);
    }
}
