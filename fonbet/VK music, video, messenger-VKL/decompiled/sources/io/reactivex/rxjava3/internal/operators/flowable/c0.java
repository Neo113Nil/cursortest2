package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;
import xsna.axm0;

/* compiled from: FlowableMap.java */
/* loaded from: classes11.dex */
public final class c0<T, U> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, U> {
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends U> d;

    /* compiled from: FlowableMap.java */
    /* loaded from: classes8.dex */
    public static final class a<T, U> extends io.reactivex.rxjava3.internal.subscribers.a<T, U> {
        public final io.reactivex.rxjava3.functions.l<? super T, ? extends U> g;

        public a(io.reactivex.rxjava3.internal.fuseable.c<? super U> cVar, io.reactivex.rxjava3.functions.l<? super T, ? extends U> lVar) {
            super(cVar);
            this.g = lVar;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public final boolean c(T t) {
            if (this.e) {
                return false;
            }
            try {
                U apply = this.g.apply(t);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                return this.b.c(apply);
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.e) {
                return;
            }
            int i = this.f;
            io.reactivex.rxjava3.core.j jVar = this.b;
            if (i != 0) {
                jVar.onNext(null);
                return;
            }
            try {
                U apply = this.g.apply(t);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                jVar.onNext(apply);
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final U poll() throws Throwable {
            T poll = this.d.poll();
            if (poll == null) {
                return null;
            }
            U apply = this.g.apply(poll);
            Objects.requireNonNull(apply, "The mapper function returned a null value.");
            return apply;
        }
    }

    /* compiled from: FlowableMap.java */
    public static final class b<T, U> extends io.reactivex.rxjava3.internal.subscribers.b<T, U> {
        public final io.reactivex.rxjava3.functions.l<? super T, ? extends U> g;

        public b(axm0<? super U> axm0Var, io.reactivex.rxjava3.functions.l<? super T, ? extends U> lVar) {
            super(axm0Var);
            this.g = lVar;
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.e) {
                return;
            }
            int i = this.f;
            axm0<? super R> axm0Var = this.b;
            if (i != 0) {
                axm0Var.onNext(null);
                return;
            }
            try {
                U apply = this.g.apply(t);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                axm0Var.onNext(apply);
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final U poll() throws Throwable {
            T poll = this.d.poll();
            if (poll == null) {
                return null;
            }
            U apply = this.g.apply(poll);
            Objects.requireNonNull(apply, "The mapper function returned a null value.");
            return apply;
        }
    }

    public c0(io.reactivex.rxjava3.core.g<T> gVar, io.reactivex.rxjava3.functions.l<? super T, ? extends U> lVar) {
        super(gVar);
        this.d = lVar;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super U> axm0Var) {
        boolean z = axm0Var instanceof io.reactivex.rxjava3.internal.fuseable.c;
        io.reactivex.rxjava3.functions.l<? super T, ? extends U> lVar = this.d;
        io.reactivex.rxjava3.core.g<T> gVar = this.c;
        if (z) {
            gVar.subscribe((io.reactivex.rxjava3.core.j) new a((io.reactivex.rxjava3.internal.fuseable.c) axm0Var, lVar));
        } else {
            gVar.subscribe((io.reactivex.rxjava3.core.j) new b(axm0Var, lVar));
        }
    }
}
