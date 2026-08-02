package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.observers.CallbackCompletableObserver;
import io.reactivex.rxjava3.internal.observers.EmptyCompletableObserver;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import rxdogtag2.m0;
import xsna.fb20;

/* compiled from: Completable.java */
/* loaded from: classes11.dex */
public abstract class a implements e {
    public static io.reactivex.rxjava3.internal.operators.completable.j k(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return new io.reactivex.rxjava3.internal.operators.completable.j(th);
    }

    public static io.reactivex.rxjava3.internal.operators.completable.l l(io.reactivex.rxjava3.functions.a aVar) {
        Objects.requireNonNull(aVar, "action is null");
        return new io.reactivex.rxjava3.internal.operators.completable.l(aVar);
    }

    public static io.reactivex.rxjava3.internal.operators.completable.s m(Iterable iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return new io.reactivex.rxjava3.internal.operators.completable.s(iterable);
    }

    @SafeVarargs
    public static a n(e... eVarArr) {
        Objects.requireNonNull(eVarArr, "sources is null");
        if (eVarArr.length == 0) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        if (eVarArr.length != 1) {
            return new io.reactivex.rxjava3.internal.operators.completable.r(eVarArr);
        }
        e eVar = eVarArr[0];
        Objects.requireNonNull(eVar, "source is null");
        return eVar instanceof a ? (a) eVar : new io.reactivex.rxjava3.internal.operators.completable.q(eVar);
    }

    public static io.reactivex.rxjava3.internal.operators.completable.a0 r(long j, TimeUnit timeUnit) {
        return s(j, timeUnit, io.reactivex.rxjava3.schedulers.a.a());
    }

    public static io.reactivex.rxjava3.internal.operators.completable.a0 s(long j, TimeUnit timeUnit, w wVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(wVar, "scheduler is null");
        return new io.reactivex.rxjava3.internal.operators.completable.a0(j, timeUnit, wVar);
    }

    public final io.reactivex.rxjava3.internal.operators.completable.b c(a aVar) {
        Objects.requireNonNull(aVar, "next is null");
        return new io.reactivex.rxjava3.internal.operators.completable.b(this, aVar);
    }

    public final io.reactivex.rxjava3.internal.operators.mixed.a d(q qVar) {
        Objects.requireNonNull(qVar, "next is null");
        return new io.reactivex.rxjava3.internal.operators.mixed.a(this, qVar);
    }

    public final io.reactivex.rxjava3.internal.operators.single.e e(x xVar) {
        Objects.requireNonNull(xVar, "next is null");
        return new io.reactivex.rxjava3.internal.operators.single.e(xVar, this);
    }

    public final io.reactivex.rxjava3.internal.operators.completable.g f(long j, TimeUnit timeUnit) {
        return new io.reactivex.rxjava3.internal.operators.completable.g(this, j, timeUnit, fb20.b(timeUnit, "unit is null", "scheduler is null"));
    }

    public final io.reactivex.rxjava3.internal.operators.completable.w g(io.reactivex.rxjava3.functions.a aVar) {
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.completable.w(this, lVar, lVar, aVar, kVar, kVar, kVar);
    }

    public final io.reactivex.rxjava3.internal.operators.completable.w h(io.reactivex.rxjava3.functions.a aVar) {
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.completable.w(this, lVar, lVar, kVar, kVar, kVar, aVar);
    }

    public final io.reactivex.rxjava3.internal.operators.completable.w i(io.reactivex.rxjava3.functions.f fVar) {
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.completable.w(this, lVar, fVar, kVar, kVar, kVar, kVar);
    }

    public final io.reactivex.rxjava3.internal.operators.completable.w j(io.reactivex.rxjava3.functions.a aVar) {
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.completable.w(this, lVar, lVar, kVar, aVar, kVar, kVar);
    }

    public final io.reactivex.rxjava3.internal.operators.completable.u o(w wVar) {
        Objects.requireNonNull(wVar, "scheduler is null");
        return new io.reactivex.rxjava3.internal.operators.completable.u(this, wVar);
    }

    public abstract void p(c cVar);

    public final io.reactivex.rxjava3.internal.operators.completable.y q(w wVar) {
        Objects.requireNonNull(wVar, "scheduler is null");
        return new io.reactivex.rxjava3.internal.operators.completable.y(this, wVar);
    }

    public final io.reactivex.rxjava3.disposables.c subscribe() {
        EmptyCompletableObserver emptyCompletableObserver = new EmptyCompletableObserver();
        subscribe(emptyCompletableObserver);
        return emptyCompletableObserver;
    }

    public final io.reactivex.rxjava3.internal.operators.completable.c0 t(Object obj) {
        Objects.requireNonNull(obj, "completionValue is null");
        return new io.reactivex.rxjava3.internal.operators.completable.c0(this, null, obj);
    }

    @Override // io.reactivex.rxjava3.core.e
    public final void subscribe(c cVar) {
        Objects.requireNonNull(cVar, "observer is null");
        try {
            m0 m0Var = io.reactivex.rxjava3.plugins.a.i;
            if (m0Var != null) {
                try {
                    cVar = (c) m0Var.apply(this, cVar);
                } catch (Throwable th) {
                    throw io.reactivex.rxjava3.internal.util.f.f(th);
                }
            }
            Objects.requireNonNull(cVar, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            p(cVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            io.reactivex.rxjava3.plugins.a.a(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final io.reactivex.rxjava3.disposables.c subscribe(io.reactivex.rxjava3.functions.a aVar, io.reactivex.rxjava3.functions.f<? super Throwable> fVar) {
        Objects.requireNonNull(fVar, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(aVar, fVar);
        subscribe(callbackCompletableObserver);
        return callbackCompletableObserver;
    }

    public final io.reactivex.rxjava3.disposables.c subscribe(io.reactivex.rxjava3.functions.a aVar) {
        Objects.requireNonNull(aVar, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(aVar);
        subscribe(callbackCompletableObserver);
        return callbackCompletableObserver;
    }
}
