package xsna;

import com.vk.mvi.core.internal.executors.ThreadType;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MviThread.kt */
/* loaded from: classes3.dex */
public final class un50 extends Thread {
    public static final AtomicInteger c = new AtomicInteger(0);
    public final ThreadType b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public un50(Runnable runnable, int i, ThreadType threadType) {
        super(r0 != null ? r0.getThreadGroup() : Thread.currentThread().getThreadGroup(), runnable, "vk-thread-mvi-" + threadType + '-' + i, 0L);
        SecurityManager securityManager = System.getSecurityManager();
        this.b = threadType;
    }
}
