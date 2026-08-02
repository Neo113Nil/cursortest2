package com.yandex.go.preorder.navigation;

import com.yandex.go.preorder.deeplinks.route.RouteData$Continuation;
import com.yandex.go.preorder.navigation.c;
import com.yandex.go.taxi.analytics.HubOpenReason;
import com.yandex.go.taxi.summary.api.model.MobilityHubSourceType;
import defpackage.a611;
import defpackage.a8w;
import defpackage.b2v;
import defpackage.b8r;
import defpackage.c0g;
import defpackage.c2v;
import defpackage.ck31;
import defpackage.crg;
import defpackage.cug;
import defpackage.cxq0;
import defpackage.dqe0;
import defpackage.e2l0;
import defpackage.eja1;
import defpackage.ffj0;
import defpackage.frj;
import defpackage.h3y;
import defpackage.h4l0;
import defpackage.h55;
import defpackage.hc00;
import defpackage.hxx;
import defpackage.ic00;
import defpackage.ihv0;
import defpackage.jc00;
import defpackage.jfb;
import defpackage.jst;
import defpackage.jzz;
import defpackage.k0g;
import defpackage.kc00;
import defpackage.krq0;
import defpackage.l4l0;
import defpackage.lsw;
import defpackage.lt2;
import defpackage.m4l0;
import defpackage.m7z;
import defpackage.n4l0;
import defpackage.n7z;
import defpackage.nv20;
import defpackage.ny61;
import defpackage.o3h;
import defpackage.o4l0;
import defpackage.o7z;
import defpackage.p4l0;
import defpackage.p7z;
import defpackage.pcm;
import defpackage.pho;
import defpackage.pj40;
import defpackage.po21;
import defpackage.pv0;
import defpackage.q0h;
import defpackage.q7z;
import defpackage.qcm;
import defpackage.qnv0;
import defpackage.qqc;
import defpackage.r7z;
import defpackage.ri1;
import defpackage.s7z;
import defpackage.t7z;
import defpackage.tje;
import defpackage.tls;
import defpackage.tq30;
import defpackage.tt2;
import defpackage.u1l0;
import defpackage.u50;
import defpackage.u7z;
import defpackage.u8w;
import defpackage.uoe0;
import defpackage.vv20;
import defpackage.w2h;
import defpackage.w511;
import defpackage.w6r;
import defpackage.wdz;
import defpackage.wnt;
import defpackage.wui;
import defpackage.xpy;
import defpackage.ynn;
import defpackage.ynv0;
import defpackage.yqg;
import defpackage.yvf0;
import defpackage.z7w;
import defpackage.za31;
import defpackage.zy11;
import defpackage.zzf;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.repository.models.FinalSuggestScreen;

/* loaded from: classes13.dex */
public final class a extends h55 {
    public final b8r D;
    public final a8w E;
    public final h3y F;
    public final h3y G;
    public final h3y H;
    public final h3y I;
    public final jc00 J;
    public final com.yandex.go.mainscreen.superapp.impl.foundation.domain.g K;
    public final krq0 L;
    public final w6r M;
    public final pcm N;
    public final yvf0 O;
    public final h3y P;
    public final nv20 Q;
    public final c2v R;
    public com.yandex.go.preload.b S;

    public a(b8r b8rVar, a8w a8wVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, jc00 jc00Var, com.yandex.go.mainscreen.superapp.impl.foundation.domain.g gVar, krq0 krq0Var, w6r w6rVar, pcm pcmVar, yvf0 yvf0Var, h3y h3yVar5, nv20 nv20Var, c2v c2vVar) {
        super(null);
        this.D = b8rVar;
        this.E = a8wVar;
        this.F = h3yVar;
        this.G = h3yVar2;
        this.H = h3yVar3;
        this.I = h3yVar4;
        this.J = jc00Var;
        this.K = gVar;
        this.L = krq0Var;
        this.M = w6rVar;
        this.N = pcmVar;
        this.O = yvf0Var;
        this.P = h3yVar5;
        this.Q = nv20Var;
        this.R = c2vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x02cc, code lost:
    
        if (r2 == r4) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0374, code lost:
    
        if (r2.a(r5, r3) == r4) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x03ef, code lost:
    
        if (r2.a(r1, r3) == r4) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0431, code lost:
    
        if (r2.a(r5, r3) == r4) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02a6, code lost:
    
        if (r2 == r4) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, t7z t7zVar, ContinuationImpl continuationImpl) {
        LocationDependentIntentRouter$processRouteDeeplink$1 locationDependentIntentRouter$processRouteDeeplink$1;
        int i;
        z7w pVar;
        Object obj;
        final p4l0 p4l0Var;
        aVar.getClass();
        if (continuationImpl instanceof LocationDependentIntentRouter$processRouteDeeplink$1) {
            locationDependentIntentRouter$processRouteDeeplink$1 = (LocationDependentIntentRouter$processRouteDeeplink$1) continuationImpl;
            int i2 = locationDependentIntentRouter$processRouteDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationDependentIntentRouter$processRouteDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = locationDependentIntentRouter$processRouteDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationDependentIntentRouter$processRouteDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    a8w a8wVar = aVar.E;
                    a8wVar.getClass();
                    if ((t7zVar instanceof r7z) || (t7zVar instanceof o7z) || (t7zVar instanceof n7z)) {
                        k0g k0gVar = (k0g) a8wVar.c.getValue();
                        zzf zzfVar = k0gVar.a;
                        tt2 tt2Var = (tt2) zzfVar.n.get();
                        c0g c0gVar = k0gVar.b;
                        jfb jfbVar = new jfb();
                        zzf zzfVar2 = c0gVar.z;
                        cxq0 cxq0Var = new cxq0(jfbVar, (ri1) zzfVar2.Tg.get(), zzfVar2.u(), new yqg(new crg()), 3);
                        h4l0 h4l0Var = new h4l0(new u8w((pho) k0gVar.a.d0.get()));
                        wnt wntVar = (wnt) zzfVar.q.get();
                        ru.yandex.taxi.favorites.data.repo.a aVar2 = (ru.yandex.taxi.favorites.data.repo.a) zzfVar.W7.get();
                        ru.yandex.taxi.persuggest.source.h hVar = (ru.yandex.taxi.persuggest.source.h) c0gVar.wE.get();
                        w2h w2hVar = new w2h((wnt) zzfVar.q.get());
                        o3h o3hVar = (o3h) zzfVar.K.get();
                        ((lt2) zzfVar.g.get()).getClass();
                        pVar = new com.yandex.go.intentprocessor.p(tt2Var, new com.yandex.go.preorder.deeplinks.route.c(new com.yandex.go.preorder.deeplinks.route.b(cxq0Var, h4l0Var, wntVar, aVar2, hVar, w2hVar, new q0h(o3hVar, new qqc())), c0gVar.s2(), (ru.yandex.taxi.favorites.data.repo.a) zzfVar.W7.get(), (ri1) zzfVar.Tg.get(), (com.yandex.go.preorder.address.b) c0gVar.yE.get(), (dqe0) zzfVar.s2.get(), (po21) zzfVar.Y1.get(), zzfVar.c(), (ru.yandex.taxi.personalstate.domain.interactor.j) zzfVar.ml.get()), (ru.yandex.taxi.orderforanother.repository.a) zzfVar.Wj.get(), new h4l0(new u8w((pho) k0gVar.a.d0.get())), (com.yandex.go.route.interactor.b) zzfVar.Qb.get(), (dqe0) zzfVar.s2.get(), (com.yandex.go.preorder.address.b) c0gVar.yE.get());
                        obj = null;
                    } else {
                        if (t7zVar instanceof s7z) {
                            cug cugVar = a8wVar.b.a;
                            cugVar.getClass();
                            HashMap hashMap = new HashMap();
                            hashMap.put("action", "transport_routes");
                            cugVar.a.a("openDeeplink", hashMap, 1, new HashMap());
                            c0g c0gVar2 = ((k0g) a8wVar.c.getValue()).b;
                            jzz jzzVar = new jzz(new m7z());
                            ru.yandex.taxi.deeplinks.e s2 = c0gVar2.s2();
                            zzf zzfVar3 = c0gVar2.z;
                            pVar = new com.yandex.go.intentprocessor.q(jzzVar, new ru.yandex.taxi.masstransit.deeplink.g(s2, (po21) zzfVar3.Y1.get(), (com.yandex.go.route.interactor.b) zzfVar3.Qb.get()), (tq30) c0gVar2.Ei.get());
                        } else if (t7zVar instanceof p7z) {
                            pVar = new com.yandex.go.intentprocessor.j(((k0g) a8wVar.c.getValue()).b.A5(), new wdz(new m7z()));
                        } else {
                            if (!(t7zVar instanceof q7z)) {
                                w511.b();
                                return null;
                            }
                            k0g k0gVar2 = (k0g) a8wVar.c.getValue();
                            zzf zzfVar4 = k0gVar2.a;
                            pVar = new com.yandex.go.intentprocessor.m(new com.yandex.go.preorder.deeplinks.requirement.a((po21) zzfVar4.Y1.get(), k0gVar2.b.s2()), zzfVar4.c(), (ru.yandex.taxi.personalstate.domain.interactor.j) zzfVar4.ml.get(), (tt2) zzfVar4.n.get());
                        }
                        obj = null;
                    }
                    locationDependentIntentRouter$processRouteDeeplink$1.L$0 = obj;
                    locationDependentIntentRouter$processRouteDeeplink$1.L$1 = obj;
                    locationDependentIntentRouter$processRouteDeeplink$1.label = 1;
                    obj2 = pVar.a(t7zVar, locationDependentIntentRouter$processRouteDeeplink$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            p4l0Var = (p4l0) locationDependentIntentRouter$processRouteDeeplink$1.L$2;
                            kotlin.b.b(obj2);
                            p4l0 p4l0Var2 = p4l0Var;
                            e2l0 e2l0Var = (e2l0) obj2;
                            pv0 pv0Var = e2l0Var.a;
                            ihv0 ihv0Var = e2l0Var.b;
                            RouteData$Continuation routeData$Continuation = e2l0Var.c;
                            n4l0 n4l0Var = (n4l0) p4l0Var2;
                            u1l0 u1l0Var = n4l0Var.a;
                            qnv0 qnv0Var = new qnv0(u1l0Var.p);
                            lsw lswVar = u1l0Var.o;
                            ic00 ic00Var = ((kc00) aVar.J).a;
                            ic00Var.getClass();
                            ynv0 b = ic00Var instanceof hc00 ? aVar.K.b(lswVar, qnv0Var) : null;
                            String str = n4l0Var.a.f;
                            za31 e = str != null ? aVar.D.e(str) : null;
                            if (((Boolean) aVar.L.a.b()).booleanValue() && e != null && e.a.b()) {
                                aVar.Q(new ynn(21, str, p4l0Var2, aVar));
                            } else {
                                if (e != null && e.a.b()) {
                                    ((qcm) aVar.N).b("drive_tariff_opened_via_deeplink", kotlin.collections.b.f());
                                }
                                aVar.Q(new u50(pv0Var, p4l0Var2, ihv0Var, b, routeData$Continuation, 11));
                            }
                            return zy11.a;
                        }
                        if (i != 3) {
                            if (i == 4) {
                                kotlin.b.b(obj2);
                                ic00 ic00Var2 = ((kc00) aVar.J).a;
                                ic00Var2.getClass();
                                aVar.Q(new frj(ic00Var2 instanceof hc00 ? aVar.K.b(null, null) : null, 2));
                                return zy11.a;
                            }
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            p4l0Var = (p4l0) locationDependentIntentRouter$processRouteDeeplink$1.L$2;
                            kotlin.b.b(obj2);
                            final int i3 = 2;
                            aVar.Q(new tls() { // from class: v7z
                                @Override // defpackage.tls
                                public final Object invoke(Object obj3) {
                                    int i4 = i3;
                                    zy11 zy11Var = zy11.a;
                                    p4l0 p4l0Var3 = p4l0Var;
                                    sqe0 sqe0Var = (sqe0) obj3;
                                    switch (i4) {
                                        case 0:
                                            sqe0Var.a.X(null, new nw20(null, "transport", new a2v(null, MobilityHubSourceType.TRANSPORT)), ((o4l0) p4l0Var3).b);
                                            break;
                                        case 1:
                                            boolean z = ((o4l0) p4l0Var3).b;
                                            c cVar = sqe0Var.a;
                                            k9s0 k9s0Var = k9s0.f;
                                            c.Z(cVar, egz.F(z ? new bov0(false, (khv0) null, (ijv0) djv0.a, 11) : bov0.e));
                                            break;
                                        default:
                                            sqe0Var.a.X(null, new nw20(null, null, null), ((l4l0) p4l0Var3).b);
                                            break;
                                    }
                                    return zy11Var;
                                }
                            });
                            return zy11.a;
                        }
                        p4l0Var = (p4l0) locationDependentIntentRouter$processRouteDeeplink$1.L$2;
                        kotlin.b.b(obj2);
                        List list = ((com.yandex.go.taxi.tariffs.internal.repository.k) ((ck31) aVar.P.get())).j().a;
                        if (list.isEmpty()) {
                            jst.e.f("TRANSPORT_HUB_ROUTING:DEEPLINK_CHOICE", "TransportHubRouting", "verticals not ready");
                        }
                        if (eja1.x(list)) {
                            aVar.Q.a(HubOpenReason.DEEPLINK);
                            c2v c2vVar = aVar.R;
                            pj40 pj40Var = ((o4l0) p4l0Var).c;
                            String str2 = pj40Var.a;
                            String str3 = pj40Var.b;
                            c2vVar.getClass();
                            c2vVar.a = new b2v(str2, str3);
                            final int i4 = 0;
                            aVar.Q(new tls() { // from class: v7z
                                @Override // defpackage.tls
                                public final Object invoke(Object obj3) {
                                    int i42 = i4;
                                    zy11 zy11Var = zy11.a;
                                    p4l0 p4l0Var3 = p4l0Var;
                                    sqe0 sqe0Var = (sqe0) obj3;
                                    switch (i42) {
                                        case 0:
                                            sqe0Var.a.X(null, new nw20(null, "transport", new a2v(null, MobilityHubSourceType.TRANSPORT)), ((o4l0) p4l0Var3).b);
                                            break;
                                        case 1:
                                            boolean z = ((o4l0) p4l0Var3).b;
                                            c cVar = sqe0Var.a;
                                            k9s0 k9s0Var = k9s0.f;
                                            c.Z(cVar, egz.F(z ? new bov0(false, (khv0) null, (ijv0) djv0.a, 11) : bov0.e));
                                            break;
                                        default:
                                            sqe0Var.a.X(null, new nw20(null, null, null), ((l4l0) p4l0Var3).b);
                                            break;
                                    }
                                    return zy11Var;
                                }
                            });
                        } else {
                            final int i5 = 1;
                            aVar.Q(new tls() { // from class: v7z
                                @Override // defpackage.tls
                                public final Object invoke(Object obj3) {
                                    int i42 = i5;
                                    zy11 zy11Var = zy11.a;
                                    p4l0 p4l0Var3 = p4l0Var;
                                    sqe0 sqe0Var = (sqe0) obj3;
                                    switch (i42) {
                                        case 0:
                                            sqe0Var.a.X(null, new nw20(null, "transport", new a2v(null, MobilityHubSourceType.TRANSPORT)), ((o4l0) p4l0Var3).b);
                                            break;
                                        case 1:
                                            boolean z = ((o4l0) p4l0Var3).b;
                                            c cVar = sqe0Var.a;
                                            k9s0 k9s0Var = k9s0.f;
                                            c.Z(cVar, egz.F(z ? new bov0(false, (khv0) null, (ijv0) djv0.a, 11) : bov0.e));
                                            break;
                                        default:
                                            sqe0Var.a.X(null, new nw20(null, null, null), ((l4l0) p4l0Var3).b);
                                            break;
                                    }
                                    return zy11Var;
                                }
                            });
                        }
                        return zy11.a;
                    }
                    kotlin.b.b(obj2);
                }
                p4l0Var = (p4l0) obj2;
                if (!(p4l0Var instanceof n4l0)) {
                    com.yandex.go.preorder.deeplinks.c cVar = (com.yandex.go.preorder.deeplinks.c) aVar.F.get();
                    u1l0 u1l0Var2 = ((n4l0) p4l0Var).a;
                    locationDependentIntentRouter$processRouteDeeplink$1.L$0 = null;
                    locationDependentIntentRouter$processRouteDeeplink$1.L$1 = null;
                    locationDependentIntentRouter$processRouteDeeplink$1.L$2 = p4l0Var;
                    locationDependentIntentRouter$processRouteDeeplink$1.label = 2;
                    obj2 = cVar.a(u1l0Var2, locationDependentIntentRouter$processRouteDeeplink$1);
                } else if (p4l0Var instanceof o4l0) {
                    com.yandex.go.preorder.deeplinks.d dVar = (com.yandex.go.preorder.deeplinks.d) aVar.G.get();
                    a611 a611Var = ((o4l0) p4l0Var).a;
                    locationDependentIntentRouter$processRouteDeeplink$1.L$0 = null;
                    locationDependentIntentRouter$processRouteDeeplink$1.L$1 = null;
                    locationDependentIntentRouter$processRouteDeeplink$1.L$2 = p4l0Var;
                    locationDependentIntentRouter$processRouteDeeplink$1.label = 3;
                } else if (p4l0Var instanceof m4l0) {
                    com.yandex.go.preorder.deeplinks.b bVar = (com.yandex.go.preorder.deeplinks.b) aVar.I.get();
                    ffj0 ffj0Var = ((m4l0) p4l0Var).a;
                    locationDependentIntentRouter$processRouteDeeplink$1.L$0 = null;
                    locationDependentIntentRouter$processRouteDeeplink$1.L$1 = null;
                    locationDependentIntentRouter$processRouteDeeplink$1.L$2 = null;
                    locationDependentIntentRouter$processRouteDeeplink$1.label = 4;
                } else {
                    if (!(p4l0Var instanceof l4l0)) {
                        aVar.Q(new xpy(24));
                        return zy11.a;
                    }
                    com.yandex.go.preorder.deeplinks.a aVar3 = (com.yandex.go.preorder.deeplinks.a) aVar.H.get();
                    vv20 vv20Var = ((l4l0) p4l0Var).a;
                    locationDependentIntentRouter$processRouteDeeplink$1.L$0 = null;
                    locationDependentIntentRouter$processRouteDeeplink$1.L$1 = null;
                    locationDependentIntentRouter$processRouteDeeplink$1.L$2 = p4l0Var;
                    locationDependentIntentRouter$processRouteDeeplink$1.label = 5;
                }
                return coroutineSingletons;
            }
        }
        locationDependentIntentRouter$processRouteDeeplink$1 = new LocationDependentIntentRouter$processRouteDeeplink$1(aVar, continuationImpl);
        Object obj22 = locationDependentIntentRouter$processRouteDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationDependentIntentRouter$processRouteDeeplink$1.label;
        if (i != 0) {
        }
        p4l0Var = (p4l0) obj22;
        if (!(p4l0Var instanceof n4l0)) {
        }
        return coroutineSingletons2;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.S = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        com.yandex.go.preload.b bVar = (com.yandex.go.preload.b) this.O.get();
        E(bVar, new uoe0(null, true), new wui(this, 16), hxx.a);
        this.S = bVar;
        ((ru.yandex.taxi.persuggest.source.f) this.M).c(FinalSuggestScreen.DEEPLINK);
        tje.N(o(), null, null, new LocationDependentIntentRouter$onLaunch$1(this, ((u7z) obj).a, null), 3);
    }

    public final void Q(tls tlsVar) {
        com.yandex.go.preload.b bVar = this.S;
        if (bVar != null) {
            bVar.i();
        }
        r(tlsVar);
    }
}
