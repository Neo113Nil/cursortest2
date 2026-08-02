package ru.ok.gl.util;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class NamedPriorityThreadFactory implements ThreadFactory {
    private final AtomicInteger counter = new AtomicInteger(0);
    private final String name;
    private final int priority;

    public NamedPriorityThreadFactory(String str, int i) {
        this.name = str;
        this.priority = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(@NonNull Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(this.priority);
        thread.setName(this.name + " # " + this.counter.incrementAndGet());
        return thread;
    }
}
