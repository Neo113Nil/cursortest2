package xsna;

import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.ds60;
import xsna.jm50;
import xsna.qn60;
import xsna.qr60;
import xsna.wrc0;
import xsna.yo60;
import xsna.zsc0;

/* compiled from: PostponedPostsMviPagingTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class isc0 extends evg0<nsc0, on50, zsc0.a, zsc0, lsc0, wrc0> {
    public final ftc0 f;
    public final eh60 g;
    public final s1v h;
    public final io.reactivex.rxjava3.internal.schedulers.d i;

    /* compiled from: PostponedPostsMviPagingTaskExecutor.kt */
    public final class a<T> implements io.reactivex.rxjava3.core.c0<T, T> {
        public a() {
        }

        public final void a() {
            isc0.this.e(new ksc0(new qr60.a.d(false)));
        }

        @Override // io.reactivex.rxjava3.core.c0
        public final io.reactivex.rxjava3.core.b0<T> b(io.reactivex.rxjava3.core.x<T> xVar) {
            return new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, new w250(new bk30(this, 20), 8)), new a8v(new bzw(this, 25), 11)).h(new tts(new vlc0(this, 1), 22)), new bq1(this, 4));
        }
    }

    /* compiled from: PostponedPostsMviPagingTaskExecutor.kt */
    public final class b<T> implements io.reactivex.rxjava3.core.c0<T, T> {
        public b() {
        }

        public static void a(b bVar, gzs gzsVar) {
            Object d = ((Result) gzsVar.invoke()).d();
            isc0 isc0Var = isc0.this;
            if (!(d instanceof Result.Failure)) {
                qn60.c cVar = (qn60.c) d;
                isc0Var.e(new ksc0(new qr60.a.c(cVar.a, cVar.b, false, null, 24)));
            }
            Throwable a = Result.a(d);
            if (a != null) {
                com.vk.metrics.eventtracking.b.a.a(a);
            }
        }

        @Override // io.reactivex.rxjava3.core.c0
        public final io.reactivex.rxjava3.core.b0<T> b(io.reactivex.rxjava3.core.x<T> xVar) {
            return new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, new fs00(new gda0(this, 7), 14)), new ca10(new v4w(this, 20), 13)).h(new j990(new hs00(this, 23), 4));
        }
    }

    public isc0(ftc0 ftc0Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = ftc0Var;
        this.g = ftc0Var.c;
        this.h = ftc0Var.g;
        asu0 asu0Var = asu0.a;
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
        this.i = new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        zsc0.a aVar = (zsc0.a) hn50Var;
        boolean z = aVar instanceof zsc0.a.C4196a;
        s1v s1vVar = this.h;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        io.reactivex.rxjava3.internal.schedulers.d dVar = this.i;
        if (z) {
            s();
            c(new wrc0.a(yo60.j.c.a));
            e(new ksc0(new qr60.a.e(ListLoadingState.RELOADING)));
            return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(t(v(io.reactivex.rxjava3.core.x.x(new a().b(s1vVar.i(((nsc0) nn50Var.getCurrentState()).b, null).m(dVar))))), new rt0(new w110(this, 16), 28)).l(new nh40(new aqs(this, true), 9)), new fsq(new ba40(this, 14), 20)), new uu60(this, 10), new rkz(this, 19));
        }
        if (aVar instanceof zsc0.a.c) {
            return g(io.reactivex.rxjava3.core.x.t(((zsc0.a.c) aVar).b, TimeUnit.SECONDS).m(dVar), new le50(com.vk.metrics.eventtracking.b.a, 25), new o330(this, 13));
        }
        if (!(aVar instanceof zsc0.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        ds60.f fVar = ((zsc0.a.b) aVar).b;
        if ((fVar instanceof ds60.f.c) || (fVar instanceof ds60.f.d)) {
            s();
            c(new wrc0.a(yo60.j.c.a));
            e(new ksc0(new qr60.a.e(ListLoadingState.RELOADING)));
            return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(t(v(io.reactivex.rxjava3.core.x.x(new a().b(s1vVar.i(((nsc0) nn50Var.getCurrentState()).b, null).m(dVar))))), new rt0(new w110(this, 16), 28)).l(new nh40(new aqs(this, false), 9)), new fsq(new ba40(this, 14), 20)), new uu60(this, 10), new afs(this, 19));
        }
        if (fVar instanceof ds60.f.b) {
            s();
            c(new wrc0.a(yo60.j.c.a));
            e(new ksc0(new qr60.a.e(ListLoadingState.REFRESHING)));
            return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(t(v(s1vVar.i(((nsc0) nn50Var.getCurrentState()).b, null).m(dVar))), new rt0(new w110(this, 16), 28)).l(new nh40(new aqs(this, false), 9)), new fsq(new ba40(this, 14), 20)), new uu60(this, 10), new gl30(this, 15));
        }
        if (!(fVar instanceof ds60.f.a) && !(fVar instanceof ds60.f.e)) {
            throw new NoWhenBranchMatchedException();
        }
        s();
        e(new ksc0(new qr60.a.e(ListLoadingState.LOADING)));
        nsc0 nsc0Var = (nsc0) nn50Var.getCurrentState();
        return g(new io.reactivex.rxjava3.internal.operators.single.r(t(v(io.reactivex.rxjava3.core.x.x(new b().b(s1vVar.i(nsc0Var.b, nsc0Var.c.d).m(dVar))))), new xw70(new hsc0(this, 0), 5)).l(new o8c0(new k220(15), 1)), new uu60(this, 10), new cp50(this, 9));
    }

    public final void s() {
        n().a(atc0.a);
        n().a(btc0.a);
        n().a(tjf.b);
        n().a(qjf.b);
        n().a(rjf.b);
        n().a(sjf.b);
        n().a(ujf.b);
    }

    public final io.reactivex.rxjava3.internal.operators.single.y t(io.reactivex.rxjava3.internal.operators.single.l lVar) {
        return lVar.l(new l340(new el30(this, 21), 7));
    }

    public final io.reactivex.rxjava3.internal.operators.single.l v(io.reactivex.rxjava3.core.x xVar) {
        return xVar.h(new o7y(new ut30(this, 10), 10));
    }
}
