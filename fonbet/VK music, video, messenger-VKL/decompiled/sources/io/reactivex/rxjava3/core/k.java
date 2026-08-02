package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeCallbackObserver;
import io.reactivex.rxjava3.internal.operators.maybe.h0;
import io.reactivex.rxjava3.internal.operators.maybe.i0;
import io.reactivex.rxjava3.internal.operators.maybe.j0;
import io.reactivex.rxjava3.internal.operators.maybe.k0;
import io.reactivex.rxjava3.internal.operators.maybe.l0;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: Maybe.java */
/* loaded from: classes8.dex */
public abstract class k<T> implements o<T> {
    public static io.reactivex.rxjava3.internal.operators.maybe.c e(n nVar) {
        return new io.reactivex.rxjava3.internal.operators.maybe.c(nVar);
    }

    public static io.reactivex.rxjava3.internal.operators.maybe.t i(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new io.reactivex.rxjava3.internal.operators.maybe.t(obj);
    }

    public static i0 p(long j, TimeUnit timeUnit, w wVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(wVar, "scheduler is null");
        return new i0(Math.max(0L, j), timeUnit, wVar);
    }

    public final T c() {
        io.reactivex.rxjava3.internal.observers.d dVar = new io.reactivex.rxjava3.internal.observers.d(1);
        subscribe(dVar);
        return (T) dVar.b();
    }

    public final io.reactivex.rxjava3.internal.operators.maybe.b d(k kVar) {
        return new io.reactivex.rxjava3.internal.operators.maybe.b(new o[]{this, kVar});
    }

    public final io.reactivex.rxjava3.internal.operators.maybe.b0 f(io.reactivex.rxjava3.functions.f fVar) {
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.maybe.b0(this, lVar, lVar, fVar, kVar, kVar);
    }

    public final io.reactivex.rxjava3.internal.operators.maybe.b0 g(io.reactivex.rxjava3.functions.f fVar) {
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.maybe.b0(this, lVar, fVar, lVar, kVar, kVar);
    }

    public final <R> q<R> h(io.reactivex.rxjava3.functions.l<? super T, ? extends t<? extends R>> lVar) {
        return new io.reactivex.rxjava3.internal.operators.mixed.f(this, lVar);
    }

    public final io.reactivex.rxjava3.internal.operators.maybe.u j(io.reactivex.rxjava3.functions.l lVar) {
        return new io.reactivex.rxjava3.internal.operators.maybe.u(this, lVar);
    }

    public final io.reactivex.rxjava3.internal.operators.maybe.x k(w wVar) {
        Objects.requireNonNull(wVar, "scheduler is null");
        return new io.reactivex.rxjava3.internal.operators.maybe.x(this, wVar);
    }

    public final io.reactivex.rxjava3.internal.operators.maybe.z l(o oVar) {
        Objects.requireNonNull(oVar, "fallback is null");
        return new io.reactivex.rxjava3.internal.operators.maybe.z(this, new a.r(oVar));
    }

    public abstract void m(m<? super T> mVar);

    public final io.reactivex.rxjava3.internal.operators.maybe.c0 n(w wVar) {
        Objects.requireNonNull(wVar, "scheduler is null");
        return new io.reactivex.rxjava3.internal.operators.maybe.c0(this, wVar);
    }

    public final h0 o(long j, TimeUnit timeUnit) {
        return new h0(this, p(j, timeUnit, io.reactivex.rxjava3.schedulers.a.a()), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g<T> q() {
        return this instanceof io.reactivex.rxjava3.internal.fuseable.d ? ((io.reactivex.rxjava3.internal.fuseable.d) this).a() : new j0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q<T> r() {
        return this instanceof io.reactivex.rxjava3.internal.fuseable.f ? ((io.reactivex.rxjava3.internal.fuseable.f) this).b() : new k0(this);
    }

    public final x<T> s() {
        return new l0(this, null);
    }

    public final io.reactivex.rxjava3.disposables.c subscribe() {
        return subscribe(io.reactivex.rxjava3.internal.functions.a.d, io.reactivex.rxjava3.internal.functions.a.f, io.reactivex.rxjava3.internal.functions.a.c);
    }

    public final io.reactivex.rxjava3.disposables.c subscribe(io.reactivex.rxjava3.functions.f<? super T> fVar) {
        return subscribe(fVar, io.reactivex.rxjava3.internal.functions.a.f, io.reactivex.rxjava3.internal.functions.a.c);
    }

    public final io.reactivex.rxjava3.disposables.c subscribe(io.reactivex.rxjava3.functions.f<? super T> fVar, io.reactivex.rxjava3.functions.f<? super Throwable> fVar2) {
        return subscribe(fVar, fVar2, io.reactivex.rxjava3.internal.functions.a.c);
    }

    public final io.reactivex.rxjava3.disposables.c subscribe(io.reactivex.rxjava3.functions.f<? super T> fVar, io.reactivex.rxjava3.functions.f<? super Throwable> fVar2, io.reactivex.rxjava3.functions.a aVar) {
        Objects.requireNonNull(fVar, "onSuccess is null");
        Objects.requireNonNull(fVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        MaybeCallbackObserver maybeCallbackObserver = new MaybeCallbackObserver(fVar, fVar2, aVar);
        subscribe(maybeCallbackObserver);
        return maybeCallbackObserver;
    }

    @Override // io.reactivex.rxjava3.core.o
    public final void subscribe(m<? super T> mVar) {
        Objects.requireNonNull(mVar, "observer is null");
        rxdogtag2.l0 l0Var = io.reactivex.rxjava3.plugins.a.f;
        if (l0Var != null) {
            try {
                mVar = (m) l0Var.apply(this, mVar);
            } catch (Throwable th) {
                throw io.reactivex.rxjava3.internal.util.f.f(th);
            }
        }
        Objects.requireNonNull(mVar, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            m(mVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }
}
