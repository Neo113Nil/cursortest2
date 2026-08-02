package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableResumeNext.java */
/* loaded from: classes8.dex */
public final class x extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.core.a b;
    public final io.reactivex.rxjava3.functions.l<? super Throwable, ? extends io.reactivex.rxjava3.core.e> c;

    /* compiled from: CompletableResumeNext.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.c, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 5018523762564524046L;
        final io.reactivex.rxjava3.core.c downstream;
        final io.reactivex.rxjava3.functions.l<? super Throwable, ? extends io.reactivex.rxjava3.core.e> errorMapper;
        boolean once;

        public a(io.reactivex.rxjava3.core.c cVar, io.reactivex.rxjava3.functions.l<? super Throwable, ? extends io.reactivex.rxjava3.core.e> lVar) {
            this.downstream = cVar;
            this.errorMapper = lVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onError(Throwable th) {
            if (this.once) {
                this.downstream.onError(th);
                return;
            }
            this.once = true;
            try {
                io.reactivex.rxjava3.core.e apply = this.errorMapper.apply(th);
                Objects.requireNonNull(apply, "The errorMapper returned a null CompletableSource");
                apply.subscribe(this);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.c(this, cVar);
        }
    }

    public x(io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.functions.l lVar) {
        this.b = aVar;
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        a aVar = new a(cVar, this.c);
        cVar.onSubscribe(aVar);
        this.b.subscribe(aVar);
    }
}
