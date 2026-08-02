package xsna;

import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.domain.model.DiscoverCustomIntent;
import com.vk.newsfeed.impl.config.FeedTabsDelayConfig;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import ru.ok.android.commons.http.Http;
import xsna.a9q0;
import xsna.ds60;
import xsna.jm50;
import xsna.lg60;
import xsna.qn60;
import xsna.qr60;
import xsna.rf60;
import xsna.yo60;

/* compiled from: NewsfeedCustomPagingTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class sg60 extends evg0<xf60, on50, lg60.a, lg60, vf60, rf60> {
    public final o1n f;
    public final lu0 g;
    public final AtomicBoolean h;
    public final AtomicReference<wn60> i;
    public final wg60 j;
    public final Object k;
    public final eh60 l;
    public final io.reactivex.rxjava3.internal.schedulers.d m;
    public final Object n;
    public final Object o;
    public NewsEntriesContainer.Info p;
    public btl<x960> q;

    /* compiled from: NewsfeedCustomPagingTaskExecutor.kt */
    public final class a<T> implements io.reactivex.rxjava3.core.c0<T, T> {
        public a() {
        }

        public final void a() {
            sg60.this.e(new uf60(new qr60.a.d(false)));
        }

        @Override // io.reactivex.rxjava3.core.c0
        public final io.reactivex.rxjava3.core.b0<T> b(io.reactivex.rxjava3.core.x<T> xVar) {
            return new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, new pw40(new ap30(this, 3), 2)), new wmz(new nt10(this, 9), 9)).h(new kjs(new mi10(this, 9), 8)), new rg60(this, 0));
        }
    }

    /* compiled from: NewsfeedCustomPagingTaskExecutor.kt */
    public final class b<T> implements io.reactivex.rxjava3.core.c0<T, T> {
        public b() {
        }

        public static void a(b bVar, gzs gzsVar) {
            Object d = ((Result) gzsVar.invoke()).d();
            sg60 sg60Var = sg60.this;
            if (!(d instanceof Result.Failure)) {
                qn60.c cVar = (qn60.c) d;
                sg60Var.e(new uf60(new qr60.a.c(cVar.a, cVar.b, false, null, 24)));
            }
            Throwable a = Result.a(d);
            if (a != null) {
                com.vk.metrics.eventtracking.b.a.a(a);
            }
        }

        @Override // io.reactivex.rxjava3.core.c0
        public final io.reactivex.rxjava3.core.b0<T> b(io.reactivex.rxjava3.core.x<T> xVar) {
            return new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, new ljs(new f0z(this, 15), 12)), new j3z(new r820(this, 7), 6)).h(new lw30(new rxz(this, 8), 1));
        }
    }

    public sg60(o1n o1nVar, lu0 lu0Var, AtomicBoolean atomicBoolean, AtomicReference atomicReference, wg60 wg60Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = o1nVar;
        this.g = lu0Var;
        this.h = atomicBoolean;
        this.i = atomicReference;
        this.j = wg60Var;
        x750 x750Var = new x750(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k = msy.a(lazyThreadSafetyMode, x750Var);
        this.l = wg60Var.d;
        asu0 asu0Var = asu0.a;
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
        this.m = new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
        this.n = msy.a(lazyThreadSafetyMode, new fc(25));
        this.o = msy.a(lazyThreadSafetyMode, new ml7(18));
    }

    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        btl<x960>.a aVar;
        lg60.a aVar2 = (lg60.a) hn50Var;
        if (aVar2 instanceof lg60.a.C3266a) {
            return v();
        }
        if (aVar2 instanceof lg60.a.d) {
            ((lg60.a.d) aVar2).getClass();
            btl<x960> btlVar = this.q;
            if (btlVar != null) {
                btlVar.M0();
                return null;
            }
        } else {
            boolean z = aVar2 instanceof lg60.a.b;
            nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
            if (z) {
                ds60.f fVar = ((lg60.a.b) aVar2).b;
                if (fVar instanceof ds60.f.c) {
                    s();
                    c(new rf60.a(yo60.j.c.a));
                    e(new uf60(new qr60.a.e(ListLoadingState.RELOADING)));
                    nf60 nf60Var = (nf60) this.k.getValue();
                    String str = ((xf60) this.b.getCurrentState()).g.b;
                    if (str == null) {
                        str = "";
                    }
                    return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.o(t(w(nf60Var.a(new og60(str, "discover_full", hd60.a().a1(), null, DiscoverCustomIntent.PTR, null, null, null, null, Http.StatusCode.RANGE_NOT_SATISFIABLE))).K().m(this.m)), new lz(new cww(this, 19), 25)).h(new lav(new owv(this, 15), 13)), new pi0(new zb60(this, 1), 27)).l(new l960(new mu1(21, this, a9q0.c.a), 1)), new qg60(new rop(this, 23), 0)), new xk30(this, 6), new oo20(this, 7));
                }
                if (fVar instanceof ds60.f.d) {
                    return v();
                }
                boolean z2 = fVar instanceof ds60.f.b;
                ?? r5 = this.k;
                io.reactivex.rxjava3.internal.schedulers.d dVar = this.m;
                if (z2) {
                    s();
                    c(new rf60.a(yo60.j.c.a));
                    e(new uf60(new qr60.a.e(ListLoadingState.RELOADING)));
                    m6n.a(((xf60) nn50Var.getCurrentState()).g);
                    nf60 nf60Var2 = (nf60) r5.getValue();
                    String str2 = ((xf60) nn50Var.getCurrentState()).g.b;
                    return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.o(t(w(nf60Var2.a(new og60(str2 == null ? "" : str2, "discover_full", hd60.a().a1(), null, DiscoverCustomIntent.PTR, null, null, null, null, Http.StatusCode.RANGE_NOT_SATISFIABLE))).K().m(dVar)), new lz(new cww(this, 19), 25)).h(new lav(new owv(this, 15), 13)), new pi0(new zb60(this, 1), 27)).l(new l960(new mu1(21, this, a9q0.b.a), 1)), new qg60(new rop(this, 23), 0)), new xk30(this, 6), new q440(this, 6));
                }
                if (!(fVar instanceof ds60.f.a) && !(fVar instanceof ds60.f.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                s();
                e(new uf60(new qr60.a.e(ListLoadingState.LOADING)));
                String str3 = epx.f(((xf60) nn50Var.getCurrentState()).d.d, "0") ? null : ((xf60) nn50Var.getCurrentState()).d.d;
                nf60 nf60Var3 = (nf60) r5.getValue();
                String str4 = ((xf60) nn50Var.getCurrentState()).g.b;
                return g(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.o(t(io.reactivex.rxjava3.core.x.x(new b().b(nf60Var3.a(new og60(str4 == null ? "" : str4, "discover_full", hd60.a().a1(), str3, DiscoverCustomIntent.NEXT_PAGE, null, null, null, null, Http.StatusCode.RANGE_NOT_SATISFIABLE)).a0(dVar).K()))), new hu50(new px30(this, 7), 1)).l(new oq(new svz(13), 23)), new sj4(new cws(this, 26), 23)).l(new t34(new hb40(this, 4), 22)), new xk30(this, 6), new vk40(this, 6));
            }
            if (aVar2 instanceof lg60.a.c) {
                btl<x960> btlVar2 = this.q;
                if (btlVar2 != null && (aVar = btlVar2.g) != null) {
                    btlVar2.e.subscribe(aVar);
                    btlVar2.g = null;
                    return null;
                }
            } else {
                boolean z3 = aVar2 instanceof jg60;
                o1n o1nVar = this.f;
                wg60 wg60Var = this.j;
                if (z3) {
                    NewsEntriesContainer.Info info = this.p;
                    if (info != null) {
                        LinkedHashSet c = wg60Var.b.c();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : c) {
                            if (obj instanceof NewsEntry) {
                                arrayList.add(obj);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        DiscoverId discoverId = ((xf60) nn50Var.getCurrentState()).g;
                        o1nVar.getClass();
                        n1n.d(discoverId, info, arrayList2);
                        return null;
                    }
                } else {
                    if (!(aVar2 instanceof kg60)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    NewsEntriesContainer.Info info2 = this.p;
                    if (info2 != null) {
                        LinkedHashSet c2 = wg60Var.b.c();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : c2) {
                            if (obj2 instanceof NewsEntry) {
                                arrayList3.add(obj2);
                            }
                        }
                        NewsEntriesContainer newsEntriesContainer = new NewsEntriesContainer(info2, new ArrayList(arrayList3));
                        DiscoverId discoverId2 = ((xf60) nn50Var.getCurrentState()).g;
                        o1nVar.getClass();
                        n1n.e(discoverId2, newsEntriesContainer);
                    }
                }
            }
        }
        return null;
    }

    public final void s() {
        n().a(v5n.b);
        n().a(mg60.a);
        n().a(w5n.b);
        n().a(tjf.b);
        n().a(qjf.b);
        n().a(rjf.b);
        n().a(sjf.b);
        n().a(ujf.b);
    }

    public final io.reactivex.rxjava3.internal.operators.single.y t(io.reactivex.rxjava3.core.x xVar) {
        return xVar.l(new pu50(new d410(this, 11), 1));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
    public final zvg0 v() {
        s();
        c(new rf60.a(yo60.j.c.a));
        e(new uf60(new qr60.a.e(ListLoadingState.RELOADING)));
        nf60 nf60Var = (nf60) this.k.getValue();
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        DiscoverId discoverId = ((xf60) nn50Var.getCurrentState()).g;
        boolean z = ((xf60) nn50Var.getCurrentState()).h;
        nf60Var.getClass();
        o1n o1nVar = this.f;
        io.reactivex.rxjava3.core.q<R> L = o1nVar.b(discoverId).L(new o7(new mf60(o1nVar, z, discoverId), 25), false);
        ed edVar = new ed(new zl20(this, 11), 28);
        L.getClass();
        io.reactivex.rxjava3.core.q o1Var = new io.reactivex.rxjava3.internal.operators.observable.o1(L, edVar);
        if (((xf60) nn50Var.getCurrentState()).i) {
            btl<x960> btlVar = new btl<>(o1Var, !((Boolean) this.n.getValue()).booleanValue() ? Long.MAX_VALUE : ((FeedTabsDelayConfig) this.o.getValue()).b, this.h.get());
            this.q = btlVar;
            o1Var = btlVar.a0(asu0.a.d());
        }
        io.reactivex.rxjava3.core.x rVar = new io.reactivex.rxjava3.internal.operators.single.r(io.reactivex.rxjava3.core.x.x(new a().b(new io.reactivex.rxjava3.internal.operators.single.o(t(w(o1Var).K().m(this.m)), new lz(new cww(this, 19), 25)))).h(new lav(new owv(this, 15), 13)), new pi0(new zb60(this, 1), 27));
        if (((xf60) nn50Var.getCurrentState()).i) {
            rVar = new io.reactivex.rxjava3.internal.operators.single.i(rVar, new igb(this, 2));
        }
        return g(new io.reactivex.rxjava3.internal.operators.single.o(rVar.l(new l960(new mu1(21, this, a9q0.a.a), 1)), new qg60(new rop(this, 23), 0)), new xk30(this, 6), new ow40(this, 3));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 w(io.reactivex.rxjava3.core.q qVar) {
        wnt wntVar = new wnt(new cqv(this, 21), 12);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return qVar.E(wntVar, lVar, kVar, kVar);
    }
}
