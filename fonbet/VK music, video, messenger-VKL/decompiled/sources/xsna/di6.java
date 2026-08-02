package xsna;

import java.util.concurrent.ExecutorService;
import xsna.ao50;
import xsna.kj50;
import xsna.vl50;
import xsna.yn50;

/* compiled from: BaseMviFeature.kt */
/* loaded from: classes2.dex */
public abstract class di6<VS extends ao50, A extends kj50, VE extends yn50, NE extends vl50> implements vk50<VS, A> {
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.subjects.d<VS> c;
    public final io.reactivex.rxjava3.subjects.f<A> d;
    public final io.reactivex.rxjava3.subjects.f<VE> e;
    public final io.reactivex.rxjava3.subjects.f<NE> f;
    public final io.reactivex.rxjava3.subjects.f<izs<VS, VS>> g;

    public di6(VS vs) {
        io.reactivex.rxjava3.subjects.d<VS> O0 = io.reactivex.rxjava3.subjects.d.O0(vs);
        this.c = O0;
        io.reactivex.rxjava3.subjects.f<A> fVar = new io.reactivex.rxjava3.subjects.f<>();
        i(fVar, io.reactivex.rxjava3.internal.functions.a.e, new f60(this, 5));
        this.d = fVar;
        this.e = new io.reactivex.rxjava3.subjects.f<>();
        this.f = new io.reactivex.rxjava3.subjects.f<>();
        asu0 asu0Var = asu0.a;
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
        io.reactivex.rxjava3.internal.schedulers.d dVar = new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
        io.reactivex.rxjava3.subjects.f<izs<VS, VS>> fVar2 = new io.reactivex.rxjava3.subjects.f<>();
        fVar2.a0(dVar).U(new aa6(new g60(this, 10), 1)).subscribe(new io.reactivex.rxjava3.observers.d(O0));
        this.g = fVar2;
    }

    public static void a(di6 di6Var, io.reactivex.rxjava3.core.a aVar) {
        di6Var.getClass();
        aVar.subscribe(io.reactivex.rxjava3.internal.functions.a.c, io.reactivex.rxjava3.internal.functions.a.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.reactivex.rxjava3.disposables.c k(di6 di6Var, io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.a aVar2, int i) {
        if ((i & 1) != 0) {
            fVar = io.reactivex.rxjava3.internal.functions.a.e;
        }
        if ((i & 2) != 0) {
            aVar2 = io.reactivex.rxjava3.internal.functions.a.c;
        }
        return di6Var.f(aVar, fVar, aVar2);
    }

    public static /* synthetic */ io.reactivex.rxjava3.disposables.c l(di6 di6Var, io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.f fVar, int i) {
        if ((i & 2) != 0) {
            fVar = io.reactivex.rxjava3.internal.functions.a.d;
        }
        return di6Var.j(xVar, io.reactivex.rxjava3.internal.functions.a.e, fVar);
    }

    @Override // xsna.vk50
    public final void C(A... aArr) {
        for (A a : aArr) {
            this.d.onNext(a);
        }
    }

    public final io.reactivex.rxjava3.disposables.c f(io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.functions.f<Throwable> fVar, io.reactivex.rxjava3.functions.a aVar2) {
        io.reactivex.rxjava3.disposables.c subscribe = aVar.subscribe(aVar2, fVar);
        this.b.b(subscribe);
        return subscribe;
    }

    @Override // xsna.vk50
    public final VS g() {
        VS P0 = this.c.P0();
        if (P0 != null) {
            return P0;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> io.reactivex.rxjava3.disposables.c i(io.reactivex.rxjava3.core.q<T> qVar, io.reactivex.rxjava3.functions.f<? super Throwable> fVar, io.reactivex.rxjava3.functions.f<T> fVar2) {
        io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(fVar2, fVar);
        this.b.b(subscribe);
        return subscribe;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> io.reactivex.rxjava3.disposables.c j(io.reactivex.rxjava3.core.x<T> xVar, io.reactivex.rxjava3.functions.f<Throwable> fVar, io.reactivex.rxjava3.functions.f<T> fVar2) {
        io.reactivex.rxjava3.disposables.c subscribe = xVar.subscribe(fVar2, fVar);
        this.b.b(subscribe);
        return subscribe;
    }

    public final void m(NE ne) {
        this.f.onNext(ne);
    }

    public final void n(VE ve) {
        this.e.onNext(ve);
    }

    @Override // xsna.g4z
    public void onDestroy() {
        this.b.e();
        this.c.onComplete();
        this.d.onComplete();
        this.e.onComplete();
        this.f.onComplete();
        this.g.onComplete();
    }

    public final void q(izs<? super VS, ? extends VS> izsVar) {
        this.g.onNext(izsVar);
    }

    public final void r(izs<? super VS, s3q0> izsVar) {
        q(new ci6(izsVar, 0));
    }

    public void d(A a) {
    }
}
