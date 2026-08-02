package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapCompletableCompletable.java */
/* loaded from: classes11.dex */
public final class l0<T> extends io.reactivex.rxjava3.core.a implements io.reactivex.rxjava3.internal.fuseable.f<T> {
    public final io.reactivex.rxjava3.core.q b;
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.e> c;

    /* compiled from: ObservableFlatMapCompletableCompletable.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.c, io.reactivex.rxjava3.core.v<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        volatile boolean disposed;
        final io.reactivex.rxjava3.core.c downstream;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.e> mapper;
        io.reactivex.rxjava3.disposables.c upstream;
        final boolean delayErrors = false;
        final AtomicThrowable errors = new AtomicThrowable();
        final io.reactivex.rxjava3.disposables.b set = new io.reactivex.rxjava3.disposables.b();

        /* compiled from: ObservableFlatMapCompletableCompletable.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.l0$a$a, reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public final class C2142a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.c, io.reactivex.rxjava3.disposables.c {
            private static final long serialVersionUID = 8606673141535671828L;

            public C2142a() {
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

        public a(io.reactivex.rxjava3.core.c cVar, io.reactivex.rxjava3.functions.l lVar) {
            this.downstream = cVar;
            this.mapper = lVar;
            lazySet(1);
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

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.errors.e(this.downstream);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.errors.a(th)) {
                if (this.delayErrors) {
                    if (decrementAndGet() == 0) {
                        this.errors.e(this.downstream);
                    }
                } else {
                    this.disposed = true;
                    this.upstream.dispose();
                    this.set.dispose();
                    this.errors.e(this.downstream);
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
                C2142a c2142a = new C2142a();
                if (this.disposed || !this.set.b(c2142a)) {
                    return;
                }
                eVar.subscribe(c2142a);
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

    public l0(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.l lVar) {
        this.b = qVar;
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.f
    public final io.reactivex.rxjava3.core.q<T> b() {
        return new k0(this.b, this.c);
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        this.b.subscribe(new a(cVar, this.c));
    }
}
