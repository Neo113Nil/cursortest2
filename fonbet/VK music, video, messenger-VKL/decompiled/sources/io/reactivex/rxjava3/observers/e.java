package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.internal.util.f;

/* compiled from: SerializedObserver.java */
/* loaded from: classes11.dex */
public final class e<T> implements v<T>, io.reactivex.rxjava3.disposables.c {
    public final v<? super T> b;
    public io.reactivex.rxjava3.disposables.c c;
    public boolean d;
    public io.reactivex.rxjava3.internal.util.a<Object> e;
    public volatile boolean f;

    public e(v<? super T> vVar) {
        this.b = vVar;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        this.f = true;
        this.c.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.c.h();
    }

    @Override // io.reactivex.rxjava3.core.v
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

    @Override // io.reactivex.rxjava3.core.v
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

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(T t) {
        io.reactivex.rxjava3.internal.util.a<Object> aVar;
        if (this.f) {
            return;
        }
        if (t == null) {
            this.c.dispose();
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
                } while (!aVar.a(this.b));
            } finally {
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        if (DisposableHelper.f(this.c, cVar)) {
            this.c = cVar;
            this.b.onSubscribe(this);
        }
    }
}
