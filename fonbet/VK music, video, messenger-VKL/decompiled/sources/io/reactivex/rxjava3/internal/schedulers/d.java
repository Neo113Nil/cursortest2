package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ExecutorScheduler.java */
/* loaded from: classes11.dex */
public final class d extends w {
    public static final w d = io.reactivex.rxjava3.schedulers.a.c();
    public final boolean b;
    public final Executor c;

    /* compiled from: ExecutorScheduler.java */
    public final class a implements Runnable {
        public final b b;

        public a(b bVar) {
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = this.b;
            SequentialDisposable sequentialDisposable = bVar.direct;
            io.reactivex.rxjava3.disposables.c c = d.this.c(bVar);
            sequentialDisposable.getClass();
            DisposableHelper.c(sequentialDisposable, c);
        }
    }

    /* compiled from: ExecutorScheduler.java */
    public static final class b extends AtomicReference<Runnable> implements Runnable, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -4101336210206799084L;
        final SequentialDisposable direct;
        final SequentialDisposable timed;

        public b(Runnable runnable) {
            super(runnable);
            this.timed = new SequentialDisposable();
            this.direct = new SequentialDisposable();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (getAndSet(null) != null) {
                SequentialDisposable sequentialDisposable = this.timed;
                sequentialDisposable.getClass();
                DisposableHelper.a(sequentialDisposable);
                SequentialDisposable sequentialDisposable2 = this.direct;
                sequentialDisposable2.getClass();
                DisposableHelper.a(sequentialDisposable2);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet(null);
                    SequentialDisposable sequentialDisposable = this.timed;
                    DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
                    sequentialDisposable.lazySet(disposableHelper);
                    this.direct.lazySet(disposableHelper);
                } catch (Throwable th) {
                    lazySet(null);
                    this.timed.lazySet(DisposableHelper.DISPOSED);
                    this.direct.lazySet(DisposableHelper.DISPOSED);
                    throw th;
                }
            }
        }
    }

    /* compiled from: ExecutorScheduler.java */
    public static final class c extends w.c implements Runnable {
        public final boolean b;
        public final Executor c;
        public volatile boolean e;
        public final AtomicInteger f = new AtomicInteger();
        public final io.reactivex.rxjava3.disposables.b g = new io.reactivex.rxjava3.disposables.b();
        public final io.reactivex.rxjava3.internal.queue.a<Runnable> d = new io.reactivex.rxjava3.internal.queue.a<>();

        /* compiled from: ExecutorScheduler.java */
        /* loaded from: classes8.dex */
        public static final class a extends AtomicBoolean implements Runnable, io.reactivex.rxjava3.disposables.c {
            private static final long serialVersionUID = -2421395018820541164L;
            final Runnable actual;

            public a(Runnable runnable) {
                this.actual = runnable;
            }

            @Override // io.reactivex.rxjava3.disposables.c
            public final void dispose() {
                lazySet(true);
            }

            @Override // io.reactivex.rxjava3.disposables.c
            public final boolean h() {
                return get();
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get()) {
                    return;
                }
                try {
                    this.actual.run();
                } finally {
                    lazySet(true);
                }
            }
        }

        /* compiled from: ExecutorScheduler.java */
        public static final class b extends AtomicInteger implements Runnable, io.reactivex.rxjava3.disposables.c {
            private static final long serialVersionUID = -3603436687413320876L;
            final Runnable run;
            final io.reactivex.rxjava3.disposables.d tasks;
            volatile Thread thread;

            public b(Runnable runnable, io.reactivex.rxjava3.disposables.d dVar) {
                this.run = runnable;
                this.tasks = dVar;
            }

            @Override // io.reactivex.rxjava3.disposables.c
            public final void dispose() {
                while (true) {
                    int i = get();
                    if (i >= 2) {
                        return;
                    }
                    if (i == 0) {
                        if (compareAndSet(0, 4)) {
                            io.reactivex.rxjava3.disposables.d dVar = this.tasks;
                            if (dVar != null) {
                                dVar.c(this);
                                return;
                            }
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.thread;
                        if (thread != null) {
                            thread.interrupt();
                            this.thread = null;
                        }
                        set(4);
                        io.reactivex.rxjava3.disposables.d dVar2 = this.tasks;
                        if (dVar2 != null) {
                            dVar2.c(this);
                            return;
                        }
                        return;
                    }
                }
            }

            @Override // io.reactivex.rxjava3.disposables.c
            public final boolean h() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get() == 0) {
                    this.thread = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.thread = null;
                        return;
                    }
                    try {
                        this.run.run();
                        this.thread = null;
                        if (!compareAndSet(1, 2)) {
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        } else {
                            io.reactivex.rxjava3.disposables.d dVar = this.tasks;
                            if (dVar != null) {
                                dVar.c(this);
                            }
                        }
                    } catch (Throwable th) {
                        this.thread = null;
                        if (compareAndSet(1, 2)) {
                            io.reactivex.rxjava3.disposables.d dVar2 = this.tasks;
                            if (dVar2 != null) {
                                dVar2.c(this);
                            }
                        } else {
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        }
                        throw th;
                    }
                }
            }
        }

        /* compiled from: ExecutorScheduler.java */
        /* renamed from: io.reactivex.rxjava3.internal.schedulers.d$c$c, reason: collision with other inner class name */
        public final class RunnableC2158c implements Runnable {
            public final SequentialDisposable b;
            public final Runnable c;

            public RunnableC2158c(SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.b = sequentialDisposable;
                this.c = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                io.reactivex.rxjava3.disposables.c a = c.this.a(this.c);
                SequentialDisposable sequentialDisposable = this.b;
                sequentialDisposable.getClass();
                DisposableHelper.c(sequentialDisposable, a);
            }
        }

        public c(Executor executor, boolean z) {
            this.c = executor;
            this.b = z;
        }

        @Override // io.reactivex.rxjava3.core.w.c
        public final io.reactivex.rxjava3.disposables.c a(Runnable runnable) {
            io.reactivex.rxjava3.disposables.c aVar;
            if (this.e) {
                return EmptyDisposable.INSTANCE;
            }
            if (this.b) {
                aVar = new b(runnable, this.g);
                this.g.b(aVar);
            } else {
                aVar = new a(runnable);
            }
            this.d.offer(aVar);
            if (this.f.getAndIncrement() != 0) {
                return aVar;
            }
            try {
                this.c.execute(this);
                return aVar;
            } catch (RejectedExecutionException e) {
                this.e = true;
                this.d.clear();
                io.reactivex.rxjava3.plugins.a.a(e);
                return EmptyDisposable.INSTANCE;
            }
        }

        @Override // io.reactivex.rxjava3.core.w.c
        public final io.reactivex.rxjava3.disposables.c b(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return a(runnable);
            }
            if (this.e) {
                return EmptyDisposable.INSTANCE;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new RunnableC2158c(sequentialDisposable2, runnable), this.g);
            this.g.b(scheduledRunnable);
            Executor executor = this.c;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable.a(((ScheduledExecutorService) executor).schedule((Callable) scheduledRunnable, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.e = true;
                    io.reactivex.rxjava3.plugins.a.a(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                scheduledRunnable.a(new io.reactivex.rxjava3.internal.schedulers.c(d.d.d(scheduledRunnable, j, timeUnit)));
            }
            DisposableHelper.c(sequentialDisposable, scheduledRunnable);
            return sequentialDisposable2;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.g.dispose();
            if (this.f.getAndIncrement() == 0) {
                this.d.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            io.reactivex.rxjava3.internal.queue.a<Runnable> aVar = this.d;
            int i = 1;
            while (!this.e) {
                do {
                    Runnable poll = aVar.poll();
                    if (poll != null) {
                        poll.run();
                    } else if (this.e) {
                        aVar.clear();
                        return;
                    } else {
                        i = this.f.addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } while (!this.e);
                aVar.clear();
                return;
            }
            aVar.clear();
        }
    }

    public d(Executor executor, boolean z) {
        this.c = executor;
        this.b = z;
    }

    @Override // io.reactivex.rxjava3.core.w
    public final w.c a() {
        return new c(this.c, this.b);
    }

    @Override // io.reactivex.rxjava3.core.w
    public final io.reactivex.rxjava3.disposables.c c(Runnable runnable) {
        Executor executor = this.c;
        Objects.requireNonNull(runnable, "run is null");
        try {
            if (executor instanceof ExecutorService) {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
                scheduledDirectTask.a(((ExecutorService) executor).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            if (this.b) {
                c.b bVar = new c.b(runnable, null);
                executor.execute(bVar);
                return bVar;
            }
            c.a aVar = new c.a(runnable);
            executor.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e) {
            io.reactivex.rxjava3.plugins.a.a(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.w
    public final io.reactivex.rxjava3.disposables.c d(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        Executor executor = this.c;
        if (executor instanceof ScheduledExecutorService) {
            try {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
                scheduledDirectTask.a(((ScheduledExecutorService) executor).schedule(scheduledDirectTask, j, timeUnit));
                return scheduledDirectTask;
            } catch (RejectedExecutionException e) {
                io.reactivex.rxjava3.plugins.a.a(e);
                return EmptyDisposable.INSTANCE;
            }
        }
        b bVar = new b(runnable);
        io.reactivex.rxjava3.disposables.c d2 = d.d(new a(bVar), j, timeUnit);
        SequentialDisposable sequentialDisposable = bVar.timed;
        sequentialDisposable.getClass();
        DisposableHelper.c(sequentialDisposable, d2);
        return bVar;
    }

    @Override // io.reactivex.rxjava3.core.w
    public final io.reactivex.rxjava3.disposables.c e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Executor executor = this.c;
        if (!(executor instanceof ScheduledExecutorService)) {
            return super.e(runnable, j, j2, timeUnit);
        }
        try {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
            scheduledDirectPeriodicTask.a(((ScheduledExecutorService) executor).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e) {
            io.reactivex.rxjava3.plugins.a.a(e);
            return EmptyDisposable.INSTANCE;
        }
    }
}
