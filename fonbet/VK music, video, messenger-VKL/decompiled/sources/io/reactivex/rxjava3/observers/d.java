package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.f;

/* compiled from: SafeObserver.java */
/* loaded from: classes8.dex */
public final class d<T> implements v<T>, io.reactivex.rxjava3.disposables.c {
    public final io.reactivex.rxjava3.subjects.d b;
    public io.reactivex.rxjava3.disposables.c c;
    public boolean d;

    public d(io.reactivex.rxjava3.subjects.d dVar) {
        this.b = dVar;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        this.c.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.c.h();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        io.reactivex.rxjava3.disposables.c cVar = this.c;
        io.reactivex.rxjava3.subjects.d dVar = this.b;
        if (cVar != null) {
            try {
                dVar.onComplete();
                return;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            dVar.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                dVar.onError(nullPointerException);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                io.reactivex.rxjava3.plugins.a.a(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.b(th3);
            io.reactivex.rxjava3.plugins.a.a(new CompositeException(nullPointerException, th3));
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        if (this.d) {
            io.reactivex.rxjava3.plugins.a.a(th);
            return;
        }
        this.d = true;
        io.reactivex.rxjava3.disposables.c cVar = this.c;
        io.reactivex.rxjava3.subjects.d dVar = this.b;
        if (cVar != null) {
            if (th == null) {
                th = f.b("onError called with a null Throwable.");
            }
            try {
                dVar.onError(th);
                return;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                io.reactivex.rxjava3.plugins.a.a(new CompositeException(th, th2));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            dVar.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                dVar.onError(new CompositeException(th, nullPointerException));
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.b(th3);
                io.reactivex.rxjava3.plugins.a.a(new CompositeException(th, nullPointerException, th3));
            }
        } catch (Throwable th4) {
            io.reactivex.rxjava3.exceptions.a.b(th4);
            io.reactivex.rxjava3.plugins.a.a(new CompositeException(th, nullPointerException, th4));
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(T t) {
        if (this.d) {
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.c;
        io.reactivex.rxjava3.subjects.d dVar = this.b;
        if (cVar == null) {
            this.d = true;
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                dVar.onSubscribe(EmptyDisposable.INSTANCE);
                try {
                    dVar.onError(nullPointerException);
                    return;
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    io.reactivex.rxjava3.plugins.a.a(new CompositeException(nullPointerException, th));
                    return;
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                io.reactivex.rxjava3.plugins.a.a(new CompositeException(nullPointerException, th2));
                return;
            }
        }
        if (t == null) {
            NullPointerException b = f.b("onNext called with a null value.");
            try {
                this.c.dispose();
                onError(b);
                return;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.b(th3);
                onError(new CompositeException(b, th3));
                return;
            }
        }
        try {
            dVar.onNext(t);
        } catch (Throwable th4) {
            io.reactivex.rxjava3.exceptions.a.b(th4);
            try {
                this.c.dispose();
                onError(th4);
            } catch (Throwable th5) {
                io.reactivex.rxjava3.exceptions.a.b(th5);
                onError(new CompositeException(th4, th5));
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        if (DisposableHelper.f(this.c, cVar)) {
            this.c = cVar;
            try {
                this.b.onSubscribe(this);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.d = true;
                try {
                    cVar.dispose();
                    io.reactivex.rxjava3.plugins.a.a(th);
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.b(th2);
                    io.reactivex.rxjava3.plugins.a.a(new CompositeException(th, th2));
                }
            }
        }
    }
}
