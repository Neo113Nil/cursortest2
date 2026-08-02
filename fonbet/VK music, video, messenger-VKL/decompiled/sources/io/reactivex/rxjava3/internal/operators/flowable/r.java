package io.reactivex.rxjava3.internal.operators.flowable;

import xsna.axm0;

/* compiled from: FlowableFilter.java */
/* loaded from: classes11.dex */
public final class r<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final io.reactivex.rxjava3.functions.m<? super T> d;

    /* compiled from: FlowableFilter.java */
    /* loaded from: classes8.dex */
    public static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.a<T, T> {
        public final io.reactivex.rxjava3.functions.m<? super T> g;

        public a(io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar, io.reactivex.rxjava3.functions.m<? super T> mVar) {
            super(cVar);
            this.g = mVar;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public final boolean c(T t) {
            if (this.e) {
                return false;
            }
            int i = this.f;
            io.reactivex.rxjava3.internal.fuseable.c<? super R> cVar = this.b;
            if (i != 0) {
                return cVar.c(null);
            }
            try {
                return this.g.test(t) && cVar.c(t);
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
            io.reactivex.rxjava3.internal.fuseable.i<T> iVar = this.d;
            while (true) {
                T poll = iVar.poll();
                if (poll == null) {
                    return null;
                }
                if (this.g.test(poll)) {
                    return poll;
                }
                if (this.f == 2) {
                    iVar.request(1L);
                }
            }
        }
    }

    /* compiled from: FlowableFilter.java */
    public static final class b<T> extends io.reactivex.rxjava3.internal.subscribers.b<T, T> implements io.reactivex.rxjava3.internal.fuseable.c<T> {
        public final io.reactivex.rxjava3.functions.m<? super T> g;

        public b(axm0<? super T> axm0Var, io.reactivex.rxjava3.functions.m<? super T> mVar) {
            super(axm0Var);
            this.g = mVar;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public final boolean c(T t) {
            if (this.e) {
                return false;
            }
            int i = this.f;
            axm0<? super R> axm0Var = this.b;
            if (i != 0) {
                axm0Var.onNext(null);
                return true;
            }
            try {
                boolean test = this.g.test(t);
                if (test) {
                    axm0Var.onNext(t);
                }
                return test;
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
            io.reactivex.rxjava3.internal.fuseable.i<T> iVar = this.d;
            while (true) {
                T poll = iVar.poll();
                if (poll == null) {
                    return null;
                }
                if (this.g.test(poll)) {
                    return poll;
                }
                if (this.f == 2) {
                    iVar.request(1L);
                }
            }
        }
    }

    public r(io.reactivex.rxjava3.core.g<T> gVar, io.reactivex.rxjava3.functions.m<? super T> mVar) {
        super(gVar);
        this.d = mVar;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        boolean z = axm0Var instanceof io.reactivex.rxjava3.internal.fuseable.c;
        io.reactivex.rxjava3.functions.m<? super T> mVar = this.d;
        io.reactivex.rxjava3.core.g<T> gVar = this.c;
        if (z) {
            gVar.subscribe((io.reactivex.rxjava3.core.j) new a((io.reactivex.rxjava3.internal.fuseable.c) axm0Var, mVar));
        } else {
            gVar.subscribe((io.reactivex.rxjava3.core.j) new b(axm0Var, mVar));
        }
    }
}
