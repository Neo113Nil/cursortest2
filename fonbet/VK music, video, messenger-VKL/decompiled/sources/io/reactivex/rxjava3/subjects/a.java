package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AsyncSubject.java */
/* loaded from: classes8.dex */
public final class a<T> extends j<T> {
    public static final C2162a[] e = new C2162a[0];
    public static final C2162a[] f = new C2162a[0];
    public final AtomicReference<C2162a<T>[]> b = new AtomicReference<>(e);
    public Throwable c;
    public T d;

    /* compiled from: AsyncSubject.java */
    /* renamed from: io.reactivex.rxjava3.subjects.a$a, reason: collision with other inner class name */
    public static final class C2162a<T> extends DeferredScalarDisposable<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final a<T> parent;

        public C2162a(v<? super T> vVar, a<T> aVar) {
            super(vVar);
            this.parent = aVar;
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (getAndSet(4) != 4) {
                this.parent.O0(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable
        public final void onComplete() {
            if (h()) {
                return;
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable
        public final void onError(Throwable th) {
            if (h()) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }

    public final boolean N0() {
        return this.b.get() == f && this.c == null;
    }

    public final void O0(C2162a<T> c2162a) {
        C2162a<T>[] c2162aArr;
        while (true) {
            AtomicReference<C2162a<T>[]> atomicReference = this.b;
            C2162a<T>[] c2162aArr2 = atomicReference.get();
            int length = c2162aArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c2162aArr2[i] == c2162a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c2162aArr = e;
            } else {
                C2162a<T>[] c2162aArr3 = new C2162a[length - 1];
                System.arraycopy(c2162aArr2, 0, c2162aArr3, 0, i);
                System.arraycopy(c2162aArr2, i + 1, c2162aArr3, i, (length - i) - 1);
                c2162aArr = c2162aArr3;
            }
            while (!atomicReference.compareAndSet(c2162aArr2, c2162aArr)) {
                if (atomicReference.get() != c2162aArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        AtomicReference<C2162a<T>[]> atomicReference = this.b;
        C2162a<T>[] c2162aArr = atomicReference.get();
        C2162a<T>[] c2162aArr2 = f;
        if (c2162aArr == c2162aArr2) {
            return;
        }
        T t = this.d;
        C2162a<T>[] andSet = atomicReference.getAndSet(c2162aArr2);
        int i = 0;
        if (t == null) {
            int length = andSet.length;
            while (i < length) {
                andSet[i].onComplete();
                i++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i < length2) {
            andSet[i].b(t);
            i++;
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        io.reactivex.rxjava3.internal.util.f.c(th, "onError called with a null Throwable.");
        AtomicReference<C2162a<T>[]> atomicReference = this.b;
        C2162a<T>[] c2162aArr = atomicReference.get();
        C2162a<T>[] c2162aArr2 = f;
        if (c2162aArr == c2162aArr2) {
            io.reactivex.rxjava3.plugins.a.a(th);
            return;
        }
        this.d = null;
        this.c = th;
        C2162a<T>[] andSet = atomicReference.getAndSet(c2162aArr2);
        for (C2162a<T> c2162a : andSet) {
            c2162a.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(T t) {
        io.reactivex.rxjava3.internal.util.f.c(t, "onNext called with a null value.");
        if (this.b.get() == f) {
            return;
        }
        this.d = t;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        if (this.b.get() == f) {
            cVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(v<? super T> vVar) {
        C2162a<T> c2162a = new C2162a<>(vVar, this);
        vVar.onSubscribe(c2162a);
        while (true) {
            AtomicReference<C2162a<T>[]> atomicReference = this.b;
            C2162a<T>[] c2162aArr = atomicReference.get();
            if (c2162aArr == f) {
                Throwable th = this.c;
                if (th != null) {
                    vVar.onError(th);
                    return;
                }
                T t = this.d;
                if (t != null) {
                    c2162a.b(t);
                    return;
                } else {
                    c2162a.onComplete();
                    return;
                }
            }
            int length = c2162aArr.length;
            C2162a<T>[] c2162aArr2 = new C2162a[length + 1];
            System.arraycopy(c2162aArr, 0, c2162aArr2, 0, length);
            c2162aArr2[length] = c2162a;
            while (!atomicReference.compareAndSet(c2162aArr, c2162aArr2)) {
                if (atomicReference.get() != c2162aArr) {
                    break;
                }
            }
            if (c2162a.h()) {
                O0(c2162a);
                return;
            }
            return;
        }
    }
}
