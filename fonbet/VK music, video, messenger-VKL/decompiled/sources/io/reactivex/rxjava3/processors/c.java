package io.reactivex.rxjava3.processors;

import defpackage.k0;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.f;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: PublishProcessor.java */
/* loaded from: classes11.dex */
public final class c<T> extends io.reactivex.rxjava3.processors.a<T> {
    public static final a[] e = new a[0];
    public static final a[] f = new a[0];
    public final AtomicReference<a<T>[]> c = new AtomicReference<>(f);
    public Throwable d;

    /* compiled from: PublishProcessor.java */
    public static final class a<T> extends AtomicLong implements jxm0 {
        private static final long serialVersionUID = 3562861878281475070L;
        final axm0<? super T> downstream;
        final c<T> parent;

        public a(axm0<? super T> axm0Var, c<T> cVar) {
            this.downstream = axm0Var;
            this.parent = cVar;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.q(this);
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            long j2;
            if (SubscriptionHelper.e(j)) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE || j2 == Long.MAX_VALUE) {
                        return;
                    }
                } while (!compareAndSet(j2, io.reactivex.rxjava3.internal.util.b.b(j2, j)));
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        a<T> aVar = new a<>(axm0Var, this);
        axm0Var.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.c;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == e) {
                Throwable th = this.d;
                if (th != null) {
                    axm0Var.onError(th);
                    return;
                } else {
                    axm0Var.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            if (aVar.get() == Long.MIN_VALUE) {
                q(aVar);
                return;
            }
            return;
        }
    }

    @Override // xsna.axm0
    public final void onComplete() {
        AtomicReference<a<T>[]> atomicReference = this.c;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = e;
        if (aVarArr == aVarArr2) {
            return;
        }
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (aVar.get() != Long.MIN_VALUE) {
                aVar.downstream.onComplete();
            }
        }
    }

    @Override // xsna.axm0
    public final void onError(Throwable th) {
        f.c(th, "onError called with a null Throwable.");
        AtomicReference<a<T>[]> atomicReference = this.c;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = e;
        if (aVarArr == aVarArr2) {
            io.reactivex.rxjava3.plugins.a.a(th);
            return;
        }
        this.d = th;
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (aVar.get() != Long.MIN_VALUE) {
                aVar.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.a(th);
            }
        }
    }

    @Override // xsna.axm0
    public final void onNext(T t) {
        long j;
        long j2;
        f.c(t, "onNext called with a null value.");
        for (a<T> aVar : this.c.get()) {
            long j3 = aVar.get();
            if (j3 != Long.MIN_VALUE) {
                if (j3 != 0) {
                    aVar.downstream.onNext(t);
                    do {
                        j = aVar.get();
                        if (j != Long.MIN_VALUE && j != Long.MAX_VALUE) {
                            j2 = j - 1;
                            if (j2 < 0) {
                                io.reactivex.rxjava3.plugins.a.a(new IllegalStateException(k0.a(j2, "More produced than requested: ")));
                                j2 = 0;
                            }
                        }
                    } while (!aVar.compareAndSet(j, j2));
                } else {
                    aVar.cancel();
                    aVar.downstream.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                }
            }
        }
    }

    @Override // xsna.axm0
    public final void onSubscribe(jxm0 jxm0Var) {
        if (this.c.get() == e) {
            jxm0Var.cancel();
        } else {
            jxm0Var.request(Long.MAX_VALUE);
        }
    }

    public final void q(a<T> aVar) {
        AtomicReference<a<T>[]> atomicReference;
        a<T>[] aVarArr;
        a<T>[] aVarArr2;
        do {
            atomicReference = this.c;
            aVarArr = atomicReference.get();
            if (aVarArr == e || aVarArr == (aVarArr2 = f)) {
                return;
            }
            int length = aVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (aVarArr[i] == aVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                aVarArr2 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
            }
        } while (!b.c(atomicReference, aVarArr, aVarArr2));
    }
}
