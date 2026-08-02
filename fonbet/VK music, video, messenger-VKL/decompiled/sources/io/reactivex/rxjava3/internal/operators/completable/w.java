package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: CompletablePeek.java */
/* loaded from: classes11.dex */
public final class w extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.core.a b;
    public final io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.disposables.c> c;
    public final io.reactivex.rxjava3.functions.f<? super Throwable> d;
    public final io.reactivex.rxjava3.functions.a e;
    public final io.reactivex.rxjava3.functions.a f;
    public final io.reactivex.rxjava3.functions.a g;
    public final io.reactivex.rxjava3.functions.a h;

    /* compiled from: CompletablePeek.java */
    public final class a implements io.reactivex.rxjava3.core.c, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.c b;
        public io.reactivex.rxjava3.disposables.c c;

        public a(io.reactivex.rxjava3.core.c cVar) {
            this.b = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            try {
                w.this.h.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                io.reactivex.rxjava3.plugins.a.a(th);
            }
            this.c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.c.h();
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onComplete() {
            io.reactivex.rxjava3.core.c cVar = this.b;
            w wVar = w.this;
            if (this.c == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                wVar.e.run();
                wVar.f.run();
                cVar.onComplete();
                try {
                    wVar.g.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    io.reactivex.rxjava3.plugins.a.a(th);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                cVar.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onError(Throwable th) {
            w wVar = w.this;
            if (this.c == DisposableHelper.DISPOSED) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            try {
                wVar.d.accept(th);
                wVar.f.run();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                th = new CompositeException(th, th2);
            }
            this.b.onError(th);
            try {
                wVar.g.run();
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.b(th3);
                io.reactivex.rxjava3.plugins.a.a(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            io.reactivex.rxjava3.core.c cVar2 = this.b;
            try {
                w.this.c.accept(cVar);
                if (DisposableHelper.f(this.c, cVar)) {
                    this.c = cVar;
                    cVar2.onSubscribe(this);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                cVar.dispose();
                this.c = DisposableHelper.DISPOSED;
                cVar2.onSubscribe(EmptyDisposable.INSTANCE);
                cVar2.onError(th);
            }
        }
    }

    public w(io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.f fVar2, io.reactivex.rxjava3.functions.a aVar2, io.reactivex.rxjava3.functions.a aVar3, io.reactivex.rxjava3.functions.a aVar4, io.reactivex.rxjava3.functions.a aVar5) {
        this.b = aVar;
        this.c = fVar;
        this.d = fVar2;
        this.e = aVar2;
        this.f = aVar3;
        this.g = aVar4;
        this.h = aVar5;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        this.b.subscribe(new a(cVar));
    }
}
