package xsna;

import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.a5n0;
import xsna.ds60;
import xsna.jm50;
import xsna.n4n0;
import xsna.qn60;
import xsna.qr60;
import xsna.yo60;

/* compiled from: SuggestedPostsMviPagingTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class r4n0 extends evg0<v4n0, on50, a5n0.b, a5n0, t4n0, n4n0> {
    public final i5n0 f;
    public final eh60 g;
    public final crx0 h;
    public final io.reactivex.rxjava3.internal.schedulers.d i;

    /* compiled from: SuggestedPostsMviPagingTaskExecutor.kt */
    public final class a<T> implements io.reactivex.rxjava3.core.c0<T, T> {
        public a() {
        }

        public final void a() {
            r4n0.this.e(new s4n0(new qr60.a.d(false)));
        }

        @Override // io.reactivex.rxjava3.core.c0
        public final io.reactivex.rxjava3.core.b0<T> b(io.reactivex.rxjava3.core.x<T> xVar) {
            return new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, new oo20(new qjm0(this, 1), 26)), new sl30(new rtg0(this, 7), 28)).h(new tl30(new qyi0(this, 6), 27)), new zsb(this, 8));
        }
    }

    /* compiled from: SuggestedPostsMviPagingTaskExecutor.kt */
    public final class b<T> implements io.reactivex.rxjava3.core.c0<T, T> {
        public b() {
        }

        public static void a(b bVar, gzs gzsVar) {
            Object d = ((Result) gzsVar.invoke()).d();
            r4n0 r4n0Var = r4n0.this;
            if (!(d instanceof Result.Failure)) {
                qn60.c cVar = (qn60.c) d;
                r4n0Var.e(new s4n0(new qr60.a.c(cVar.a, cVar.b, false, null, 24)));
            }
            Throwable a = Result.a(d);
            if (a != null) {
                com.vk.metrics.eventtracking.b.a.a(a);
            }
        }

        @Override // io.reactivex.rxjava3.core.c0
        public final io.reactivex.rxjava3.core.b0<T> b(io.reactivex.rxjava3.core.x<T> xVar) {
            return new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, new wmz(new zyl0(this, 7), 26)), new kjs(new cim0(this, 3), 25)).h(new zk30(new fuc0(this, 15), 21));
        }
    }

    public r4n0(i5n0 i5n0Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = i5n0Var;
        this.g = i5n0Var.c;
        this.h = i5n0Var.g;
        asu0 asu0Var = asu0.a;
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
        this.i = new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        a5n0.b bVar = (a5n0.b) hn50Var;
        boolean z = bVar instanceof a5n0.b.a;
        io.reactivex.rxjava3.internal.schedulers.d dVar = this.i;
        crx0 crx0Var = this.h;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z) {
            s();
            c(new n4n0.a(yo60.j.c.a));
            e(new s4n0(new qr60.a.e(ListLoadingState.RELOADING)));
            return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(t(io.reactivex.rxjava3.core.x.x(new a().b(crx0Var.k(((v4n0) nn50Var.getCurrentState()).b, null).m(dVar)))), new l960(new b8e0(this, 13), 10)).l(new fhb0(new q4n0(this, true), 8)), new h8l0(new wgm0(this, 1), 4)), new p350(this, 22), new d750(this, 19));
        }
        if (!(bVar instanceof a5n0.b.C2524b)) {
            throw new NoWhenBranchMatchedException();
        }
        ds60.f fVar = ((a5n0.b.C2524b) bVar).b;
        if ((fVar instanceof ds60.f.c) || (fVar instanceof ds60.f.d)) {
            s();
            c(new n4n0.a(yo60.j.c.a));
            e(new s4n0(new qr60.a.e(ListLoadingState.RELOADING)));
            return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(t(io.reactivex.rxjava3.core.x.x(new a().b(crx0Var.k(((v4n0) nn50Var.getCurrentState()).b, null).m(dVar)))), new l960(new b8e0(this, 13), 10)).l(new fhb0(new q4n0(this, false), 8)), new h8l0(new wgm0(this, 1), 4)), new p350(this, 22), new whm0(this, 1));
        }
        if (fVar instanceof ds60.f.b) {
            s();
            c(new n4n0.a(yo60.j.c.a));
            e(new s4n0(new qr60.a.e(ListLoadingState.REFRESHING)));
            return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(t(crx0Var.k(((v4n0) nn50Var.getCurrentState()).b, null).m(dVar)), new l960(new b8e0(this, 13), 10)).l(new fhb0(new q4n0(this, false), 8)), new h8l0(new wgm0(this, 1), 4)), new p350(this, 22), new pd40(this, 15));
        }
        if (!(fVar instanceof ds60.f.a) && !(fVar instanceof ds60.f.e)) {
            throw new NoWhenBranchMatchedException();
        }
        s();
        e(new s4n0(new qr60.a.e(ListLoadingState.LOADING)));
        v4n0 v4n0Var = (v4n0) nn50Var.getCurrentState();
        return g(new io.reactivex.rxjava3.internal.operators.single.r(t(io.reactivex.rxjava3.core.x.x(new b().b(crx0Var.k(v4n0Var.b, v4n0Var.c.d).m(dVar)))), new pu50(new wug0(this, 14), 13)).l(new aam0(new rgl0(9), 1)), new p350(this, 22), new le50(this, 16));
    }

    public final void s() {
        n().a(ypq.b);
        n().a(tjf.b);
        n().a(qjf.b);
        n().a(rjf.b);
        n().a(sjf.b);
        n().a(ujf.b);
    }

    public final io.reactivex.rxjava3.internal.operators.single.l t(io.reactivex.rxjava3.core.x xVar) {
        return xVar.h(new jsb0(new ggb0(this, 20), 12));
    }
}
