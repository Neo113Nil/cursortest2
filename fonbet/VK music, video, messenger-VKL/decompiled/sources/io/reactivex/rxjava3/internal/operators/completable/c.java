package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableCache.java */
/* loaded from: classes8.dex */
public final class c extends io.reactivex.rxjava3.core.a implements io.reactivex.rxjava3.core.c {
    public static final a[] f = new a[0];
    public static final a[] g = new a[0];
    public final y b;
    public final AtomicReference<a[]> c = new AtomicReference<>(f);
    public final AtomicBoolean d = new AtomicBoolean();
    public Throwable e;

    /* compiled from: CompletableCache.java */
    public final class a extends AtomicBoolean implements io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 8943152917179642732L;
        final io.reactivex.rxjava3.core.c downstream;

        public a(io.reactivex.rxjava3.core.c cVar) {
            this.downstream = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (compareAndSet(false, true)) {
                c.this.u(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return get();
        }
    }

    public c(y yVar) {
        this.b = yVar;
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onComplete() {
        for (a aVar : this.c.getAndSet(g)) {
            if (!aVar.get()) {
                aVar.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onError(Throwable th) {
        this.e = th;
        for (a aVar : this.c.getAndSet(g)) {
            if (!aVar.get()) {
                aVar.downstream.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        a aVar = new a(cVar);
        cVar.onSubscribe(aVar);
        while (true) {
            AtomicReference<a[]> atomicReference = this.c;
            a[] aVarArr = atomicReference.get();
            if (aVarArr == g) {
                Throwable th = this.e;
                if (th != null) {
                    cVar.onError(th);
                    return;
                } else {
                    cVar.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            a[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            if (aVar.get()) {
                u(aVar);
            }
            if (this.d.compareAndSet(false, true)) {
                this.b.subscribe(this);
                return;
            }
            return;
        }
    }

    public final void u(a aVar) {
        a[] aVarArr;
        while (true) {
            AtomicReference<a[]> atomicReference = this.c;
            a[] aVarArr2 = atomicReference.get();
            int length = aVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (aVarArr2[i] == aVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                aVarArr = f;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr3, 0, i);
                System.arraycopy(aVarArr2, i + 1, aVarArr3, i, (length - i) - 1);
                aVarArr = aVarArr3;
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
    }
}
