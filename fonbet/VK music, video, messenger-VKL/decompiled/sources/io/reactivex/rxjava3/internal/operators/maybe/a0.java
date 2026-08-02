package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* compiled from: MaybeOnErrorReturn.java */
/* loaded from: classes8.dex */
public final class a0<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {
    public final io.reactivex.rxjava3.functions.l<? super Throwable, ? extends T> c;

    /* compiled from: MaybeOnErrorReturn.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.m<? super T> b;
        public final io.reactivex.rxjava3.functions.l<? super Throwable, ? extends T> c;
        public io.reactivex.rxjava3.disposables.c d;

        public a(io.reactivex.rxjava3.core.m<? super T> mVar, io.reactivex.rxjava3.functions.l<? super Throwable, ? extends T> lVar) {
            this.b = mVar;
            this.c = lVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d.h();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            io.reactivex.rxjava3.core.m<? super T> mVar = this.b;
            try {
                T apply = this.c.apply(th);
                Objects.requireNonNull(apply, "The itemSupplier returned a null value");
                mVar.onSuccess(apply);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                mVar.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.d, cVar)) {
                this.d = cVar;
                this.b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            this.b.onSuccess(t);
        }
    }

    public a0(io.reactivex.rxjava3.core.k kVar, io.reactivex.rxjava3.functions.l lVar) {
        super(kVar);
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        this.b.subscribe(new a(mVar, this.c));
    }
}
