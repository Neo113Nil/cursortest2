package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableRepeatWhen.java */
/* loaded from: classes8.dex */
public final class z1<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final io.reactivex.rxjava3.functions.l<? super io.reactivex.rxjava3.core.q<Object>, ? extends io.reactivex.rxjava3.core.t<?>> c;

    /* compiled from: ObservableRepeatWhen.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 802743776666017014L;
        volatile boolean active;
        final io.reactivex.rxjava3.core.v<? super T> downstream;
        final io.reactivex.rxjava3.subjects.j<Object> signaller;
        final io.reactivex.rxjava3.core.t<T> source;
        final AtomicInteger wip = new AtomicInteger();
        final AtomicThrowable error = new AtomicThrowable();
        final a<T>.C2150a inner = new C2150a();
        final AtomicReference<io.reactivex.rxjava3.disposables.c> upstream = new AtomicReference<>();

        /* compiled from: ObservableRepeatWhen.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.z1$a$a, reason: collision with other inner class name */
        public final class C2150a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.v<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            public C2150a() {
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onComplete() {
                a aVar = a.this;
                DisposableHelper.a(aVar.upstream);
                io.reactivex.rxjava3.internal.util.g.a(aVar.downstream, aVar, aVar.error);
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onError(Throwable th) {
                a aVar = a.this;
                DisposableHelper.a(aVar.upstream);
                io.reactivex.rxjava3.internal.util.g.b(aVar.downstream, th, aVar, aVar.error);
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onNext(Object obj) {
                a.this.d();
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.e(this, cVar);
            }
        }

        public a(io.reactivex.rxjava3.core.v vVar, io.reactivex.rxjava3.subjects.h hVar, io.reactivex.rxjava3.core.t tVar) {
            this.downstream = vVar;
            this.signaller = hVar;
            this.source = tVar;
        }

        public final void d() {
            if (this.wip.getAndIncrement() == 0) {
                while (!h()) {
                    if (!this.active) {
                        this.active = true;
                        this.source.subscribe(this);
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this.upstream);
            DisposableHelper.a(this.inner);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(this.upstream.get());
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            DisposableHelper.c(this.upstream, null);
            this.active = false;
            this.signaller.onNext(0);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            DisposableHelper.a(this.inner);
            io.reactivex.rxjava3.internal.util.g.b(this.downstream, th, this, this.error);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            io.reactivex.rxjava3.internal.util.g.c(this.downstream, t, this, this.error);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this.upstream, cVar);
        }
    }

    public z1(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.l lVar) {
        super(qVar);
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        io.reactivex.rxjava3.subjects.h M0 = new io.reactivex.rxjava3.subjects.f().M0();
        try {
            io.reactivex.rxjava3.core.t<?> apply = this.c.apply(M0);
            Objects.requireNonNull(apply, "The handler returned a null ObservableSource");
            io.reactivex.rxjava3.core.t<?> tVar = apply;
            a aVar = new a(vVar, M0, this.b);
            vVar.onSubscribe(aVar);
            tVar.subscribe(aVar.inner);
            aVar.d();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            vVar.onSubscribe(EmptyDisposable.INSTANCE);
            vVar.onError(th);
        }
    }
}
