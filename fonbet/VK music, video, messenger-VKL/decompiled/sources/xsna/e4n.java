package xsna;

import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.domain.model.DiscoverCustomIntent;
import com.vk.newsfeed.impl.config.FeedTabsDelayConfig;
import com.vk.newsfeed.impl.discover.repository.DiscoverNewsEntriesRepository;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.a9q0;
import xsna.ds60;
import xsna.e3n;
import xsna.jm50;
import xsna.l5n;
import xsna.qn60;
import xsna.qr60;
import xsna.yo60;

/* compiled from: DiscoverMediaPagingTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class e4n extends evg0<t4n, on50, l5n.b, l5n, h4n, e3n> {
    public final a5n f;
    public final x5n g;
    public final AtomicReference<wn60> h;
    public final io.reactivex.rxjava3.internal.schedulers.d i;
    public final bpn0 j;
    public NewsEntriesContainer k;
    public boolean l;
    public btl<x960> m;
    public final Object n;

    /* compiled from: DiscoverMediaPagingTaskExecutor.kt */
    public final class a<T> implements io.reactivex.rxjava3.core.c0<T, T> {
        public a() {
        }

        public final void a() {
            e4n.this.e(new i4n(new qr60.a.d(false)));
        }

        @Override // io.reactivex.rxjava3.core.c0
        public final io.reactivex.rxjava3.core.b0<T> b(io.reactivex.rxjava3.core.x<T> xVar) {
            return new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, new c60(new mmf(this, 22), 22)), new bn3(new j6e(this, 19), 24)).h(new tf1(new h6g(this, 12), 19)), new ahe(this, 2));
        }
    }

    /* compiled from: DiscoverMediaPagingTaskExecutor.kt */
    public final class b<T> implements io.reactivex.rxjava3.core.c0<T, T> {
        public b() {
        }

        @Override // io.reactivex.rxjava3.core.c0
        public final io.reactivex.rxjava3.core.b0<T> b(io.reactivex.rxjava3.core.x<T> xVar) {
            return new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, new eu0(new b5h(this, 12), 23)), new fu0(new fre(this, 18), 20)).h(new h60(new nhe(this, 16), 22));
        }
    }

    public e4n(a5n a5nVar, x5n x5nVar, AtomicReference atomicReference, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = a5nVar;
        this.g = x5nVar;
        this.h = atomicReference;
        asu0 asu0Var = asu0.a;
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
        this.i = new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
        this.j = new bpn0(new kk1(7));
        this.n = msy.a(LazyThreadSafetyMode.NONE, new ig(7));
    }

    public static io.reactivex.rxjava3.internal.operators.single.y E(io.reactivex.rxjava3.internal.operators.single.i iVar, a9q0 a9q0Var) {
        return iVar.l(new nm3(new wzf(a9q0Var, 11), 10));
    }

    public static io.reactivex.rxjava3.internal.operators.observable.b0 H(io.reactivex.rxjava3.internal.operators.observable.b0 b0Var) {
        ia iaVar = new ia(new com.vk.movika.sdk.base.logic.interactor.f(20), 27);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return b0Var.E(iaVar, lVar, kVar, kVar);
    }

    public static io.reactivex.rxjava3.internal.operators.single.i I(io.reactivex.rxjava3.internal.operators.single.r rVar, awq awqVar) {
        return new io.reactivex.rxjava3.internal.operators.single.i(rVar.l(new jo3(new f1j(awqVar, 7), 9)).h(new p41(new arf(awqVar, 9), 17)), new axb(awqVar, 1));
    }

    public static io.reactivex.rxjava3.internal.operators.single.o J(io.reactivex.rxjava3.core.x xVar, awq awqVar) {
        return new io.reactivex.rxjava3.internal.operators.single.o(xVar, new gf0(new j9k(awqVar, 3), 19));
    }

    public static void N(e4n e4nVar, gzs gzsVar) {
        Object d = ((Result) gzsVar.invoke()).d();
        if (!(d instanceof Result.Failure)) {
            qn60.c cVar = (qn60.c) d;
            e4nVar.e(new i4n(new qr60.a.c(cVar.a, cVar.b, false, null, 24)));
        }
        Throwable a2 = Result.a(d);
        if (a2 != null) {
            com.vk.metrics.eventtracking.b.a.a(a2);
        }
    }

    public final io.reactivex.rxjava3.internal.operators.single.o A(io.reactivex.rxjava3.internal.operators.single.b0 b0Var) {
        return new io.reactivex.rxjava3.internal.operators.single.o(b0Var, new mp0(new wcj(this, 6), 20));
    }

    @Override // xsna.dl50, xsna.mn50
    public final boolean B(hn50 hn50Var) {
        l5n.b bVar = (l5n.b) hn50Var;
        if (!(bVar instanceof l5n.b.c)) {
            return true;
        }
        ds60.f fVar = ((l5n.b.c) bVar).b;
        boolean z = fVar instanceof ds60.f.e;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        return z ? ((t4n) nn50Var.getCurrentState()).b.e == ListLoadingState.ERROR : !(fVar instanceof ds60.f.a) || ((t4n) nn50Var.getCurrentState()).b.e == ListLoadingState.IDLE;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 L(io.reactivex.rxjava3.core.q qVar) {
        j50 j50Var = new j50(new i50(this, 24), 20);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return qVar.E(j50Var, lVar, kVar, kVar).F(new l50(new nfj(this, 11), 20));
    }

    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        l5n.b bVar = (l5n.b) hn50Var;
        boolean z = bVar instanceof l5n.b.C3233b;
        int i = 5;
        int i2 = 28;
        x5n x5nVar = this.g;
        io.reactivex.rxjava3.internal.schedulers.d dVar = this.i;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z) {
            x5nVar.getClass();
            i0q0.j(new rc4(x5nVar, 5));
            t();
            e(new i4n(new qr60.a.e(ListLoadingState.RELOADING)));
            mx6 d = DiscoverNewsEntriesRepository.a.d(((t4n) nn50Var.getCurrentState()).c, false, ((t4n) nn50Var.getCurrentState()).d, v(), DiscoverCustomIntent.PRELOAD, new m6o0(MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA));
            btl<x960> btlVar = new btl<>(d.b, ((FeedTabsDelayConfig) this.n.getValue()).b, true);
            this.m = btlVar;
            s3q0 s3q0Var = s3q0.a;
            d.b = z(H(w(L(btlVar.a0(asu0.a.d())))));
            io.reactivex.rxjava3.core.x x = io.reactivex.rxjava3.core.x.x(new a().b(s(A(d.K().m(dVar)))));
            awq awqVar = d.c;
            return g(E(new io.reactivex.rxjava3.internal.operators.single.i(I(y(J(x, awqVar)), awqVar), new q46(this, 2)), a9q0.a.a), new nf1(this, i2), new c40(this, 17));
        }
        if (!(bVar instanceof l5n.b.d)) {
            int i3 = 3;
            if (bVar instanceof l5n.b.c) {
                ds60.f fVar = ((l5n.b.c) bVar).b;
                int i4 = 20;
                int i5 = 23;
                int i6 = 7;
                if (fVar instanceof ds60.f.d) {
                    x5nVar.getClass();
                    i0q0.j(new rc4(x5nVar, 5));
                    t();
                    e(new i4n(new qr60.a.e(ListLoadingState.RELOADING)));
                    mx6 d2 = DiscoverNewsEntriesRepository.a.d(((t4n) nn50Var.getCurrentState()).c, false, ((t4n) nn50Var.getCurrentState()).d, v(), DiscoverCustomIntent.PRELOAD, new m6o0(MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA));
                    d2.b = z(H(w(L(d2.b))));
                    io.reactivex.rxjava3.internal.operators.single.l h = io.reactivex.rxjava3.core.x.x(new a().b(s(A(d2.K().m(dVar))))).h(new tp0(new s6k(this, i6), i5));
                    awq awqVar2 = d2.c;
                    return g(new io.reactivex.rxjava3.internal.operators.single.n(E(I(y(J(h, awqVar2)), awqVar2), a9q0.d.a), new defpackage.z(new rlh(this, i), i4)), new nf1(this, i2), new f40(this, 18));
                }
                int i7 = 22;
                int i8 = 8;
                if (fVar instanceof ds60.f.a) {
                    t4n t4nVar = (t4n) nn50Var.getCurrentState();
                    e(new i4n(new qr60.a.e(ListLoadingState.LOADING)));
                    DiscoverNewsEntriesRepository discoverNewsEntriesRepository = DiscoverNewsEntriesRepository.a;
                    mx6 c = DiscoverNewsEntriesRepository.c(((t4n) nn50Var.getCurrentState()).c, t4nVar.b.d, this.l ? DiscoverCustomIntent.PRELOAD : DiscoverCustomIntent.NEXT_PAGE, new krk0(4, MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA));
                    c.b = z(H(w(c.b)));
                    io.reactivex.rxjava3.core.x x2 = io.reactivex.rxjava3.core.x.x(new b().b(s(A(c.K().m(dVar)))));
                    awq awqVar3 = c.c;
                    return g(new io.reactivex.rxjava3.internal.operators.single.n(I(new io.reactivex.rxjava3.internal.operators.single.r(J(x2, awqVar3), new qs6(new r3h(this, i8), 9)), awqVar3).l(new e10(new l8k(i3), i7)), new j41(new po1(this, i2), 12)), new nf1(this, i2), new defpackage.x(this, i4));
                }
                if (fVar instanceof ds60.f.b) {
                    x5nVar.getClass();
                    i0q0.j(new rc4(x5nVar, 5));
                    t();
                    c(new e3n.a(yo60.j.c.a));
                    e(new i4n(new qr60.a.e(ListLoadingState.REFRESHING)));
                    mx6 d3 = DiscoverNewsEntriesRepository.a.d(((t4n) nn50Var.getCurrentState()).c, true, ((t4n) nn50Var.getCurrentState()).d, v(), DiscoverCustomIntent.PTR, new m6o0(MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA));
                    d3.b = z(H(w(L(d3.b))));
                    io.reactivex.rxjava3.internal.operators.single.l h2 = s(A(d3.K().m(dVar))).h(new tp0(new s6k(this, i6), i5));
                    awq awqVar4 = d3.c;
                    return g(E(I(y(J(h2, awqVar4)), awqVar4), a9q0.b.a), new nf1(this, i2), new np3(this, 19));
                }
                if (fVar instanceof ds60.f.c) {
                    return x();
                }
                if (!(fVar instanceof ds60.f.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                t4n t4nVar2 = (t4n) nn50Var.getCurrentState();
                e(new i4n(new qr60.a.e(ListLoadingState.LOADING)));
                DiscoverNewsEntriesRepository discoverNewsEntriesRepository2 = DiscoverNewsEntriesRepository.a;
                mx6 c2 = DiscoverNewsEntriesRepository.c(((t4n) nn50Var.getCurrentState()).c, t4nVar2.b.d, this.l ? DiscoverCustomIntent.PRELOAD : DiscoverCustomIntent.NEXT_PAGE, new krk0(4, MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA));
                c2.b = z(H(w(c2.b)));
                io.reactivex.rxjava3.core.x x3 = io.reactivex.rxjava3.core.x.x(new b().b(s(A(c2.K().m(dVar)))));
                awq awqVar5 = c2.c;
                return g(new io.reactivex.rxjava3.internal.operators.single.n(I(new io.reactivex.rxjava3.internal.operators.single.r(J(x3, awqVar5), new qs6(new r3h(this, i8), 9)), awqVar5).l(new e10(new l8k(i3), i7)), new sv(new pwk(this, i3), 26)), new nf1(this, i2), new tz(this, 15));
            }
            if (bVar instanceof r5n) {
                NewsEntriesContainer newsEntriesContainer = this.k;
                NewsEntriesContainer.Info info = newsEntriesContainer != null ? newsEntriesContainer.b : null;
                if (info != null) {
                    List<NewsEntry> list = newsEntriesContainer != null ? newsEntriesContainer.c : null;
                    if (list != null) {
                        q1n v = v();
                        DiscoverId discoverId = ((t4n) nn50Var.getCurrentState()).c;
                        v.getClass();
                        n1n.d(discoverId, info, list);
                        return null;
                    }
                }
            } else if (bVar instanceof s5n) {
                NewsEntriesContainer newsEntriesContainer2 = this.k;
                NewsEntriesContainer.Info info2 = newsEntriesContainer2 != null ? newsEntriesContainer2.b : null;
                if (info2 != null) {
                    List<NewsEntry> list2 = newsEntriesContainer2 != null ? newsEntriesContainer2.c : null;
                    if (list2 != null) {
                        NewsEntriesContainer newsEntriesContainer3 = new NewsEntriesContainer(info2, list2);
                        q1n v2 = v();
                        DiscoverId discoverId2 = ((t4n) nn50Var.getCurrentState()).c;
                        v2.getClass();
                        n1n.e(discoverId2, newsEntriesContainer3);
                        return null;
                    }
                }
            } else {
                if (!(bVar instanceof l5n.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((t4n) nn50Var.getCurrentState()).e <= 3) {
                    n().a(u5n.a);
                    com.vk.core.utils.newtork.b.a.getClass();
                    return g(com.vk.core.utils.newtork.b.f().K(), new lem(), new st0(this, 14));
                }
            }
        } else {
            if (((l5n.b.d) bVar).b) {
                return x();
            }
            btl<x960> btlVar2 = this.m;
            if (btlVar2 != null) {
                btlVar2.M0();
                return null;
            }
        }
        return null;
    }

    public final io.reactivex.rxjava3.core.x s(io.reactivex.rxjava3.internal.operators.single.o oVar) {
        return ((Boolean) this.j.getValue()).booleanValue() ? new io.reactivex.rxjava3.internal.operators.single.o(oVar, new t00(new t3h(this, 8), 25)).h(new j22(new x2e(this, 11), 26)) : oVar;
    }

    public final void t() {
        n().a(v5n.a);
        n().a(w5n.a);
        n().a(u5n.a);
        n().a(tjf.b);
        n().a(qjf.b);
        n().a(rjf.b);
        n().a(sjf.b);
        n().a(ujf.b);
    }

    public final q1n v() {
        return this.f.q.getValue();
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 w(io.reactivex.rxjava3.core.q qVar) {
        om1 om1Var = new om1(new dhh(this, 9), 13);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return qVar.E(om1Var, lVar, kVar, kVar);
    }

    public final zvg0 x() {
        x5n x5nVar = this.g;
        x5nVar.getClass();
        i0q0.j(new rc4(x5nVar, 5));
        t();
        c(new e3n.a(yo60.j.c.a));
        e(new i4n(new qr60.a.e(ListLoadingState.REFRESHING)));
        DiscoverNewsEntriesRepository discoverNewsEntriesRepository = DiscoverNewsEntriesRepository.a;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        mx6 d = discoverNewsEntriesRepository.d(((t4n) nn50Var.getCurrentState()).c, true, ((t4n) nn50Var.getCurrentState()).d, v(), DiscoverCustomIntent.PTR, new m6o0(MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA));
        d.b = z(H(w(L(d.b))));
        io.reactivex.rxjava3.internal.operators.single.l h = s(A(d.K().m(this.i))).h(new tp0(new s6k(this, 7), 23));
        awq awqVar = d.c;
        return g(new io.reactivex.rxjava3.internal.operators.single.n(E(I(y(J(h, awqVar)), awqVar), a9q0.c.a), new wn(new bhh(this, 10), 21)), new nf1(this, 28), new vl0(this, 20));
    }

    public final io.reactivex.rxjava3.internal.operators.single.r y(io.reactivex.rxjava3.internal.operators.single.o oVar) {
        return new io.reactivex.rxjava3.internal.operators.single.r(oVar, new r41(new lbe(this, 15), 23));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 z(io.reactivex.rxjava3.internal.operators.observable.b0 b0Var) {
        da daVar = new da(new gmj(this, 4), 24);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return b0Var.E(daVar, lVar, kVar, kVar);
    }
}
