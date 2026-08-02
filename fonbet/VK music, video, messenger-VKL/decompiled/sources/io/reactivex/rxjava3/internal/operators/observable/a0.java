package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;

/* compiled from: ObservableDoFinally.java */
/* loaded from: classes8.dex */
public final class a0<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final io.reactivex.rxjava3.functions.a c;

    /* compiled from: ObservableDoFinally.java */
    public static final class a<T> extends BasicIntQueueDisposable<T> implements io.reactivex.rxjava3.core.v<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final io.reactivex.rxjava3.core.v<? super T> downstream;
        final io.reactivex.rxjava3.functions.a onFinally;
        io.reactivex.rxjava3.internal.fuseable.g<T> qd;
        boolean syncFused;
        io.reactivex.rxjava3.disposables.c upstream;

        public a(io.reactivex.rxjava3.core.v<? super T> vVar, io.reactivex.rxjava3.functions.a aVar) {
            this.downstream = vVar;
            this.onFinally = aVar;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.h
        public final int a(int i) {
            io.reactivex.rxjava3.internal.fuseable.g<T> gVar = this.qd;
            if (gVar == null || (i & 4) != 0) {
                return 0;
            }
            int a = gVar.a(i);
            if (a != 0) {
                this.syncFused = a == 1;
            }
            return a;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final void clear() {
            this.qd.clear();
        }

        public final void d() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    io.reactivex.rxjava3.plugins.a.a(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.upstream.dispose();
            d();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.upstream.h();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final boolean isEmpty() {
            return this.qd.isEmpty();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.downstream.onComplete();
            d();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.downstream.onError(th);
            d();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                if (cVar instanceof io.reactivex.rxjava3.internal.fuseable.g) {
                    this.qd = (io.reactivex.rxjava3.internal.fuseable.g) cVar;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() throws Throwable {
            T poll = this.qd.poll();
            if (poll == null && this.syncFused) {
                d();
            }
            return poll;
        }
    }

    public a0(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.a aVar) {
        super(qVar);
        this.c = aVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new a(vVar, this.c));
    }
}
