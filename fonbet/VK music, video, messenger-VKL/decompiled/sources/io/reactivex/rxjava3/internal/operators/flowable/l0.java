package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import xsna.axm0;

/* compiled from: FlowableRange.java */
/* loaded from: classes8.dex */
public final class l0 extends io.reactivex.rxjava3.core.g<Integer> {
    public final int c = 1;
    public final int d = Integer.MIN_VALUE;

    /* compiled from: FlowableRange.java */
    public static abstract class a extends BasicQueueSubscription<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final int end;
        int index;

        public a(int i, int i2) {
            this.index = i;
            this.end = i2;
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
            this.index = this.end;
        }

        public abstract void d();

        public abstract void e(long j);

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final Object poll() throws Throwable {
            int i = this.index;
            if (i == this.end) {
                return null;
            }
            this.index = i + 1;
            return Integer.valueOf(i);
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

    /* compiled from: FlowableRange.java */
    public static final class b extends a {
        private static final long serialVersionUID = 2587302975077663557L;
        final io.reactivex.rxjava3.internal.fuseable.c<? super Integer> downstream;

        public b(io.reactivex.rxjava3.internal.fuseable.c<? super Integer> cVar, int i, int i2) {
            super(i, i2);
            this.downstream = cVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.l0.a
        public final void d() {
            int i = this.end;
            io.reactivex.rxjava3.internal.fuseable.c<? super Integer> cVar = this.downstream;
            for (int i2 = this.index; i2 != i; i2++) {
                if (this.cancelled) {
                    return;
                }
                cVar.c(Integer.valueOf(i2));
            }
            if (this.cancelled) {
                return;
            }
            cVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        
            r9.index = r1;
            r10 = addAndGet(-r5);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.l0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void e(long j) {
            int i = this.end;
            int i2 = this.index;
            io.reactivex.rxjava3.internal.fuseable.c<? super Integer> cVar = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == i) {
                        if (i2 == i) {
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
                        if (cVar.c(Integer.valueOf(i2))) {
                            j2++;
                        }
                        i2++;
                    }
                }
            } while (j != 0);
        }
    }

    /* compiled from: FlowableRange.java */
    public static final class c extends a {
        private static final long serialVersionUID = 2587302975077663557L;
        final axm0<? super Integer> downstream;

        public c(axm0<? super Integer> axm0Var, int i, int i2) {
            super(i, i2);
            this.downstream = axm0Var;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.l0.a
        public final void d() {
            int i = this.end;
            axm0<? super Integer> axm0Var = this.downstream;
            for (int i2 = this.index; i2 != i; i2++) {
                if (this.cancelled) {
                    return;
                }
                axm0Var.onNext(Integer.valueOf(i2));
            }
            if (this.cancelled) {
                return;
            }
            axm0Var.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        
            r9.index = r1;
            r10 = addAndGet(-r5);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.l0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void e(long j) {
            int i = this.end;
            int i2 = this.index;
            axm0<? super Integer> axm0Var = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == i) {
                        if (i2 == i) {
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
                        axm0Var.onNext(Integer.valueOf(i2));
                        j2++;
                        i2++;
                    }
                }
            } while (j != 0);
        }
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super Integer> axm0Var) {
        boolean z = axm0Var instanceof io.reactivex.rxjava3.internal.fuseable.c;
        int i = this.d;
        int i2 = this.c;
        if (z) {
            axm0Var.onSubscribe(new b((io.reactivex.rxjava3.internal.fuseable.c) axm0Var, i2, i));
        } else {
            axm0Var.onSubscribe(new c(axm0Var, i2, i));
        }
    }
}
