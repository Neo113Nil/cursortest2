package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes11.dex */
public final class clo implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ clo(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(new blo(0, runnable));
                newThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) obj).getAndIncrement());
                return newThread;
            case 1:
                return new Thread(runnable, (String) obj);
            default:
                return ((ThreadFactory) obj).newThread(new h30(3, runnable));
        }
    }
}
