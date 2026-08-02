package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableDebounceTimed.java */
/* loaded from: classes11.dex */
public final class s<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final long c;
    public final TimeUnit d;
    public final io.reactivex.rxjava3.core.w e;

    /* compiled from: ObservableDebounceTimed.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements Runnable, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final b<T> parent;
        final T value;

        public a(T t, long j, b<T> bVar) {
            this.value = t;
            this.idx = j;
            this.parent = bVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.once.compareAndSet(false, true)) {
                b<T> bVar = this.parent;
                long j = this.idx;
                T t = this.value;
                if (j == bVar.h) {
                    bVar.b.onNext(t);
                    DisposableHelper.a(this);
                }
            }
        }
    }

    /* compiled from: ObservableDebounceTimed.java */
    public static final class b<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.observers.e b;
        public final long c;
        public final TimeUnit d;
        public final w.c e;
        public io.reactivex.rxjava3.disposables.c f;
        public a g;
        public volatile long h;
        public boolean i;

        public b(io.reactivex.rxjava3.observers.e eVar, long j, TimeUnit timeUnit, w.c cVar) {
            this.b = eVar;
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
            if (this.i) {
                return;
            }
            this.i = true;
            a aVar = this.g;
            if (aVar != null) {
                DisposableHelper.a(aVar);
            }
            if (aVar != null) {
                aVar.run();
            }
            this.b.onComplete();
            this.e.dispose();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.i) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            a aVar = this.g;
            if (aVar != null) {
                DisposableHelper.a(aVar);
            }
            this.i = true;
            this.b.onError(th);
            this.e.dispose();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.i) {
                return;
            }
            long j = this.h + 1;
            this.h = j;
            a aVar = this.g;
            if (aVar != null) {
                DisposableHelper.a(aVar);
            }
            a aVar2 = new a(t, j, this);
            this.g = aVar2;
            DisposableHelper.c(aVar2, this.e.b(aVar2, this.c, this.d));
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.f, cVar)) {
                this.f = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    public s(io.reactivex.rxjava3.core.q qVar, long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
        super(qVar);
        this.c = j;
        this.d = timeUnit;
        this.e = wVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new b(new io.reactivex.rxjava3.observers.e(vVar), this.c, this.d, this.e.a()));
    }
}
