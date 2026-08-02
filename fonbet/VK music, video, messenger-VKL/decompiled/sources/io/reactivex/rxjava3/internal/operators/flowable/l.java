package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import xsna.axm0;

/* compiled from: FlowableDistinctUntilChanged.java */
/* loaded from: classes8.dex */
public final class l<T, K> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final a.q d;
    public final b.a e;

    /* compiled from: FlowableDistinctUntilChanged.java */
    public static final class a<T, K> extends io.reactivex.rxjava3.internal.subscribers.a<T, T> {
        public final io.reactivex.rxjava3.functions.l<? super T, K> g;
        public final io.reactivex.rxjava3.functions.d<? super K, ? super K> h;
        public K i;
        public boolean j;

        public a(io.reactivex.rxjava3.internal.fuseable.c cVar, a.q qVar, b.a aVar) {
            super(cVar);
            this.g = qVar;
            this.h = aVar;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public final boolean c(T t) {
            if (this.e) {
                return false;
            }
            int i = this.f;
            io.reactivex.rxjava3.internal.fuseable.c<? super R> cVar = this.b;
            if (i != 0) {
                return cVar.c(t);
            }
            try {
                K apply = this.g.apply(t);
                if (this.j) {
                    boolean test = this.h.test(this.i, apply);
                    this.i = apply;
                    if (test) {
                        return false;
                    }
                } else {
                    this.j = true;
                    this.i = apply;
                }
                cVar.onNext(t);
                return true;
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (c(t)) {
                return;
            }
            this.c.request(1L);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() throws Throwable {
            while (true) {
                T poll = this.d.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.g.apply(poll);
                if (!this.j) {
                    this.j = true;
                    this.i = apply;
                    return poll;
                }
                if (!this.h.test(this.i, apply)) {
                    this.i = apply;
                    return poll;
                }
                this.i = apply;
                if (this.f != 1) {
                    this.c.request(1L);
                }
            }
        }
    }

    /* compiled from: FlowableDistinctUntilChanged.java */
    public static final class b<T, K> extends io.reactivex.rxjava3.internal.subscribers.b<T, T> implements io.reactivex.rxjava3.internal.fuseable.c<T> {
        public final io.reactivex.rxjava3.functions.l<? super T, K> g;
        public final io.reactivex.rxjava3.functions.d<? super K, ? super K> h;
        public K i;
        public boolean j;

        public b(axm0 axm0Var, a.q qVar, b.a aVar) {
            super(axm0Var);
            this.g = qVar;
            this.h = aVar;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public final boolean c(T t) {
            if (this.e) {
                return false;
            }
            int i = this.f;
            axm0<? super R> axm0Var = this.b;
            if (i != 0) {
                axm0Var.onNext(t);
                return true;
            }
            try {
                K apply = this.g.apply(t);
                if (this.j) {
                    boolean test = this.h.test(this.i, apply);
                    this.i = apply;
                    if (test) {
                        return false;
                    }
                } else {
                    this.j = true;
                    this.i = apply;
                }
                axm0Var.onNext(t);
                return true;
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (c(t)) {
                return;
            }
            this.c.request(1L);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() throws Throwable {
            while (true) {
                T poll = this.d.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.g.apply(poll);
                if (!this.j) {
                    this.j = true;
                    this.i = apply;
                    return poll;
                }
                if (!this.h.test(this.i, apply)) {
                    this.i = apply;
                    return poll;
                }
                this.i = apply;
                if (this.f != 1) {
                    this.c.request(1L);
                }
            }
        }
    }

    public l(io.reactivex.rxjava3.core.g gVar) {
        super(gVar);
        this.d = io.reactivex.rxjava3.internal.functions.a.a;
        this.e = io.reactivex.rxjava3.internal.functions.b.a;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        boolean z = axm0Var instanceof io.reactivex.rxjava3.internal.fuseable.c;
        b.a aVar = this.e;
        a.q qVar = this.d;
        io.reactivex.rxjava3.core.g<T> gVar = this.c;
        if (z) {
            gVar.subscribe((io.reactivex.rxjava3.core.j) new a((io.reactivex.rxjava3.internal.fuseable.c) axm0Var, qVar, aVar));
        } else {
            gVar.subscribe((io.reactivex.rxjava3.core.j) new b(axm0Var, qVar, aVar));
        }
    }
}
