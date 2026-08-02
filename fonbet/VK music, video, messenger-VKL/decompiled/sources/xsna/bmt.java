package xsna;

import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.jm50;
import xsna.qr60;
import xsna.smt;
import xsna.xlt;
import xsna.yo60;

/* compiled from: GeoPostsMviPagingTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class bmt extends evg0<gmt, on50, smt.a, smt, dmt, xlt> {
    public final vmt f;
    public final eh60 g;
    public final nl h;
    public final io.reactivex.rxjava3.internal.schedulers.d i;

    /* compiled from: GeoPostsMviPagingTaskExecutor.kt */
    public static final class a {
        public final blt a;
        public final boolean b;
        public final klk c;

        public a(blt bltVar, boolean z, klk klkVar) {
            this.a = bltVar;
            this.b = z;
            this.c = klkVar;
        }
    }

    /* compiled from: GeoPostsMviPagingTaskExecutor.kt */
    public final class b<T> implements io.reactivex.rxjava3.core.c0<T, T> {
        public b() {
        }

        public final void a() {
            bmt.this.e(new cmt(new qr60.a.d(false)));
        }

        @Override // io.reactivex.rxjava3.core.c0
        public final io.reactivex.rxjava3.core.b0<T> b(io.reactivex.rxjava3.core.x<T> xVar) {
            int i = 24;
            return new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, new m5(new d9j(this, 13), i)), new defpackage.x(new ifg(this, 22), i)).h(new defpackage.z(new rlh(this, 13), 25)), new x97(this, 3));
        }
    }

    /* compiled from: GeoPostsMviPagingTaskExecutor.kt */
    public final class c<T> implements io.reactivex.rxjava3.core.c0<T, T> {
        public c() {
        }

        @Override // io.reactivex.rxjava3.core.c0
        public final io.reactivex.rxjava3.core.b0<T> b(io.reactivex.rxjava3.core.x<T> xVar) {
            return new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, new b00(new qqe(this, 22), 26)), new cw(new lrk(this, 18), 22)).h(new ew(new z8f(this, 17), 24));
        }
    }

    public bmt(vmt vmtVar, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = vmtVar;
        this.g = vmtVar.d;
        this.h = vmtVar.h;
        asu0 asu0Var = asu0.a;
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
        this.i = new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        smt.a aVar = (smt.a) hn50Var;
        boolean z = aVar instanceof smt.a.C3680a;
        int i = 29;
        int i2 = 24;
        int i3 = 17;
        int i4 = 9;
        int i5 = 20;
        int i6 = 14;
        int i7 = 28;
        int i8 = 18;
        io.reactivex.rxjava3.internal.schedulers.d dVar = this.i;
        vmt vmtVar = this.f;
        nl nlVar = this.h;
        if (z) {
            s();
            c(new xlt.a(yo60.j.c.a));
            e(new cmt(new qr60.a.e(ListLoadingState.RELOADING)));
            return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(t(io.reactivex.rxjava3.core.x.x(new b().b(new io.reactivex.rxjava3.internal.operators.single.r(nlVar.e(vmtVar.i.a), new kb(new qcl(this, i6), 28)).m(dVar)))).l(new h8(new zkh(this, i8), i5)), new mm6(new zxo(this, i4), i8)).l(new l8(new fgh(this, i3), i2)), new defpackage.d(new ire(this, i8), i)), new hz(this, i7), new amt(this, 0));
        }
        if (!(aVar instanceof smt.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        ds60.f fVar = ((smt.a.b) aVar).b;
        boolean z2 = fVar instanceof ds60.f.c;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z2 || (fVar instanceof ds60.f.d)) {
            s();
            c(new xlt.a(yo60.j.c.a));
            e(new cmt(new qr60.a.e(ListLoadingState.RELOADING)));
            return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(t(io.reactivex.rxjava3.core.x.x(new b().b(new io.reactivex.rxjava3.internal.operators.single.r(nlVar.e(vmtVar.i.a), new kb(new qcl(this, i6), 28)).m(dVar)))).l(new h8(new zkh(this, i8), i5)), new mm6(new zxo(this, i4), i8)).l(new l8(new fgh(this, i3), i2)), new defpackage.d(new ire(this, i8), i)), new hz(this, i7), new qz(this, i8));
        }
        if (fVar instanceof ds60.f.b) {
            s();
            c(new xlt.a(yo60.j.c.a));
            e(new cmt(new qr60.a.e(ListLoadingState.REFRESHING)));
            return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(t(new io.reactivex.rxjava3.internal.operators.single.r(nlVar.e(vmtVar.i.a), new kb(new qcl(this, i6), 28)).m(dVar)).l(new h8(new zkh(this, i8), i5)), new mm6(new zxo(this, i4), i8)).l(new l8(new fgh(this, i3), i2)), new defpackage.d(new ire(this, i8), i)), new hz(this, i7), new xf1(this, 25));
        }
        if (!(fVar instanceof ds60.f.a) && !(fVar instanceof ds60.f.e)) {
            throw new NoWhenBranchMatchedException();
        }
        s();
        e(new cmt(new qr60.a.e(ListLoadingState.LOADING)));
        gmt gmtVar = (gmt) nn50Var.getCurrentState();
        int i9 = vmtVar.i.a;
        String str = gmtVar.d.d;
        bpn0 bpn0Var = cqm0.a;
        if (str == null) {
            str = "";
        }
        nlVar.getClass();
        return g(new io.reactivex.rxjava3.internal.operators.single.r(t(io.reactivex.rxjava3.core.x.x(new c().b(rsg0.W(new srt(i9, str), 7).l(new ox0(new b4r(4), 19)).m(dVar)))), new sj4(new cws(this, 2), 16)).l(new rj4(new af2(22), 15)), new hz(this, i7), new oz(this, i8));
    }

    public final void s() {
        n().a(tmt.a);
        n().a(tjf.b);
        n().a(qjf.b);
        n().a(rjf.b);
        n().a(sjf.b);
        n().a(ujf.b);
    }

    public final io.reactivex.rxjava3.internal.operators.single.l t(io.reactivex.rxjava3.core.x xVar) {
        return xVar.h(new ho1(new r9k(this, 12), 23));
    }
}
