package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;

/* compiled from: ObservableOnErrorNext.java */
/* loaded from: classes11.dex */
public final class o1<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final io.reactivex.rxjava3.functions.l<? super Throwable, ? extends io.reactivex.rxjava3.core.t<? extends T>> c;

    /* compiled from: ObservableOnErrorNext.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T> {
        public final io.reactivex.rxjava3.core.v<? super T> b;
        public final io.reactivex.rxjava3.functions.l<? super Throwable, ? extends io.reactivex.rxjava3.core.t<? extends T>> c;
        public final SequentialDisposable d = new SequentialDisposable();
        public boolean e;
        public boolean f;

        public a(io.reactivex.rxjava3.core.v<? super T> vVar, io.reactivex.rxjava3.functions.l<? super Throwable, ? extends io.reactivex.rxjava3.core.t<? extends T>> lVar) {
            this.b = vVar;
            this.c = lVar;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.e = true;
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            boolean z = this.e;
            io.reactivex.rxjava3.core.v<? super T> vVar = this.b;
            if (z) {
                if (this.f) {
                    io.reactivex.rxjava3.plugins.a.a(th);
                    return;
                } else {
                    vVar.onError(th);
                    return;
                }
            }
            this.e = true;
            try {
                io.reactivex.rxjava3.core.t<? extends T> apply = this.c.apply(th);
                if (apply != null) {
                    apply.subscribe(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th);
                vVar.onError(nullPointerException);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                vVar.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.f) {
                return;
            }
            this.b.onNext(t);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            SequentialDisposable sequentialDisposable = this.d;
            sequentialDisposable.getClass();
            DisposableHelper.c(sequentialDisposable, cVar);
        }
    }

    public o1(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.l lVar) {
        super(qVar);
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        a aVar = new a(vVar, this.c);
        vVar.onSubscribe(aVar.d);
        this.b.subscribe(aVar);
    }
}
