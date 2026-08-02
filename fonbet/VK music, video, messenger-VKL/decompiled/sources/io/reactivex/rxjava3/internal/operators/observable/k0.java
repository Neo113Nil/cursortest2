package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapCompletable.java */
/* loaded from: classes8.dex */
public final class k0<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.e> c;

    public k0(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.l lVar) {
        super(qVar);
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new a(vVar, this.c));
    }

    /* compiled from: ObservableFlatMapCompletable.java */
    public static final class a<T> extends BasicIntQueueDisposable<T> implements io.reactivex.rxjava3.core.v<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        volatile boolean disposed;
        final io.reactivex.rxjava3.core.v<? super T> downstream;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.e> mapper;
        io.reactivex.rxjava3.disposables.c upstream;
        final boolean delayErrors = false;
        final AtomicThrowable errors = new AtomicThrowable();
        final io.reactivex.rxjava3.disposables.b set = new io.reactivex.rxjava3.disposables.b();

        /* compiled from: ObservableFlatMapCompletable.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.k0$a$a, reason: collision with other inner class name */
        public final class C2141a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.c, io.reactivex.rxjava3.disposables.c {
            private static final long serialVersionUID = 8606673141535671828L;

            public C2141a() {
            }

            @Override // io.reactivex.rxjava3.disposables.c
            public final void dispose() {
                DisposableHelper.a(this);
            }

            @Override // io.reactivex.rxjava3.disposables.c
            public final boolean h() {
                return DisposableHelper.b(get());
            }

            @Override // io.reactivex.rxjava3.core.c
            public final void onComplete() {
                a aVar = a.this;
                aVar.set.c(this);
                aVar.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.c
            public final void onError(Throwable th) {
                a aVar = a.this;
                aVar.set.c(this);
                aVar.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.c
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.e(this, cVar);
            }
        }

        public a(io.reactivex.rxjava3.core.v vVar, io.reactivex.rxjava3.functions.l lVar) {
            this.downstream = vVar;
            this.mapper = lVar;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.h
        public final int a(int i) {
            return 2;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            this.set.dispose();
            this.errors.d();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.upstream.h();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.errors.f(this.downstream);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.errors.a(th)) {
                if (this.delayErrors) {
                    if (decrementAndGet() == 0) {
                        this.errors.f(this.downstream);
                    }
                } else {
                    this.disposed = true;
                    this.upstream.dispose();
                    this.set.dispose();
                    this.errors.f(this.downstream);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            try {
                io.reactivex.rxjava3.core.e apply = this.mapper.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                io.reactivex.rxjava3.core.e eVar = apply;
                getAndIncrement();
                C2141a c2141a = new C2141a();
                if (this.disposed || !this.set.b(c2141a)) {
                    return;
                }
                eVar.subscribe(c2141a);
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

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() {
            return null;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final void clear() {
        }
    }
}
