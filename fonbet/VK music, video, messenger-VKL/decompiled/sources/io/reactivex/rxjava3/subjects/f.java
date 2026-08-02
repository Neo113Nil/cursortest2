package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.v;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PublishSubject.java */
/* loaded from: classes11.dex */
public final class f<T> extends j<T> {
    public static final a[] d = new a[0];
    public static final a[] e = new a[0];
    public final AtomicReference<a<T>[]> b = new AtomicReference<>(e);
    public Throwable c;

    /* compiled from: PublishSubject.java */
    public static final class a<T> extends AtomicBoolean implements io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 3562861878281475070L;
        final v<? super T> downstream;
        final f<T> parent;

        public a(v<? super T> vVar, f<T> fVar) {
            this.downstream = vVar;
            this.parent = fVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.N0(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return get();
        }
    }

    public final void N0(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.b;
            a<T>[] aVarArr2 = atomicReference.get();
            if (aVarArr2 == d || aVarArr2 == (aVarArr = e)) {
                return;
            }
            int length = aVarArr2.length;
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
            if (length != 1) {
                aVarArr = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr, 0, i);
                System.arraycopy(aVarArr2, i + 1, aVarArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        AtomicReference<a<T>[]> atomicReference = this.b;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = d;
        if (aVarArr == aVarArr2) {
            return;
        }
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (!aVar.get()) {
                aVar.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        io.reactivex.rxjava3.internal.util.f.c(th, "onError called with a null Throwable.");
        AtomicReference<a<T>[]> atomicReference = this.b;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = d;
        if (aVarArr == aVarArr2) {
            io.reactivex.rxjava3.plugins.a.a(th);
            return;
        }
        this.c = th;
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (aVar.get()) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                aVar.downstream.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(T t) {
        io.reactivex.rxjava3.internal.util.f.c(t, "onNext called with a null value.");
        for (a<T> aVar : this.b.get()) {
            if (!aVar.get()) {
                aVar.downstream.onNext(t);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        if (this.b.get() == d) {
            cVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(v<? super T> vVar) {
        a<T> aVar = new a<>(vVar, this);
        vVar.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.b;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == d) {
                Throwable th = this.c;
                if (th != null) {
                    vVar.onError(th);
                    return;
                } else {
                    vVar.onComplete();
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
            if (aVar.get()) {
                N0(aVar);
                return;
            }
            return;
        }
    }
}
