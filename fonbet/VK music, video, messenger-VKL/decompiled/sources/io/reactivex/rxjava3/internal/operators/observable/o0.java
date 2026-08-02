package io.reactivex.rxjava3.internal.operators.observable;

import android.R;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapSingle.java */
/* loaded from: classes11.dex */
public final class o0<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.b0<? extends R>> c;

    /* compiled from: ObservableFlatMapSingle.java */
    public static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 8600231336733376951L;
        volatile boolean cancelled;
        final io.reactivex.rxjava3.core.v<? super R> downstream;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.b0<? extends R>> mapper;
        io.reactivex.rxjava3.disposables.c upstream;
        final boolean delayErrors = false;
        final io.reactivex.rxjava3.disposables.b set = new io.reactivex.rxjava3.disposables.b();
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicInteger active = new AtomicInteger(1);
        final AtomicReference<io.reactivex.rxjava3.internal.queue.b<R>> queue = new AtomicReference<>();

        /* compiled from: ObservableFlatMapSingle.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.o0$a$a, reason: collision with other inner class name */
        public final class C2145a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.z<R>, io.reactivex.rxjava3.disposables.c {
            private static final long serialVersionUID = -502562646270949838L;

            public C2145a() {
            }

            @Override // io.reactivex.rxjava3.disposables.c
            public final void dispose() {
                DisposableHelper.a(this);
            }

            @Override // io.reactivex.rxjava3.disposables.c
            public final boolean h() {
                return DisposableHelper.b(get());
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onError(Throwable th) {
                a aVar = a.this;
                aVar.set.c(this);
                if (aVar.errors.a(th)) {
                    if (!aVar.delayErrors) {
                        aVar.upstream.dispose();
                        aVar.set.dispose();
                    }
                    aVar.active.decrementAndGet();
                    if (aVar.getAndIncrement() == 0) {
                        aVar.d();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.e(this, cVar);
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onSuccess(R r) {
                a aVar = a.this;
                aVar.set.c(this);
                if (aVar.get() == 0) {
                    if (aVar.compareAndSet(0, 1)) {
                        aVar.downstream.onNext(r);
                        boolean z = aVar.active.decrementAndGet() == 0;
                        io.reactivex.rxjava3.internal.queue.b<R> bVar = aVar.queue.get();
                        if (z && (bVar == null || bVar.isEmpty())) {
                            aVar.errors.f(aVar.downstream);
                            return;
                        }
                        if (aVar.decrementAndGet() == 0) {
                            return;
                        }
                        aVar.d();
                    }
                }
                io.reactivex.rxjava3.internal.queue.b<R> bVar2 = aVar.queue.get();
                if (bVar2 == null) {
                    bVar2 = new io.reactivex.rxjava3.internal.queue.b<>(io.reactivex.rxjava3.core.g.b);
                    if (!n0.d(aVar.queue, bVar2)) {
                        bVar2 = aVar.queue.get();
                    }
                }
                synchronized (bVar2) {
                    bVar2.offer(r);
                }
                aVar.active.decrementAndGet();
                if (aVar.getAndIncrement() != 0) {
                    return;
                }
                aVar.d();
            }
        }

        public a(io.reactivex.rxjava3.core.v vVar, io.reactivex.rxjava3.functions.l lVar) {
            this.downstream = vVar;
            this.mapper = lVar;
        }

        public final void d() {
            io.reactivex.rxjava3.core.v<? super R> vVar = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<io.reactivex.rxjava3.internal.queue.b<R>> atomicReference = this.queue;
            int i = 1;
            while (!this.cancelled) {
                if (!this.delayErrors && this.errors.get() != null) {
                    io.reactivex.rxjava3.internal.queue.b<R> bVar = this.queue.get();
                    if (bVar != null) {
                        bVar.clear();
                    }
                    this.errors.f(vVar);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                io.reactivex.rxjava3.internal.queue.b<R> bVar2 = atomicReference.get();
                R poll = bVar2 != null ? bVar2.poll() : null;
                boolean z2 = poll == null;
                if (z && z2) {
                    this.errors.f(this.downstream);
                    return;
                } else if (z2) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    vVar.onNext(poll);
                }
            }
            io.reactivex.rxjava3.internal.queue.b<R> bVar3 = this.queue.get();
            if (bVar3 != null) {
                bVar3.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.set.dispose();
            this.errors.d();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.active.decrementAndGet();
            if (getAndIncrement() == 0) {
                d();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.active.decrementAndGet();
            if (this.errors.a(th)) {
                if (!this.delayErrors) {
                    this.set.dispose();
                }
                if (getAndIncrement() == 0) {
                    d();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            try {
                io.reactivex.rxjava3.core.b0<? extends R> apply = this.mapper.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                io.reactivex.rxjava3.core.b0<? extends R> b0Var = apply;
                this.active.getAndIncrement();
                C2145a c2145a = new C2145a();
                if (this.cancelled || !this.set.b(c2145a)) {
                    return;
                }
                b0Var.subscribe(c2145a);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public o0(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.l lVar) {
        super(qVar);
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super R> vVar) {
        this.b.subscribe(new a(vVar, this.c));
    }
}
