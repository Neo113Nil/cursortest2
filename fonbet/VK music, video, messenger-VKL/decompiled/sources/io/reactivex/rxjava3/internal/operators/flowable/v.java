package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import xsna.axm0;
import xsna.tgw;

/* compiled from: FlowableFromArray.java */
/* loaded from: classes8.dex */
public final class v<T> extends io.reactivex.rxjava3.core.g<T> {
    public final T[] c;

    /* compiled from: FlowableFromArray.java */
    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final io.reactivex.rxjava3.internal.fuseable.c<? super T> downstream;

        public a(io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar, T[] tArr) {
            super(tArr);
            this.downstream = cVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.v.c
        public final void d() {
            T[] tArr = this.array;
            int length = tArr.length;
            io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar = this.downstream;
            for (int i = this.index; i != length; i++) {
                if (this.cancelled) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    cVar.onError(new NullPointerException(tgw.b(i, "The element at index ", " is null")));
                    return;
                }
                cVar.c(t);
            }
            if (this.cancelled) {
                return;
            }
            cVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
        
            r10.index = r2;
            r11 = addAndGet(-r6);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.v.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void e(long j) {
            T[] tArr = this.array;
            int length = tArr.length;
            int i = this.index;
            io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i == length) {
                            if (this.cancelled) {
                                return;
                            }
                            cVar.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        T t = tArr[i];
                        if (t == null) {
                            cVar.onError(new NullPointerException(tgw.b(i, "The element at index ", " is null")));
                            return;
                        } else {
                            if (cVar.c(t)) {
                                j2++;
                            }
                            i++;
                        }
                    }
                }
            } while (j != 0);
        }
    }

    /* compiled from: FlowableFromArray.java */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final axm0<? super T> downstream;

        public b(axm0<? super T> axm0Var, T[] tArr) {
            super(tArr);
            this.downstream = axm0Var;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.v.c
        public final void d() {
            T[] tArr = this.array;
            int length = tArr.length;
            axm0<? super T> axm0Var = this.downstream;
            for (int i = this.index; i != length; i++) {
                if (this.cancelled) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    axm0Var.onError(new NullPointerException(tgw.b(i, "The element at index ", " is null")));
                    return;
                }
                axm0Var.onNext(t);
            }
            if (this.cancelled) {
                return;
            }
            axm0Var.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
        
            r10.index = r2;
            r11 = addAndGet(-r6);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.v.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void e(long j) {
            T[] tArr = this.array;
            int length = tArr.length;
            int i = this.index;
            axm0<? super T> axm0Var = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i == length) {
                            if (this.cancelled) {
                                return;
                            }
                            axm0Var.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        T t = tArr[i];
                        if (t == null) {
                            axm0Var.onError(new NullPointerException(tgw.b(i, "The element at index ", " is null")));
                            return;
                        } else {
                            axm0Var.onNext(t);
                            j2++;
                            i++;
                        }
                    }
                }
            } while (j != 0);
        }
    }

    /* compiled from: FlowableFromArray.java */
    public static abstract class c<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        final T[] array;
        volatile boolean cancelled;
        int index;

        public c(T[] tArr) {
            this.array = tArr;
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
            this.index = this.array.length;
        }

        public abstract void d();

        public abstract void e(long j);

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final boolean isEmpty() {
            return this.index == this.array.length;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() {
            int i = this.index;
            T[] tArr = this.array;
            if (i == tArr.length) {
                return null;
            }
            this.index = i + 1;
            T t = tArr[i];
            Objects.requireNonNull(t, "array element is null");
            return t;
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

    public v(T[] tArr) {
        this.c = tArr;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        boolean z = axm0Var instanceof io.reactivex.rxjava3.internal.fuseable.c;
        T[] tArr = this.c;
        if (z) {
            axm0Var.onSubscribe(new a((io.reactivex.rxjava3.internal.fuseable.c) axm0Var, tArr));
        } else {
            axm0Var.onSubscribe(new b(axm0Var, tArr));
        }
    }
}
