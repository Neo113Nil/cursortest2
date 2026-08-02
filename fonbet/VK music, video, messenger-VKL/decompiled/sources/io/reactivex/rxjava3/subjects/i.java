package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.core.z;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleSubject.java */
/* loaded from: classes8.dex */
public final class i<T> extends x<T> implements z<T> {
    public static final a[] f = new a[0];
    public static final a[] g = new a[0];
    public T d;
    public Throwable e;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicReference<a<T>[]> b = new AtomicReference<>(f);

    /* compiled from: SingleSubject.java */
    public static final class a<T> extends AtomicReference<i<T>> implements io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -7650903191002190468L;
        final z<? super T> downstream;

        public a(z<? super T> zVar, i<T> iVar) {
            this.downstream = zVar;
            lazySet(iVar);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            i<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.F(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return get() == null;
        }
    }

    public final void F(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.b;
            a<T>[] aVarArr2 = atomicReference.get();
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
                a<T>[] aVarArr3 = new a[length - 1];
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

    @Override // io.reactivex.rxjava3.core.z
    public final void onError(Throwable th) {
        io.reactivex.rxjava3.internal.util.f.c(th, "onError called with a null Throwable.");
        if (!this.c.compareAndSet(false, true)) {
            io.reactivex.rxjava3.plugins.a.a(th);
            return;
        }
        this.e = th;
        for (a<T> aVar : this.b.getAndSet(g)) {
            aVar.downstream.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        if (this.b.get() == g) {
            cVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onSuccess(T t) {
        io.reactivex.rxjava3.internal.util.f.c(t, "onSuccess called with a null value.");
        if (this.c.compareAndSet(false, true)) {
            this.d = t;
            for (a<T> aVar : this.b.getAndSet(g)) {
                aVar.downstream.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(z<? super T> zVar) {
        a<T> aVar = new a<>(zVar, this);
        zVar.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.b;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == g) {
                Throwable th = this.e;
                if (th != null) {
                    zVar.onError(th);
                    return;
                } else {
                    zVar.onSuccess(this.d);
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
            if (aVar.h()) {
                F(aVar);
                return;
            }
            return;
        }
    }
}
