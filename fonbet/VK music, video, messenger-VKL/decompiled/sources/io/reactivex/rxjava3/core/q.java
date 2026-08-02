package io.reactivex.rxjava3.core;

import com.coremedia.iso.boxes.FreeSpaceBox;
import defpackage.k0;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.observers.LambdaObserver;
import io.reactivex.rxjava3.internal.operators.flowable.e0;
import io.reactivex.rxjava3.internal.operators.flowable.i0;
import io.reactivex.rxjava3.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.rxjava3.internal.operators.observable.a2;
import io.reactivex.rxjava3.internal.operators.observable.b2;
import io.reactivex.rxjava3.internal.operators.observable.c3;
import io.reactivex.rxjava3.internal.operators.observable.d2;
import io.reactivex.rxjava3.internal.operators.observable.e1;
import io.reactivex.rxjava3.internal.operators.observable.e3;
import io.reactivex.rxjava3.internal.operators.observable.f0;
import io.reactivex.rxjava3.internal.operators.observable.f1;
import io.reactivex.rxjava3.internal.operators.observable.f2;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import io.reactivex.rxjava3.internal.operators.observable.g1;
import io.reactivex.rxjava3.internal.operators.observable.h0;
import io.reactivex.rxjava3.internal.operators.observable.i2;
import io.reactivex.rxjava3.internal.operators.observable.j0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.l2;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.n2;
import io.reactivex.rxjava3.internal.operators.observable.o1;
import io.reactivex.rxjava3.internal.operators.observable.o2;
import io.reactivex.rxjava3.internal.operators.observable.p1;
import io.reactivex.rxjava3.internal.operators.observable.r0;
import io.reactivex.rxjava3.internal.operators.observable.r1;
import io.reactivex.rxjava3.internal.operators.observable.s2;
import io.reactivex.rxjava3.internal.operators.observable.t1;
import io.reactivex.rxjava3.internal.operators.observable.t2;
import io.reactivex.rxjava3.internal.operators.observable.u0;
import io.reactivex.rxjava3.internal.operators.observable.u2;
import io.reactivex.rxjava3.internal.operators.observable.v1;
import io.reactivex.rxjava3.internal.operators.observable.v2;
import io.reactivex.rxjava3.internal.operators.observable.w2;
import io.reactivex.rxjava3.internal.operators.observable.x0;
import io.reactivex.rxjava3.internal.operators.observable.x1;
import io.reactivex.rxjava3.internal.operators.observable.y2;
import io.reactivex.rxjava3.internal.operators.observable.z2;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import xsna.fb20;
import xsna.lhg;

/* compiled from: Observable.java */
/* loaded from: classes11.dex */
public abstract class q<T> implements t<T> {

    /* compiled from: Observable.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            a = iArr;
            try {
                iArr[BackpressureStrategy.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[BackpressureStrategy.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[BackpressureStrategy.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[BackpressureStrategy.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static w2 B0(long j, TimeUnit timeUnit) {
        return C0(j, timeUnit, io.reactivex.rxjava3.schedulers.a.a());
    }

    public static w2 C0(long j, TimeUnit timeUnit, w wVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(wVar, "scheduler is null");
        return new w2(Math.max(j, 0L), timeUnit, wVar);
    }

    public static h0 H(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return new h0(new a.r(th));
    }

    public static q H0(q qVar, q qVar2, q qVar3, q qVar4, io.reactivex.rxjava3.functions.h hVar) {
        Objects.requireNonNull(qVar, "source1 is null");
        Objects.requireNonNull(qVar2, "source2 is null");
        Objects.requireNonNull(qVar3, "source3 is null");
        Objects.requireNonNull(qVar4, "source4 is null");
        return K0(g.b, new a.d(hVar), qVar, qVar2, qVar3, qVar4);
    }

    public static q I0(q qVar, t tVar, io.reactivex.rxjava3.functions.c cVar) {
        Objects.requireNonNull(qVar, "source1 is null");
        Objects.requireNonNull(tVar, "source2 is null");
        Objects.requireNonNull(cVar, "zipper is null");
        return K0(g.b, new a.b(cVar), qVar, tVar);
    }

    public static q J0(q qVar, io.reactivex.rxjava3.internal.operators.observable.a aVar, q qVar2, io.reactivex.rxjava3.functions.g gVar) {
        Objects.requireNonNull(qVar, "source1 is null");
        Objects.requireNonNull(qVar2, "source3 is null");
        return K0(g.b, new a.c(gVar), qVar, aVar, qVar2);
    }

    @SafeVarargs
    public static q K0(int i, io.reactivex.rxjava3.functions.l lVar, t... tVarArr) {
        if (tVarArr.length == 0) {
            return g0.b;
        }
        io.reactivex.rxjava3.internal.functions.b.a(i, "bufferSize");
        return new e3(tVarArr, null, lVar, i);
    }

    @SafeVarargs
    public static <T> q<T> N(T... tArr) {
        return tArr.length == 0 ? g0.b : tArr.length == 1 ? T(tArr[0]) : new r0(tArr);
    }

    public static u0 O(Iterable iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return new u0(iterable);
    }

    public static e1 P(long j, long j2, TimeUnit timeUnit) {
        return Q(j, j2, timeUnit, io.reactivex.rxjava3.schedulers.a.a());
    }

    public static e1 Q(long j, long j2, TimeUnit timeUnit, w wVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(wVar, "scheduler is null");
        return new e1(Math.max(0L, j), Math.max(0L, j2), timeUnit, wVar);
    }

    public static e1 R(long j, TimeUnit timeUnit) {
        return Q(j, j, timeUnit, io.reactivex.rxjava3.schedulers.a.a());
    }

    public static q<Long> S(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        w a2 = io.reactivex.rxjava3.schedulers.a.a();
        if (j2 < 0) {
            throw new IllegalArgumentException(k0.a(j2, "count >= 0 required but it was "));
        }
        if (j2 == 0) {
            g0 g0Var = g0.b;
            g0Var.getClass();
            Objects.requireNonNull(timeUnit, "unit is null");
            Objects.requireNonNull(a2, "scheduler is null");
            return new io.reactivex.rxjava3.internal.operators.observable.u(g0Var, j3, timeUnit, a2);
        }
        long j5 = (j2 - 1) + j;
        if (j > 0 && j5 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a2, "scheduler is null");
        return new f1(j, j5, Math.max(0L, j3), Math.max(0L, j4), timeUnit, a2);
    }

    public static g1 T(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new g1(obj);
    }

    public static q V(q qVar, q qVar2, q qVar3) {
        Objects.requireNonNull(qVar, "source1 is null");
        Objects.requireNonNull(qVar2, "source2 is null");
        Objects.requireNonNull(qVar3, "source3 is null");
        q N = N(qVar, qVar2, qVar3);
        N.getClass();
        return N.M(io.reactivex.rxjava3.internal.functions.a.a, false, 3, g.b);
    }

    public static q W(q qVar, q qVar2, q qVar3, q qVar4) {
        Objects.requireNonNull(qVar, "source1 is null");
        Objects.requireNonNull(qVar2, "source2 is null");
        Objects.requireNonNull(qVar3, "source3 is null");
        Objects.requireNonNull(qVar4, "source4 is null");
        q N = N(qVar, qVar2, qVar3, qVar4);
        N.getClass();
        return N.M(io.reactivex.rxjava3.internal.functions.a.a, false, 4, g.b);
    }

    public static <T> q<T> X(t<? extends T> tVar, t<? extends T> tVar2) {
        Objects.requireNonNull(tVar, "source1 is null");
        Objects.requireNonNull(tVar2, "source2 is null");
        q N = N(tVar, tVar2);
        N.getClass();
        return N.M(io.reactivex.rxjava3.internal.functions.a.a, false, 2, g.b);
    }

    public static q<Integer> e0(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(lhg.a(i2, "count >= 0 required but it was "));
        }
        if (i2 == 0) {
            return g0.b;
        }
        if (i2 == 1) {
            return T(Integer.valueOf(i));
        }
        if (i + (i2 - 1) <= 2147483647L) {
            return new t1(i, i2);
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    public static q g(q qVar, q qVar2, q qVar3, q qVar4, q qVar5, q qVar6, q qVar7, io.reactivex.rxjava3.functions.k kVar) {
        Objects.requireNonNull(qVar, "source1 is null");
        Objects.requireNonNull(qVar2, "source2 is null");
        Objects.requireNonNull(qVar3, "source3 is null");
        Objects.requireNonNull(qVar4, "source4 is null");
        Objects.requireNonNull(qVar5, "source5 is null");
        Objects.requireNonNull(qVar7, "source7 is null");
        return o(g.b, new a.g(kVar), new t[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7});
    }

    public static q i(q qVar, q qVar2, q qVar3, q qVar4, q qVar5, q qVar6, io.reactivex.rxjava3.functions.j jVar) {
        Objects.requireNonNull(qVar, "source1 is null");
        Objects.requireNonNull(qVar2, "source2 is null");
        Objects.requireNonNull(qVar3, "source3 is null");
        Objects.requireNonNull(qVar4, "source4 is null");
        Objects.requireNonNull(qVar5, "source5 is null");
        Objects.requireNonNull(qVar6, "source6 is null");
        return o(g.b, new a.f(jVar), new t[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6});
    }

    public static q j(q qVar, q qVar2, q qVar3, q qVar4, io.reactivex.rxjava3.functions.h hVar) {
        Objects.requireNonNull(qVar, "source1 is null");
        Objects.requireNonNull(qVar2, "source2 is null");
        Objects.requireNonNull(qVar3, "source3 is null");
        Objects.requireNonNull(qVar4, "source4 is null");
        return o(g.b, new a.d(hVar), new t[]{qVar, qVar2, qVar3, qVar4});
    }

    public static <T1, T2, T3, T4, T5, R> q<R> k(t<? extends T1> tVar, t<? extends T2> tVar2, t<? extends T3> tVar3, t<? extends T4> tVar4, t<? extends T5> tVar5, io.reactivex.rxjava3.functions.i<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> iVar) {
        Objects.requireNonNull(tVar, "source1 is null");
        Objects.requireNonNull(tVar2, "source2 is null");
        Objects.requireNonNull(tVar3, "source3 is null");
        Objects.requireNonNull(tVar4, "source4 is null");
        Objects.requireNonNull(tVar5, "source5 is null");
        return o(g.b, new a.e(iVar), new t[]{tVar, tVar2, tVar3, tVar4, tVar5});
    }

    public static <T1, T2, T3, R> q<R> l(t<? extends T1> tVar, t<? extends T2> tVar2, t<? extends T3> tVar3, io.reactivex.rxjava3.functions.g<? super T1, ? super T2, ? super T3, ? extends R> gVar) {
        Objects.requireNonNull(tVar, "source1 is null");
        Objects.requireNonNull(tVar2, "source2 is null");
        Objects.requireNonNull(tVar3, "source3 is null");
        return o(g.b, new a.c(gVar), new t[]{tVar, tVar2, tVar3});
    }

    public static <T1, T2, R> q<R> m(t<? extends T1> tVar, t<? extends T2> tVar2, io.reactivex.rxjava3.functions.c<? super T1, ? super T2, ? extends R> cVar) {
        Objects.requireNonNull(tVar, "source1 is null");
        Objects.requireNonNull(tVar2, "source2 is null");
        return o(g.b, new a.b(cVar), new t[]{tVar, tVar2});
    }

    public static io.reactivex.rxjava3.internal.operators.observable.n n(Iterable iterable, io.reactivex.rxjava3.functions.l lVar) {
        int i = g.b;
        Objects.requireNonNull(iterable, "sources is null");
        io.reactivex.rxjava3.internal.functions.b.a(i, "bufferSize");
        return new io.reactivex.rxjava3.internal.operators.observable.n(null, iterable, lVar, i << 1);
    }

    public static q o(int i, io.reactivex.rxjava3.functions.l lVar, t[] tVarArr) {
        if (tVarArr.length == 0) {
            return g0.b;
        }
        io.reactivex.rxjava3.internal.functions.b.a(i, "bufferSize");
        return new io.reactivex.rxjava3.internal.operators.observable.n(tVarArr, null, lVar, i << 1);
    }

    public static <T> q<T> q(t<? extends T> tVar, t<? extends T> tVar2) {
        Objects.requireNonNull(tVar, "source1 is null");
        Objects.requireNonNull(tVar2, "source2 is null");
        return s(tVar, tVar2);
    }

    public static q r(ArrayList arrayList) {
        return O(arrayList).v(io.reactivex.rxjava3.internal.functions.a.a, false, g.b);
    }

    @SafeVarargs
    public static <T> q<T> s(t<? extends T>... tVarArr) {
        if (tVarArr.length == 0) {
            return g0.b;
        }
        if (tVarArr.length != 1) {
            return new io.reactivex.rxjava3.internal.operators.observable.o(g.b, N(tVarArr), io.reactivex.rxjava3.internal.functions.a.a, ErrorMode.BOUNDARY);
        }
        t<? extends T> tVar = tVarArr[0];
        Objects.requireNonNull(tVar, "source is null");
        return tVar instanceof q ? (q) tVar : new x0(tVar);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.u A(long j, TimeUnit timeUnit) {
        return new io.reactivex.rxjava3.internal.operators.observable.u(this, j, timeUnit, fb20.b(timeUnit, "unit is null", "scheduler is null"));
    }

    public final v2 A0(long j, TimeUnit timeUnit, t tVar, w wVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(wVar, "scheduler is null");
        return new v2(this, j, timeUnit, wVar, tVar);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.y B(io.reactivex.rxjava3.functions.l lVar) {
        return new io.reactivex.rxjava3.internal.operators.observable.y(this, lVar, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 C(io.reactivex.rxjava3.functions.a aVar) {
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        return E(lVar, lVar, aVar, io.reactivex.rxjava3.internal.functions.a.c);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 D(io.reactivex.rxjava3.functions.f fVar) {
        return E(new a.u(fVar), new a.t(fVar), new a.s(fVar), io.reactivex.rxjava3.internal.functions.a.c);
    }

    public final g<T> D0(BackpressureStrategy backpressureStrategy) {
        Objects.requireNonNull(backpressureStrategy, "strategy is null");
        io.reactivex.rxjava3.internal.operators.flowable.z zVar = new io.reactivex.rxjava3.internal.operators.flowable.z(this);
        int i = a.a[backpressureStrategy.ordinal()];
        if (i == 1) {
            return new io.reactivex.rxjava3.internal.operators.flowable.g0(zVar);
        }
        if (i == 2) {
            return new i0(zVar);
        }
        if (i == 3) {
            return zVar;
        }
        if (i == 4) {
            return new io.reactivex.rxjava3.internal.operators.flowable.h0(zVar);
        }
        int i2 = g.b;
        io.reactivex.rxjava3.internal.functions.b.a(i2, "capacity");
        return new e0(zVar, i2);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 E(io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.f fVar2, io.reactivex.rxjava3.functions.a aVar, io.reactivex.rxjava3.functions.a aVar2) {
        Objects.requireNonNull(fVar, "onNext is null");
        Objects.requireNonNull(fVar2, "onError is null");
        return new io.reactivex.rxjava3.internal.operators.observable.b0(this, fVar, fVar2, aVar, aVar2);
    }

    public final y2 E0() {
        io.reactivex.rxjava3.internal.functions.b.a(16, "capacityHint");
        return new y2(this);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 F(io.reactivex.rxjava3.functions.f fVar) {
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return E(lVar, fVar, kVar, kVar);
    }

    public final z2 F0(w wVar) {
        Objects.requireNonNull(wVar, "scheduler is null");
        return new z2(this, wVar);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 G(io.reactivex.rxjava3.functions.a aVar) {
        return E(io.reactivex.rxjava3.internal.functions.a.d, new a.C2116a(aVar), aVar, io.reactivex.rxjava3.internal.functions.a.c);
    }

    public final c3 G0(t tVar, io.reactivex.rxjava3.functions.c cVar) {
        Objects.requireNonNull(tVar, "other is null");
        return new c3(this, tVar, cVar);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.i0 I(io.reactivex.rxjava3.functions.m mVar) {
        return new io.reactivex.rxjava3.internal.operators.observable.i0(this, mVar);
    }

    public final f0 J(Object obj) {
        Objects.requireNonNull(obj, "defaultItem is null");
        return new f0(this, obj);
    }

    public final f0 K() {
        return new f0(this, null);
    }

    public final <R> q<R> L(io.reactivex.rxjava3.functions.l<? super T, ? extends t<? extends R>> lVar, boolean z) {
        return M(lVar, z, Integer.MAX_VALUE, g.b);
    }

    public final q L0(q qVar, io.reactivex.rxjava3.functions.c cVar) {
        Objects.requireNonNull(qVar, "other is null");
        return I0(this, qVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> q<R> M(io.reactivex.rxjava3.functions.l<? super T, ? extends t<? extends R>> lVar, boolean z, int i, int i2) {
        Objects.requireNonNull(lVar, "mapper is null");
        io.reactivex.rxjava3.internal.functions.b.a(i, "maxConcurrency");
        io.reactivex.rxjava3.internal.functions.b.a(i2, "bufferSize");
        if (!(this instanceof io.reactivex.rxjava3.internal.fuseable.j)) {
            return new j0(this, lVar, z, i, i2);
        }
        T t = ((io.reactivex.rxjava3.internal.fuseable.j) this).get();
        return t == null ? g0.b : new ObservableScalarXMap.a(t, lVar);
    }

    public final j1 U(io.reactivex.rxjava3.functions.l lVar) {
        Objects.requireNonNull(lVar, "mapper is null");
        return new j1(this, lVar);
    }

    public final q<T> Y(t<? extends T> tVar) {
        Objects.requireNonNull(tVar, "other is null");
        return X(this, tVar);
    }

    public final m1 Z(int i, w wVar, boolean z) {
        Objects.requireNonNull(wVar, "scheduler is null");
        io.reactivex.rxjava3.internal.functions.b.a(i, "bufferSize");
        return new m1(this, wVar, z, i);
    }

    public final T a() {
        io.reactivex.rxjava3.internal.observers.c cVar = new io.reactivex.rxjava3.internal.observers.c(1);
        subscribe(cVar);
        if (cVar.getCount() != 0) {
            try {
                cVar.await();
            } catch (InterruptedException e) {
                cVar.dispose();
                throw io.reactivex.rxjava3.internal.util.f.f(e);
            }
        }
        Throwable th = cVar.c;
        if (th != null) {
            throw io.reactivex.rxjava3.internal.util.f.f(th);
        }
        T t = (T) cVar.b;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException();
    }

    public final m1 a0(w wVar) {
        return Z(g.b, wVar, false);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.h b(int i, int i2) {
        ArrayListSupplier arrayListSupplier = ArrayListSupplier.INSTANCE;
        io.reactivex.rxjava3.internal.functions.b.a(i, "count");
        io.reactivex.rxjava3.internal.functions.b.a(i2, FreeSpaceBox.TYPE);
        Objects.requireNonNull(arrayListSupplier, "bufferSupplier is null");
        return new io.reactivex.rxjava3.internal.operators.observable.h(this, i, i2, arrayListSupplier);
    }

    public final j1 b0(Class cls) {
        return new io.reactivex.rxjava3.internal.operators.observable.i0(this, new a.j(cls)).f(cls);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.i c(q qVar) {
        ArrayListSupplier arrayListSupplier = ArrayListSupplier.INSTANCE;
        Objects.requireNonNull(arrayListSupplier, "bufferSupplier is null");
        return new io.reactivex.rxjava3.internal.operators.observable.i(this, qVar, arrayListSupplier);
    }

    public final o1 c0(t tVar) {
        Objects.requireNonNull(tVar, "fallback is null");
        return new o1(this, new a.r(tVar));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j d(long j, TimeUnit timeUnit, w wVar, int i, io.reactivex.rxjava3.functions.n nVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(wVar, "scheduler is null");
        Objects.requireNonNull(nVar, "bufferSupplier is null");
        io.reactivex.rxjava3.internal.functions.b.a(i, "count");
        return new io.reactivex.rxjava3.internal.operators.observable.j(this, j, j, timeUnit, wVar, nVar, i);
    }

    public final p1 d0(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new p1(this, new a.r(obj));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.k e() {
        io.reactivex.rxjava3.internal.functions.b.a(16, "initialCapacity");
        return new io.reactivex.rxjava3.internal.operators.observable.k(this);
    }

    public final j1 f(Class cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return U(new a.i(cls));
    }

    public final v1 f0(Object obj, io.reactivex.rxjava3.functions.c cVar) {
        Objects.requireNonNull(obj, "seed is null");
        return new v1(this, obj, cVar);
    }

    public final a2 g0() {
        io.reactivex.rxjava3.internal.functions.b.a(1, "bufferSize");
        return a2.Q0(this);
    }

    public final b2 h0(long j) {
        if (j >= 0) {
            return new b2(this, j);
        }
        throw new IllegalArgumentException(k0.a(j, "times >= 0 required but it was "));
    }

    public final d2 i0() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return new d2(this, 100L, timeUnit, fb20.b(timeUnit, "unit is null", "scheduler is null"), true);
    }

    public final f2 j0(Object obj, io.reactivex.rxjava3.functions.c cVar) {
        Objects.requireNonNull(obj, "initialValue is null");
        return new f2(this, new a.r(obj), cVar);
    }

    public final x1 k0() {
        return new r1(this).O0();
    }

    public final i2 l0(Object obj) {
        Objects.requireNonNull(obj, "defaultItem is null");
        return new i2(this, obj);
    }

    public final i2 m0() {
        return new i2(this, null);
    }

    public final q n0(q qVar) {
        Objects.requireNonNull(qVar, "other is null");
        return s(qVar, this);
    }

    public final q o0(x xVar) {
        Objects.requireNonNull(xVar, "other is null");
        return q(x.x(xVar).w(), this);
    }

    public final <R> q<R> p(u<? super T, ? extends R> uVar) {
        Objects.requireNonNull(uVar, "composer is null");
        t<? extends R> a2 = uVar.a(this);
        Objects.requireNonNull(a2, "source is null");
        return a2 instanceof q ? (q) a2 : new x0(a2);
    }

    public final q<T> p0(T t) {
        return s(T(t), this);
    }

    public abstract void q0(v<? super T> vVar);

    public final l2 r0(w wVar) {
        Objects.requireNonNull(wVar, "scheduler is null");
        return new l2(this, wVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> q<R> s0(io.reactivex.rxjava3.functions.l<? super T, ? extends t<? extends R>> lVar) {
        int i = g.b;
        io.reactivex.rxjava3.internal.functions.b.a(i, "bufferSize");
        if (!(this instanceof io.reactivex.rxjava3.internal.fuseable.j)) {
            return new n2(this, lVar, i);
        }
        T t = ((io.reactivex.rxjava3.internal.fuseable.j) this).get();
        return t == null ? g0.b : new ObservableScalarXMap.a(t, lVar);
    }

    public final io.reactivex.rxjava3.disposables.c subscribe() {
        return subscribe(io.reactivex.rxjava3.internal.functions.a.d, io.reactivex.rxjava3.internal.functions.a.f, io.reactivex.rxjava3.internal.functions.a.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> q<R> t(io.reactivex.rxjava3.functions.l<? super T, ? extends t<? extends R>> lVar) {
        io.reactivex.rxjava3.internal.functions.b.a(2, "bufferSize");
        if (!(this instanceof io.reactivex.rxjava3.internal.fuseable.j)) {
            return new io.reactivex.rxjava3.internal.operators.observable.o(2, this, lVar, ErrorMode.IMMEDIATE);
        }
        T t = ((io.reactivex.rxjava3.internal.fuseable.j) this).get();
        return t == null ? g0.b : new ObservableScalarXMap.a(t, lVar);
    }

    public final o2 t0(long j) {
        if (j >= 0) {
            return new o2(this, j);
        }
        throw new IllegalArgumentException(k0.a(j, "count >= 0 required but it was "));
    }

    public final io.reactivex.rxjava3.core.a u(io.reactivex.rxjava3.functions.l<? super T, ? extends e> lVar) {
        io.reactivex.rxjava3.internal.functions.b.a(2, "capacityHint");
        return new io.reactivex.rxjava3.internal.operators.mixed.g(this, lVar, ErrorMode.IMMEDIATE);
    }

    public final s2 u0(long j, TimeUnit timeUnit) {
        return new s2(this, j, timeUnit, fb20.b(timeUnit, "unit is null", "scheduler is null"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> q<R> v(io.reactivex.rxjava3.functions.l<? super T, ? extends t<? extends R>> lVar, boolean z, int i) {
        io.reactivex.rxjava3.internal.functions.b.a(i, "bufferSize");
        if (!(this instanceof io.reactivex.rxjava3.internal.fuseable.j)) {
            return new io.reactivex.rxjava3.internal.operators.observable.o(i, this, lVar, z ? ErrorMode.END : ErrorMode.BOUNDARY);
        }
        T t = ((io.reactivex.rxjava3.internal.fuseable.j) this).get();
        return t == null ? g0.b : new ObservableScalarXMap.a(t, lVar);
    }

    public final d2 v0(long j, TimeUnit timeUnit) {
        return new d2(this, j, timeUnit, fb20.b(timeUnit, "unit is null", "scheduler is null"), false);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.p w(io.reactivex.rxjava3.functions.l lVar) {
        int i = g.b;
        io.reactivex.rxjava3.internal.functions.b.a(Integer.MAX_VALUE, "maxConcurrency");
        io.reactivex.rxjava3.internal.functions.b.a(i, "bufferSize");
        return new io.reactivex.rxjava3.internal.operators.observable.p(i, this, lVar, ErrorMode.IMMEDIATE);
    }

    public final t2 w0(long j, TimeUnit timeUnit) {
        return new t2(this, j, timeUnit, fb20.b(timeUnit, "unit is null", "scheduler is null"), false);
    }

    public final io.reactivex.rxjava3.internal.operators.mixed.i x(io.reactivex.rxjava3.functions.l lVar) {
        io.reactivex.rxjava3.internal.functions.b.a(2, "bufferSize");
        return new io.reactivex.rxjava3.internal.operators.mixed.i(this, lVar, ErrorMode.IMMEDIATE);
    }

    public final u2 x0() {
        return new u2(this, fb20.b(TimeUnit.MILLISECONDS, "unit is null", "scheduler is null"));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.s y(long j, TimeUnit timeUnit) {
        return z(j, timeUnit, io.reactivex.rxjava3.schedulers.a.a());
    }

    public final v2 y0(long j, TimeUnit timeUnit) {
        return A0(j, timeUnit, null, io.reactivex.rxjava3.schedulers.a.a());
    }

    public final io.reactivex.rxjava3.internal.operators.observable.s z(long j, TimeUnit timeUnit, w wVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(wVar, "scheduler is null");
        return new io.reactivex.rxjava3.internal.operators.observable.s(this, j, timeUnit, wVar);
    }

    public final v2 z0(long j, TimeUnit timeUnit, q qVar) {
        Objects.requireNonNull(qVar, "fallback is null");
        return A0(j, timeUnit, qVar, io.reactivex.rxjava3.schedulers.a.a());
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
        LambdaObserver lambdaObserver = new LambdaObserver(fVar, fVar2, aVar);
        subscribe(lambdaObserver);
        return lambdaObserver;
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void subscribe(v<? super T> vVar) {
        Objects.requireNonNull(vVar, "observer is null");
        try {
            rxdogtag2.i0 i0Var = io.reactivex.rxjava3.plugins.a.g;
            if (i0Var != null) {
                try {
                    vVar = (v) i0Var.apply(this, vVar);
                } catch (Throwable th) {
                    throw io.reactivex.rxjava3.internal.util.f.f(th);
                }
            }
            Objects.requireNonNull(vVar, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            q0(vVar);
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
