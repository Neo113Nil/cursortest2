package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.internal.util.NotificationLite;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: SerializedProcessor.java */
/* loaded from: classes8.dex */
public final class d<T> extends a<T> {
    public final e c;
    public boolean d;
    public io.reactivex.rxjava3.internal.util.a<Object> e;
    public volatile boolean f;

    public d(e eVar) {
        this.c = eVar;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        this.c.subscribe(axm0Var);
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
                this.f = true;
                if (!this.d) {
                    this.d = true;
                    this.c.onComplete();
                    return;
                }
                io.reactivex.rxjava3.internal.util.a<Object> aVar = this.e;
                if (aVar == null) {
                    aVar = new io.reactivex.rxjava3.internal.util.a<>();
                    this.e = aVar;
                }
                aVar.c(NotificationLite.COMPLETE);
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
                    this.f = true;
                    if (this.d) {
                        io.reactivex.rxjava3.internal.util.a<Object> aVar = this.e;
                        if (aVar == null) {
                            aVar = new io.reactivex.rxjava3.internal.util.a<>();
                            this.e = aVar;
                        }
                        aVar.e(new NotificationLite.b(th));
                        return;
                    }
                    this.d = true;
                    z = false;
                }
                if (z) {
                    io.reactivex.rxjava3.plugins.a.a(th);
                } else {
                    this.c.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xsna.axm0
    public final void onNext(T t) {
        if (this.f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f) {
                    return;
                }
                if (!this.d) {
                    this.d = true;
                    this.c.onNext(t);
                    q();
                } else {
                    io.reactivex.rxjava3.internal.util.a<Object> aVar = this.e;
                    if (aVar == null) {
                        aVar = new io.reactivex.rxjava3.internal.util.a<>();
                        this.e = aVar;
                    }
                    aVar.c(t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.axm0
    public final void onSubscribe(jxm0 jxm0Var) {
        boolean z = true;
        if (!this.f) {
            synchronized (this) {
                try {
                    if (!this.f) {
                        if (this.d) {
                            io.reactivex.rxjava3.internal.util.a<Object> aVar = this.e;
                            if (aVar == null) {
                                aVar = new io.reactivex.rxjava3.internal.util.a<>();
                                this.e = aVar;
                            }
                            aVar.c(new NotificationLite.c(jxm0Var));
                            return;
                        }
                        this.d = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            jxm0Var.cancel();
        } else {
            this.c.onSubscribe(jxm0Var);
            q();
        }
    }

    public final void q() {
        io.reactivex.rxjava3.internal.util.a<Object> aVar;
        while (true) {
            synchronized (this) {
                try {
                    aVar = this.e;
                    if (aVar == null) {
                        this.d = false;
                        return;
                    }
                    this.e = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            aVar.b(this.c);
        }
    }
}
