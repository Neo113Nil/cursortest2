package xsna;

import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.ds60;
import xsna.dvc0;
import xsna.hwc0;
import xsna.jm50;
import xsna.qn60;
import xsna.qr60;
import xsna.yo60;

/* compiled from: PostsFromNotificationsMviPagingTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class pvc0 extends evg0<uvc0, on50, hwc0.a, hwc0, rvc0, dvc0> {
    public final lwc0 f;
    public final eh60 g;
    public final f870 h;
    public final io.reactivex.rxjava3.internal.schedulers.d i;

    /* compiled from: PostsFromNotificationsMviPagingTaskExecutor.kt */
    public final class a<T> implements io.reactivex.rxjava3.core.c0<T, T> {
        public a() {
        }

        public final void a() {
            pvc0.this.e(new qvc0(new qr60.a.d(false)));
        }

        @Override // io.reactivex.rxjava3.core.c0
        public final io.reactivex.rxjava3.core.b0<T> b(io.reactivex.rxjava3.core.x<T> xVar) {
            int i = 17;
            return new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, new oo20(new pb00(this, 17), i)), new sl30(new zl20(this, 22), i)).h(new tl30(new lw20(this, 21), i)), new zsb(this, 5));
        }
    }

    /* compiled from: PostsFromNotificationsMviPagingTaskExecutor.kt */
    public final class b<T> implements io.reactivex.rxjava3.core.c0<T, T> {
        public b() {
        }

        public static void a(b bVar, gzs gzsVar) {
            Object d = ((Result) gzsVar.invoke()).d();
            pvc0 pvc0Var = pvc0.this;
            if (!(d instanceof Result.Failure)) {
                qn60.c cVar = (qn60.c) d;
                pvc0Var.e(new qvc0(new qr60.a.c(cVar.a, cVar.b, false, null, 24)));
            }
            Throwable a = Result.a(d);
            if (a != null) {
                com.vk.metrics.eventtracking.b.a.a(a);
            }
        }

        @Override // io.reactivex.rxjava3.core.c0
        public final io.reactivex.rxjava3.core.b0<T> b(io.reactivex.rxjava3.core.x<T> xVar) {
            return new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, new wmz(new nt10(this, 16), 18)), new kjs(new mi10(this, 17), 15)).h(new zk30(new fuc0(this, 1), 14));
        }
    }

    public pvc0(lwc0 lwc0Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = lwc0Var;
        this.g = lwc0Var.c;
        this.h = lwc0Var.g;
        asu0 asu0Var = asu0.a;
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
        this.i = new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        hwc0.a aVar = (hwc0.a) hn50Var;
        boolean z = aVar instanceof hwc0.a.C3025a;
        boolean z2 = true;
        io.reactivex.rxjava3.internal.schedulers.d dVar = this.i;
        String str = null;
        f870 f870Var = this.h;
        if (z) {
            s();
            c(new dvc0.a(yo60.j.c.a));
            e(new qvc0(new qr60.a.e(ListLoadingState.RELOADING)));
            muc0 muc0Var = this.f.h;
            String str2 = muc0Var.b;
            String str3 = muc0Var.b;
            io.reactivex.rxjava3.internal.operators.single.r rVar = new io.reactivex.rxjava3.internal.operators.single.r(t(io.reactivex.rxjava3.core.x.x(new a().b(f870Var.u(null, str2).m(dVar)))), new fhb0(new d2y(this, 21), 4));
            if (str3 != null && str3.length() != 0) {
                z2 = false;
            }
            return g(new io.reactivex.rxjava3.internal.operators.single.o(rVar.l(new e40(new ovc0(this, z2, str3), 23)), new c2y(new rj60(this, 12), 21)), new p350(this, 9), new pd40(this, 12));
        }
        if (!(aVar instanceof hwc0.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        ds60.f fVar = ((hwc0.a.b) aVar).b;
        boolean z3 = fVar instanceof ds60.f.c;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z3 || (fVar instanceof ds60.f.d)) {
            s();
            c(new dvc0.a(yo60.j.c.a));
            e(new qvc0(new qr60.a.e(ListLoadingState.RELOADING)));
            return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(t(io.reactivex.rxjava3.core.x.x(new a().b(f870Var.u(null, ((uvc0) nn50Var.getCurrentState()).c).m(dVar)))), new fhb0(new d2y(this, 21), 4)).l(new e40(new ovc0(this, z2, str), 23)), new c2y(new rj60(this, 12), 21)), new p350(this, 9), new c120(this, 20));
        }
        if (fVar instanceof ds60.f.b) {
            s();
            c(new dvc0.a(yo60.j.c.a));
            e(new qvc0(new qr60.a.e(ListLoadingState.REFRESHING)));
            return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(t(f870Var.u(null, null).m(dVar)), new fhb0(new d2y(this, 21), 4)).l(new e40(new ovc0(this, z2, str), 23)), new c2y(new rj60(this, 12), 21)), new p350(this, 9), new le50(this, 10));
        }
        if (!(fVar instanceof ds60.f.a) && !(fVar instanceof ds60.f.e)) {
            throw new NoWhenBranchMatchedException();
        }
        s();
        e(new qvc0(new qr60.a.e(ListLoadingState.LOADING)));
        return g(new io.reactivex.rxjava3.internal.operators.single.r(t(io.reactivex.rxjava3.core.x.x(new b().b(f870Var.u(((uvc0) nn50Var.getCurrentState()).b.d, null).m(dVar)))), new uxb0(new ggb0(this, 4), 2)).l(new pu50(new q520(16), 7)), new p350(this, 9), new d750(this, 9));
    }

    public final void s() {
        n().a(zpq.b);
        n().a(tjf.b);
        n().a(qjf.b);
        n().a(rjf.b);
        n().a(sjf.b);
        n().a(ujf.b);
    }

    public final io.reactivex.rxjava3.internal.operators.single.l t(io.reactivex.rxjava3.core.x xVar) {
        return xVar.h(new ksb0(new bgy(this, 28), 2));
    }
}
