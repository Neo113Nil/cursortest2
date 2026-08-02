package xsna;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ExecutorUtils.java */
/* loaded from: classes13.dex */
public final class s3q implements ThreadFactory {
    public final /* synthetic */ AtomicLong b;

    /* compiled from: ExecutorUtils.java */
    public class a extends gx5 {
        public final /* synthetic */ Runnable b;

        public a(Runnable runnable) {
            this.b = runnable;
        }

        @Override // xsna.gx5
        public final void a() {
            this.b.run();
        }
    }

    public s3q(AtomicLong atomicLong) {
        this.b = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new a(runnable));
        newThread.setName("awaitEvenIfOnMainThread task continuation executor" + this.b.getAndIncrement());
        return newThread;
    }
}
