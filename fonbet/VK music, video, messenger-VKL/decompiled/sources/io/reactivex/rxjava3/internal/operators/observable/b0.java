package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: ObservableDoOnEach.java */
/* loaded from: classes11.dex */
public final class b0<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final io.reactivex.rxjava3.functions.f<? super T> c;
    public final io.reactivex.rxjava3.functions.f<? super Throwable> d;
    public final io.reactivex.rxjava3.functions.a e;
    public final io.reactivex.rxjava3.functions.a f;

    /* compiled from: ObservableDoOnEach.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super T> b;
        public final io.reactivex.rxjava3.functions.f<? super T> c;
        public final io.reactivex.rxjava3.functions.f<? super Throwable> d;
        public final io.reactivex.rxjava3.functions.a e;
        public final io.reactivex.rxjava3.functions.a f;
        public io.reactivex.rxjava3.disposables.c g;
        public boolean h;

        public a(io.reactivex.rxjava3.core.v<? super T> vVar, io.reactivex.rxjava3.functions.f<? super T> fVar, io.reactivex.rxjava3.functions.f<? super Throwable> fVar2, io.reactivex.rxjava3.functions.a aVar, io.reactivex.rxjava3.functions.a aVar2) {
            this.b = vVar;
            this.c = fVar;
            this.d = fVar2;
            this.e = aVar;
            this.f = aVar2;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.g.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.g.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.h) {
                return;
            }
            try {
                this.e.run();
                this.h = true;
                this.b.onComplete();
                try {
                    this.f.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    io.reactivex.rxjava3.plugins.a.a(th);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.h) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.h = true;
            try {
                this.d.accept(th);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                th = new CompositeException(th, th2);
            }
            this.b.onError(th);
            try {
                this.f.run();
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.b(th3);
                io.reactivex.rxjava3.plugins.a.a(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.h) {
                return;
            }
            try {
                this.c.accept(t);
                this.b.onNext(t);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.g.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.g, cVar)) {
                this.g = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    public b0(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.f fVar2, io.reactivex.rxjava3.functions.a aVar, io.reactivex.rxjava3.functions.a aVar2) {
        super(qVar);
        this.c = fVar;
        this.d = fVar2;
        this.e = aVar;
        this.f = aVar2;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new a(vVar, this.c, this.d, this.e, this.f));
    }
}
