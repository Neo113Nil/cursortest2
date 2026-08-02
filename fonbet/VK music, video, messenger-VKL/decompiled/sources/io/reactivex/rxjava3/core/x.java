package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.observers.BiConsumerSingleObserver;
import io.reactivex.rxjava3.internal.observers.ConsumerSingleObserver;
import io.reactivex.rxjava3.internal.operators.observable.i2;
import io.reactivex.rxjava3.internal.operators.single.d0;
import io.reactivex.rxjava3.internal.operators.single.e0;
import io.reactivex.rxjava3.internal.operators.single.f0;
import io.reactivex.rxjava3.internal.operators.single.h0;
import io.reactivex.rxjava3.internal.operators.single.i0;
import io.reactivex.rxjava3.internal.operators.single.j0;
import io.reactivex.rxjava3.internal.operators.single.k0;
import io.reactivex.rxjava3.internal.operators.single.m0;
import io.reactivex.rxjava3.internal.operators.single.n0;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import xsna.fb20;

/* compiled from: Single.java */
/* loaded from: classes11.dex */
public abstract class x<T> implements b0<T> {
    public static x A(b0 b0Var, x xVar, x xVar2, io.reactivex.rxjava3.functions.g gVar) {
        Objects.requireNonNull(b0Var, "source1 is null");
        Objects.requireNonNull(xVar, "source2 is null");
        Objects.requireNonNull(xVar2, "source3 is null");
        return E(new a.c(gVar), b0Var, xVar, xVar2);
    }

    public static <T1, T2, R> x<R> B(b0<? extends T1> b0Var, b0<? extends T2> b0Var2, io.reactivex.rxjava3.functions.c<? super T1, ? super T2, ? extends R> cVar) {
        Objects.requireNonNull(b0Var, "source1 is null");
        Objects.requireNonNull(b0Var2, "source2 is null");
        return E(new a.b(cVar), b0Var, b0Var2);
    }

    public static x C(f0 f0Var, f0 f0Var2, f0 f0Var3, x xVar, x xVar2, io.reactivex.rxjava3.functions.i iVar) {
        return E(new a.e(iVar), f0Var, f0Var2, f0Var3, xVar, xVar2);
    }

    public static n0 D(List list, io.reactivex.rxjava3.functions.l lVar) {
        Objects.requireNonNull(list, "sources is null");
        return new n0(list, lVar);
    }

    @SafeVarargs
    public static <T, R> x<R> E(io.reactivex.rxjava3.functions.l<? super Object[], ? extends R> lVar, b0<? extends T>... b0VarArr) {
        return b0VarArr.length == 0 ? i(new NoSuchElementException()) : new m0(lVar, b0VarArr);
    }

    public static io.reactivex.rxjava3.internal.operators.mixed.c e(x xVar, x xVar2) {
        Objects.requireNonNull(xVar2, "source2 is null");
        return g.h(xVar, xVar2).d(false);
    }

    public static io.reactivex.rxjava3.internal.operators.single.q i(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return new io.reactivex.rxjava3.internal.operators.single.q(new a.r(th));
    }

    public static i2 j(t tVar) {
        Objects.requireNonNull(tVar, "observable is null");
        return new i2(tVar, null);
    }

    public static io.reactivex.rxjava3.internal.operators.single.x k(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new io.reactivex.rxjava3.internal.operators.single.x(obj);
    }

    public static i0 t(long j, TimeUnit timeUnit) {
        return new i0(j, timeUnit, fb20.b(timeUnit, "unit is null", "scheduler is null"));
    }

    public static <T> x<T> x(b0<T> b0Var) {
        Objects.requireNonNull(b0Var, "source is null");
        return b0Var instanceof x ? (x) b0Var : new io.reactivex.rxjava3.internal.operators.single.w(b0Var);
    }

    public static x y(x xVar, x xVar2, x xVar3, x xVar4, x xVar5, x xVar6, io.reactivex.rxjava3.functions.j jVar) {
        return E(new a.f(jVar), xVar, xVar2, xVar3, xVar4, xVar5, xVar6);
    }

    public static x z(x xVar, x xVar2, x xVar3, x xVar4, io.reactivex.rxjava3.functions.h hVar) {
        return E(new a.d(hVar), xVar, xVar2, xVar3, xVar4);
    }

    public final T c() {
        io.reactivex.rxjava3.internal.observers.d dVar = new io.reactivex.rxjava3.internal.observers.d();
        subscribe(dVar);
        return (T) dVar.b();
    }

    public final void d(io.reactivex.rxjava3.functions.f<? super T> fVar, io.reactivex.rxjava3.functions.f<? super Throwable> fVar2) {
        io.reactivex.rxjava3.internal.observers.d dVar = new io.reactivex.rxjava3.internal.observers.d();
        subscribe(dVar);
        dVar.a(fVar, fVar2);
    }

    public final io.reactivex.rxjava3.internal.operators.single.d f(long j, TimeUnit timeUnit) {
        return new io.reactivex.rxjava3.internal.operators.single.d(this, j, timeUnit, fb20.b(timeUnit, "unit is null", "scheduler is null"), false);
    }

    public final io.reactivex.rxjava3.internal.operators.single.f g(long j) {
        return new io.reactivex.rxjava3.internal.operators.single.f(this, q.C0(j, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.a.a()));
    }

    public final io.reactivex.rxjava3.internal.operators.single.l h(io.reactivex.rxjava3.functions.f fVar) {
        Objects.requireNonNull(fVar, "onError is null");
        return new io.reactivex.rxjava3.internal.operators.single.l(this, fVar);
    }

    public final io.reactivex.rxjava3.internal.operators.single.y l(io.reactivex.rxjava3.functions.l lVar) {
        Objects.requireNonNull(lVar, "mapper is null");
        return new io.reactivex.rxjava3.internal.operators.single.y(this, lVar);
    }

    public final io.reactivex.rxjava3.internal.operators.single.b0 m(w wVar) {
        Objects.requireNonNull(wVar, "scheduler is null");
        return new io.reactivex.rxjava3.internal.operators.single.b0(this, wVar);
    }

    public final e0 n(b0 b0Var) {
        Objects.requireNonNull(b0Var, "fallback is null");
        return new e0(this, new a.r(b0Var));
    }

    public final d0 o(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new d0(this, null, obj);
    }

    public abstract void p(z<? super T> zVar);

    public final f0 q(w wVar) {
        Objects.requireNonNull(wVar, "scheduler is null");
        return new f0(this, wVar);
    }

    public final h0 r(long j, TimeUnit timeUnit) {
        return s(j, timeUnit, io.reactivex.rxjava3.schedulers.a.a(), null);
    }

    public final h0 s(long j, TimeUnit timeUnit, w wVar, io.reactivex.rxjava3.internal.operators.single.x xVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(wVar, "scheduler is null");
        return new h0(this, j, timeUnit, wVar, xVar);
    }

    public final io.reactivex.rxjava3.disposables.c subscribe() {
        return subscribe(io.reactivex.rxjava3.internal.functions.a.d, io.reactivex.rxjava3.internal.functions.a.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g<T> u() {
        return this instanceof io.reactivex.rxjava3.internal.fuseable.d ? ((io.reactivex.rxjava3.internal.fuseable.d) this).a() : new j0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k<T> v() {
        return this instanceof io.reactivex.rxjava3.internal.fuseable.e ? ((io.reactivex.rxjava3.internal.fuseable.e) this).a() : new io.reactivex.rxjava3.internal.operators.maybe.q(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q<T> w() {
        return this instanceof io.reactivex.rxjava3.internal.fuseable.f ? ((io.reactivex.rxjava3.internal.fuseable.f) this).b() : new k0(this);
    }

    public final io.reactivex.rxjava3.disposables.c subscribe(io.reactivex.rxjava3.functions.b<? super T, ? super Throwable> bVar) {
        Objects.requireNonNull(bVar, "onCallback is null");
        BiConsumerSingleObserver biConsumerSingleObserver = new BiConsumerSingleObserver(bVar);
        subscribe(biConsumerSingleObserver);
        return biConsumerSingleObserver;
    }

    public final io.reactivex.rxjava3.disposables.c subscribe(io.reactivex.rxjava3.functions.f<? super T> fVar) {
        return subscribe(fVar, io.reactivex.rxjava3.internal.functions.a.f);
    }

    public final io.reactivex.rxjava3.disposables.c subscribe(io.reactivex.rxjava3.functions.f<? super T> fVar, io.reactivex.rxjava3.functions.f<? super Throwable> fVar2) {
        Objects.requireNonNull(fVar, "onSuccess is null");
        Objects.requireNonNull(fVar2, "onError is null");
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(fVar, fVar2);
        subscribe(consumerSingleObserver);
        return consumerSingleObserver;
    }

    @Override // io.reactivex.rxjava3.core.b0
    public final void subscribe(z<? super T> zVar) {
        Objects.requireNonNull(zVar, "observer is null");
        rxdogtag2.k0 k0Var = io.reactivex.rxjava3.plugins.a.h;
        if (k0Var != null) {
            try {
                zVar = (z) k0Var.apply(this, zVar);
            } catch (Throwable th) {
                throw io.reactivex.rxjava3.internal.util.f.f(th);
            }
        }
        Objects.requireNonNull(zVar, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            p(zVar);
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
