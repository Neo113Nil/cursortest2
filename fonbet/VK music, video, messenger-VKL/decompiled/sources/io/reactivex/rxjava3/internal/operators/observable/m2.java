package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;

/* compiled from: ObservableSwitchIfEmpty.java */
/* loaded from: classes8.dex */
public final class m2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final io.reactivex.rxjava3.core.q c;

    /* compiled from: ObservableSwitchIfEmpty.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T> {
        public final io.reactivex.rxjava3.core.v<? super T> b;
        public final io.reactivex.rxjava3.core.t<? extends T> c;
        public boolean e = true;
        public final SequentialDisposable d = new SequentialDisposable();

        public a(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.core.v vVar) {
            this.b = vVar;
            this.c = qVar;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (!this.e) {
                this.b.onComplete();
            } else {
                this.e = false;
                this.c.subscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.e) {
                this.e = false;
            }
            this.b.onNext(t);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            SequentialDisposable sequentialDisposable = this.d;
            sequentialDisposable.getClass();
            DisposableHelper.d(sequentialDisposable, cVar);
        }
    }

    public m2(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.core.q qVar2) {
        super(qVar);
        this.c = qVar2;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        a aVar = new a(this.c, vVar);
        vVar.onSubscribe(aVar.d);
        this.b.subscribe(aVar);
    }
}
