package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableRepeat.java */
/* loaded from: classes11.dex */
public final class y1<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final long c;

    /* compiled from: ObservableRepeat.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.v<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final io.reactivex.rxjava3.core.v<? super T> downstream;
        long remaining;
        final SequentialDisposable sd;
        final io.reactivex.rxjava3.core.t<? extends T> source;

        public a(io.reactivex.rxjava3.core.v<? super T> vVar, long j, SequentialDisposable sequentialDisposable, io.reactivex.rxjava3.core.t<? extends T> tVar) {
            this.downstream = vVar;
            this.sd = sequentialDisposable;
            this.source = tVar;
            this.remaining = j;
        }

        public final void d() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.sd.h()) {
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
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j != 0) {
                d();
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            SequentialDisposable sequentialDisposable = this.sd;
            sequentialDisposable.getClass();
            DisposableHelper.c(sequentialDisposable, cVar);
        }
    }

    public y1(w2 w2Var) {
        super(w2Var);
        this.c = Long.MAX_VALUE;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        vVar.onSubscribe(sequentialDisposable);
        long j = this.c;
        new a(vVar, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, sequentialDisposable, this.b).d();
    }
}
