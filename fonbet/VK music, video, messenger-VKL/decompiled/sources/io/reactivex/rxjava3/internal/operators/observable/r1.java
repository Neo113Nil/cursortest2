package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservablePublish.java */
/* loaded from: classes11.dex */
public final class r1<T> extends io.reactivex.rxjava3.observables.a<T> {
    public final io.reactivex.rxjava3.core.q b;
    public final AtomicReference<b<T>> c = new AtomicReference<>();

    /* compiled from: ObservablePublish.java */
    public static final class a<T> extends AtomicReference<b<T>> implements io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 7463222674719692880L;
        final io.reactivex.rxjava3.core.v<? super T> downstream;

        public a(io.reactivex.rxjava3.core.v<? super T> vVar, b<T> bVar) {
            this.downstream = vVar;
            lazySet(bVar);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            b<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.a(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return get() == null;
        }
    }

    /* compiled from: ObservablePublish.java */
    public static final class b<T> extends AtomicReference<a<T>[]> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public static final a[] b = new a[0];
        public static final a[] c = new a[0];
        private static final long serialVersionUID = -3251430252873581268L;
        final AtomicReference<b<T>> current;
        Throwable error;
        final AtomicBoolean connect = new AtomicBoolean();
        final AtomicReference<io.reactivex.rxjava3.disposables.c> upstream = new AtomicReference<>();

        public b(AtomicReference<b<T>> atomicReference) {
            this.current = atomicReference;
            lazySet(b);
        }

        public final void a(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
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
                if (length != 1) {
                    aVarArr2 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                    System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                } else {
                    aVarArr2 = b;
                }
            } while (!compareAndSet(aVarArr, aVarArr2));
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            getAndSet(c);
            q1.f(this.current, this);
            DisposableHelper.a(this.upstream);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return get() == c;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.upstream.lazySet(DisposableHelper.DISPOSED);
            for (a<T> aVar : getAndSet(c)) {
                aVar.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            io.reactivex.rxjava3.disposables.c cVar = this.upstream.get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (cVar == disposableHelper) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.error = th;
            this.upstream.lazySet(disposableHelper);
            for (a<T> aVar : getAndSet(c)) {
                aVar.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            for (a<T> aVar : get()) {
                aVar.downstream.onNext(t);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this.upstream, cVar);
        }
    }

    public r1(io.reactivex.rxjava3.core.q qVar) {
        this.b = qVar;
    }

    @Override // io.reactivex.rxjava3.observables.a
    public final void N0(io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.disposables.c> fVar) {
        b<T> bVar;
        loop0: while (true) {
            AtomicReference<b<T>> atomicReference = this.c;
            bVar = atomicReference.get();
            if (bVar != null && !bVar.h()) {
                break;
            }
            b<T> bVar2 = new b<>(atomicReference);
            while (!atomicReference.compareAndSet(bVar, bVar2)) {
                if (atomicReference.get() != bVar) {
                    break;
                }
            }
            bVar = bVar2;
            break loop0;
        }
        boolean z = false;
        if (!bVar.connect.get() && bVar.connect.compareAndSet(false, true)) {
            z = true;
        }
        try {
            fVar.accept(bVar);
            if (z) {
                this.b.subscribe(bVar);
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            throw io.reactivex.rxjava3.internal.util.f.f(th);
        }
    }

    @Override // io.reactivex.rxjava3.observables.a
    public final void P0() {
        AtomicReference<b<T>> atomicReference = this.c;
        b<T> bVar = atomicReference.get();
        if (bVar == null || !bVar.h()) {
            return;
        }
        q1.f(atomicReference, bVar);
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        b<T> bVar;
        a<T>[] aVarArr;
        a[] aVarArr2;
        loop0: while (true) {
            AtomicReference<b<T>> atomicReference = this.c;
            bVar = atomicReference.get();
            if (bVar != null) {
                break;
            }
            b<T> bVar2 = new b<>(atomicReference);
            while (!atomicReference.compareAndSet(bVar, bVar2)) {
                if (atomicReference.get() != bVar) {
                    break;
                }
            }
            bVar = bVar2;
            break loop0;
        }
        a<T> aVar = new a<>(vVar, bVar);
        vVar.onSubscribe(aVar);
        do {
            aVarArr = bVar.get();
            if (aVarArr == b.c) {
                Throwable th = bVar.error;
                if (th != null) {
                    vVar.onError(th);
                    return;
                } else {
                    vVar.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!bVar.compareAndSet(aVarArr, aVarArr2));
        if (aVar.h()) {
            bVar.a(aVar);
        }
    }
}
