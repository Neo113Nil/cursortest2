package ru.ok.tracer.utils;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SequentialExecutor.kt */
/* loaded from: classes11.dex */
public final class SequentialExecutor implements Executor {
    private final Executor delegate;
    private final ConcurrentLinkedQueue<Runnable> queue = new ConcurrentLinkedQueue<>();
    private final QueueRunnable queueRunnable = new QueueRunnable();
    private final AtomicBoolean isRunning = new AtomicBoolean(false);

    /* compiled from: SequentialExecutor.kt */
    public final class QueueRunnable implements Runnable {
        public QueueRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SequentialExecutor.this.run();
        }
    }

    public SequentialExecutor(Executor executor) {
        this.delegate = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void run() {
        boolean isEmpty;
        while (true) {
            try {
                Runnable poll = this.queue.poll();
                if (poll == null) {
                    break;
                } else {
                    poll.run();
                }
            } finally {
                this.isRunning.set(false);
                if (!this.queue.isEmpty() && this.isRunning.compareAndSet(false, true)) {
                    this.delegate.execute(this.queueRunnable);
                }
            }
        }
        if (isEmpty) {
            return;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.queue.add(runnable);
        if (this.isRunning.compareAndSet(false, true)) {
            this.delegate.execute(this.queueRunnable);
        }
    }
}
