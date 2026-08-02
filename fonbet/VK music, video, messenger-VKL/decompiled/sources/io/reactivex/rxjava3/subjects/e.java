package io.reactivex.rxjava3.subjects;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableSubject.java */
/* loaded from: classes11.dex */
public final class e extends io.reactivex.rxjava3.core.a implements io.reactivex.rxjava3.core.c {
    public static final a[] e = new a[0];
    public static final a[] f = new a[0];
    public Throwable d;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicReference<a[]> b = new AtomicReference<>(e);

    /* compiled from: CompletableSubject.java */
    public static final class a extends AtomicReference<e> implements io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -7650903191002190468L;
        final io.reactivex.rxjava3.core.c downstream;

        public a(io.reactivex.rxjava3.core.c cVar, e eVar) {
            this.downstream = cVar;
            lazySet(eVar);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            e andSet = getAndSet(null);
            if (andSet != null) {
                andSet.u(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return get() == null;
        }
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onComplete() {
        if (this.c.compareAndSet(false, true)) {
            for (a aVar : this.b.getAndSet(f)) {
                aVar.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onError(Throwable th) {
        io.reactivex.rxjava3.internal.util.f.c(th, "onError called with a null Throwable.");
        if (!this.c.compareAndSet(false, true)) {
            io.reactivex.rxjava3.plugins.a.a(th);
            return;
        }
        this.d = th;
        for (a aVar : this.b.getAndSet(f)) {
            aVar.downstream.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        if (this.b.get() == f) {
            cVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        AtomicReference<a[]> atomicReference;
        a[] aVarArr;
        a[] aVarArr2;
        a aVar = new a(cVar, this);
        cVar.onSubscribe(aVar);
        do {
            atomicReference = this.b;
            aVarArr = atomicReference.get();
            if (aVarArr == f) {
                Throwable th = this.d;
                if (th != null) {
                    cVar.onError(th);
                    return;
                } else {
                    cVar.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!io.reactivex.rxjava3.processors.b.c(atomicReference, aVarArr, aVarArr2));
        if (aVar.h()) {
            u(aVar);
        }
    }

    public final void u(a aVar) {
        AtomicReference<a[]> atomicReference;
        a[] aVarArr;
        a[] aVarArr2;
        do {
            atomicReference = this.b;
            aVarArr = atomicReference.get();
            int length = aVarArr.length;
            if (length == 0) {
                return;
            }
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
            if (length == 1) {
                aVarArr2 = e;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!io.reactivex.rxjava3.processors.b.c(atomicReference, aVarArr, aVarArr2));
    }
}
