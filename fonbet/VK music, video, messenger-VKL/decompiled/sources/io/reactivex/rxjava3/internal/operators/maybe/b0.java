package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: MaybePeek.java */
/* loaded from: classes8.dex */
public final class b0<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {
    public final io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.disposables.c> c;
    public final io.reactivex.rxjava3.functions.f<? super T> d;
    public final io.reactivex.rxjava3.functions.f<? super Throwable> e;
    public final io.reactivex.rxjava3.functions.a f;
    public final a.k g;
    public final io.reactivex.rxjava3.functions.a h;

    /* compiled from: MaybePeek.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.m<? super T> b;
        public final b0<T> c;
        public io.reactivex.rxjava3.disposables.c d;

        public a(io.reactivex.rxjava3.core.m<? super T> mVar, b0<T> b0Var) {
            this.b = mVar;
            this.c = b0Var;
        }

        public final void a() {
            try {
                this.c.g.getClass();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                io.reactivex.rxjava3.plugins.a.a(th);
            }
        }

        public final void b(Throwable th) {
            try {
                this.c.e.accept(th);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                th = new CompositeException(th, th2);
            }
            this.d = DisposableHelper.DISPOSED;
            this.b.onError(th);
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            try {
                this.c.h.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                io.reactivex.rxjava3.plugins.a.a(th);
            }
            this.d.dispose();
            this.d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d.h();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
        public final void onComplete() {
            io.reactivex.rxjava3.disposables.c cVar = this.d;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (cVar == disposableHelper) {
                return;
            }
            try {
                this.c.f.run();
                this.d = disposableHelper;
                this.b.onComplete();
                a();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            if (this.d == DisposableHelper.DISPOSED) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            io.reactivex.rxjava3.core.m<? super T> mVar = this.b;
            if (DisposableHelper.f(this.d, cVar)) {
                try {
                    this.c.c.accept(cVar);
                    this.d = cVar;
                    mVar.onSubscribe(this);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    cVar.dispose();
                    this.d = DisposableHelper.DISPOSED;
                    mVar.onSubscribe(EmptyDisposable.INSTANCE);
                    mVar.onError(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            io.reactivex.rxjava3.disposables.c cVar = this.d;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (cVar == disposableHelper) {
                return;
            }
            try {
                this.c.d.accept(t);
                this.d = disposableHelper;
                this.b.onSuccess(t);
                a();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                b(th);
            }
        }
    }

    public b0(io.reactivex.rxjava3.core.k kVar, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.f fVar2, io.reactivex.rxjava3.functions.f fVar3, io.reactivex.rxjava3.functions.a aVar, io.reactivex.rxjava3.functions.a aVar2) {
        super(kVar);
        this.c = fVar;
        this.d = fVar2;
        this.e = fVar3;
        this.f = aVar;
        this.g = io.reactivex.rxjava3.internal.functions.a.c;
        this.h = aVar2;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        this.b.subscribe(new a(mVar, this));
    }
}
