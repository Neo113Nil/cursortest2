package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.j;
import io.reactivex.rxjava3.internal.fuseable.i;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: BasicFuseableSubscriber.java */
/* loaded from: classes11.dex */
public abstract class b<T, R> implements j<T>, i<R> {
    public final axm0<? super R> b;
    public jxm0 c;
    public i<T> d;
    public boolean e;
    public int f;

    public b(axm0<? super R> axm0Var) {
        this.b = axm0Var;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.h
    public int a(int i) {
        i<T> iVar = this.d;
        if (iVar == null || (i & 4) != 0) {
            return 0;
        }
        int a = iVar.a(i);
        if (a == 0) {
            return a;
        }
        this.f = a;
        return a;
    }

    public final void b(Throwable th) {
        io.reactivex.rxjava3.exceptions.a.b(th);
        this.c.cancel();
        onError(th);
    }

    @Override // xsna.jxm0
    public final void cancel() {
        this.c.cancel();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final void clear() {
        this.d.clear();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // xsna.axm0
    public void onComplete() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.b.onComplete();
    }

    @Override // xsna.axm0
    public void onError(Throwable th) {
        if (this.e) {
            io.reactivex.rxjava3.plugins.a.a(th);
        } else {
            this.e = true;
            this.b.onError(th);
        }
    }

    @Override // xsna.axm0
    public final void onSubscribe(jxm0 jxm0Var) {
        if (SubscriptionHelper.f(this.c, jxm0Var)) {
            this.c = jxm0Var;
            if (jxm0Var instanceof i) {
                this.d = (i) jxm0Var;
            }
            this.b.onSubscribe(this);
        }
    }

    @Override // xsna.jxm0
    public final void request(long j) {
        this.c.request(j);
    }
}
