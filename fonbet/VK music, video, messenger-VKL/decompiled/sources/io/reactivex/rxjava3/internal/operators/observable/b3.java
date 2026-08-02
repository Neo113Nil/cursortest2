package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableWindowTimed.java */
/* loaded from: classes8.dex */
public final class b3<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, io.reactivex.rxjava3.core.q<T>> {
    public final long c;
    public final long d;
    public final TimeUnit e;
    public final io.reactivex.rxjava3.core.w f;
    public final long g;
    public final int h;

    /* compiled from: ObservableWindowTimed.java */
    public static abstract class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 5724293814035355511L;
        final int bufferSize;
        volatile boolean done;
        final io.reactivex.rxjava3.core.v<? super io.reactivex.rxjava3.core.q<T>> downstream;
        long emitted;
        Throwable error;
        final long timespan;
        final TimeUnit unit;
        io.reactivex.rxjava3.disposables.c upstream;
        volatile boolean upstreamCancelled;
        final io.reactivex.rxjava3.internal.fuseable.k<Object> queue = new io.reactivex.rxjava3.internal.queue.a();
        final AtomicBoolean downstreamCancelled = new AtomicBoolean();
        final AtomicInteger windowCount = new AtomicInteger(1);

        public a(io.reactivex.rxjava3.core.v<? super io.reactivex.rxjava3.core.q<T>> vVar, long j, TimeUnit timeUnit, int i) {
            this.downstream = vVar;
            this.timespan = j;
            this.unit = timeUnit;
            this.bufferSize = i;
        }

        public abstract void d();

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (this.downstreamCancelled.compareAndSet(false, true)) {
                j();
            }
        }

        public abstract void g();

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.downstreamCancelled.get();
        }

        public abstract void i();

        public final void j() {
            if (this.windowCount.decrementAndGet() == 0) {
                d();
                this.upstream.dispose();
                this.upstreamCancelled = true;
                i();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.done = true;
            i();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            i();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.queue.offer(t);
            i();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
                g();
            }
        }

        public void run() {
            j();
        }
    }

    /* compiled from: ObservableWindowTimed.java */
    public static final class b<T> extends a<T> implements Runnable {
        private static final long serialVersionUID = -6130475889925953722L;
        long count;
        final long maxSize;
        final boolean restartTimerOnMaxSize;
        final io.reactivex.rxjava3.core.w scheduler;
        final SequentialDisposable timer;
        io.reactivex.rxjava3.subjects.k<T> window;
        final w.c worker;

        /* compiled from: ObservableWindowTimed.java */
        public static final class a implements Runnable {
            public final b<?> b;
            public final long c;

            public a(b<?> bVar, long j) {
                this.b = bVar;
                this.c = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b<?> bVar = this.b;
                bVar.queue.offer(this);
                bVar.i();
            }
        }

        public b(io.reactivex.rxjava3.core.v vVar, long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar, int i, long j2) {
            super(vVar, j, timeUnit, i);
            this.scheduler = wVar;
            this.maxSize = j2;
            this.restartTimerOnMaxSize = false;
            this.worker = null;
            this.timer = new SequentialDisposable();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.b3.a
        public final void d() {
            SequentialDisposable sequentialDisposable = this.timer;
            sequentialDisposable.getClass();
            DisposableHelper.a(sequentialDisposable);
            w.c cVar = this.worker;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.b3.a
        public final void g() {
            if (this.downstreamCancelled.get()) {
                return;
            }
            this.emitted = 1L;
            this.windowCount.getAndIncrement();
            io.reactivex.rxjava3.subjects.k<T> N0 = io.reactivex.rxjava3.subjects.k.N0(this.bufferSize, this);
            this.window = N0;
            a3 a3Var = new a3(N0);
            this.downstream.onNext(a3Var);
            a aVar = new a(this, 1L);
            if (this.restartTimerOnMaxSize) {
                SequentialDisposable sequentialDisposable = this.timer;
                w.c cVar = this.worker;
                long j = this.timespan;
                io.reactivex.rxjava3.disposables.c c = cVar.c(aVar, j, j, this.unit);
                sequentialDisposable.getClass();
                DisposableHelper.c(sequentialDisposable, c);
            } else {
                SequentialDisposable sequentialDisposable2 = this.timer;
                io.reactivex.rxjava3.core.w wVar = this.scheduler;
                long j2 = this.timespan;
                io.reactivex.rxjava3.disposables.c e = wVar.e(aVar, j2, j2, this.unit);
                sequentialDisposable2.getClass();
                DisposableHelper.c(sequentialDisposable2, e);
            }
            if (a3Var.M0()) {
                this.window.onComplete();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.internal.operators.observable.b3.a
        public final void i() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.fuseable.k<Object> kVar = this.queue;
            io.reactivex.rxjava3.core.v<? super io.reactivex.rxjava3.core.q<T>> vVar = this.downstream;
            io.reactivex.rxjava3.subjects.k<T> kVar2 = this.window;
            int i = 1;
            while (true) {
                if (this.upstreamCancelled) {
                    kVar.clear();
                    kVar2 = 0;
                    this.window = null;
                } else {
                    boolean z = this.done;
                    Object poll = kVar.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        Throwable th = this.error;
                        if (th != null) {
                            if (kVar2 != 0) {
                                kVar2.onError(th);
                            }
                            vVar.onError(th);
                        } else {
                            if (kVar2 != 0) {
                                kVar2.onComplete();
                            }
                            vVar.onComplete();
                        }
                        d();
                        this.upstreamCancelled = true;
                    } else if (!z2) {
                        if (poll instanceof a) {
                            if (((a) poll).c == this.emitted || !this.restartTimerOnMaxSize) {
                                this.count = 0L;
                                kVar2 = k(kVar2);
                            }
                        } else if (kVar2 != 0) {
                            kVar2.onNext(poll);
                            long j = this.count + 1;
                            if (j == this.maxSize) {
                                this.count = 0L;
                                kVar2 = k(kVar2);
                            } else {
                                this.count = j;
                            }
                        }
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        public final io.reactivex.rxjava3.subjects.k<T> k(io.reactivex.rxjava3.subjects.k<T> kVar) {
            if (kVar != null) {
                kVar.onComplete();
                kVar = null;
            }
            if (this.downstreamCancelled.get()) {
                d();
                return kVar;
            }
            long j = this.emitted + 1;
            this.emitted = j;
            this.windowCount.getAndIncrement();
            io.reactivex.rxjava3.subjects.k<T> N0 = io.reactivex.rxjava3.subjects.k.N0(this.bufferSize, this);
            this.window = N0;
            a3 a3Var = new a3(N0);
            this.downstream.onNext(a3Var);
            if (this.restartTimerOnMaxSize) {
                SequentialDisposable sequentialDisposable = this.timer;
                w.c cVar = this.worker;
                a aVar = new a(this, j);
                long j2 = this.timespan;
                io.reactivex.rxjava3.disposables.c c = cVar.c(aVar, j2, j2, this.unit);
                sequentialDisposable.getClass();
                DisposableHelper.d(sequentialDisposable, c);
            }
            if (a3Var.M0()) {
                N0.onComplete();
            }
            return N0;
        }
    }

    /* compiled from: ObservableWindowTimed.java */
    public static final class c<T> extends a<T> implements Runnable {
        public static final Object b = new Object();
        private static final long serialVersionUID = 1155822639622580836L;
        final io.reactivex.rxjava3.core.w scheduler;
        final SequentialDisposable timer;
        io.reactivex.rxjava3.subjects.k<T> window;
        final Runnable windowRunnable;

        /* compiled from: ObservableWindowTimed.java */
        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                c.this.j();
            }
        }

        public c(io.reactivex.rxjava3.core.v<? super io.reactivex.rxjava3.core.q<T>> vVar, long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar, int i) {
            super(vVar, j, timeUnit, i);
            this.scheduler = wVar;
            this.timer = new SequentialDisposable();
            this.windowRunnable = new a();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.b3.a
        public final void d() {
            SequentialDisposable sequentialDisposable = this.timer;
            sequentialDisposable.getClass();
            DisposableHelper.a(sequentialDisposable);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.b3.a
        public final void g() {
            if (this.downstreamCancelled.get()) {
                return;
            }
            this.windowCount.getAndIncrement();
            io.reactivex.rxjava3.subjects.k<T> N0 = io.reactivex.rxjava3.subjects.k.N0(this.bufferSize, this.windowRunnable);
            this.window = N0;
            this.emitted = 1L;
            a3 a3Var = new a3(N0);
            this.downstream.onNext(a3Var);
            SequentialDisposable sequentialDisposable = this.timer;
            io.reactivex.rxjava3.core.w wVar = this.scheduler;
            long j = this.timespan;
            io.reactivex.rxjava3.disposables.c e = wVar.e(this, j, j, this.unit);
            sequentialDisposable.getClass();
            DisposableHelper.c(sequentialDisposable, e);
            if (a3Var.M0()) {
                this.window.onComplete();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12, types: [io.reactivex.rxjava3.subjects.k] */
        @Override // io.reactivex.rxjava3.internal.operators.observable.b3.a
        public final void i() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.fuseable.k<Object> kVar = this.queue;
            io.reactivex.rxjava3.core.v<? super io.reactivex.rxjava3.core.q<T>> vVar = this.downstream;
            io.reactivex.rxjava3.subjects.k kVar2 = (io.reactivex.rxjava3.subjects.k<T>) this.window;
            int i = 1;
            while (true) {
                if (this.upstreamCancelled) {
                    kVar.clear();
                    this.window = null;
                    kVar2 = (io.reactivex.rxjava3.subjects.k<T>) null;
                } else {
                    boolean z = this.done;
                    Object poll = kVar.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        Throwable th = this.error;
                        if (th != null) {
                            if (kVar2 != null) {
                                kVar2.onError(th);
                            }
                            vVar.onError(th);
                        } else {
                            if (kVar2 != null) {
                                kVar2.onComplete();
                            }
                            vVar.onComplete();
                        }
                        d();
                        this.upstreamCancelled = true;
                    } else if (!z2) {
                        if (poll == b) {
                            if (kVar2 != null) {
                                kVar2.onComplete();
                                this.window = null;
                                kVar2 = (io.reactivex.rxjava3.subjects.k<T>) null;
                            }
                            if (this.downstreamCancelled.get()) {
                                SequentialDisposable sequentialDisposable = this.timer;
                                sequentialDisposable.getClass();
                                DisposableHelper.a(sequentialDisposable);
                            } else {
                                this.emitted++;
                                this.windowCount.getAndIncrement();
                                kVar2 = (io.reactivex.rxjava3.subjects.k<T>) io.reactivex.rxjava3.subjects.k.N0(this.bufferSize, this.windowRunnable);
                                this.window = kVar2;
                                a3 a3Var = new a3(kVar2);
                                vVar.onNext(a3Var);
                                if (a3Var.M0()) {
                                    kVar2.onComplete();
                                }
                            }
                        } else if (kVar2 != null) {
                            kVar2.onNext(poll);
                        }
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.b3.a, java.lang.Runnable
        public final void run() {
            this.queue.offer(b);
            i();
        }
    }

    /* compiled from: ObservableWindowTimed.java */
    public static final class d<T> extends a<T> implements Runnable {
        public static final Object b = new Object();
        public static final Object c = new Object();
        private static final long serialVersionUID = -7852870764194095894L;
        final long timeskip;
        final List<io.reactivex.rxjava3.subjects.k<T>> windows;
        final w.c worker;

        /* compiled from: ObservableWindowTimed.java */
        public static final class a implements Runnable {
            public final d<?> b;
            public final boolean c;

            public a(d<?> dVar, boolean z) {
                this.b = dVar;
                this.c = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d<?> dVar = this.b;
                dVar.queue.offer(this.c ? d.b : d.c);
                dVar.i();
            }
        }

        public d(io.reactivex.rxjava3.core.v<? super io.reactivex.rxjava3.core.q<T>> vVar, long j, long j2, TimeUnit timeUnit, w.c cVar, int i) {
            super(vVar, j, timeUnit, i);
            this.timeskip = j2;
            this.worker = cVar;
            this.windows = new LinkedList();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.b3.a
        public final void d() {
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.b3.a
        public final void g() {
            if (this.downstreamCancelled.get()) {
                return;
            }
            this.emitted = 1L;
            this.windowCount.getAndIncrement();
            io.reactivex.rxjava3.subjects.k<T> N0 = io.reactivex.rxjava3.subjects.k.N0(this.bufferSize, this);
            this.windows.add(N0);
            a3 a3Var = new a3(N0);
            this.downstream.onNext(a3Var);
            this.worker.b(new a(this, false), this.timespan, this.unit);
            w.c cVar = this.worker;
            a aVar = new a(this, true);
            long j = this.timeskip;
            cVar.c(aVar, j, j, this.unit);
            if (a3Var.M0()) {
                N0.onComplete();
                this.windows.remove(N0);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.internal.operators.observable.b3.a
        public final void i() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.fuseable.k<Object> kVar = this.queue;
            io.reactivex.rxjava3.core.v<? super io.reactivex.rxjava3.core.q<T>> vVar = this.downstream;
            List<io.reactivex.rxjava3.subjects.k<T>> list = this.windows;
            int i = 1;
            while (true) {
                if (this.upstreamCancelled) {
                    kVar.clear();
                    list.clear();
                } else {
                    boolean z = this.done;
                    Object poll = kVar.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        Throwable th = this.error;
                        if (th != null) {
                            Iterator<io.reactivex.rxjava3.subjects.k<T>> it = list.iterator();
                            while (it.hasNext()) {
                                it.next().onError(th);
                            }
                            vVar.onError(th);
                        } else {
                            Iterator<io.reactivex.rxjava3.subjects.k<T>> it2 = list.iterator();
                            while (it2.hasNext()) {
                                it2.next().onComplete();
                            }
                            vVar.onComplete();
                        }
                        d();
                        this.upstreamCancelled = true;
                    } else if (!z2) {
                        if (poll == b) {
                            if (!this.downstreamCancelled.get()) {
                                this.emitted++;
                                this.windowCount.getAndIncrement();
                                io.reactivex.rxjava3.subjects.k<T> N0 = io.reactivex.rxjava3.subjects.k.N0(this.bufferSize, this);
                                list.add(N0);
                                a3 a3Var = new a3(N0);
                                vVar.onNext(a3Var);
                                this.worker.b(new a(this, false), this.timespan, this.unit);
                                if (a3Var.M0()) {
                                    N0.onComplete();
                                }
                            }
                        } else if (poll != c) {
                            Iterator<io.reactivex.rxjava3.subjects.k<T>> it3 = list.iterator();
                            while (it3.hasNext()) {
                                it3.next().onNext(poll);
                            }
                        } else if (!list.isEmpty()) {
                            list.remove(0).onComplete();
                        }
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.core.w wVar, int i) {
        super(qVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.c = 5000L;
        this.d = 5000L;
        this.e = timeUnit;
        this.f = wVar;
        this.g = Long.MAX_VALUE;
        this.h = i;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super io.reactivex.rxjava3.core.q<T>> vVar) {
        long j = this.c;
        long j2 = this.d;
        io.reactivex.rxjava3.core.t<T> tVar = this.b;
        if (j != j2) {
            tVar.subscribe(new d(vVar, this.c, this.d, this.e, this.f.a(), this.h));
        } else if (this.g == Long.MAX_VALUE) {
            tVar.subscribe(new c(vVar, this.c, this.e, this.f, this.h));
        } else {
            tVar.subscribe(new b(vVar, this.c, this.e, this.f, this.h, this.g));
        }
    }
}
