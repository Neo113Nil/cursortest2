package io.reactivex.rxjava3.core;

import defpackage.k0;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableInternalHelper$RequestMax;
import io.reactivex.rxjava3.internal.operators.flowable.b1;
import io.reactivex.rxjava3.internal.operators.flowable.c1;
import io.reactivex.rxjava3.internal.operators.flowable.d0;
import io.reactivex.rxjava3.internal.operators.flowable.f0;
import io.reactivex.rxjava3.internal.operators.flowable.s0;
import io.reactivex.rxjava3.internal.operators.flowable.v0;
import io.reactivex.rxjava3.internal.operators.flowable.x0;
import io.reactivex.rxjava3.internal.subscribers.LambdaSubscriber;
import io.reactivex.rxjava3.internal.subscribers.StrictSubscriber;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import rxdogtag2.j0;
import xsna.axm0;
import xsna.fb20;
import xsna.ffe0;

/* compiled from: Flowable.java */
/* loaded from: classes11.dex */
public abstract class g<T> implements ffe0<T> {
    public static final int b = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    public static io.reactivex.rxjava3.internal.operators.flowable.g a(g gVar, g gVar2, io.reactivex.rxjava3.functions.c cVar) {
        ffe0[] ffe0VarArr = {gVar, gVar2};
        a.b bVar = new a.b(cVar);
        int i = b;
        io.reactivex.rxjava3.internal.functions.b.a(i, "bufferSize");
        return new io.reactivex.rxjava3.internal.operators.flowable.g(ffe0VarArr, bVar, i);
    }

    public static io.reactivex.rxjava3.internal.operators.flowable.q e(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return new io.reactivex.rxjava3.internal.operators.flowable.q(new a.r(th));
    }

    @SafeVarargs
    public static <T> g<T> h(T... tArr) {
        return tArr.length == 0 ? io.reactivex.rxjava3.internal.operators.flowable.p.c : tArr.length == 1 ? i(tArr[0]) : new io.reactivex.rxjava3.internal.operators.flowable.v(tArr);
    }

    public static io.reactivex.rxjava3.internal.operators.flowable.b0 i(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new io.reactivex.rxjava3.internal.operators.flowable.b0(obj);
    }

    public static c1 p(long j, TimeUnit timeUnit, w wVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(wVar, "scheduler is null");
        return new c1(Math.max(0L, j), timeUnit, wVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> g<R> b(io.reactivex.rxjava3.functions.l<? super T, ? extends ffe0<? extends R>> lVar) {
        io.reactivex.rxjava3.internal.functions.b.a(2, "prefetch");
        if (!(this instanceof io.reactivex.rxjava3.internal.fuseable.j)) {
            return new io.reactivex.rxjava3.internal.operators.flowable.i(this, lVar, ErrorMode.IMMEDIATE);
        }
        T t = ((io.reactivex.rxjava3.internal.fuseable.j) this).get();
        return t == null ? io.reactivex.rxjava3.internal.operators.flowable.p.c : s0.a(t, lVar);
    }

    public final io.reactivex.rxjava3.internal.operators.mixed.c d(boolean z) {
        io.reactivex.rxjava3.internal.functions.b.a(2, "prefetch");
        return new io.reactivex.rxjava3.internal.operators.mixed.c(this, z ? ErrorMode.END : ErrorMode.BOUNDARY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g f(io.reactivex.rxjava3.functions.l lVar, int i, int i2) {
        io.reactivex.rxjava3.internal.functions.b.a(i, "maxConcurrency");
        io.reactivex.rxjava3.internal.functions.b.a(i2, "bufferSize");
        if (!(this instanceof io.reactivex.rxjava3.internal.fuseable.j)) {
            return new io.reactivex.rxjava3.internal.operators.flowable.s(this, lVar, i, i2);
        }
        T t = ((io.reactivex.rxjava3.internal.fuseable.j) this).get();
        return t == null ? io.reactivex.rxjava3.internal.operators.flowable.p.c : s0.a(t, lVar);
    }

    public final io.reactivex.rxjava3.internal.operators.flowable.t g(io.reactivex.rxjava3.functions.l lVar, int i) {
        io.reactivex.rxjava3.internal.functions.b.a(i, "maxConcurrency");
        return new io.reactivex.rxjava3.internal.operators.flowable.t(this, lVar, i);
    }

    public final d0 j(w wVar) {
        Objects.requireNonNull(wVar, "scheduler is null");
        int i = b;
        io.reactivex.rxjava3.internal.functions.b.a(i, "bufferSize");
        return new d0(this, wVar, i);
    }

    public final f0 k(long j, io.reactivex.rxjava3.functions.a aVar, BackpressureOverflowStrategy backpressureOverflowStrategy) {
        Objects.requireNonNull(backpressureOverflowStrategy, "overflowStrategy is null");
        io.reactivex.rxjava3.internal.functions.b.b(j, "capacity");
        return new f0(this, j, aVar, backpressureOverflowStrategy);
    }

    public abstract void l(axm0<? super T> axm0Var);

    public final v0 m(w wVar) {
        Objects.requireNonNull(wVar, "scheduler is null");
        return new v0(this, wVar, !(this instanceof io.reactivex.rxjava3.internal.operators.flowable.j));
    }

    public final x0 n(long j) {
        if (j >= 0) {
            return new x0(this, j);
        }
        throw new IllegalArgumentException(k0.a(j, "count >= 0 required but it was "));
    }

    public final b1 o(long j, TimeUnit timeUnit) {
        return new b1(this, j, timeUnit, fb20.b(timeUnit, "unit is null", "scheduler is null"));
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
        Objects.requireNonNull(fVar, "onNext is null");
        Objects.requireNonNull(fVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(fVar, fVar2, aVar, FlowableInternalHelper$RequestMax.INSTANCE);
        subscribe((j) lambdaSubscriber);
        return lambdaSubscriber;
    }

    @Override // xsna.ffe0
    public final void subscribe(axm0<? super T> axm0Var) {
        if (axm0Var instanceof j) {
            subscribe((j) axm0Var);
        } else {
            Objects.requireNonNull(axm0Var, "subscriber is null");
            subscribe((j) new StrictSubscriber(axm0Var));
        }
    }

    public final void subscribe(j<? super T> jVar) {
        Objects.requireNonNull(jVar, "subscriber is null");
        try {
            j0 j0Var = io.reactivex.rxjava3.plugins.a.e;
            if (j0Var != null) {
                try {
                    jVar = (j<? super T>) ((axm0) j0Var.apply(this, jVar));
                } catch (Throwable th) {
                    throw io.reactivex.rxjava3.internal.util.f.f(th);
                }
            }
            Objects.requireNonNull(jVar, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            l(jVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            io.reactivex.rxjava3.plugins.a.a(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }
}
