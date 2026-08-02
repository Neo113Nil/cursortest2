package io.reactivex.rxjava3.internal.subscriptions;

import defpackage.k0;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.internal.util.b;
import io.reactivex.rxjava3.plugins.a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.jxm0;

/* loaded from: classes8.dex */
public class SubscriptionArbiter extends AtomicInteger implements jxm0 {
    private static final long serialVersionUID = -2189523197179400958L;
    jxm0 actual;
    volatile boolean cancelled;
    long requested;
    protected boolean unbounded;
    final boolean cancelOnReplace = false;
    final AtomicReference<jxm0> missedSubscription = new AtomicReference<>();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicLong missedProduced = new AtomicLong();

    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        if (getAndIncrement() != 0) {
            return;
        }
        d();
    }

    public final void d() {
        int i = 1;
        long j = 0;
        jxm0 jxm0Var = null;
        do {
            jxm0 jxm0Var2 = this.missedSubscription.get();
            if (jxm0Var2 != null) {
                jxm0Var2 = this.missedSubscription.getAndSet(null);
            }
            long j2 = this.missedRequested.get();
            if (j2 != 0) {
                j2 = this.missedRequested.getAndSet(0L);
            }
            long j3 = this.missedProduced.get();
            if (j3 != 0) {
                j3 = this.missedProduced.getAndSet(0L);
            }
            jxm0 jxm0Var3 = this.actual;
            if (this.cancelled) {
                if (jxm0Var3 != null) {
                    jxm0Var3.cancel();
                    this.actual = null;
                }
                if (jxm0Var2 != null) {
                    jxm0Var2.cancel();
                }
            } else {
                long j4 = this.requested;
                if (j4 != Long.MAX_VALUE) {
                    j4 = b.b(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            a.a(new ProtocolViolationException(k0.a(j4, "More produced than requested: ")));
                            j4 = 0;
                        }
                    }
                    this.requested = j4;
                }
                if (jxm0Var2 != null) {
                    if (jxm0Var3 != null && this.cancelOnReplace) {
                        jxm0Var3.cancel();
                    }
                    this.actual = jxm0Var2;
                    if (j4 != 0) {
                        j = b.b(j, j4);
                        jxm0Var = jxm0Var2;
                    }
                } else if (jxm0Var3 != null && j2 != 0) {
                    j = b.b(j, j2);
                    jxm0Var = jxm0Var3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            jxm0Var.request(j);
        }
    }

    public final boolean g() {
        return this.cancelled;
    }

    public final boolean h() {
        return this.unbounded;
    }

    public final void i(long j) {
        if (this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            b.a(this.missedProduced, j);
            if (getAndIncrement() != 0) {
                return;
            }
            d();
            return;
        }
        long j2 = this.requested;
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 - j;
            if (j3 < 0) {
                a.a(new ProtocolViolationException(k0.a(j3, "More produced than requested: ")));
                j3 = 0;
            }
            this.requested = j3;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        d();
    }

    public final void j(jxm0 jxm0Var) {
        if (this.cancelled) {
            jxm0Var.cancel();
            return;
        }
        Objects.requireNonNull(jxm0Var, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            jxm0 andSet = this.missedSubscription.getAndSet(jxm0Var);
            if (andSet != null && this.cancelOnReplace) {
                andSet.cancel();
            }
            if (getAndIncrement() != 0) {
                return;
            }
            d();
            return;
        }
        jxm0 jxm0Var2 = this.actual;
        if (jxm0Var2 != null && this.cancelOnReplace) {
            jxm0Var2.cancel();
        }
        this.actual = jxm0Var;
        long j = this.requested;
        if (decrementAndGet() != 0) {
            d();
        }
        if (j != 0) {
            jxm0Var.request(j);
        }
    }

    public void onSubscribe(jxm0 jxm0Var) {
        j(jxm0Var);
    }

    @Override // xsna.jxm0
    public final void request(long j) {
        if (!SubscriptionHelper.e(j) || this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            b.a(this.missedRequested, j);
            if (getAndIncrement() != 0) {
                return;
            }
            d();
            return;
        }
        long j2 = this.requested;
        if (j2 != Long.MAX_VALUE) {
            long b = b.b(j2, j);
            this.requested = b;
            if (b == Long.MAX_VALUE) {
                this.unbounded = true;
            }
        }
        jxm0 jxm0Var = this.actual;
        if (decrementAndGet() != 0) {
            d();
        }
        if (jxm0Var != null) {
            jxm0Var.request(j);
        }
    }
}
