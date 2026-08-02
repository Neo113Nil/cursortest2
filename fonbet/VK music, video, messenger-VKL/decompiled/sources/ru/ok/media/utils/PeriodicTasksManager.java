package ru.ok.media.utils;

import android.os.Handler;
import java.util.IdentityHashMap;
import ru.ok.media.utils.PeriodicTasksManager;
import xsna.cc3;
import xsna.m9p;

/* loaded from: classes9.dex */
public class PeriodicTasksManager {
    private final Handler handler;
    private boolean paused;
    private volatile boolean shutdown;
    private final IdentityHashMap<Runnable, Task> tasks = new IdentityHashMap<>();
    private int version;

    public class Task {
        private final TimedEvent lastExecution = new TimedEvent();
        private final int period;
        private final Runnable r;

        public Task(Runnable runnable, int i) {
            this.r = runnable;
            this.period = i;
        }

        /* renamed from: runTask, reason: merged with bridge method [inline-methods] */
        public void lambda$runTask$0(final int i) {
            if (!PeriodicTasksManager.this.shutdown && i == PeriodicTasksManager.this.version && PeriodicTasksManager.this.tasks.get(this.r) == this) {
                this.r.run();
                this.lastExecution.signal();
                PeriodicTasksManager.this.handler.postDelayed(new Runnable() { // from class: ru.ok.media.utils.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        PeriodicTasksManager.Task.this.lambda$runTask$0(i);
                    }
                }, this.period);
            }
        }
    }

    public PeriodicTasksManager(Handler handler) {
        this.handler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addTask$3(Task task) {
        task.lambda$runTask$0(this.version);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addTask$4(Runnable runnable, int i, boolean z) {
        final Task task = new Task(runnable, i);
        this.tasks.put(runnable, task);
        if (this.paused) {
            return;
        }
        this.handler.postDelayed(new Runnable() { // from class: ru.ok.media.utils.b
            @Override // java.lang.Runnable
            public final void run() {
                PeriodicTasksManager.this.lambda$addTask$3(task);
            }
        }, z ? 0L : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeTask$5(Runnable runnable) {
        this.tasks.remove(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPaused$0(boolean z) {
        if (z == this.paused) {
            return;
        }
        int i = this.version + 1;
        this.version = i;
        if (!z) {
            startAllTasks(i);
        }
        this.paused = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startAllTasks$2(final int i) {
        for (final Task task : this.tasks.values()) {
            this.handler.postDelayed(new Runnable() { // from class: ru.ok.media.utils.a
                @Override // java.lang.Runnable
                public final void run() {
                    PeriodicTasksManager.Task.this.lambda$runTask$0(i);
                }
            }, Math.max(0L, task.period - task.lastExecution.elapsed(Integer.MAX_VALUE)));
        }
    }

    private void startAllTasks(final int i) {
        this.handler.post(new Runnable() { // from class: xsna.ox90
            @Override // java.lang.Runnable
            public final void run() {
                PeriodicTasksManager.this.lambda$startAllTasks$2(i);
            }
        });
    }

    public void addTask(final Runnable runnable, final int i, final boolean z) {
        this.handler.post(new Runnable() { // from class: xsna.nx90
            @Override // java.lang.Runnable
            public final void run() {
                PeriodicTasksManager.this.lambda$addTask$4(runnable, i, z);
            }
        });
    }

    public void removeTask(Runnable runnable) {
        this.handler.post(new cc3(4, this, runnable));
    }

    public void setPaused(boolean z) {
        this.handler.post(new m9p(this, z, 2));
    }

    public void shutdown() {
        this.shutdown = true;
    }
}
