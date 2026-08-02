package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: MaybeConcatArray.java */
/* loaded from: classes8.dex */
public final class b<T> extends io.reactivex.rxjava3.core.g<T> {
    public final io.reactivex.rxjava3.core.o<? extends T>[] c;

    /* compiled from: MaybeConcatArray.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.m<T>, jxm0 {
        private static final long serialVersionUID = 3520831347801429610L;
        final axm0<? super T> downstream;
        int index;
        long produced;
        final io.reactivex.rxjava3.core.o<? extends T>[] sources;
        final AtomicLong requested = new AtomicLong();
        final SequentialDisposable disposables = new SequentialDisposable();
        final AtomicReference<Object> current = new AtomicReference<>(NotificationLite.COMPLETE);

        public a(axm0<? super T> axm0Var, io.reactivex.rxjava3.core.o<? extends T>[] oVarArr) {
            this.downstream = axm0Var;
            this.sources = oVarArr;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            SequentialDisposable sequentialDisposable = this.disposables;
            sequentialDisposable.getClass();
            DisposableHelper.a(sequentialDisposable);
        }

        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.current;
            axm0<? super T> axm0Var = this.downstream;
            SequentialDisposable sequentialDisposable = this.disposables;
            while (!sequentialDisposable.h()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    if (obj != NotificationLite.COMPLETE) {
                        long j = this.produced;
                        if (j != this.requested.get()) {
                            this.produced = j + 1;
                            atomicReference.lazySet(null);
                            axm0Var.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!sequentialDisposable.h()) {
                        int i = this.index;
                        io.reactivex.rxjava3.core.o<? extends T>[] oVarArr = this.sources;
                        if (i == oVarArr.length) {
                            axm0Var.onComplete();
                            return;
                        } else {
                            this.index = i + 1;
                            oVarArr[i].subscribe(this);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.current.lazySet(NotificationLite.COMPLETE);
            d();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            SequentialDisposable sequentialDisposable = this.disposables;
            sequentialDisposable.getClass();
            DisposableHelper.c(sequentialDisposable, cVar);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            this.current.lazySet(t);
            d();
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                io.reactivex.rxjava3.internal.util.b.a(this.requested, j);
                d();
            }
        }
    }

    public b(io.reactivex.rxjava3.core.o<? extends T>[] oVarArr) {
        this.c = oVarArr;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        a aVar = new a(axm0Var, this.c);
        axm0Var.onSubscribe(aVar);
        aVar.d();
    }
}
