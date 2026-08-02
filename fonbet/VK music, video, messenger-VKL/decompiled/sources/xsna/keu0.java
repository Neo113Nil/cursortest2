package xsna;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import xsna.mgn0;

/* compiled from: VkBaseExecutorProvider.kt */
/* loaded from: classes6.dex */
public final class keu0 implements mgn0.h {
    public final bpn0 a;
    public final bpn0 b;

    public keu0() {
        new bpn0(new d3j0(this, 21));
        this.a = new bpn0(new jo60(22));
        this.b = new bpn0(new uv80(16));
    }

    @Override // xsna.mgn0.h
    public final ExecutorService a() {
        return (ExecutorService) this.a.getValue();
    }

    @Override // xsna.mgn0.h
    public final ExecutorService b(final int i, final String str) {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: xsna.ieu0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setPriority(i);
                return thread;
            }
        });
    }

    @Override // xsna.mgn0.h
    public final ExecutorService c() {
        return (ExecutorService) this.b.getValue();
    }
}
