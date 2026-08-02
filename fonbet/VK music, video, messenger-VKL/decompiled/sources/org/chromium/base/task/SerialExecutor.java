package org.chromium.base.task;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
class SerialExecutor implements Executor {
    Runnable mActive;
    final ArrayDeque<Runnable> mTasks = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            scheduleNext();
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(final Runnable runnable) {
        this.mTasks.offer(new Runnable() { // from class: org.chromium.base.task.b
            @Override // java.lang.Runnable
            public final void run() {
                SerialExecutor.this.lambda$execute$0(runnable);
            }
        });
        if (this.mActive == null) {
            scheduleNext();
        }
    }

    public synchronized void scheduleNext() {
        Runnable poll = this.mTasks.poll();
        this.mActive = poll;
        if (poll != null) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(poll);
        }
    }
}
