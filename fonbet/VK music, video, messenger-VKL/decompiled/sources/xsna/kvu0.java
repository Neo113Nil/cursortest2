package xsna;

import android.os.Process;
import com.vk.log.L;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: VkForkJoinThreadFactory.kt */
/* loaded from: classes17.dex */
public final class kvu0 implements ForkJoinPool.ForkJoinWorkerThreadFactory {
    public final String a;
    public final Integer b;
    public final AtomicInteger c = new AtomicInteger();

    /* compiled from: VkForkJoinThreadFactory.kt */
    public static final class a extends ForkJoinWorkerThread {
        public final Integer b;

        public a(Integer num, ForkJoinPool forkJoinPool, String str) {
            super(forkJoinPool);
            this.b = num;
            setPriority(10);
            setName(str);
        }

        @Override // java.util.concurrent.ForkJoinWorkerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                Integer num = this.b;
                if (num != null) {
                    Process.setThreadPriority(num.intValue());
                }
            } catch (Throwable th) {
                L.i(th);
            }
            super.run();
        }
    }

    public kvu0(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    @Override // java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory
    public final ForkJoinWorkerThread newThread(ForkJoinPool forkJoinPool) {
        return new a(this.b, forkJoinPool, this.a + this.c.incrementAndGet());
    }
}
