package io.reactivex.rxjava3.internal.operators.single;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleCache.java */
/* loaded from: classes8.dex */
public final class a<T> extends io.reactivex.rxjava3.core.x<T> implements io.reactivex.rxjava3.core.z<T> {
    public static final C2152a[] g = new C2152a[0];
    public static final C2152a[] h = new C2152a[0];
    public final io.reactivex.rxjava3.core.x b;
    public final AtomicInteger c = new AtomicInteger();
    public final AtomicReference<C2152a<T>[]> d = new AtomicReference<>(g);
    public T e;
    public Throwable f;

    /* compiled from: SingleCache.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.a$a, reason: collision with other inner class name */
    public static final class C2152a<T> extends AtomicBoolean implements io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 7514387411091976596L;
        final io.reactivex.rxjava3.core.z<? super T> downstream;
        final a<T> parent;

        public C2152a(io.reactivex.rxjava3.core.z<? super T> zVar, a<T> aVar) {
            this.downstream = zVar;
            this.parent = aVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.F(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return get();
        }
    }

    public a(io.reactivex.rxjava3.core.x xVar) {
        this.b = xVar;
    }

    public final void F(C2152a<T> c2152a) {
        C2152a<T>[] c2152aArr;
        while (true) {
            AtomicReference<C2152a<T>[]> atomicReference = this.d;
            C2152a<T>[] c2152aArr2 = atomicReference.get();
            int length = c2152aArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c2152aArr2[i] == c2152a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c2152aArr = g;
            } else {
                C2152a<T>[] c2152aArr3 = new C2152a[length - 1];
                System.arraycopy(c2152aArr2, 0, c2152aArr3, 0, i);
                System.arraycopy(c2152aArr2, i + 1, c2152aArr3, i, (length - i) - 1);
                c2152aArr = c2152aArr3;
            }
            while (!atomicReference.compareAndSet(c2152aArr2, c2152aArr)) {
                if (atomicReference.get() != c2152aArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onError(Throwable th) {
        this.f = th;
        for (C2152a<T> c2152a : this.d.getAndSet(h)) {
            if (!c2152a.get()) {
                c2152a.downstream.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onSuccess(T t) {
        this.e = t;
        for (C2152a<T> c2152a : this.d.getAndSet(h)) {
            if (!c2152a.get()) {
                c2152a.downstream.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        C2152a<T> c2152a = new C2152a<>(zVar, this);
        zVar.onSubscribe(c2152a);
        while (true) {
            AtomicReference<C2152a<T>[]> atomicReference = this.d;
            C2152a<T>[] c2152aArr = atomicReference.get();
            if (c2152aArr == h) {
                Throwable th = this.f;
                if (th != null) {
                    zVar.onError(th);
                    return;
                } else {
                    zVar.onSuccess(this.e);
                    return;
                }
            }
            int length = c2152aArr.length;
            C2152a<T>[] c2152aArr2 = new C2152a[length + 1];
            System.arraycopy(c2152aArr, 0, c2152aArr2, 0, length);
            c2152aArr2[length] = c2152a;
            while (!atomicReference.compareAndSet(c2152aArr, c2152aArr2)) {
                if (atomicReference.get() != c2152aArr) {
                    break;
                }
            }
            if (c2152a.get()) {
                F(c2152a);
            }
            if (this.c.getAndIncrement() == 0) {
                this.b.subscribe(this);
                return;
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
    }
}
