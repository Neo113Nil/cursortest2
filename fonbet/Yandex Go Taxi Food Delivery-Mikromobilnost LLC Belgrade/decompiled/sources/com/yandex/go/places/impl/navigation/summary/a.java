package com.yandex.go.places.impl.navigation.summary;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.tariffs.interactor.b;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.a611;
import defpackage.acc0;
import defpackage.bhv0;
import defpackage.ck31;
import defpackage.djv0;
import defpackage.dqe0;
import defpackage.dse0;
import defpackage.e3n;
import defpackage.egz;
import defpackage.eja1;
import defpackage.hre0;
import defpackage.hxx;
import defpackage.icv0;
import defpackage.jst;
import defpackage.k9s0;
import defpackage.kp50;
import defpackage.kpi0;
import defpackage.lgv0;
import defpackage.ljo;
import defpackage.m950;
import defpackage.ny61;
import defpackage.o430;
import defpackage.oep0;
import defpackage.ose0;
import defpackage.paq0;
import defpackage.pep0;
import defpackage.vpe0;
import defpackage.w411;
import defpackage.xby;
import defpackage.xpb1;
import defpackage.y9y0;
import defpackage.yvf0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.masstransit.deeplink.g;

/* loaded from: classes13.dex */
public final class a implements acc0 {
    public final y9y0 a;
    public final g b;
    public final oep0 c;
    public final yvf0 d;
    public final dqe0 e;
    public final kpi0 f;
    public final paq0 g;
    public final lgv0 h;
    public final icv0 i;
    public final b j;
    public final ck31 k;

    public a(y9y0 y9y0Var, g gVar, oep0 oep0Var, yvf0 yvf0Var, dqe0 dqe0Var, kpi0 kpi0Var, paq0 paq0Var, lgv0 lgv0Var, icv0 icv0Var, b bVar, ck31 ck31Var) {
        this.a = y9y0Var;
        this.b = gVar;
        this.c = oep0Var;
        this.d = yvf0Var;
        this.e = dqe0Var;
        this.f = kpi0Var;
        this.g = paq0Var;
        this.h = lgv0Var;
        this.i = icv0Var;
        this.j = bVar;
        this.k = ck31Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(w411 w411Var, Throwable th, ContinuationImpl continuationImpl) {
        PlacesNativeSummaryRouterImpl$handleFallbackTransportPoints$1 placesNativeSummaryRouterImpl$handleFallbackTransportPoints$1;
        int i;
        try {
            if (continuationImpl instanceof PlacesNativeSummaryRouterImpl$handleFallbackTransportPoints$1) {
                placesNativeSummaryRouterImpl$handleFallbackTransportPoints$1 = (PlacesNativeSummaryRouterImpl$handleFallbackTransportPoints$1) continuationImpl;
                int i2 = placesNativeSummaryRouterImpl$handleFallbackTransportPoints$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    placesNativeSummaryRouterImpl$handleFallbackTransportPoints$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = placesNativeSummaryRouterImpl$handleFallbackTransportPoints$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesNativeSummaryRouterImpl$handleFallbackTransportPoints$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        g gVar = this.b;
                        placesNativeSummaryRouterImpl$handleFallbackTransportPoints$1.L$0 = null;
                        placesNativeSummaryRouterImpl$handleFallbackTransportPoints$1.L$1 = th;
                        placesNativeSummaryRouterImpl$handleFallbackTransportPoints$1.label = 1;
                        obj = gVar.a(w411Var, placesNativeSummaryRouterImpl$handleFallbackTransportPoints$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) placesNativeSummaryRouterImpl$handleFallbackTransportPoints$1.L$1;
                        kotlin.b.b(obj);
                    }
                    return (a611) obj;
                }
            }
            if (i != 0) {
            }
            return (a611) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            ljo.a(th2, th);
            xby.l(jst.e, "TRANSPORT_ROUTE_DEEPLINK", null, th2, "Failed to build transport route from Places deeplink with current route source fallback", 2);
            return null;
        }
        placesNativeSummaryRouterImpl$handleFallbackTransportPoints$1 = new PlacesNativeSummaryRouterImpl$handleFallbackTransportPoints$1(this, continuationImpl);
        Object obj2 = placesNativeSummaryRouterImpl$handleFallbackTransportPoints$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesNativeSummaryRouterImpl$handleFallbackTransportPoints$1.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|8|(1:(1:(3:12|13|14)(2:16|17))(2:18|19))(3:23|24|(2:26|27))|20|21))|40|6|7|8|(0)(0)|20|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (r13.a != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
    
        r0 = new defpackage.w411(r14, r13.b, r13.c);
        r15.L$0 = null;
        r15.L$1 = null;
        r15.L$2 = null;
        r15.L$3 = null;
        r15.L$4 = null;
        r15.label = 2;
        r0 = a(r0, r0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        if (r0 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        defpackage.xby.l(defpackage.jst.e, "TRANSPORT_ROUTE_DEEPLINK", null, r0, "Failed to build transport route from Places deeplink", 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(w411 w411Var, zzs zzsVar, ContinuationImpl continuationImpl) {
        PlacesNativeSummaryRouterImpl$handleTransportPointsWithFallback$1 placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$1;
        int i;
        if (continuationImpl instanceof PlacesNativeSummaryRouterImpl$handleTransportPointsWithFallback$1) {
            placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$1 = (PlacesNativeSummaryRouterImpl$handleTransportPointsWithFallback$1) continuationImpl;
            int i2 = placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$1.label = i2 - Integer.MIN_VALUE;
                PlacesNativeSummaryRouterImpl$handleTransportPointsWithFallback$1 placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$12 = placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$1;
                Object obj = placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = this.b;
                    placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$12.L$0 = w411Var;
                    placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$12.L$1 = zzsVar;
                    placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$12.label = 1;
                    obj = gVar.a(w411Var, placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return (a611) obj;
                    }
                    zzsVar = (zzs) placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$12.L$1;
                    w411Var = (w411) placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$12.L$0;
                    kotlin.b.b(obj);
                }
                return (a611) obj;
            }
        }
        placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$1 = new PlacesNativeSummaryRouterImpl$handleTransportPointsWithFallback$1(this, continuationImpl);
        PlacesNativeSummaryRouterImpl$handleTransportPointsWithFallback$1 placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$122 = placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$1;
        Object obj3 = placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesNativeSummaryRouterImpl$handleTransportPointsWithFallback$122.label;
        if (i != 0) {
        }
        return (a611) obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (kotlinx.coroutines.a.x(r7, r10, r1) == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        if (r11 == r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(w411 w411Var, ContinuationImpl continuationImpl) {
        PlacesNativeSummaryRouterImpl$openTransport$1 placesNativeSummaryRouterImpl$openTransport$1;
        int i;
        a611 a611Var;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof PlacesNativeSummaryRouterImpl$openTransport$1) {
            placesNativeSummaryRouterImpl$openTransport$1 = (PlacesNativeSummaryRouterImpl$openTransport$1) continuationImpl;
            int i2 = placesNativeSummaryRouterImpl$openTransport$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesNativeSummaryRouterImpl$openTransport$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesNativeSummaryRouterImpl$openTransport$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesNativeSummaryRouterImpl$openTransport$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Address h = this.e.a.G.h();
                    zzs B = h != null ? h.B() : null;
                    placesNativeSummaryRouterImpl$openTransport$1.L$0 = null;
                    placesNativeSummaryRouterImpl$openTransport$1.L$1 = null;
                    placesNativeSummaryRouterImpl$openTransport$1.label = 1;
                    obj = b(w411Var, B, placesNativeSummaryRouterImpl$openTransport$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        List list = ((k) this.k).j().a;
                        if (list.isEmpty()) {
                            jst.e.f("TRANSPORT_HUB_ROUTING:PLACES", "TransportHubRouting", "verticals not ready");
                        }
                        k9s0 k9s0Var = k9s0.f;
                        k9s0 G = egz.G(true, new bhv0(0), djv0.a);
                        ((pep0) this.c).f((m950) this.d.get(), new hre0(new vpe0(this.e.a), eja1.x(list) ? new ose0(G) : new dse0(G), "open_summary_from_places_router", false, xpb1.c), hxx.a);
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                a611Var = (a611) obj;
                if (a611Var != null) {
                    return zy11Var;
                }
                o430 o430Var = e3n.b;
                long U = kp50.U(3, DurationUnit.SECONDS);
                PlacesNativeSummaryRouterImpl$openTransport$2 placesNativeSummaryRouterImpl$openTransport$2 = new PlacesNativeSummaryRouterImpl$openTransport$2(this, a611Var, null);
                placesNativeSummaryRouterImpl$openTransport$1.L$0 = null;
                placesNativeSummaryRouterImpl$openTransport$1.L$1 = null;
                placesNativeSummaryRouterImpl$openTransport$1.L$2 = null;
                placesNativeSummaryRouterImpl$openTransport$1.label = 2;
            }
        }
        placesNativeSummaryRouterImpl$openTransport$1 = new PlacesNativeSummaryRouterImpl$openTransport$1(this, continuationImpl);
        Object obj3 = placesNativeSummaryRouterImpl$openTransport$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesNativeSummaryRouterImpl$openTransport$1.label;
        if (i != 0) {
        }
        a611Var = (a611) obj3;
        if (a611Var != null) {
        }
    }
}
