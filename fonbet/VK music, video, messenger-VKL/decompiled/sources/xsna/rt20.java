package xsna;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_common.zzbh;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class rt20 extends zzbh {
    public static final ThreadLocal c = new ThreadLocal();
    public final ThreadPoolExecutor b;

    public rt20() {
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: xsna.dh01
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return defaultThreadFactory.newThread(new Runnable() { // from class: xsna.qf01
                    @Override // java.lang.Runnable
                    public final void run() {
                        rt20.c.set(new ArrayDeque());
                        runnable.run();
                    }
                });
            }
        });
        this.b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbh, java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        Deque deque = (Deque) c.get();
        if (deque == null || deque.size() > 1) {
            this.b.execute(new ysz0(runnable, 1));
            return;
        }
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbh, com.google.android.gms.internal.mlkit_common.zzaj
    @NonNull
    public final /* synthetic */ Object zza() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbh
    @NonNull
    public final ExecutorService zzb() {
        return this.b;
    }
}
