package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableTimeoutTimed.java */
/* loaded from: classes11.dex */
public final class v2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final long c;
    public final TimeUnit d;
    public final io.reactivex.rxjava3.core.w e;
    public final io.reactivex.rxjava3.core.t<? extends T> f;

    /* compiled from: ObservableTimeoutTimed.java */
    /* loaded from: classes8.dex */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T> {
        public final io.reactivex.rxjava3.core.v<? super T> b;
        public final b c;

        public a(io.reactivex.rxjava3.core.v vVar, b bVar) {
            this.b = vVar;
            this.c = bVar;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.b.onNext(t);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.c(this.c, cVar);
        }
    }

    /* compiled from: ObservableTimeoutTimed.java */
    public static final class b<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c, d {
        private static final long serialVersionUID = 3764492702657003550L;
        final io.reactivex.rxjava3.core.v<? super T> downstream;
        io.reactivex.rxjava3.core.t<? extends T> fallback;
        final long timeout;
        final TimeUnit unit;
        final w.c worker;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicLong index = new AtomicLong();
        final AtomicReference<io.reactivex.rxjava3.disposables.c> upstream = new AtomicReference<>();

        public b(io.reactivex.rxjava3.core.v<? super T> vVar, long j, TimeUnit timeUnit, w.c cVar, io.reactivex.rxjava3.core.t<? extends T> tVar) {
            this.downstream = vVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
            this.fallback = tVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.v2.d
        public final void a(long j) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.a(this.upstream);
                io.reactivex.rxjava3.core.t<? extends T> tVar = this.fallback;
                this.fallback = null;
                tVar.subscribe(new a(this.downstream, this));
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this.upstream);
            DisposableHelper.a(this);
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                SequentialDisposable sequentialDisposable = this.task;
                sequentialDisposable.getClass();
                DisposableHelper.a(sequentialDisposable);
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            SequentialDisposable sequentialDisposable = this.task;
            sequentialDisposable.getClass();
            DisposableHelper.a(sequentialDisposable);
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            long j = this.index.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.index.compareAndSet(j, j2)) {
                    this.task.get().dispose();
                    this.downstream.onNext(t);
                    SequentialDisposable sequentialDisposable = this.task;
                    io.reactivex.rxjava3.disposables.c b = this.worker.b(new e(j2, this), this.timeout, this.unit);
                    sequentialDisposable.getClass();
                    DisposableHelper.c(sequentialDisposable, b);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this.upstream, cVar);
        }
    }

    /* compiled from: ObservableTimeoutTimed.java */
    public static final class c<T> extends AtomicLong implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c, d {
        private static final long serialVersionUID = 3764492702657003550L;
        final io.reactivex.rxjava3.core.v<? super T> downstream;
        final long timeout;
        final TimeUnit unit;
        final w.c worker;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicReference<io.reactivex.rxjava3.disposables.c> upstream = new AtomicReference<>();

        public c(io.reactivex.rxjava3.core.v<? super T> vVar, long j, TimeUnit timeUnit, w.c cVar) {
            this.downstream = vVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.v2.d
        public final void a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.a(this.upstream);
                this.downstream.onError(new TimeoutException(io.reactivex.rxjava3.internal.util.f.e(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this.upstream);
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(this.upstream.get());
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                SequentialDisposable sequentialDisposable = this.task;
                sequentialDisposable.getClass();
                DisposableHelper.a(sequentialDisposable);
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            SequentialDisposable sequentialDisposable = this.task;
            sequentialDisposable.getClass();
            DisposableHelper.a(sequentialDisposable);
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    this.task.get().dispose();
                    this.downstream.onNext(t);
                    SequentialDisposable sequentialDisposable = this.task;
                    io.reactivex.rxjava3.disposables.c b = this.worker.b(new e(j2, this), this.timeout, this.unit);
                    sequentialDisposable.getClass();
                    DisposableHelper.c(sequentialDisposable, b);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this.upstream, cVar);
        }
    }

    /* compiled from: ObservableTimeoutTimed.java */
    public interface d {
        void a(long j);
    }

    /* compiled from: ObservableTimeoutTimed.java */
    public static final class e implements Runnable {
        public final Object b;
        public final long c;

        public e(long j, d dVar) {
            this.c = j;
            this.b = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.internal.operators.observable.v2$d, java.lang.Object] */
        @Override // java.lang.Runnable
        public final void run() {
            this.b.a(this.c);
        }
    }

    public v2(io.reactivex.rxjava3.core.q<T> qVar, long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar, io.reactivex.rxjava3.core.t<? extends T> tVar) {
        super(qVar);
        this.c = j;
        this.d = timeUnit;
        this.e = wVar;
        this.f = tVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        io.reactivex.rxjava3.core.t<? extends T> tVar = this.f;
        io.reactivex.rxjava3.core.t<T> tVar2 = this.b;
        io.reactivex.rxjava3.core.w wVar = this.e;
        if (tVar == null) {
            c cVar = new c(vVar, this.c, this.d, wVar.a());
            vVar.onSubscribe(cVar);
            SequentialDisposable sequentialDisposable = cVar.task;
            io.reactivex.rxjava3.disposables.c b2 = cVar.worker.b(new e(0L, cVar), cVar.timeout, cVar.unit);
            sequentialDisposable.getClass();
            DisposableHelper.c(sequentialDisposable, b2);
            tVar2.subscribe(cVar);
            return;
        }
        b bVar = new b(vVar, this.c, this.d, wVar.a(), this.f);
        vVar.onSubscribe(bVar);
        SequentialDisposable sequentialDisposable2 = bVar.task;
        io.reactivex.rxjava3.disposables.c b3 = bVar.worker.b(new e(0L, bVar), bVar.timeout, bVar.unit);
        sequentialDisposable2.getClass();
        DisposableHelper.c(sequentialDisposable2, b3);
        tVar2.subscribe(bVar);
    }
}
