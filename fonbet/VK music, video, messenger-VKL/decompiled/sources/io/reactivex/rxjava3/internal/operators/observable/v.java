package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;

/* compiled from: ObservableDelaySubscriptionOther.java */
/* loaded from: classes8.dex */
public final class v<T, U> extends io.reactivex.rxjava3.core.q<T> {
    public final io.reactivex.rxjava3.core.q b;
    public final w2 c;

    /* compiled from: ObservableDelaySubscriptionOther.java */
    public final class a implements io.reactivex.rxjava3.core.v<U> {
        public final SequentialDisposable b;
        public final io.reactivex.rxjava3.core.v<? super T> c;
        public boolean d;

        /* compiled from: ObservableDelaySubscriptionOther.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.v$a$a, reason: collision with other inner class name */
        public final class C2149a implements io.reactivex.rxjava3.core.v<T> {
            public C2149a() {
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onComplete() {
                a.this.c.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onError(Throwable th) {
                a.this.c.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onNext(T t) {
                a.this.c.onNext(t);
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                SequentialDisposable sequentialDisposable = a.this.b;
                sequentialDisposable.getClass();
                DisposableHelper.d(sequentialDisposable, cVar);
            }
        }

        public a(SequentialDisposable sequentialDisposable, io.reactivex.rxjava3.core.v<? super T> vVar) {
            this.b = sequentialDisposable;
            this.c = vVar;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            v.this.b.subscribe(new C2149a());
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.d) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.d = true;
                this.c.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(U u) {
            onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            SequentialDisposable sequentialDisposable = this.b;
            sequentialDisposable.getClass();
            DisposableHelper.d(sequentialDisposable, cVar);
        }
    }

    public v(io.reactivex.rxjava3.core.q qVar, w2 w2Var) {
        this.b = qVar;
        this.c = w2Var;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        vVar.onSubscribe(sequentialDisposable);
        this.c.subscribe(new a(sequentialDisposable, vVar));
    }
}
