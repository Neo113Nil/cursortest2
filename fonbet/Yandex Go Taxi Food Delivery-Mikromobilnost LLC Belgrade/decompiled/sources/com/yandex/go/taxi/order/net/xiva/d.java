package com.yandex.go.taxi.order.net.xiva;

import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import defpackage.a3y0;
import defpackage.dw41;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.hst;
import defpackage.jst;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.tje;
import defpackage.tse;
import defpackage.ub3;
import defpackage.w511;
import defpackage.xc8;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class d {
    public final tse a;
    public final com.yandex.go.taxi_order.ws.d b;
    public final p2y0 c;
    public final dw41 d;
    public final a3y0 e = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "TaxiRouteWebSocketTrackingInteractor");
    public final kotlinx.coroutines.sync.a f = gtq0.a();
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashSet h = new LinkedHashSet();
    public boolean i;

    public d(tse tseVar, com.yandex.go.taxi_order.ws.d dVar, p2y0 p2y0Var, dw41 dw41Var) {
        this.a = tseVar;
        this.b = dVar;
        this.c = p2y0Var;
        this.d = dw41Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0067, code lost:
    
        if (r13 == r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, tse tseVar, String str, ContinuationImpl continuationImpl) {
        TaxiRouteWebSocketTrackingInteractor$setupSubscription$1 taxiRouteWebSocketTrackingInteractor$setupSubscription$1;
        int i;
        o2y0 o2y0Var;
        tse tseVar2;
        String str2;
        o2y0 o2y0Var2;
        g050 g050Var;
        l8x l8xVar;
        LinkedHashMap linkedHashMap = dVar.g;
        a3y0 a3y0Var = dVar.e;
        if (continuationImpl instanceof TaxiRouteWebSocketTrackingInteractor$setupSubscription$1) {
            taxiRouteWebSocketTrackingInteractor$setupSubscription$1 = (TaxiRouteWebSocketTrackingInteractor$setupSubscription$1) continuationImpl;
            int i2 = taxiRouteWebSocketTrackingInteractor$setupSubscription$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiRouteWebSocketTrackingInteractor$setupSubscription$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiRouteWebSocketTrackingInteractor$setupSubscription$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiRouteWebSocketTrackingInteractor$setupSubscription$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p2y0 p2y0Var = dVar.c;
                    taxiRouteWebSocketTrackingInteractor$setupSubscription$1.L$0 = tseVar;
                    taxiRouteWebSocketTrackingInteractor$setupSubscription$1.L$1 = str;
                    taxiRouteWebSocketTrackingInteractor$setupSubscription$1.label = 1;
                    obj = ((e0) p2y0Var).p(str, taxiRouteWebSocketTrackingInteractor$setupSubscription$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) taxiRouteWebSocketTrackingInteractor$setupSubscription$1.L$3;
                        o2y0Var2 = (o2y0) taxiRouteWebSocketTrackingInteractor$setupSubscription$1.L$2;
                        str2 = (String) taxiRouteWebSocketTrackingInteractor$setupSubscription$1.L$1;
                        tseVar2 = (tse) taxiRouteWebSocketTrackingInteractor$setupSubscription$1.L$0;
                        kotlin.b.b(obj);
                        try {
                            l8xVar = (l8x) linkedHashMap.get(str2);
                            if (l8xVar != null || !l8xVar.isActive()) {
                                linkedHashMap.put(str2, tje.N(tseVar2, null, null, new TaxiRouteWebSocketTrackingInteractor$setupSubscription$3$2(o2y0Var2, dVar, str2, null), 3));
                                return zy11Var;
                            }
                            a3y0Var.getClass();
                            a3y0.h(new String[]{"setupSubscription"});
                            hst hstVar = jst.e;
                            return zy11Var;
                        } finally {
                            g050Var.d(null);
                        }
                    }
                    str = (String) taxiRouteWebSocketTrackingInteractor$setupSubscription$1.L$1;
                    tseVar = (tse) taxiRouteWebSocketTrackingInteractor$setupSubscription$1.L$0;
                    kotlin.b.b(obj);
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null) {
                    a3y0.d(a3y0Var, "setupSubscription", null, new xc8(str, 22), 2);
                    return zy11Var;
                }
                kotlinx.coroutines.sync.a aVar = dVar.f;
                taxiRouteWebSocketTrackingInteractor$setupSubscription$1.L$0 = tseVar;
                taxiRouteWebSocketTrackingInteractor$setupSubscription$1.L$1 = str;
                taxiRouteWebSocketTrackingInteractor$setupSubscription$1.L$2 = o2y0Var;
                taxiRouteWebSocketTrackingInteractor$setupSubscription$1.L$3 = aVar;
                taxiRouteWebSocketTrackingInteractor$setupSubscription$1.label = 2;
                if (aVar.a(taxiRouteWebSocketTrackingInteractor$setupSubscription$1) != coroutineSingletons) {
                    tseVar2 = tseVar;
                    str2 = str;
                    o2y0Var2 = o2y0Var;
                    g050Var = aVar;
                    l8xVar = (l8x) linkedHashMap.get(str2);
                    if (l8xVar != null) {
                    }
                    linkedHashMap.put(str2, tje.N(tseVar2, null, null, new TaxiRouteWebSocketTrackingInteractor$setupSubscription$3$2(o2y0Var2, dVar, str2, null), 3));
                    return zy11Var;
                }
                return coroutineSingletons;
            }
        }
        taxiRouteWebSocketTrackingInteractor$setupSubscription$1 = new TaxiRouteWebSocketTrackingInteractor$setupSubscription$1(dVar, continuationImpl);
        Object obj2 = taxiRouteWebSocketTrackingInteractor$setupSubscription$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiRouteWebSocketTrackingInteractor$setupSubscription$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (o2y0Var != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r10v6, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d dVar, String str, boolean z, Continuation continuation) {
        TaxiRouteWebSocketTrackingInteractor$updateConnection$1 taxiRouteWebSocketTrackingInteractor$updateConnection$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        int i2;
        com.yandex.go.taxi_order.ws.d dVar2 = dVar.b;
        LinkedHashSet linkedHashSet = dVar.h;
        a3y0 a3y0Var = dVar.e;
        try {
            if (continuation instanceof TaxiRouteWebSocketTrackingInteractor$updateConnection$1) {
                taxiRouteWebSocketTrackingInteractor$updateConnection$1 = (TaxiRouteWebSocketTrackingInteractor$updateConnection$1) continuation;
                int i3 = taxiRouteWebSocketTrackingInteractor$updateConnection$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    taxiRouteWebSocketTrackingInteractor$updateConnection$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = taxiRouteWebSocketTrackingInteractor$updateConnection$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = taxiRouteWebSocketTrackingInteractor$updateConnection$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        a3y0Var.getClass();
                        a3y0.h(new String[]{"updateConnection"});
                        hst hstVar = jst.e;
                        aVar = dVar.f;
                        taxiRouteWebSocketTrackingInteractor$updateConnection$1.L$0 = str;
                        taxiRouteWebSocketTrackingInteractor$updateConnection$1.L$1 = aVar;
                        taxiRouteWebSocketTrackingInteractor$updateConnection$1.Z$0 = z;
                        taxiRouteWebSocketTrackingInteractor$updateConnection$1.label = 1;
                        if (aVar.a(taxiRouteWebSocketTrackingInteractor$updateConnection$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = taxiRouteWebSocketTrackingInteractor$updateConnection$1.Z$0;
                        ?? r10 = (g050) taxiRouteWebSocketTrackingInteractor$updateConnection$1.L$1;
                        String str2 = (String) taxiRouteWebSocketTrackingInteractor$updateConnection$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r10;
                        str = str2;
                    }
                    TaxiRouteWebSocketTrackingInteractor$WsAction taxiRouteWebSocketTrackingInteractor$WsAction = (dVar.i && z && linkedHashSet.add(str)) ? TaxiRouteWebSocketTrackingInteractor$WsAction.CONNECT : (z && linkedHashSet.remove(str)) ? TaxiRouteWebSocketTrackingInteractor$WsAction.DISCONNECT : TaxiRouteWebSocketTrackingInteractor$WsAction.NONE;
                    aVar.d(null);
                    i2 = a.a[taxiRouteWebSocketTrackingInteractor$WsAction.ordinal()];
                    if (i2 != 1) {
                        a3y0Var.getClass();
                        a3y0.h(new String[]{"updateConnection"});
                        hst hstVar2 = jst.e;
                        if (ub3.a(dVar2.p) > 1) {
                            jst.e.getClass();
                        } else {
                            dVar2.d();
                        }
                    } else if (i2 == 2) {
                        a3y0Var.getClass();
                        a3y0.h(new String[]{"updateConnection"});
                        hst hstVar3 = jst.e;
                        dVar2.e();
                    } else if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    return zy11.a;
                }
            }
            if (dVar.i) {
            }
            aVar.d(null);
            i2 = a.a[taxiRouteWebSocketTrackingInteractor$WsAction.ordinal()];
            if (i2 != 1) {
            }
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        taxiRouteWebSocketTrackingInteractor$updateConnection$1 = new TaxiRouteWebSocketTrackingInteractor$updateConnection$1(dVar, continuation);
        Object obj2 = taxiRouteWebSocketTrackingInteractor$updateConnection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiRouteWebSocketTrackingInteractor$updateConnection$1.label;
        if (i != 0) {
        }
    }

    public final void c() {
        tje.N(this.a, null, null, new TaxiRouteWebSocketTrackingInteractor$resumeAll$1(this, null), 3);
    }

    public final void d(String str) {
        tje.N(this.a, null, null, new TaxiRouteWebSocketTrackingInteractor$startListening$1(this, str, null), 3);
    }

    public final void e() {
        tje.N(this.a, null, null, new TaxiRouteWebSocketTrackingInteractor$stopAll$1(this, null), 3);
    }

    public final void f(String str) {
        tje.N(this.a, null, null, new TaxiRouteWebSocketTrackingInteractor$stopListening$1(this, str, null), 3);
    }
}
