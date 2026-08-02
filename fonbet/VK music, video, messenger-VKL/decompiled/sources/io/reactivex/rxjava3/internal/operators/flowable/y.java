package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.Objects;
import xsna.axm0;

/* compiled from: FlowableFromIterable.java */
/* loaded from: classes8.dex */
public final class y<T> extends io.reactivex.rxjava3.core.g<T> {
    public final Iterable<? extends T> c;

    /* compiled from: FlowableFromIterable.java */
    public static abstract class a<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        Iterator<? extends T> iterator;
        boolean once;

        public a(Iterator<? extends T> it) {
            this.iterator = it;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.h
        public final int a(int i) {
            return 1;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final void clear() {
            this.iterator = null;
        }

        public abstract void d();

        public abstract void e(long j);

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.iterator;
            if (it == null) {
                return true;
            }
            if (!this.once || it.hasNext()) {
                return false;
            }
            this.iterator = null;
            return true;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() {
            Iterator<? extends T> it = this.iterator;
            if (it == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!it.hasNext()) {
                return null;
            }
            T next = this.iterator.next();
            Objects.requireNonNull(next, "Iterator.next() returned a null value");
            return next;
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (SubscriptionHelper.e(j) && io.reactivex.rxjava3.internal.util.b.a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    d();
                } else {
                    e(j);
                }
            }
        }
    }

    /* compiled from: FlowableFromIterable.java */
    public static final class b<T> extends a<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final io.reactivex.rxjava3.internal.fuseable.c<? super T> downstream;

        public b(io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar, Iterator<? extends T> it) {
            super(it);
            this.downstream = cVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.y.a
        public final void d() {
            Iterator<? extends T> it = this.iterator;
            io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar = this.downstream;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    if (this.cancelled) {
                        return;
                    }
                    if (next == null) {
                        cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    cVar.c(next);
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.cancelled) {
                                return;
                            }
                            cVar.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.a.b(th);
                        cVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.b(th2);
                    cVar.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.y.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void e(long j) {
            Iterator<? extends T> it = this.iterator;
            io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.cancelled) {
                                return;
                            }
                            if (next == null) {
                                cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean c = cVar.c(next);
                            if (this.cancelled) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.cancelled) {
                                        return;
                                    }
                                    cVar.onComplete();
                                    return;
                                } else if (c) {
                                    j2++;
                                }
                            } catch (Throwable th) {
                                io.reactivex.rxjava3.exceptions.a.b(th);
                                cVar.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            io.reactivex.rxjava3.exceptions.a.b(th2);
                            cVar.onError(th2);
                            return;
                        }
                    }
                }
            } while (j != 0);
        }
    }

    /* compiled from: FlowableFromIterable.java */
    public static final class c<T> extends a<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final axm0<? super T> downstream;

        public c(axm0<? super T> axm0Var, Iterator<? extends T> it) {
            super(it);
            this.downstream = axm0Var;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.y.a
        public final void d() {
            Iterator<? extends T> it = this.iterator;
            axm0<? super T> axm0Var = this.downstream;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    if (this.cancelled) {
                        return;
                    }
                    if (next == null) {
                        axm0Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    axm0Var.onNext(next);
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.cancelled) {
                                return;
                            }
                            axm0Var.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.a.b(th);
                        axm0Var.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.b(th2);
                    axm0Var.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0058, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.y.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void e(long j) {
            Iterator<? extends T> it = this.iterator;
            axm0<? super T> axm0Var = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.cancelled) {
                                return;
                            }
                            if (next == null) {
                                axm0Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            axm0Var.onNext(next);
                            if (this.cancelled) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.cancelled) {
                                        return;
                                    }
                                    axm0Var.onComplete();
                                    return;
                                }
                                j2++;
                            } catch (Throwable th) {
                                io.reactivex.rxjava3.exceptions.a.b(th);
                                axm0Var.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            io.reactivex.rxjava3.exceptions.a.b(th2);
                            axm0Var.onError(th2);
                            return;
                        }
                    }
                }
            } while (j != 0);
        }
    }

    public y(Iterable<? extends T> iterable) {
        this.c = iterable;
    }

    public static <T> void subscribe(axm0<? super T> axm0Var, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                EmptySubscription.b(axm0Var);
            } else if (axm0Var instanceof io.reactivex.rxjava3.internal.fuseable.c) {
                axm0Var.onSubscribe(new b((io.reactivex.rxjava3.internal.fuseable.c) axm0Var, it));
            } else {
                axm0Var.onSubscribe(new c(axm0Var, it));
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            EmptySubscription.c(th, axm0Var);
        }
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        try {
            subscribe(axm0Var, this.c.iterator());
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            axm0Var.onSubscribe(EmptySubscription.INSTANCE);
            axm0Var.onError(th);
        }
    }
}
