package com.vungle.ads.internal.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class c implements ThreadFactory {
    public final String a;
    public final ThreadFactory b = Executors.defaultThreadFactory();
    public final AtomicInteger c = new AtomicInteger(0);

    public c(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.b.newThread(runnable);
        newThread.setName(this.a + "-th-" + this.c.incrementAndGet());
        return newThread;
    }
}
