package com.yandex.go.taxi.tariffs.internal.routestats.interactor;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import com.yandex.go.address.models.Address;
import com.yandex.go.preorder.source.altpins.Alternatives;
import com.yandex.go.taxi.tariffs.internal.routestats.models.RouteStatsMode;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.objects.TariffUnavailable;
import defpackage.bbl0;
import defpackage.bcl0;
import defpackage.c5r;
import defpackage.cbl0;
import defpackage.cwd;
import defpackage.dwj0;
import defpackage.g7j0;
import defpackage.g8e;
import defpackage.ioe0;
import defpackage.jl40;
import defpackage.kbs;
import defpackage.kgx0;
import defpackage.l8j0;
import defpackage.lbl0;
import defpackage.msb1;
import defpackage.ngd0;
import defpackage.ny61;
import defpackage.qtb1;
import defpackage.srb1;
import defpackage.t7j0;
import defpackage.tcc;
import defpackage.uze0;
import defpackage.w3l0;
import defpackage.w511;
import defpackage.x1k;
import defpackage.x4c;
import defpackage.xd00;
import defpackage.xpb1;
import defpackage.yal0;
import defpackage.ybl0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes8.dex */
public final class c {
    public final t7j0 a;
    public final ru.yandex.taxi.provider.a b;
    public final uze0 c;
    public final ru.yandex.taxi.routestats.prefetch.m d;
    public final com.yandex.go.analytics.b e;

    public c(t7j0 t7j0Var, ru.yandex.taxi.provider.a aVar, uze0 uze0Var, ru.yandex.taxi.routestats.prefetch.m mVar, com.yandex.go.analytics.b bVar) {
        this.a = t7j0Var;
        this.b = aVar;
        this.c = uze0Var;
        this.d = mVar;
        this.e = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(g7j0 g7j0Var, ContinuationImpl continuationImpl) {
        MakeTariffRequestInteractor$consumePrefetch$1 makeTariffRequestInteractor$consumePrefetch$1;
        int i;
        ioe0 ioe0Var;
        if (continuationImpl instanceof MakeTariffRequestInteractor$consumePrefetch$1) {
            makeTariffRequestInteractor$consumePrefetch$1 = (MakeTariffRequestInteractor$consumePrefetch$1) continuationImpl;
            int i2 = makeTariffRequestInteractor$consumePrefetch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                makeTariffRequestInteractor$consumePrefetch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = makeTariffRequestInteractor$consumePrefetch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = makeTariffRequestInteractor$consumePrefetch$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cbl0 cbl0Var = new cbl0(g7j0Var.a, g7j0Var.d);
                    makeTariffRequestInteractor$consumePrefetch$1.L$0 = null;
                    makeTariffRequestInteractor$consumePrefetch$1.L$1 = null;
                    makeTariffRequestInteractor$consumePrefetch$1.label = 1;
                    obj = this.d.a(cbl0Var, makeTariffRequestInteractor$consumePrefetch$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                ioe0Var = (ioe0) obj;
                if (ioe0Var != null) {
                    return null;
                }
                this.e.a("RouteStats.Prefetched");
                lbl0 a = ioe0Var.a();
                yal0 b = ioe0Var.b();
                makeTariffRequestInteractor$consumePrefetch$1.L$0 = null;
                makeTariffRequestInteractor$consumePrefetch$1.L$1 = null;
                makeTariffRequestInteractor$consumePrefetch$1.L$2 = null;
                makeTariffRequestInteractor$consumePrefetch$1.label = 2;
                this.b.b(b, a);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        makeTariffRequestInteractor$consumePrefetch$1 = new MakeTariffRequestInteractor$consumePrefetch$1(this, continuationImpl);
        Object obj2 = makeTariffRequestInteractor$consumePrefetch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = makeTariffRequestInteractor$consumePrefetch$1.label;
        if (i != 0) {
        }
        ioe0Var = (ioe0) obj2;
        if (ioe0Var != null) {
        }
    }

    public final c5r b(dwj0 dwj0Var, g7j0 g7j0Var) {
        g7j0 g7j0Var2;
        msb1 msb1Var = msb1.Q;
        if (dwj0Var == null || (g7j0Var2 = dwj0Var.a) == null) {
            return new c5r(true, ngd0.E);
        }
        ListBuilder b = g7j0Var2.a.b(g7j0Var.a);
        if (!b.isEmpty()) {
            return new c5r(true, new l8j0(b));
        }
        if (g7j0Var.e && !g7j0Var2.e) {
            return new c5r(true, xpb1.O);
        }
        RouteStatsMode routeStatsMode = g7j0Var2.d;
        RouteStatsMode routeStatsMode2 = g7j0Var.d;
        if (routeStatsMode == routeStatsMode2) {
            if (g7j0Var.c) {
                return new c5r(((PriceUpdate$PriceLoadingState) ((com.yandex.go.taxi.tariffs.internal.repository.k) this.c).j.c.getValue()) != PriceUpdate$PriceLoadingState.LOADING, qtb1.N);
            }
            return new c5r(System.currentTimeMillis() - dwj0Var.b > MapiClientImpl.RETRIES_TIME_MILLIS, x4c.T);
        }
        int i = xd00.a[routeStatsMode2.ordinal()];
        if (i == 1) {
            return new c5r(true, msb1Var);
        }
        if (i == 2) {
            return new c5r(false, msb1Var);
        }
        w511.b();
        return null;
    }

    public final Object c(g7j0 g7j0Var, boolean z, ContinuationImpl continuationImpl) {
        bbl0 bbl0Var = g7j0Var.a;
        RouteStatsMode routeStatsMode = g7j0Var.d;
        return this.b.c(this.a.a(g7j0Var.b, bbl0Var, routeStatsMode, z, g7j0Var.e), continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0067, code lost:
    
        if (r5 == r4) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(g7j0 g7j0Var, dwj0 dwj0Var, ContinuationImpl continuationImpl) {
        MakeTariffRequestInteractor$routeStats$1 makeTariffRequestInteractor$routeStats$1;
        int i;
        dwj0 dwj0Var2;
        Object a;
        yal0 yal0Var;
        Object obj;
        cwd cwdVar;
        g7j0 g7j0Var2 = g7j0Var;
        if (continuationImpl instanceof MakeTariffRequestInteractor$routeStats$1) {
            makeTariffRequestInteractor$routeStats$1 = (MakeTariffRequestInteractor$routeStats$1) continuationImpl;
            int i2 = makeTariffRequestInteractor$routeStats$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                makeTariffRequestInteractor$routeStats$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = makeTariffRequestInteractor$routeStats$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = makeTariffRequestInteractor$routeStats$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    makeTariffRequestInteractor$routeStats$1.L$0 = g7j0Var2;
                    dwj0Var2 = dwj0Var;
                    makeTariffRequestInteractor$routeStats$1.L$1 = dwj0Var2;
                    makeTariffRequestInteractor$routeStats$1.label = 1;
                    a = a(g7j0Var2, makeTariffRequestInteractor$routeStats$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    dwj0 dwj0Var3 = (dwj0) makeTariffRequestInteractor$routeStats$1.L$1;
                    g7j0 g7j0Var3 = (g7j0) makeTariffRequestInteractor$routeStats$1.L$0;
                    kotlin.b.b(obj2);
                    dwj0Var2 = dwj0Var3;
                    g7j0Var2 = g7j0Var3;
                    a = obj2;
                }
                yal0Var = (yal0) a;
                if (yal0Var == null) {
                    return yal0Var;
                }
                yal0 yal0Var2 = (dwj0Var2 == null || (cwdVar = dwj0Var2.c) == null) ? null : cwdVar.b;
                if (dwj0Var2 == null || yal0Var2 == null) {
                    obj = null;
                } else {
                    x1k x1kVar = yal0Var2.d;
                    g7j0 g7j0Var4 = dwj0Var2.a;
                    if (!g7j0Var2.c && (System.currentTimeMillis() - dwj0Var2.b) / 1000 <= x1kVar.b && jl40.l(g7j0Var4.b.b, g7j0Var2.b.b)) {
                        bbl0 bbl0Var = g7j0Var4.a;
                        bbl0 bbl0Var2 = g7j0Var2.a;
                        w3l0 w3l0Var = bbl0Var.c;
                        List list = bbl0Var.d;
                        List list2 = w3l0Var.b;
                        w3l0 w3l0Var2 = bbl0Var2.c;
                        List list3 = bbl0Var2.d;
                        List list4 = w3l0Var2.b;
                        if (list2.size() == list4.size()) {
                            int size = list2.size();
                            int i3 = 1;
                            while (true) {
                                if (i3 < size) {
                                    if (!jl40.l(((Address) list2.get(i3)).B(), ((Address) list4.get(i3)).B())) {
                                        break;
                                    }
                                    i3++;
                                } else if (srb1.d(((Address) list2.get(0)).B(), ((Address) list4.get(0)).B()) <= x1kVar.a && jl40.l(bbl0Var.a, bbl0Var2.a) && jl40.l(bbl0Var.b, bbl0Var2.b) && list.size() == list3.size() && list.containsAll(list3) && jl40.l(bbl0Var.f, bbl0Var2.f) && jl40.l(bbl0Var.g, bbl0Var2.g) && jl40.l(bbl0Var.h, bbl0Var2.h) && jl40.l(bbl0Var.i, bbl0Var2.i) && jl40.l(bbl0Var.k, bbl0Var2.k) && jl40.l(bbl0Var.l, bbl0Var2.l) && jl40.l(bbl0Var.n, bbl0Var2.n)) {
                                    makeTariffRequestInteractor$routeStats$1.L$0 = null;
                                    makeTariffRequestInteractor$routeStats$1.L$1 = null;
                                    makeTariffRequestInteractor$routeStats$1.L$2 = null;
                                    makeTariffRequestInteractor$routeStats$1.label = 2;
                                    Object e = e(yal0Var2, g7j0Var2, makeTariffRequestInteractor$routeStats$1);
                                    if (e != obj3) {
                                        return e;
                                    }
                                }
                            }
                        }
                    }
                    obj = null;
                }
                makeTariffRequestInteractor$routeStats$1.L$0 = obj;
                makeTariffRequestInteractor$routeStats$1.L$1 = obj;
                makeTariffRequestInteractor$routeStats$1.L$2 = obj;
                makeTariffRequestInteractor$routeStats$1.label = 3;
                Object c = c(g7j0Var2, false, makeTariffRequestInteractor$routeStats$1);
                return c == obj3 ? obj3 : c;
            }
        }
        makeTariffRequestInteractor$routeStats$1 = new MakeTariffRequestInteractor$routeStats$1(this, continuationImpl);
        Object obj22 = makeTariffRequestInteractor$routeStats$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = makeTariffRequestInteractor$routeStats$1.label;
        if (i != 0) {
        }
        yal0Var = (yal0) a;
        if (yal0Var == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x0063, code lost:
    
        if (r5 == r4) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(yal0 yal0Var, g7j0 g7j0Var, ContinuationImpl continuationImpl) {
        MakeTariffRequestInteractor$routeStatsWithoutETA$1 makeTariffRequestInteractor$routeStatsWithoutETA$1;
        int i;
        yal0 yal0Var2;
        Object c;
        Iterator it;
        boolean z;
        Object obj;
        Object obj2;
        bcl0 bcl0Var;
        TariffUnavailable tariffUnavailable;
        com.yandex.go.zone.dto.response.c cVar;
        g7j0 g7j0Var2 = g7j0Var;
        if (continuationImpl instanceof MakeTariffRequestInteractor$routeStatsWithoutETA$1) {
            makeTariffRequestInteractor$routeStatsWithoutETA$1 = (MakeTariffRequestInteractor$routeStatsWithoutETA$1) continuationImpl;
            int i2 = makeTariffRequestInteractor$routeStatsWithoutETA$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                makeTariffRequestInteractor$routeStatsWithoutETA$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = makeTariffRequestInteractor$routeStatsWithoutETA$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = makeTariffRequestInteractor$routeStatsWithoutETA$1.label;
                Alternatives alternatives = null;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    yal0Var2 = yal0Var;
                    makeTariffRequestInteractor$routeStatsWithoutETA$1.L$0 = yal0Var2;
                    makeTariffRequestInteractor$routeStatsWithoutETA$1.L$1 = g7j0Var2;
                    makeTariffRequestInteractor$routeStatsWithoutETA$1.label = 1;
                    c = c(g7j0Var2, true, makeTariffRequestInteractor$routeStatsWithoutETA$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj3);
                        return obj3;
                    }
                    g7j0Var2 = (g7j0) makeTariffRequestInteractor$routeStatsWithoutETA$1.L$1;
                    yal0 yal0Var3 = (yal0) makeTariffRequestInteractor$routeStatsWithoutETA$1.L$0;
                    kotlin.b.b(obj3);
                    c = obj3;
                    yal0Var2 = yal0Var3;
                }
                yal0 yal0Var4 = (yal0) c;
                List list = yal0Var4.b;
                Alternatives alternatives2 = yal0Var4.e;
                List list2 = yal0Var4.k;
                it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ServiceLevel serviceLevel = (ServiceLevel) it.next();
                        ServiceLevel h = yal0Var2.h(serviceLevel.l);
                        if (h == null || !jl40.l(h.C, serviceLevel.C)) {
                            break;
                        }
                    } else {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                ybl0 ybl0Var = (ybl0) it2.next();
                                String str = ybl0Var.a;
                                Iterator it3 = yal0Var2.k.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it3.next();
                                    if (jl40.l(((ybl0) obj).a, str)) {
                                        break;
                                    }
                                }
                                ybl0 ybl0Var2 = (ybl0) obj;
                                bcl0 bcl0Var2 = ybl0Var2 != null ? ybl0Var2.m : null;
                                if (ybl0Var.m != null && bcl0Var2 == null) {
                                    break;
                                }
                            } else {
                                boolean z2 = (alternatives2 != null ? alternatives2.a() : null) != null;
                                Alternatives alternatives3 = yal0Var2.e;
                                boolean z3 = (alternatives3 != null ? alternatives3.a() : null) != null;
                                if (!z2 || z3) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                if (z) {
                    makeTariffRequestInteractor$routeStatsWithoutETA$1.L$0 = null;
                    makeTariffRequestInteractor$routeStatsWithoutETA$1.L$1 = null;
                    makeTariffRequestInteractor$routeStatsWithoutETA$1.L$2 = null;
                    makeTariffRequestInteractor$routeStatsWithoutETA$1.label = 2;
                    Object c2 = c(g7j0Var2, false, makeTariffRequestInteractor$routeStatsWithoutETA$1);
                    return c2 == obj4 ? obj4 : c2;
                }
                List list3 = yal0Var4.b;
                ArrayList arrayList = new ArrayList(list3.size());
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    ServiceLevel serviceLevel2 = (ServiceLevel) it4.next();
                    ServiceLevel h2 = yal0Var2.h(serviceLevel2.l);
                    if (h2 == null) {
                        Alternatives alternatives4 = alternatives;
                        kbs.g(g8e.o("Trying to merge with cache that does not contains service level ", serviceLevel2.e));
                        return alternatives4;
                    }
                    TariffUnavailable tariffUnavailable2 = serviceLevel2.m;
                    com.yandex.go.zone.dto.response.c cVar2 = serviceLevel2.d;
                    if (cVar2 == null) {
                        TariffUnavailable tariffUnavailable3 = tariffUnavailable2 == null ? h2.m : tariffUnavailable2;
                        if (tariffUnavailable2 == null) {
                            cVar2 = h2.d;
                        }
                        cVar = cVar2;
                        tariffUnavailable = tariffUnavailable3;
                    } else {
                        tariffUnavailable = tariffUnavailable2;
                        cVar = cVar2;
                    }
                    arrayList.add(new ServiceLevel(serviceLevel2.a, serviceLevel2.b, serviceLevel2.c, cVar, serviceLevel2.e, serviceLevel2.f, serviceLevel2.g, serviceLevel2.h, serviceLevel2.i, serviceLevel2.j, serviceLevel2.k, serviceLevel2.l, tariffUnavailable, serviceLevel2.n, serviceLevel2.o, serviceLevel2.p, serviceLevel2.q, serviceLevel2.r, serviceLevel2.s, serviceLevel2.t, serviceLevel2.u, serviceLevel2.v, serviceLevel2.w, serviceLevel2.x, serviceLevel2.y, serviceLevel2.z, serviceLevel2.A, serviceLevel2.B, serviceLevel2.C, serviceLevel2.D, serviceLevel2.E, serviceLevel2.F, serviceLevel2.G, serviceLevel2.H, serviceLevel2.I, serviceLevel2.J, serviceLevel2.K, serviceLevel2.L, serviceLevel2.M, serviceLevel2.N, serviceLevel2.O, serviceLevel2.P, serviceLevel2.Q, serviceLevel2.R, serviceLevel2.S, serviceLevel2.T, serviceLevel2.U, serviceLevel2.V, serviceLevel2.W, serviceLevel2.X, serviceLevel2.Y, serviceLevel2.Z));
                    it4 = it4;
                    alternatives = alternatives;
                }
                Alternatives alternatives5 = alternatives;
                Alternatives alternatives6 = yal0Var2.e;
                if (alternatives6 != null) {
                    if (alternatives2 == null) {
                        alternatives2 = alternatives5;
                    } else {
                        Alternatives.MulticlassOptionDto a = alternatives2.a();
                        Alternatives.MulticlassOptionDto a2 = alternatives6.a();
                        if (a != null && a2 != null) {
                            Alternatives.RouteStatsMulticlassDetails routeStatsMulticlassDetails = a.d;
                            Alternatives.RouteStatsMulticlassDetails routeStatsMulticlassDetails2 = a2.d;
                            if (routeStatsMulticlassDetails != null && routeStatsMulticlassDetails2 != null) {
                                Alternatives.RouteStatsMulticlassDetails routeStatsMulticlassDetails3 = routeStatsMulticlassDetails.c == null ? new Alternatives.RouteStatsMulticlassDetails(routeStatsMulticlassDetails.a, routeStatsMulticlassDetails.b, routeStatsMulticlassDetails2.c, routeStatsMulticlassDetails.d, routeStatsMulticlassDetails.e, routeStatsMulticlassDetails.f) : routeStatsMulticlassDetails;
                                TariffUnavailable tariffUnavailable4 = a.f;
                                if (tariffUnavailable4 == null) {
                                    tariffUnavailable4 = a2.f;
                                }
                                Alternatives.MulticlassOptionDto multiclassOptionDto = new Alternatives.MulticlassOptionDto(a.a, a.b, a.c, routeStatsMulticlassDetails3, a.e, tariffUnavailable4, a.g, a.h, a.i, a.j, a.k, a.l, a.m);
                                List<com.yandex.go.preorder.source.altpins.b> list4 = alternatives2.a;
                                ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
                                for (com.yandex.go.preorder.source.altpins.b bVar : list4) {
                                    if (!(bVar instanceof Alternatives.AltpinAOptionDto) && !(bVar instanceof Alternatives.AltpinBOptionDto) && !(bVar instanceof Alternatives.PlusPromoOptionDto) && !(bVar instanceof Alternatives.RequirementOptionDto) && !(bVar instanceof Alternatives.TariffSelectorOptionDto) && !(bVar instanceof Alternatives.CreateYandexCardOptionDto) && !(bVar instanceof Alternatives.AltPaymentMethodOptionDto) && !(bVar instanceof Alternatives.PlusSubscriptionOptionDto) && !(bVar instanceof Alternatives.PlusDummySubscriptionOptionDto) && !(bVar instanceof Alternatives.DeeplinkOptionDto) && !(bVar instanceof Alternatives.ComboOptionDto) && !(bVar instanceof Alternatives.MultimodalOptionDto) && !(bVar instanceof Alternatives.MarketplaceOptionDto)) {
                                        if (bVar instanceof Alternatives.MulticlassOptionDto) {
                                            bVar = multiclassOptionDto;
                                        } else {
                                            if (!(bVar instanceof Alternatives.CommonOptionLegacyDto)) {
                                                w511.b();
                                                return alternatives5;
                                            }
                                            if (kgx0.a[((Alternatives.CommonOptionLegacyDto) bVar).a.ordinal()] == 1) {
                                                bVar = multiclassOptionDto;
                                            }
                                            arrayList2.add(bVar);
                                        }
                                    }
                                    arrayList2.add(bVar);
                                }
                                alternatives2 = new Alternatives(arrayList2, alternatives2.b);
                            }
                        }
                    }
                }
                Alternatives alternatives7 = alternatives2;
                List list5 = yal0Var2.k;
                ArrayList arrayList3 = new ArrayList();
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    ybl0 ybl0Var3 = (ybl0) it5.next();
                    Iterator it6 = list2.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj2 = alternatives5;
                            break;
                        }
                        obj2 = it6.next();
                        if (jl40.l(((ybl0) obj2).a, ybl0Var3.a)) {
                            break;
                        }
                    }
                    ybl0 ybl0Var4 = (ybl0) obj2;
                    if (ybl0Var4 != null) {
                        bcl0 bcl0Var3 = ybl0Var4.m;
                        bcl0 bcl0Var4 = ybl0Var3.m;
                        if (bcl0Var3 == null || bcl0Var4 == null) {
                            bcl0Var = bcl0Var3;
                        } else {
                            com.yandex.go.zone.dto.response.c cVar3 = bcl0Var3.h;
                            if (cVar3 == null) {
                                cVar3 = bcl0Var4.h;
                            }
                            com.yandex.go.zone.dto.response.c cVar4 = cVar3;
                            TariffUnavailable tariffUnavailable5 = bcl0Var3.j;
                            if (tariffUnavailable5 == null) {
                                tariffUnavailable5 = bcl0Var4.j;
                            }
                            bcl0Var = new bcl0(bcl0Var3.a, bcl0Var3.b, bcl0Var3.c, bcl0Var3.d, bcl0Var3.e, bcl0Var3.f, bcl0Var3.g, cVar4, bcl0Var3.i, tariffUnavailable5, bcl0Var3.k);
                        }
                        arrayList3.add(new ybl0(ybl0Var4.a, ybl0Var4.b, ybl0Var4.c, ybl0Var4.d, ybl0Var4.e, ybl0Var4.f, ybl0Var4.g, ybl0Var4.h, ybl0Var4.i, ybl0Var4.j, ybl0Var4.k, ybl0Var4.l, bcl0Var, ybl0Var4.n));
                        it5 = it5;
                    }
                }
                return new yal0(yal0Var4.a, arrayList, yal0Var4.c, yal0Var4.d, alternatives7, yal0Var4.f, yal0Var4.g, yal0Var4.h, yal0Var4.i, yal0Var4.j, arrayList3, yal0Var4.l, yal0Var4.m, yal0Var4.n, yal0Var4.o, yal0Var4.p, yal0Var4.q, yal0Var4.r, yal0Var4.s, yal0Var4.t);
            }
        }
        makeTariffRequestInteractor$routeStatsWithoutETA$1 = new MakeTariffRequestInteractor$routeStatsWithoutETA$1(this, continuationImpl);
        Object obj32 = makeTariffRequestInteractor$routeStatsWithoutETA$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = makeTariffRequestInteractor$routeStatsWithoutETA$1.label;
        Alternatives alternatives8 = null;
        if (i != 0) {
        }
        yal0 yal0Var42 = (yal0) c;
        List list6 = yal0Var42.b;
        Alternatives alternatives22 = yal0Var42.e;
        List list22 = yal0Var42.k;
        it = list6.iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        if (z) {
        }
    }
}
