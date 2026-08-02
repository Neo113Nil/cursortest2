package xsna;

import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.a9q0;
import xsna.ds60;
import xsna.jm50;
import xsna.qn60;
import xsna.qr60;
import xsna.t7n;
import xsna.yo60;
import xsna.z8n;

/* compiled from: DiscoverSimilarFeedMviPagingTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class h8n extends evg0<l8n, on50, z8n.a, z8n, j8n, t7n> {
    public final e9n f;
    public final ca90 g;
    public final eh60 h;
    public final uv60 i;
    public final lu0 j;
    public final io.reactivex.rxjava3.internal.schedulers.d k;

    /* compiled from: DiscoverSimilarFeedMviPagingTaskExecutor.kt */
    public final class a<T> implements io.reactivex.rxjava3.core.c0<T, T> {
        public a() {
        }

        public final void a() {
            h8n.this.e(new i8n(new qr60.a.d(false), null, null));
        }

        @Override // io.reactivex.rxjava3.core.c0
        public final io.reactivex.rxjava3.core.b0<T> b(io.reactivex.rxjava3.core.x<T> xVar) {
            return new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, new l50(new nfj(this, 12), 21)), new tp0(new s6k(this, 8), 24)).h(new pf1(new vam(this, 4), 15)), new lcb(this, 2));
        }
    }

    /* compiled from: DiscoverSimilarFeedMviPagingTaskExecutor.kt */
    public final class b<T> implements io.reactivex.rxjava3.core.c0<T, T> {
        public b() {
        }

        public static void a(b bVar, gzs gzsVar) {
            Object d = ((Result) gzsVar.invoke()).d();
            h8n h8nVar = h8n.this;
            if (!(d instanceof Result.Failure)) {
                qn60.c cVar = (qn60.c) d;
                h8nVar.e(new i8n(new qr60.a.c(cVar.a, cVar.b, false, null, 24), null, null));
            }
            Throwable a = Result.a(d);
            if (a != null) {
                com.vk.metrics.eventtracking.b.a.a(a);
            }
        }

        @Override // io.reactivex.rxjava3.core.c0
        public final io.reactivex.rxjava3.core.b0<T> b(io.reactivex.rxjava3.core.x<T> xVar) {
            return new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, new np3(new n6f(this, 14), 20)), new pp3(new i4e(this, 23), 18)).h(new b60(new n3i(this, 10), 23));
        }
    }

    public h8n(e9n e9nVar, ca90 ca90Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = e9nVar;
        this.g = ca90Var;
        this.h = e9nVar.c;
        this.i = e9nVar.h;
        this.j = e9nVar.d;
        asu0 asu0Var = asu0.a;
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
        this.k = new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        z8n.a aVar = (z8n.a) hn50Var;
        boolean z = aVar instanceof z8n.a.C4166a;
        lu0 lu0Var = this.j;
        io.reactivex.rxjava3.internal.schedulers.d dVar = this.k;
        e9n e9nVar = this.f;
        ca90 ca90Var = this.g;
        uv60 uv60Var = this.i;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z) {
            s();
            c(new t7n.a(yo60.j.c.a));
            e(new i8n(new qr60.a.e(ListLoadingState.RELOADING), null, null));
            l8n l8nVar = (l8n) nn50Var.getCurrentState();
            boolean isEmpty = l8nVar.d.isEmpty();
            io.reactivex.rxjava3.core.c0 bVar = !isEmpty ? new b() : new a();
            String str = l8nVar.c;
            String str2 = l8nVar.f;
            boolean a1 = hd60.a().a1();
            String str3 = l8nVar.h;
            Integer valueOf = Integer.valueOf(ca90Var.a);
            w6n w6nVar = e9nVar.i;
            return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(t(io.reactivex.rxjava3.core.x.x(bVar.b(ou0.a(uv60Var.a(new og60(str, str2, a1, null, null, str3, valueOf, w6nVar.h, w6nVar.i, 16)).a0(dVar), lu0Var, true).K())).l(new ao(new z13(13), 14))), new e05(new cqf(this, 14), 19)).l(new mj1(new f8n(a9q0.a.a, isEmpty), 16)), new wn(new l2k(this, 6), 23)), new f50(this, 27), new ga(this, 26));
        }
        if (!(aVar instanceof z8n.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        ds60.f fVar = ((z8n.a.b) aVar).b;
        if ((fVar instanceof ds60.f.c) || (fVar instanceof ds60.f.d)) {
            s();
            c(new t7n.a(yo60.j.c.a));
            e(new i8n(new qr60.a.e(ListLoadingState.RELOADING), null, null));
            l8n l8nVar2 = (l8n) nn50Var.getCurrentState();
            String str4 = l8nVar2.c;
            String str5 = l8nVar2.f;
            boolean a12 = hd60.a().a1();
            String str6 = l8nVar2.h;
            Integer valueOf2 = Integer.valueOf(ca90Var.a);
            w6n w6nVar2 = e9nVar.i;
            return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(t(io.reactivex.rxjava3.core.x.x(new a().b(ou0.a(uv60Var.a(new og60(str4, str5, a12, null, null, str6, valueOf2, w6nVar2.h, w6nVar2.i, 16)).a0(dVar), lu0Var, true).K())).l(new to(new d0k(5), 11))), new e05(new cqf(this, 14), 19)).l(new mj1(new f8n(a9q0.c.a, true), 16)), new wn(new l2k(this, 6), 23)), new f50(this, 27), new nf1(this, 29));
        }
        if (fVar instanceof ds60.f.b) {
            s();
            c(new t7n.a(yo60.j.c.a));
            e(new i8n(new qr60.a.e(ListLoadingState.REFRESHING), null, null));
            l8n l8nVar3 = (l8n) nn50Var.getCurrentState();
            String str7 = l8nVar3.c;
            String str8 = l8nVar3.f;
            boolean a13 = hd60.a().a1();
            String str9 = l8nVar3.h;
            Integer valueOf3 = Integer.valueOf(ca90Var.a);
            w6n w6nVar3 = e9nVar.i;
            return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(t(ou0.a(uv60Var.a(new og60(str7, str8, a13, null, null, str9, valueOf3, w6nVar3.h, w6nVar3.i, 16)).a0(dVar), lu0Var, true).K().l(new r11(new z90(27), 10))), new e05(new cqf(this, 14), 19)).l(new mj1(new f8n(a9q0.b.a, true), 16)), new wn(new l2k(this, 6), 23)), new f50(this, 27), new zl0(this, 23));
        }
        if (!(fVar instanceof ds60.f.a) && !(fVar instanceof ds60.f.e)) {
            throw new NoWhenBranchMatchedException();
        }
        s();
        e(new i8n(new qr60.a.e(ListLoadingState.LOADING), null, null));
        l8n l8nVar4 = (l8n) nn50Var.getCurrentState();
        String str10 = l8nVar4.c;
        String str11 = l8nVar4.f;
        boolean a14 = hd60.a().a1();
        String str12 = l8nVar4.e.d;
        String str13 = l8nVar4.h;
        Integer valueOf4 = Integer.valueOf(ca90Var.b);
        w6n w6nVar4 = e9nVar.i;
        return g(new io.reactivex.rxjava3.internal.operators.single.r(t(io.reactivex.rxjava3.core.x.x(new b().b(ou0.a(uv60Var.a(new og60(str10, str11, a14, str12, null, str13, valueOf4, w6nVar4.h, w6nVar4.i, 16)).a0(dVar), lu0Var, false).K())).l(new mr(new od3(25), 13))), new lp0(new n1d(this, 14), 18)).l(new q9(new cj1(21), 7)), new f50(this, 27), new pm1(this, 17));
    }

    public final void s() {
        n().a(u5n.b);
        n().a(tjf.b);
        n().a(qjf.b);
        n().a(rjf.b);
        n().a(sjf.b);
        n().a(ujf.b);
    }

    public final io.reactivex.rxjava3.internal.operators.single.l t(io.reactivex.rxjava3.internal.operators.single.y yVar) {
        return yVar.h(new xn(new lbe(this, 16), 15));
    }
}
