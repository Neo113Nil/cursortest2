package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.axm0;
import xsna.ffe0;

/* compiled from: FlowableConcatArray.java */
/* loaded from: classes8.dex */
public final class h<T> extends io.reactivex.rxjava3.core.g<T> {
    public final ffe0<? extends T>[] c;

    /* compiled from: FlowableConcatArray.java */
    public static final class a<T> extends SubscriptionArbiter implements io.reactivex.rxjava3.core.j<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        final axm0<? super T> downstream;
        List<Throwable> errors;
        int index;
        long produced;
        final ffe0<? extends T>[] sources;
        final boolean delayError = false;
        final AtomicInteger wip = new AtomicInteger();

        public a(ffe0[] ffe0VarArr, axm0 axm0Var) {
            this.downstream = axm0Var;
            this.sources = ffe0VarArr;
        }

        @Override // xsna.axm0
        public final void onComplete() {
            if (this.wip.getAndIncrement() == 0) {
                ffe0<? extends T>[] ffe0VarArr = this.sources;
                int length = ffe0VarArr.length;
                int i = this.index;
                while (i != length) {
                    ffe0<? extends T> ffe0Var = ffe0VarArr[i];
                    if (ffe0Var == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (!this.delayError) {
                            this.downstream.onError(nullPointerException);
                            return;
                        }
                        List list = this.errors;
                        if (list == null) {
                            list = new ArrayList((length - i) + 1);
                            this.errors = list;
                        }
                        list.add(nullPointerException);
                        i++;
                    } else {
                        long j = this.produced;
                        if (j != 0) {
                            this.produced = 0L;
                            i(j);
                        }
                        ffe0Var.subscribe(this);
                        i++;
                        this.index = i;
                        if (this.wip.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List<Throwable> list2 = this.errors;
                if (list2 == null) {
                    this.downstream.onComplete();
                } else if (list2.size() == 1) {
                    this.downstream.onError(list2.get(0));
                } else {
                    this.downstream.onError(new CompositeException(list2));
                }
            }
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (!this.delayError) {
                this.downstream.onError(th);
                return;
            }
            List list = this.errors;
            if (list == null) {
                list = new ArrayList((this.sources.length - this.index) + 1);
                this.errors = list;
            }
            list.add(th);
            onComplete();
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }
    }

    public h(ffe0[] ffe0VarArr) {
        this.c = ffe0VarArr;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        a aVar = new a(this.c, axm0Var);
        axm0Var.onSubscribe(aVar);
        aVar.onComplete();
    }
}
