package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.internal.util.a;

/* compiled from: SerializedSubject.java */
/* loaded from: classes11.dex */
public final class h<T> extends j<T> implements a.InterfaceC2159a<Object> {
    public final j<T> b;
    public boolean c;
    public io.reactivex.rxjava3.internal.util.a<Object> d;
    public volatile boolean e;

    public h(j<T> jVar) {
        this.b = jVar;
    }

    public final void N0() {
        io.reactivex.rxjava3.internal.util.a<Object> aVar;
        while (true) {
            synchronized (this) {
                try {
                    aVar = this.d;
                    if (aVar == null) {
                        this.c = false;
                        return;
                    }
                    this.d = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            aVar.d(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                this.e = true;
                if (!this.c) {
                    this.c = true;
                    this.b.onComplete();
                    return;
                }
                io.reactivex.rxjava3.internal.util.a<Object> aVar = this.d;
                if (aVar == null) {
                    aVar = new io.reactivex.rxjava3.internal.util.a<>();
                    this.d = aVar;
                }
                aVar.c(NotificationLite.COMPLETE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        if (this.e) {
            io.reactivex.rxjava3.plugins.a.a(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.e) {
                    this.e = true;
                    if (this.c) {
                        io.reactivex.rxjava3.internal.util.a<Object> aVar = this.d;
                        if (aVar == null) {
                            aVar = new io.reactivex.rxjava3.internal.util.a<>();
                            this.d = aVar;
                        }
                        aVar.e(new NotificationLite.b(th));
                        return;
                    }
                    this.c = true;
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

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(T t) {
        if (this.e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (!this.c) {
                    this.c = true;
                    this.b.onNext(t);
                    N0();
                } else {
                    io.reactivex.rxjava3.internal.util.a<Object> aVar = this.d;
                    if (aVar == null) {
                        aVar = new io.reactivex.rxjava3.internal.util.a<>();
                        this.d = aVar;
                    }
                    aVar.c(t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        boolean z = true;
        if (!this.e) {
            synchronized (this) {
                try {
                    if (!this.e) {
                        if (this.c) {
                            io.reactivex.rxjava3.internal.util.a<Object> aVar = this.d;
                            if (aVar == null) {
                                aVar = new io.reactivex.rxjava3.internal.util.a<>();
                                this.d = aVar;
                            }
                            aVar.c(new NotificationLite.a(cVar));
                            return;
                        }
                        this.c = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            cVar.dispose();
        } else {
            this.b.onSubscribe(cVar);
            N0();
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(v<? super T> vVar) {
        this.b.subscribe(vVar);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public final boolean test(Object obj) {
        return NotificationLite.b(this.b, obj);
    }
}
