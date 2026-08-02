package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: BasicFuseableObserver.java */
/* loaded from: classes11.dex */
public abstract class a<T, R> implements v<T>, io.reactivex.rxjava3.internal.fuseable.g<R> {
    public final v<? super R> b;
    public io.reactivex.rxjava3.disposables.c c;
    public io.reactivex.rxjava3.internal.fuseable.g<T> d;
    public boolean e;
    public int f;

    public a(v<? super R> vVar) {
        this.b = vVar;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.h
    public int a(int i) {
        io.reactivex.rxjava3.internal.fuseable.g<T> gVar = this.d;
        if (gVar == null || (i & 4) != 0) {
            return 0;
        }
        int a = gVar.a(i);
        if (a == 0) {
            return a;
        }
        this.f = a;
        return a;
    }

    public final void b(Throwable th) {
        io.reactivex.rxjava3.exceptions.a.b(th);
        this.c.dispose();
        onError(th);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public void clear() {
        this.d.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        this.c.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.c.h();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.core.v
    public void onComplete() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.b.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.v
    public void onError(Throwable th) {
        if (this.e) {
            io.reactivex.rxjava3.plugins.a.a(th);
        } else {
            this.e = true;
            this.b.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        if (DisposableHelper.f(this.c, cVar)) {
            this.c = cVar;
            if (cVar instanceof io.reactivex.rxjava3.internal.fuseable.g) {
                this.d = (io.reactivex.rxjava3.internal.fuseable.g) cVar;
            }
            this.b.onSubscribe(this);
        }
    }
}
