package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CompletableConcatIterable.java */
/* loaded from: classes11.dex */
public final class d extends io.reactivex.rxjava3.core.a {
    public final ArrayList b;

    /* compiled from: CompletableConcatIterable.java */
    public static final class a extends AtomicInteger implements io.reactivex.rxjava3.core.c {
        private static final long serialVersionUID = -7965400327305809232L;
        final io.reactivex.rxjava3.core.c downstream;
        final SequentialDisposable sd = new SequentialDisposable();
        final Iterator<? extends io.reactivex.rxjava3.core.e> sources;

        public a(io.reactivex.rxjava3.core.c cVar, Iterator<? extends io.reactivex.rxjava3.core.e> it) {
            this.downstream = cVar;
            this.sources = it;
        }

        public final void d() {
            if (!this.sd.h() && getAndIncrement() == 0) {
                Iterator<? extends io.reactivex.rxjava3.core.e> it = this.sources;
                while (!this.sd.h()) {
                    try {
                        if (!it.hasNext()) {
                            this.downstream.onComplete();
                            return;
                        }
                        try {
                            io.reactivex.rxjava3.core.e next = it.next();
                            Objects.requireNonNull(next, "The CompletableSource returned is null");
                            next.subscribe(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.a.b(th);
                            this.downstream.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.b(th2);
                        this.downstream.onError(th2);
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onComplete() {
            d();
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            SequentialDisposable sequentialDisposable = this.sd;
            sequentialDisposable.getClass();
            DisposableHelper.c(sequentialDisposable, cVar);
        }
    }

    public d(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        try {
            Iterator it = this.b.iterator();
            Objects.requireNonNull(it, "The iterator returned is null");
            a aVar = new a(cVar, it);
            cVar.onSubscribe(aVar.sd);
            aVar.d();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            cVar.onSubscribe(EmptyDisposable.INSTANCE);
            cVar.onError(th);
        }
    }
}
