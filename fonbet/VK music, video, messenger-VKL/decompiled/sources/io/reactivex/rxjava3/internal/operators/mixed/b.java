package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xsna.jxm0;

/* compiled from: FlowableConcatMapCompletable.java */
/* loaded from: classes11.dex */
public final class b<T> extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.core.g<T> b;
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.e> c;
    public final ErrorMode d;
    public final int e = 2;

    /* compiled from: FlowableConcatMapCompletable.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.j<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 3610901111000061034L;
        volatile boolean active;
        int consumed;
        volatile boolean disposed;
        volatile boolean done;
        final io.reactivex.rxjava3.core.c downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final C2131a inner = new C2131a(this);
        final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.e> mapper;
        final int prefetch;
        final io.reactivex.rxjava3.internal.fuseable.k<T> queue;
        jxm0 upstream;

        /* compiled from: FlowableConcatMapCompletable.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.b$a$a, reason: collision with other inner class name */
        public static final class C2131a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.c {
            private static final long serialVersionUID = 5638352172918776687L;
            final a<?> parent;

            public C2131a(a<?> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.rxjava3.core.c
            public final void onComplete() {
                a<?> aVar = this.parent;
                aVar.active = false;
                aVar.d();
            }

            @Override // io.reactivex.rxjava3.core.c
            public final void onError(Throwable th) {
                a<?> aVar = this.parent;
                if (aVar.errors.a(th)) {
                    if (aVar.errorMode != ErrorMode.IMMEDIATE) {
                        aVar.active = false;
                        aVar.d();
                        return;
                    }
                    aVar.upstream.cancel();
                    aVar.errors.e(aVar.downstream);
                    if (aVar.getAndIncrement() == 0) {
                        aVar.queue.clear();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.c
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.c(this, cVar);
            }
        }

        public a(io.reactivex.rxjava3.core.c cVar, io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.e> lVar, ErrorMode errorMode, int i) {
            this.downstream = cVar;
            this.mapper = lVar;
            this.errorMode = errorMode;
            this.prefetch = i;
            this.queue = new SpscArrayQueue(i);
        }

        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.disposed) {
                if (!this.active) {
                    if (this.errorMode == ErrorMode.BOUNDARY && this.errors.get() != null) {
                        this.queue.clear();
                        this.errors.e(this.downstream);
                        return;
                    }
                    boolean z = this.done;
                    T poll = this.queue.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        this.errors.e(this.downstream);
                        return;
                    }
                    if (!z2) {
                        int i = this.prefetch;
                        int i2 = i - (i >> 1);
                        int i3 = this.consumed + 1;
                        if (i3 == i2) {
                            this.consumed = 0;
                            this.upstream.request(i2);
                        } else {
                            this.consumed = i3;
                        }
                        try {
                            io.reactivex.rxjava3.core.e apply = this.mapper.apply(poll);
                            Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                            io.reactivex.rxjava3.core.e eVar = apply;
                            this.active = true;
                            eVar.subscribe(this.inner);
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.a.b(th);
                            this.queue.clear();
                            this.upstream.cancel();
                            this.errors.a(th);
                            this.errors.e(this.downstream);
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.queue.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.disposed = true;
            this.upstream.cancel();
            C2131a c2131a = this.inner;
            c2131a.getClass();
            DisposableHelper.a(c2131a);
            this.errors.d();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.disposed;
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.done = true;
            d();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (this.errors.a(th)) {
                if (this.errorMode != ErrorMode.IMMEDIATE) {
                    this.done = true;
                    d();
                    return;
                }
                C2131a c2131a = this.inner;
                c2131a.getClass();
                DisposableHelper.a(c2131a);
                this.errors.e(this.downstream);
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.queue.offer(t)) {
                d();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.upstream, jxm0Var)) {
                this.upstream = jxm0Var;
                this.downstream.onSubscribe(this);
                jxm0Var.request(this.prefetch);
            }
        }
    }

    public b(io.reactivex.rxjava3.core.g gVar, io.reactivex.rxjava3.functions.l lVar, ErrorMode errorMode) {
        this.b = gVar;
        this.c = lVar;
        this.d = errorMode;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        this.b.subscribe((io.reactivex.rxjava3.core.j) new a(cVar, this.c, this.d, this.e));
    }
}
