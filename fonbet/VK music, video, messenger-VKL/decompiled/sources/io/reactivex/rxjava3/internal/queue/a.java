package io.reactivex.rxjava3.internal.queue;

import io.reactivex.rxjava3.internal.fuseable.k;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MpscLinkedQueue.java */
/* loaded from: classes11.dex */
public final class a<T> implements k<T> {
    public final AtomicReference<C2156a<T>> b;
    public final AtomicReference<C2156a<T>> c;

    /* compiled from: MpscLinkedQueue.java */
    /* renamed from: io.reactivex.rxjava3.internal.queue.a$a, reason: collision with other inner class name */
    public static final class C2156a<E> extends AtomicReference<C2156a<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        public C2156a() {
        }

        public final E d() {
            E e = this.value;
            this.value = null;
            return e;
        }

        public C2156a(E e) {
            this.value = e;
        }
    }

    public a() {
        AtomicReference<C2156a<T>> atomicReference = new AtomicReference<>();
        this.b = atomicReference;
        AtomicReference<C2156a<T>> atomicReference2 = new AtomicReference<>();
        this.c = atomicReference2;
        C2156a<T> c2156a = new C2156a<>();
        atomicReference2.lazySet(c2156a);
        atomicReference.getAndSet(c2156a);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean isEmpty() {
        return this.c.get() == this.b.get();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        C2156a<T> c2156a = new C2156a<>(t);
        this.b.getAndSet(c2156a).lazySet(c2156a);
        return true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final T poll() {
        C2156a<T> c2156a;
        AtomicReference<C2156a<T>> atomicReference = this.c;
        C2156a<T> c2156a2 = atomicReference.get();
        C2156a<T> c2156a3 = (C2156a) c2156a2.get();
        if (c2156a3 != null) {
            T d = c2156a3.d();
            atomicReference.lazySet(c2156a3);
            return d;
        }
        if (c2156a2 == this.b.get()) {
            return null;
        }
        do {
            c2156a = (C2156a) c2156a2.get();
        } while (c2156a == null);
        T d2 = c2156a.d();
        atomicReference.lazySet(c2156a);
        return d2;
    }
}
