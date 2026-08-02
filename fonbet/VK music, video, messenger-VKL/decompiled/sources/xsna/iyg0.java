package xsna;

import com.vk.sqliteext.observer.SQLiteContentObserver;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class iyg0 implements ThreadFactory {
    public final /* synthetic */ int b;

    public /* synthetic */ iyg0(int i) {
        this.b = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread createSingleThreadExecutor$lambda$2;
        switch (this.b) {
            case 0:
                createSingleThreadExecutor$lambda$2 = SQLiteContentObserver.createSingleThreadExecutor$lambda$2(runnable);
                return createSingleThreadExecutor$lambda$2;
            case 1:
                AtomicInteger atomicInteger = tn50.b;
                return new tn50(runnable, lhg.a(tn50.b.incrementAndGet(), "vk-mvi-store-thread-"));
            default:
                Thread thread = new Thread(runnable, "queue-sync-manager-worker");
                thread.setPriority(1);
                return thread;
        }
    }
}
