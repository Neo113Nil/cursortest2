package ru.mail.verify.core.api;

import androidx.annotation.NonNull;
import java.lang.Thread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
final class e implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(0);
    final /* synthetic */ f b;

    public e(f fVar) {
        this.b = fVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        Thread thread = new Thread(runnable);
        thread.setName("notify_core_background_worker" + this.a.incrementAndGet());
        thread.setPriority(8);
        uncaughtExceptionHandler = this.b.c;
        thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        return thread;
    }
}
