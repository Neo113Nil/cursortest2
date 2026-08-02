package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableRetryPredicate.java */
/* loaded from: classes8.dex */
public final class b2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final a.x c;
    public final long d;

    /* compiled from: ObservableRetryPredicate.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.v<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final io.reactivex.rxjava3.core.v<? super T> downstream;
        final io.reactivex.rxjava3.functions.m<? super Throwable> predicate;
        long remaining;
        final io.reactivex.rxjava3.core.t<? extends T> source;
        final SequentialDisposable upstream;

        public a(io.reactivex.rxjava3.core.v vVar, long j, a.x xVar, SequentialDisposable sequentialDisposable, io.reactivex.rxjava3.core.t tVar) {
            this.downstream = vVar;
            this.upstream = sequentialDisposable;
            this.source = tVar;
            this.predicate = xVar;
            this.remaining = j;
        }

        public final void d() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.upstream.h()) {
                    this.source.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j == 0) {
                this.downstream.onError(th);
                return;
            }
            try {
                if (this.predicate.test(th)) {
                    d();
                } else {
                    this.downstream.onError(th);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            SequentialDisposable sequentialDisposable = this.upstream;
            sequentialDisposable.getClass();
            DisposableHelper.c(sequentialDisposable, cVar);
        }
    }

    public b2(io.reactivex.rxjava3.core.q qVar, long j) {
        super(qVar);
        this.c = io.reactivex.rxjava3.internal.functions.a.g;
        this.d = j;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        vVar.onSubscribe(sequentialDisposable);
        new a(vVar, this.d, this.c, sequentialDisposable, this.b).d();
    }
}
