package xsna;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultTaskExecutor.java */
/* loaded from: classes.dex */
public final class iol extends n1z0 {
    public final Object g = new Object();
    public final ExecutorService h = asu0.B(4, new a());

    @Nullable
    public volatile Handler i;

    /* compiled from: DefaultTaskExecutor.java */
    public class a implements ThreadFactory {
        public final AtomicInteger b = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.b.getAndIncrement());
            return thread;
        }
    }
}
