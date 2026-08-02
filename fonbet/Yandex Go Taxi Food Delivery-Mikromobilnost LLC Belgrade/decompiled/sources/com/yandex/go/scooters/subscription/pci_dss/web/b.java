package com.yandex.go.scooters.subscription.pci_dss.web;

import com.yandex.go.scooters.subscription.api.ScootersSubscriptionEntryPoint;
import com.yandex.go.scooters.subscription.pci_dss.web.b;
import com.yandex.go.scooters.subscription.pci_dss.web.js.ScootersSubscriptionJsApi;
import defpackage.axo0;
import defpackage.bgc;
import defpackage.c0p0;
import defpackage.dg41;
import defpackage.epb;
import defpackage.ff41;
import defpackage.fko0;
import defpackage.fva0;
import defpackage.gf41;
import defpackage.h55;
import defpackage.i3y;
import defpackage.kio0;
import defpackage.ny61;
import defpackage.scg;
import defpackage.sls;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u8w;
import defpackage.vwo0;
import defpackage.vx9;
import defpackage.w030;
import defpackage.wnt;
import defpackage.yvf0;
import defpackage.zwo0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes13.dex */
public final class b extends h55 {
    public final w030 D;
    public final fva0 E;
    public final gf41 F;
    public final fko0 G;
    public final vwo0 H;
    public final yvf0 I;
    public final MapNotificationsMuteRepository J;
    public final zwo0 K;
    public final com.yandex.go.scooters.subscription.pci_dss.data.a L;
    public final yvf0 M;
    public final a N;
    public final i3y O;
    public final i3y P;

    public b(w030 w030Var, fva0 fva0Var, gf41 gf41Var, fko0 fko0Var, vwo0 vwo0Var, yvf0 yvf0Var, MapNotificationsMuteRepository mapNotificationsMuteRepository, zwo0 zwo0Var, com.yandex.go.scooters.subscription.pci_dss.data.a aVar, yvf0 yvf0Var2, a aVar2) {
        super(null);
        this.D = w030Var;
        this.E = fva0Var;
        this.F = gf41Var;
        this.G = fko0Var;
        this.H = vwo0Var;
        this.I = yvf0Var;
        this.J = mapNotificationsMuteRepository;
        this.K = zwo0Var;
        this.L = aVar;
        this.M = yvf0Var2;
        this.N = aVar2;
        final int i = 0;
        this.O = kotlin.a.a(new sls(this) { // from class: b0p0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                b bVar = this.b;
                switch (i2) {
                    case 0:
                        return bVar.F.a();
                    default:
                        return ((scg) ((ff41) bVar.O.getValue())).a();
                }
            }
        });
        final int i2 = 1;
        this.P = kotlin.a.a(new sls(this) { // from class: b0p0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                b bVar = this.b;
                switch (i22) {
                    case 0:
                        return bVar.F.a();
                    default:
                        return ((scg) ((ff41) bVar.O.getValue())).a();
                }
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|8|(1:(1:(5:12|13|14|15|16)(2:19|20))(3:21|22|23))(3:28|29|(2:31|26)(1:32))|24|(4:27|14|15|16)|26))|37|6|7|8|(0)(0)|24|(0)|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x011b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0048, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010b, code lost:
    
        defpackage.zgz.a(null, r0);
        r24.r(new defpackage.qu(9));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(b bVar, axo0 axo0Var, ContinuationImpl continuationImpl) {
        ScootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$1 scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        ru.yandex.taxi.scooters.presentation.loading.b bVar2;
        ru.yandex.taxi.scooters.presentation.loading.b bVar3;
        axo0 axo0Var2;
        ScootersSubscriptionJsApi scootersSubscriptionJsApi;
        axo0 axo0Var3 = axo0Var;
        bVar.getClass();
        if (continuationImpl instanceof ScootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$1) {
            scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$1 = (ScootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$1) continuationImpl;
            int i2 = scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$1.label = i2 - Integer.MIN_VALUE;
                ScootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$1 scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$12 = scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$1;
                obj = scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$12.label;
                int i3 = 0;
                int i4 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.scooters.presentation.loading.b bVar4 = (ru.yandex.taxi.scooters.presentation.loading.b) bVar.I.get();
                    bVar.z(bVar4, new c0p0(bVar, i3));
                    com.yandex.go.scooters.subscription.pci_dss.data.a aVar = bVar.L;
                    String str = axo0Var3.a;
                    String str2 = axo0Var3.b;
                    boolean z = axo0Var3.c;
                    ScootersSubscriptionEntryPoint scootersSubscriptionEntryPoint = axo0Var3.d;
                    scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$12.L$0 = axo0Var3;
                    scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$12.L$1 = bVar4;
                    scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$12.label = 1;
                    Object a = aVar.a(str, str2, z, scootersSubscriptionEntryPoint, scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$12);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bVar2 = bVar4;
                    obj = a;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        scootersSubscriptionJsApi = (ScootersSubscriptionJsApi) scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$12.L$3;
                        bVar3 = (ru.yandex.taxi.scooters.presentation.loading.b) scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$12.L$1;
                        axo0Var2 = (axo0) scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$12.L$0;
                        kotlin.b.b(obj);
                        bVar.j(new epb(bVar3));
                        bVar.A(((scg) ((ff41) bVar.O.getValue())).b(), new dg41((UiWebViewConfig) obj, new vx9(scootersSubscriptionJsApi, 1), null, null, null, null, null, 252), new c0p0(bVar, i4));
                        fva0.b(bVar.E, "ScootersSubscriptionCard", PerformanceAnalytics$Type.Loading, null, 4);
                        bVar.H.a(axo0Var2.e, axo0Var2.f);
                        return zy11.a;
                    }
                    ru.yandex.taxi.scooters.presentation.loading.b bVar5 = (ru.yandex.taxi.scooters.presentation.loading.b) scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$12.L$1;
                    axo0 axo0Var4 = (axo0) scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$12.L$0;
                    kotlin.b.b(obj);
                    bVar2 = bVar5;
                    axo0Var3 = axo0Var4;
                }
                fva0.f(bVar.E, "ScootersSubscriptionCard", PerformanceAnalytics$Type.Loading, 0L, 4);
                ScootersSubscriptionJsApi Q = bVar.Q();
                a aVar2 = bVar.N;
                scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$12.L$0 = axo0Var3;
                scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$12.L$1 = bVar2;
                scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$12.L$2 = null;
                scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$12.L$3 = Q;
                scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$12.label = 2;
                obj = aVar2.b((String) obj, Q, scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$12);
                if (obj != coroutineSingletons) {
                    bVar3 = bVar2;
                    axo0Var2 = axo0Var3;
                    scootersSubscriptionJsApi = Q;
                    bVar.j(new epb(bVar3));
                    bVar.A(((scg) ((ff41) bVar.O.getValue())).b(), new dg41((UiWebViewConfig) obj, new vx9(scootersSubscriptionJsApi, 1), null, null, null, null, null, 252), new c0p0(bVar, i4));
                    fva0.b(bVar.E, "ScootersSubscriptionCard", PerformanceAnalytics$Type.Loading, null, 4);
                    bVar.H.a(axo0Var2.e, axo0Var2.f);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$1 = new ScootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$1(bVar, continuationImpl);
        ScootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$1 scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$122 = scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$1;
        obj = scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$122.label;
        int i32 = 0;
        int i42 = 1;
        if (i != 0) {
        }
        fva0.f(bVar.E, "ScootersSubscriptionCard", PerformanceAnalytics$Type.Loading, 0L, 4);
        ScootersSubscriptionJsApi Q2 = bVar.Q();
        a aVar22 = bVar.N;
        scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$122.L$0 = axo0Var3;
        scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$122.L$1 = bVar2;
        scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$122.L$2 = null;
        scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$122.L$3 = Q2;
        scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$122.label = 2;
        obj = aVar22.b((String) obj, Q2, scootersSubscriptionWebContainerModalViewRouter$onAttachSuspend$122);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        this.J.a();
        tje.N(o(), null, null, new ScootersSubscriptionWebContainerModalViewRouter$onAttach$1(this, (axo0) obj, null), 3);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        u8w u8wVar = this.H.b;
        u8wVar.getClass();
        u8wVar.a.a("ScootersSubscriptionCard.Closed", new HashMap(), 1, new HashMap());
        this.J.b();
    }

    public final ScootersSubscriptionJsApi Q() {
        bgc bgcVar = new bgc(12);
        ScootersSubscriptionWebContainerModalViewRouter$createJsApi$2 scootersSubscriptionWebContainerModalViewRouter$createJsApi$2 = new ScootersSubscriptionWebContainerModalViewRouter$createJsApi$2(1, this, b.class, "forceUpdate", "forceUpdate(Lru/yandex/taxi/web/nativeapi/ReloadPageParam;)V", 0);
        ScootersSubscriptionWebContainerModalViewRouter$createJsApi$3 scootersSubscriptionWebContainerModalViewRouter$createJsApi$3 = new ScootersSubscriptionWebContainerModalViewRouter$createJsApi$3(0, this, b.class, "requestHideWebView", "requestHideWebView()V", 0);
        ScootersSubscriptionWebContainerModalViewRouter$createJsApi$4 scootersSubscriptionWebContainerModalViewRouter$createJsApi$4 = new ScootersSubscriptionWebContainerModalViewRouter$createJsApi$4(1, this, b.class, "sendAnalyticsEvent", "sendAnalyticsEvent(Lru/yandex/taxi/analytics/AnalyticsWebViewEvent;)V", 0);
        ScootersSubscriptionWebContainerModalViewRouter$createJsApi$5 scootersSubscriptionWebContainerModalViewRouter$createJsApi$5 = new ScootersSubscriptionWebContainerModalViewRouter$createJsApi$5(0, this, b.class, "enableSwipe", "enableSwipe()V", 0);
        ScootersSubscriptionWebContainerModalViewRouter$createJsApi$6 scootersSubscriptionWebContainerModalViewRouter$createJsApi$6 = new ScootersSubscriptionWebContainerModalViewRouter$createJsApi$6(0, this, b.class, "disableSwipe", "disableSwipe()V", 0);
        ScootersSubscriptionWebContainerModalViewRouter$createJsApi$7 scootersSubscriptionWebContainerModalViewRouter$createJsApi$7 = new ScootersSubscriptionWebContainerModalViewRouter$createJsApi$7(2, this, b.class, "showStories", "showStories(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", 0);
        ScootersSubscriptionWebContainerModalViewRouter$createJsApi$8 scootersSubscriptionWebContainerModalViewRouter$createJsApi$8 = new ScootersSubscriptionWebContainerModalViewRouter$createJsApi$8(2, this, b.class, "showPlus", "showPlus(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", 0);
        kio0 kio0Var = this.K.a;
        return new ScootersSubscriptionJsApi((wnt) kio0Var.a.get(), (tt2) kio0Var.b.get(), bgcVar, scootersSubscriptionWebContainerModalViewRouter$createJsApi$2, scootersSubscriptionWebContainerModalViewRouter$createJsApi$3, scootersSubscriptionWebContainerModalViewRouter$createJsApi$4, scootersSubscriptionWebContainerModalViewRouter$createJsApi$5, scootersSubscriptionWebContainerModalViewRouter$createJsApi$6, scootersSubscriptionWebContainerModalViewRouter$createJsApi$7, scootersSubscriptionWebContainerModalViewRouter$createJsApi$8);
    }
}
