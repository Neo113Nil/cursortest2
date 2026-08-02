package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: ObservableFromIterable.java */
/* loaded from: classes11.dex */
public final class u0<T> extends io.reactivex.rxjava3.core.q<T> {
    public final Iterable<? extends T> b;

    /* compiled from: ObservableFromIterable.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.observers.b<T> {
        public final io.reactivex.rxjava3.core.v<? super T> b;
        public final Iterator<? extends T> c;
        public volatile boolean d;
        public boolean e;
        public boolean f;
        public boolean g;

        public a(io.reactivex.rxjava3.core.v<? super T> vVar, Iterator<? extends T> it) {
            this.b = vVar;
            this.c = it;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.h
        public final int a(int i) {
            this.e = true;
            return 1;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final void clear() {
            this.f = true;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.d = true;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final boolean isEmpty() {
            return this.f;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() {
            if (this.f) {
                return null;
            }
            boolean z = this.g;
            Iterator<? extends T> it = this.c;
            if (!z) {
                this.g = true;
            } else if (!it.hasNext()) {
                this.f = true;
                return null;
            }
            T next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            return next;
        }
    }

    public u0(Iterable<? extends T> iterable) {
        this.b = iterable;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        try {
            Iterator<? extends T> it = this.b.iterator();
            try {
                if (!it.hasNext()) {
                    vVar.onSubscribe(EmptyDisposable.INSTANCE);
                    vVar.onComplete();
                    return;
                }
                a aVar = new a(vVar, it);
                vVar.onSubscribe(aVar);
                if (aVar.e) {
                    return;
                }
                while (!aVar.d) {
                    try {
                        T next = aVar.c.next();
                        Objects.requireNonNull(next, "The iterator returned a null value");
                        aVar.b.onNext(next);
                        if (aVar.d) {
                            return;
                        }
                        try {
                            if (!aVar.c.hasNext()) {
                                if (aVar.d) {
                                    return;
                                }
                                aVar.b.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.a.b(th);
                            aVar.b.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.b(th2);
                        aVar.b.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.b(th3);
                vVar.onSubscribe(EmptyDisposable.INSTANCE);
                vVar.onError(th3);
            }
        } catch (Throwable th4) {
            io.reactivex.rxjava3.exceptions.a.b(th4);
            vVar.onSubscribe(EmptyDisposable.INSTANCE);
            vVar.onError(th4);
        }
    }
}
