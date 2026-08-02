package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.j;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.internal.util.f;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: SerializedSubscriber.java */
/* loaded from: classes11.dex */
public final class a<T> implements j<T>, jxm0 {
    public final axm0<? super T> b;
    public jxm0 c;
    public boolean d;
    public io.reactivex.rxjava3.internal.util.a<Object> e;
    public volatile boolean f;

    public a(axm0<? super T> axm0Var) {
        this.b = axm0Var;
    }

    @Override // xsna.jxm0
    public final void cancel() {
        this.c.cancel();
    }

    @Override // xsna.axm0
    public final void onComplete() {
        if (this.f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f) {
                    return;
                }
                if (!this.d) {
                    this.f = true;
                    this.d = true;
                    this.b.onComplete();
                } else {
                    io.reactivex.rxjava3.internal.util.a<Object> aVar = this.e;
                    if (aVar == null) {
                        aVar = new io.reactivex.rxjava3.internal.util.a<>();
                        this.e = aVar;
                    }
                    aVar.c(NotificationLite.COMPLETE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.axm0
    public final void onError(Throwable th) {
        if (this.f) {
            io.reactivex.rxjava3.plugins.a.a(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f) {
                    if (this.d) {
                        this.f = true;
                        io.reactivex.rxjava3.internal.util.a<Object> aVar = this.e;
                        if (aVar == null) {
                            aVar = new io.reactivex.rxjava3.internal.util.a<>();
                            this.e = aVar;
                        }
                        aVar.e(new NotificationLite.b(th));
                        return;
                    }
                    this.f = true;
                    this.d = true;
                    z = false;
                }
                if (z) {
                    io.reactivex.rxjava3.plugins.a.a(th);
                } else {
                    this.b.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xsna.axm0
    public final void onNext(T t) {
        io.reactivex.rxjava3.internal.util.a<Object> aVar;
        if (this.f) {
            return;
        }
        if (t == null) {
            this.c.cancel();
            onError(f.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f) {
                    return;
                }
                if (this.d) {
                    io.reactivex.rxjava3.internal.util.a<Object> aVar2 = this.e;
                    if (aVar2 == null) {
                        aVar2 = new io.reactivex.rxjava3.internal.util.a<>();
                        this.e = aVar2;
                    }
                    aVar2.c(t);
                    return;
                }
                this.d = true;
                this.b.onNext(t);
                do {
                    synchronized (this) {
                        try {
                            aVar = this.e;
                            if (aVar == null) {
                                this.d = false;
                                return;
                            }
                            this.e = null;
                        } finally {
                        }
                    }
                } while (!aVar.b(this.b));
            } finally {
            }
        }
    }

    @Override // xsna.axm0
    public final void onSubscribe(jxm0 jxm0Var) {
        if (SubscriptionHelper.f(this.c, jxm0Var)) {
            this.c = jxm0Var;
            this.b.onSubscribe(this);
        }
    }

    @Override // xsna.jxm0
    public final void request(long j) {
        this.c.request(j);
    }
}
