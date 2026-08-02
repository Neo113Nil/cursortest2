package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.util.f;
import xsna.axm0;

/* compiled from: FlowableDoOnEach.java */
/* loaded from: classes8.dex */
public final class m<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final io.reactivex.rxjava3.functions.f<? super T> d;
    public final io.reactivex.rxjava3.functions.f<? super Throwable> e;
    public final a.k f;
    public final a.k g;

    /* compiled from: FlowableDoOnEach.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.a<T, T> {
        public final io.reactivex.rxjava3.functions.f<? super T> g;
        public final io.reactivex.rxjava3.functions.f<? super Throwable> h;
        public final io.reactivex.rxjava3.functions.a i;
        public final io.reactivex.rxjava3.functions.a j;

        public a(io.reactivex.rxjava3.internal.fuseable.c cVar, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.f fVar2, a.k kVar, a.k kVar2) {
            super(cVar);
            this.g = fVar;
            this.h = fVar2;
            this.i = kVar;
            this.j = kVar2;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public final boolean c(T t) {
            if (this.e) {
                return false;
            }
            try {
                this.g.accept(t);
                return this.b.c(t);
            } catch (Throwable th) {
                b(th);
                return false;
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.a, xsna.axm0
        public final void onComplete() {
            if (this.e) {
                return;
            }
            try {
                this.i.run();
                this.e = true;
                this.b.onComplete();
                try {
                    this.j.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    io.reactivex.rxjava3.plugins.a.a(th);
                }
            } catch (Throwable th2) {
                b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.a, xsna.axm0
        public final void onError(Throwable th) {
            io.reactivex.rxjava3.core.j jVar = this.b;
            if (this.e) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.e = true;
            try {
                this.h.accept(th);
                jVar.onError(th);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                jVar.onError(new CompositeException(th, th2));
            }
            try {
                this.j.run();
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.b(th3);
                io.reactivex.rxjava3.plugins.a.a(th3);
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
                this.g.accept(t);
                jVar.onNext(t);
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() throws Throwable {
            CompositeException compositeException;
            io.reactivex.rxjava3.functions.f<? super Throwable> fVar = this.h;
            try {
                T poll = this.d.poll();
                io.reactivex.rxjava3.functions.a aVar = this.j;
                if (poll == null) {
                    if (this.f == 1) {
                        this.i.run();
                        aVar.run();
                    }
                    return poll;
                }
                try {
                    this.g.accept(poll);
                    aVar.run();
                    return poll;
                } catch (Throwable th) {
                    try {
                        io.reactivex.rxjava3.exceptions.a.b(th);
                        try {
                            fVar.accept(th);
                            f.a aVar2 = io.reactivex.rxjava3.internal.util.f.a;
                            if (th instanceof Exception) {
                                throw th;
                            }
                            throw th;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        aVar.run();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.b(th3);
                try {
                    fVar.accept(th3);
                    f.a aVar3 = io.reactivex.rxjava3.internal.util.f.a;
                    if (th3 instanceof Exception) {
                        throw th3;
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    /* compiled from: FlowableDoOnEach.java */
    public static final class b<T> extends io.reactivex.rxjava3.internal.subscribers.b<T, T> {
        public final io.reactivex.rxjava3.functions.f<? super T> g;
        public final io.reactivex.rxjava3.functions.f<? super Throwable> h;
        public final io.reactivex.rxjava3.functions.a i;
        public final io.reactivex.rxjava3.functions.a j;

        public b(axm0 axm0Var, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.f fVar2, a.k kVar, a.k kVar2) {
            super(axm0Var);
            this.g = fVar;
            this.h = fVar2;
            this.i = kVar;
            this.j = kVar2;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, xsna.axm0
        public final void onComplete() {
            if (this.e) {
                return;
            }
            try {
                this.i.run();
                this.e = true;
                this.b.onComplete();
                try {
                    this.j.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    io.reactivex.rxjava3.plugins.a.a(th);
                }
            } catch (Throwable th2) {
                b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, xsna.axm0
        public final void onError(Throwable th) {
            axm0<? super R> axm0Var = this.b;
            if (this.e) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.e = true;
            try {
                this.h.accept(th);
                axm0Var.onError(th);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                axm0Var.onError(new CompositeException(th, th2));
            }
            try {
                this.j.run();
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.b(th3);
                io.reactivex.rxjava3.plugins.a.a(th3);
            }
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
                this.g.accept(t);
                axm0Var.onNext(t);
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() throws Throwable {
            CompositeException compositeException;
            io.reactivex.rxjava3.functions.f<? super Throwable> fVar = this.h;
            try {
                T poll = this.d.poll();
                io.reactivex.rxjava3.functions.a aVar = this.j;
                if (poll == null) {
                    if (this.f == 1) {
                        this.i.run();
                        aVar.run();
                    }
                    return poll;
                }
                try {
                    this.g.accept(poll);
                    aVar.run();
                    return poll;
                } catch (Throwable th) {
                    try {
                        io.reactivex.rxjava3.exceptions.a.b(th);
                        try {
                            fVar.accept(th);
                            f.a aVar2 = io.reactivex.rxjava3.internal.util.f.a;
                            if (th instanceof Exception) {
                                throw th;
                            }
                            throw th;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        aVar.run();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.b(th3);
                try {
                    fVar.accept(th3);
                    f.a aVar3 = io.reactivex.rxjava3.internal.util.f.a;
                    if (th3 instanceof Exception) {
                        throw th3;
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    public m(io.reactivex.rxjava3.core.g gVar, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.f fVar2) {
        super(gVar);
        this.d = fVar;
        this.e = fVar2;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.f = kVar;
        this.g = kVar;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        boolean z = axm0Var instanceof io.reactivex.rxjava3.internal.fuseable.c;
        io.reactivex.rxjava3.core.g<T> gVar = this.c;
        if (z) {
            gVar.subscribe((io.reactivex.rxjava3.core.j) new a((io.reactivex.rxjava3.internal.fuseable.c) axm0Var, this.d, this.e, this.f, this.g));
        } else {
            gVar.subscribe((io.reactivex.rxjava3.core.j) new b(axm0Var, this.d, this.e, this.f, this.g));
        }
    }
}
