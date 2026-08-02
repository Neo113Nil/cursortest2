package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

/* compiled from: ObservableDelay.java */
/* loaded from: classes11.dex */
public final class u<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final long c;
    public final TimeUnit d;
    public final io.reactivex.rxjava3.core.w e;

    /* compiled from: ObservableDelay.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super T> b;
        public final long c;
        public final TimeUnit d;
        public final w.c e;
        public io.reactivex.rxjava3.disposables.c f;

        /* compiled from: ObservableDelay.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.u$a$a, reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public final class RunnableC2148a implements Runnable {
            public RunnableC2148a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                try {
                    aVar.b.onComplete();
                } finally {
                    aVar.e.dispose();
                }
            }
        }

        /* compiled from: ObservableDelay.java */
        /* loaded from: classes8.dex */
        public final class b implements Runnable {
            public final Throwable b;

            public b(Throwable th) {
                this.b = th;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                try {
                    aVar.b.onError(this.b);
                } finally {
                    aVar.e.dispose();
                }
            }
        }

        /* compiled from: ObservableDelay.java */
        public final class c implements Runnable {
            public final T b;

            public c(T t) {
                this.b = t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.b.onNext(this.b);
            }
        }

        public a(io.reactivex.rxjava3.core.v vVar, long j, TimeUnit timeUnit, w.c cVar) {
            this.b = vVar;
            this.c = j;
            this.d = timeUnit;
            this.e = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.f.dispose();
            this.e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.e.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.e.b(new RunnableC2148a(), this.c, this.d);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.e.b(new b(th), 0L, this.d);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.e.b(new c(t), this.c, this.d);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.f, cVar)) {
                this.f = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    public u(io.reactivex.rxjava3.core.q qVar, long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
        super(qVar);
        this.c = j;
        this.d = timeUnit;
        this.e = wVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new a(new io.reactivex.rxjava3.observers.e(vVar), this.c, this.d, this.e.a()));
    }
}
