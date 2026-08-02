package com.yandex.go.intercity.flex.dashboard.presentation;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.model.Zone;
import defpackage.cir;
import defpackage.dir;
import defpackage.dqe0;
import defpackage.fvt;
import defpackage.hu70;
import defpackage.iu70;
import defpackage.jl40;
import defpackage.jst;
import defpackage.lbl0;
import defpackage.lza1;
import defpackage.mth;
import defpackage.ny61;
import defpackage.pew;
import defpackage.qew;
import defpackage.rbl0;
import defpackage.rew;
import defpackage.w511;
import defpackage.w53;
import defpackage.w8w;
import defpackage.wiq0;
import defpackage.wnt;
import defpackage.xdw;
import defpackage.xnt;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes12.dex */
public final class g {
    public final xdw a;
    public final dqe0 b;
    public final iu70 c;
    public final wnt d;
    public final fvt e;
    public final rbl0 f;
    public final m0 g;
    public final f h;

    public g(xdw xdwVar, dqe0 dqe0Var, iu70 iu70Var, wnt wntVar, fvt fvtVar, rbl0 rbl0Var, wiq0 wiq0Var, cir cirVar) {
        this.a = xdwVar;
        this.b = dqe0Var;
        this.c = iu70Var;
        this.d = wntVar;
        this.e = fvtVar;
        this.f = rbl0Var;
        this.g = new m0(new mth(rbl0Var.a, 6), kotlinx.coroutines.flow.e.t(new d(((k) wiq0Var).j.b())), new IntercityDashboardFlexSdkInteractorImpl$routeStatsParamFlow$2(this, null));
        this.h = new f(((dir) cirVar).a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (r11 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, rew rewVar, ContinuationImpl continuationImpl) {
        IntercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1 intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1;
        int i;
        g gVar2;
        Object b;
        Object obj;
        lbl0 lbl0Var;
        rew rewVar2;
        lbl0 lbl0Var2;
        Object obj2;
        gVar.getClass();
        if (continuationImpl instanceof IntercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1) {
            intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1 = (IntercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1) continuationImpl;
            int i2 = intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.label;
                List list = null;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    m0 m0Var = gVar.g;
                    if (rewVar == null) {
                        intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.L$0 = null;
                        intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.L$1 = gVar;
                        intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.label = 1;
                        obj3 = kotlinx.coroutines.flow.e.y(m0Var, intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1);
                        if (obj3 != coroutineSingletons) {
                            gVar2 = gVar;
                            lbl0 lbl0Var3 = (lbl0) obj3;
                            intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.L$0 = null;
                            intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.L$1 = gVar2;
                            intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.L$2 = lbl0Var3;
                            intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.label = 2;
                            b = gVar.b(intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1);
                            if (b != coroutineSingletons) {
                            }
                        }
                    } else {
                        intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.L$0 = rewVar;
                        intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.label = 3;
                        obj3 = kotlinx.coroutines.flow.e.y(m0Var, intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    gVar2 = (g) intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.L$1;
                    kotlin.b.b(obj3);
                    lbl0 lbl0Var32 = (lbl0) obj3;
                    intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.L$0 = null;
                    intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.L$1 = gVar2;
                    intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.L$2 = lbl0Var32;
                    intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.label = 2;
                    b = gVar.b(intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1);
                    if (b != coroutineSingletons) {
                        obj = b;
                        lbl0Var = lbl0Var32;
                        return gVar2.c(lbl0Var, (String) obj, null);
                    }
                    return coroutineSingletons;
                }
                if (i == 2) {
                    lbl0Var = (lbl0) intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.L$2;
                    gVar2 = (g) intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.L$1;
                    kotlin.b.b(obj3);
                    obj = ((hu70) obj3).a;
                    return gVar2.c(lbl0Var, (String) obj, null);
                }
                if (i == 3) {
                    rewVar = (rew) intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.L$0;
                    kotlin.b.b(obj3);
                    lbl0 lbl0Var4 = (lbl0) obj3;
                    intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.L$0 = rewVar;
                    intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.L$1 = lbl0Var4;
                    intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.label = 4;
                    Object b2 = gVar.b(intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1);
                    if (b2 != coroutineSingletons) {
                        rewVar2 = rewVar;
                        lbl0Var2 = lbl0Var4;
                        obj2 = b2;
                        String str = (String) obj2;
                        if (!jl40.l(rewVar2, pew.b)) {
                        }
                        return gVar.c(lbl0Var2, str, list);
                    }
                    return coroutineSingletons;
                }
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lbl0Var2 = (lbl0) intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.L$1;
                rewVar2 = (rew) intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.L$0;
                kotlin.b.b(obj3);
                obj2 = ((hu70) obj3).a;
                String str2 = (String) obj2;
                if (!jl40.l(rewVar2, pew.b)) {
                    list = Collections.singletonList("reload_payment_method");
                } else if (jl40.l(rewVar2, pew.c)) {
                    list = Collections.singletonList("reload_shuttle_point");
                } else if (rewVar2 instanceof qew) {
                    list = ((qew) rewVar2).a;
                } else if (!jl40.l(rewVar2, pew.a)) {
                    w511.b();
                    return null;
                }
                return gVar.c(lbl0Var2, str2, list);
            }
        }
        intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1 = new IntercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1(gVar, continuationImpl);
        Object obj32 = intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardFlexSdkInteractorImpl$createLoadedStateQueryParams$1.label;
        List list2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c8, code lost:
    
        if (r9 != r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        IntercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1 intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1;
        int i;
        String str;
        Preorder preorder;
        Throwable th;
        String str2;
        Object b;
        try {
            if (continuationImpl instanceof IntercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1) {
                intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1 = (IntercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1) continuationImpl;
                int i2 = intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        Preorder preorder2 = this.b.a;
                        ZoneAddress zoneAddress = this.b.a.G.a;
                        if (zoneAddress == null) {
                            ny61.g("Required value was null.");
                            return null;
                        }
                        Zone zone = zoneAddress.b;
                        if (zone == null) {
                            ny61.g("Required value was null.");
                            return null;
                        }
                        str = zone.a;
                        if (preorder2.h().a() == PaymentMethod$Type.GOOGLE_PAY) {
                            try {
                                kotlinx.coroutines.flow.internal.g l = ((com.yandex.go.payments.googlepay.domain.e) this.e).l();
                                intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$0 = preorder2;
                                intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$1 = null;
                                intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$2 = null;
                                intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$3 = str;
                                intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.label = 1;
                                Object y = kotlinx.coroutines.flow.e.y(l, intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1);
                                if (y != coroutineSingletons) {
                                    preorder = preorder2;
                                    obj = y;
                                }
                            } catch (Throwable th2) {
                                preorder = preorder2;
                                th = th2;
                                jst.e.k(th, "Unexpected requestGooglePayCardId error");
                                str2 = null;
                                iu70 iu70Var = this.c;
                                intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$0 = null;
                                intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$1 = null;
                                intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$2 = null;
                                intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$3 = null;
                                intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$4 = null;
                                intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.label = 2;
                                b = ((com.yandex.go.taxi.order.network.a) iu70Var).b(preorder, str, str2, intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1);
                            }
                            return coroutineSingletons;
                        }
                        preorder = preorder2;
                        str2 = null;
                        iu70 iu70Var2 = this.c;
                        intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$0 = null;
                        intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$1 = null;
                        intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$2 = null;
                        intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$3 = null;
                        intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$4 = null;
                        intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.label = 2;
                        b = ((com.yandex.go.taxi.order.network.a) iu70Var2).b(preorder, str, str2, intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            b = ((hu70) obj).a;
                            return (String) b;
                        }
                        str = (String) intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$3;
                        preorder = (Preorder) intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$0;
                        try {
                            kotlin.b.b(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            jst.e.k(th, "Unexpected requestGooglePayCardId error");
                            str2 = null;
                            iu70 iu70Var22 = this.c;
                            intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$0 = null;
                            intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$1 = null;
                            intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$2 = null;
                            intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$3 = null;
                            intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$4 = null;
                            intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.label = 2;
                            b = ((com.yandex.go.taxi.order.network.a) iu70Var22).b(preorder, str, str2, intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1);
                        }
                    }
                    str2 = (String) obj;
                    iu70 iu70Var222 = this.c;
                    intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$0 = null;
                    intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$1 = null;
                    intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$2 = null;
                    intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$3 = null;
                    intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$4 = null;
                    intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.label = 2;
                    b = ((com.yandex.go.taxi.order.network.a) iu70Var222).b(preorder, str, str2, intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1);
                }
            }
            if (i != 0) {
            }
            str2 = (String) obj;
            iu70 iu70Var2222 = this.c;
            intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$0 = null;
            intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$1 = null;
            intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$2 = null;
            intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$3 = null;
            intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.L$4 = null;
            intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.label = 2;
            b = ((com.yandex.go.taxi.order.network.a) iu70Var2222).b(preorder, str, str2, intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1);
        } catch (CancellationException e) {
            throw e;
        }
        intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1 = new IntercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1(this, continuationImpl);
        Object obj2 = intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1.label;
    }

    public final w8w c(lbl0 lbl0Var, String str, List list) {
        KSerializer serializer = lbl0.Companion.serializer();
        xnt xntVar = (xnt) this.d;
        kotlinx.serialization.json.b a = xntVar.a(lbl0Var, serializer);
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) xntVar.c(str, kotlinx.serialization.json.c.Companion.serializer());
        xdw xdwVar = this.a;
        Map map = xdwVar.b;
        if (map == null) {
            map = kotlin.collections.b.f();
        }
        String str2 = xdwVar.a;
        w53 e = lza1.e(new Pair("routestats_body", a), new Pair("orderdraft_body", cVar), new Pair("custom_properties", map));
        if (list == null) {
            list = EmptyList.a;
        }
        return new w8w(str2, e, list);
    }
}
