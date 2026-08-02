package com.yandex.go.payments.transport.navigation;

import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.api.transport.TransportPaymentListSource;
import com.yandex.go.payments.transport.domain.TransportPaymentListInteractor$observePaymentMethods$$inlined$flatMapLatest$1;
import defpackage.aii;
import defpackage.ama;
import defpackage.azz;
import defpackage.by90;
import defpackage.cca0;
import defpackage.cz51;
import defpackage.ere0;
import defpackage.f9y0;
import defpackage.h0a0;
import defpackage.h55;
import defpackage.i3y;
import defpackage.ida0;
import defpackage.jj3;
import defpackage.jst;
import defpackage.lv90;
import defpackage.m950;
import defpackage.mo21;
import defpackage.nsd0;
import defpackage.ny61;
import defpackage.po21;
import defpackage.pv01;
import defpackage.qaa0;
import defpackage.qu;
import defpackage.qzj0;
import defpackage.raa0;
import defpackage.sj30;
import defpackage.t411;
import defpackage.tc;
import defpackage.tj30;
import defpackage.tje;
import defpackage.tls;
import defpackage.u411;
import defpackage.uba0;
import defpackage.uj4;
import defpackage.uk10;
import defpackage.um3;
import defpackage.v411;
import defpackage.vba0;
import defpackage.w511;
import defpackage.w9a0;
import defpackage.wma0;
import defpackage.yvf0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes13.dex */
public final class e extends h55 implements m950 {
    public final ere0 D;
    public final jj3 E;
    public final com.yandex.go.payments.transport.domain.d F;
    public final yvf0 G;
    public final raa0 H;
    public final po21 I;
    public final tj30 J;
    public final com.yandex.go.payments.badges.a K;
    public final f9y0 L;
    public final i3y M;

    public e(ere0 ere0Var, jj3 jj3Var, com.yandex.go.payments.transport.domain.d dVar, tc tcVar, raa0 raa0Var, po21 po21Var, tj30 tj30Var, com.yandex.go.payments.badges.a aVar, f9y0 f9y0Var) {
        super(null);
        this.D = ere0Var;
        this.E = jj3Var;
        this.F = dVar;
        this.G = tcVar;
        this.H = raa0Var;
        this.I = po21Var;
        this.J = tj30Var;
        this.K = aVar;
        this.L = f9y0Var;
        this.M = kotlin.a.a(new pv01(3, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        if (r1 == r4) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(e eVar, ContinuationImpl continuationImpl) {
        TransportPaymentListRouterImpl$launchForAuthorizedUser$1 transportPaymentListRouterImpl$launchForAuthorizedUser$1;
        int i;
        Map map;
        m950 m950Var;
        e eVar2;
        String str;
        eVar.getClass();
        i3y i3yVar = eVar.M;
        if (continuationImpl instanceof TransportPaymentListRouterImpl$launchForAuthorizedUser$1) {
            transportPaymentListRouterImpl$launchForAuthorizedUser$1 = (TransportPaymentListRouterImpl$launchForAuthorizedUser$1) continuationImpl;
            int i2 = transportPaymentListRouterImpl$launchForAuthorizedUser$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportPaymentListRouterImpl$launchForAuthorizedUser$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transportPaymentListRouterImpl$launchForAuthorizedUser$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportPaymentListRouterImpl$launchForAuthorizedUser$1.label;
                if (i == 0) {
                    if (i == 1) {
                        m950Var = (m950) transportPaymentListRouterImpl$launchForAuthorizedUser$1.L$1;
                        eVar2 = (e) transportPaymentListRouterImpl$launchForAuthorizedUser$1.L$0;
                        kotlin.b.b(obj);
                        eVar2.A(m950Var, obj, new aii(eVar, 6));
                        return zy11.a;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    zzs zzsVar = ((mo21) obj).a();
                    t411 t411Var = (t411) eVar.x;
                    com.yandex.go.payments.lpm.navigation.d a = ((by90) ((sj30) i3yVar.getValue()).d.getValue()).a();
                    PaymentsScreen paymentsScreen = PaymentsScreen.TRANSPORT_SUMMARY;
                    h0a0 h0a0Var = new h0a0(zzsVar, null);
                    sj30 sj30Var = (sj30) i3yVar.getValue();
                    lv90 i3 = ((by90) sj30Var.d.getValue()).b().i("transport_external");
                    eVar.A(a, new azz(paymentsScreen, "no_feature", h0a0Var, i3 == null ? sj30Var.b.a(i3) : null, true, false, null, false, t411Var == null && (str = t411Var.b) != null && str.length() > 0, null, null, null, null, null, null, t411Var != null ? t411Var.c : null, null, null, 457856), new ama(9, eVar));
                    return zy11.a;
                }
                kotlin.b.b(obj);
                v411 v411Var = TransportPaymentListSource.Companion;
                t411 t411Var2 = (t411) eVar.x;
                String str2 = t411Var2 != null ? t411Var2.a : null;
                v411Var.getClass();
                map = TransportPaymentListSource.map;
                TransportPaymentListSource transportPaymentListSource = (TransportPaymentListSource) map.get(str2);
                if (transportPaymentListSource == null) {
                    transportPaymentListSource = TransportPaymentListSource.DEFAULT;
                }
                int i4 = u411.a[transportPaymentListSource.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        w511.b();
                        return null;
                    }
                    qaa0 a2 = eVar.H.a();
                    if (a2 == null || (zzsVar = a2.b) == null) {
                        po21 po21Var = eVar.I;
                        transportPaymentListRouterImpl$launchForAuthorizedUser$1.label = 2;
                        obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).f(transportPaymentListRouterImpl$launchForAuthorizedUser$1);
                    }
                    t411 t411Var3 = (t411) eVar.x;
                    com.yandex.go.payments.lpm.navigation.d a3 = ((by90) ((sj30) i3yVar.getValue()).d.getValue()).a();
                    PaymentsScreen paymentsScreen2 = PaymentsScreen.TRANSPORT_SUMMARY;
                    h0a0 h0a0Var2 = new h0a0(zzsVar, null);
                    sj30 sj30Var2 = (sj30) i3yVar.getValue();
                    lv90 i32 = ((by90) sj30Var2.d.getValue()).b().i("transport_external");
                    eVar.A(a3, new azz(paymentsScreen2, "no_feature", h0a0Var2, i32 == null ? sj30Var2.b.a(i32) : null, true, false, null, false, t411Var3 == null && (str = t411Var3.b) != null && str.length() > 0, null, null, null, null, null, null, t411Var3 != null ? t411Var3.c : null, null, null, 457856), new ama(9, eVar));
                    return zy11.a;
                }
                m950Var = (m950) eVar.G.get();
                transportPaymentListRouterImpl$launchForAuthorizedUser$1.L$0 = eVar;
                transportPaymentListRouterImpl$launchForAuthorizedUser$1.L$1 = m950Var;
                transportPaymentListRouterImpl$launchForAuthorizedUser$1.label = 1;
                obj = eVar.Q(transportPaymentListRouterImpl$launchForAuthorizedUser$1);
                if (obj != coroutineSingletons) {
                    eVar2 = eVar;
                    eVar2.A(m950Var, obj, new aii(eVar, 6));
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        transportPaymentListRouterImpl$launchForAuthorizedUser$1 = new TransportPaymentListRouterImpl$launchForAuthorizedUser$1(eVar, continuationImpl);
        Object obj2 = transportPaymentListRouterImpl$launchForAuthorizedUser$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportPaymentListRouterImpl$launchForAuthorizedUser$1.label;
        if (i == 0) {
        }
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        ((by90) ((sj30) this.M.getValue()).d.getValue()).dispose();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.E.c(new um3(Events$Zalogin$LoginContext.SUMMARY, new qzj0(null, new tls() { // from class: com.yandex.go.payments.transport.navigation.d
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                Result result = (Result) obj2;
                Object value = result.getValue();
                boolean z = value instanceof Result.Failure;
                e eVar = e.this;
                if (!z) {
                    tje.N(eVar.o(), null, null, new TransportPaymentListRouterImpl$onLaunch$1$1$1(eVar, null), 3);
                }
                Throwable a = Result.a(result.getValue());
                if (a != null) {
                    jst.e.k(new IllegalStateException(a), "Failed to authorize user after direct auth command");
                    eVar.r(new qu(9));
                }
                return zy11.a;
            }
        }), false, false, 28));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(ContinuationImpl continuationImpl) {
        TransportPaymentListRouterImpl$createPayload$1 transportPaymentListRouterImpl$createPayload$1;
        int i;
        if (continuationImpl instanceof TransportPaymentListRouterImpl$createPayload$1) {
            transportPaymentListRouterImpl$createPayload$1 = (TransportPaymentListRouterImpl$createPayload$1) continuationImpl;
            int i2 = transportPaymentListRouterImpl$createPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportPaymentListRouterImpl$createPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transportPaymentListRouterImpl$createPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportPaymentListRouterImpl$createPayload$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PaymentsScreen paymentsScreen = PaymentsScreen.TRANSPORT_SUMMARY;
                    transportPaymentListRouterImpl$createPayload$1.label = 1;
                    obj = this.K.a(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, null, paymentsScreen, transportPaymentListRouterImpl$createPayload$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                vba0 vba0Var = new vba0(PaymentsScreen.TRANSPORT_CHECKOUT, new cca0(null, 21, true, true), new wma0(EmptyList.a), null, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, (uj4) obj, null, 72);
                com.yandex.go.payments.transport.domain.d dVar = this.F;
                return new ida0(vba0Var, this.D, kotlinx.coroutines.flow.e.X(dVar.c.b(), new TransportPaymentListInteractor$observePaymentMethods$$inlined$flatMapLatest$1(null, dVar)), null, new uba0((cz51) null, (uk10) null, (nsd0) null, this.L.a(null), (w9a0) null, 55));
            }
        }
        transportPaymentListRouterImpl$createPayload$1 = new TransportPaymentListRouterImpl$createPayload$1(this, continuationImpl);
        Object obj2 = transportPaymentListRouterImpl$createPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportPaymentListRouterImpl$createPayload$1.label;
        if (i != 0) {
        }
        vba0 vba0Var2 = new vba0(PaymentsScreen.TRANSPORT_CHECKOUT, new cca0(null, 21, true, true), new wma0(EmptyList.a), null, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, (uj4) obj2, null, 72);
        com.yandex.go.payments.transport.domain.d dVar2 = this.F;
        return new ida0(vba0Var2, this.D, kotlinx.coroutines.flow.e.X(dVar2.c.b(), new TransportPaymentListInteractor$observePaymentMethods$$inlined$flatMapLatest$1(null, dVar2)), null, new uba0((cz51) null, (uk10) null, (nsd0) null, this.L.a(null), (w9a0) null, 55));
    }
}
