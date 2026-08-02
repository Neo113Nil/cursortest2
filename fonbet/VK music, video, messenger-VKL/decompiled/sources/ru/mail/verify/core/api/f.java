package ru.mail.verify.core.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.Thread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ru.mail.libverify.g0.o;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
final class f {
    private static final TimeUnit e = TimeUnit.SECONDS;

    @Nullable
    private ThreadPoolExecutor a;

    @NonNull
    private final o b;

    @NonNull
    private final Thread.UncaughtExceptionHandler c;

    @NonNull
    private final RejectedExecutionHandler d;

    public f(@NonNull Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @NonNull RejectedExecutionHandler rejectedExecutionHandler, @NonNull ru.mail.libverify.p0.f fVar) {
        this.c = uncaughtExceptionHandler;
        this.d = rejectedExecutionHandler;
        this.b = new o("notify_core_worker", fVar, uncaughtExceptionHandler);
    }

    @NonNull
    public final ru.mail.libverify.p0.b b() {
        return this.b.a();
    }

    public final void c() {
        this.b.c();
        ThreadPoolExecutor threadPoolExecutor = this.a;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdownNow();
            try {
                if (!this.a.awaitTermination(5000L, TimeUnit.MILLISECONDS)) {
                    FileLog.e("ApiThread", "wait for shutdown failure");
                }
            } catch (InterruptedException unused) {
                FileLog.e("ApiThread", "shutdown failure");
            }
            this.a = null;
        }
    }

    @NonNull
    public final ThreadPoolExecutor a() {
        if (this.a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 15, 120L, e, new LinkedBlockingQueue());
            this.a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            this.a.setRejectedExecutionHandler(this.d);
            this.a.setThreadFactory(new e(this));
        }
        return this.a;
    }
}
