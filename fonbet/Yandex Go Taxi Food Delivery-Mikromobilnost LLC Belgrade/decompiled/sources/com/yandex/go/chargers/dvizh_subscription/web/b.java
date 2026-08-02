package com.yandex.go.chargers.dvizh_subscription.web;

import com.yandex.go.chargers.dvizh_subscription.web.b;
import com.yandex.go.chargers.dvizh_subscription.web.js.ChargersDvizhSubscriptionJsApi;
import defpackage.bgc;
import defpackage.dg41;
import defpackage.epb;
import defpackage.ff41;
import defpackage.gf41;
import defpackage.h55;
import defpackage.i3y;
import defpackage.lma;
import defpackage.mc;
import defpackage.ny61;
import defpackage.qx9;
import defpackage.rx9;
import defpackage.scg;
import defpackage.sh41;
import defpackage.sls;
import defpackage.tje;
import defpackage.tt2;
import defpackage.vx9;
import defpackage.w030;
import defpackage.wnt;
import defpackage.wx9;
import defpackage.x2a;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes12.dex */
public final class b extends h55 {
    public final w030 D;
    public final sh41 E;
    public final gf41 F;
    public final lma G;
    public final yvf0 H;
    public final yvf0 I;
    public final qx9 J;
    public final com.yandex.go.chargers.dvizh_subscription.data.a K;
    public final a L;
    public final i3y M;
    public final i3y N;

    public b(w030 w030Var, sh41 sh41Var, gf41 gf41Var, lma lmaVar, yvf0 yvf0Var, yvf0 yvf0Var2, qx9 qx9Var, com.yandex.go.chargers.dvizh_subscription.data.a aVar, a aVar2) {
        super(null);
        this.D = w030Var;
        this.E = sh41Var;
        this.F = gf41Var;
        this.G = lmaVar;
        this.H = yvf0Var;
        this.I = yvf0Var2;
        this.J = qx9Var;
        this.K = aVar;
        this.L = aVar2;
        final int i = 0;
        this.M = kotlin.a.a(new sls(this) { // from class: ux9
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
                        return ((scg) ((ff41) bVar.M.getValue())).a();
                }
            }
        });
        final int i2 = 1;
        this.N = kotlin.a.a(new sls(this) { // from class: ux9
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
                        return ((scg) ((ff41) bVar.M.getValue())).a();
                }
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(5:11|12|13|14|15)(2:18|19))(2:20|21))(3:26|27|(2:29|24)(1:30))|22|(4:25|13|14|15)|24))|35|6|7|(0)(0)|22|(0)|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ef, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0045, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00df, code lost:
    
        defpackage.whb1.c(null, r0);
        r20.r(new defpackage.qu(9));
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(b bVar, rx9 rx9Var, ContinuationImpl continuationImpl) {
        ChargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1 chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        x2a x2aVar;
        x2a x2aVar2;
        ChargersDvizhSubscriptionJsApi chargersDvizhSubscriptionJsApi;
        bVar.getClass();
        if (continuationImpl instanceof ChargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1) {
            chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1 = (ChargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1) continuationImpl;
            int i2 = chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.label = i2 - Integer.MIN_VALUE;
                obj = chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.label;
                int i3 = 0;
                int i4 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    x2a x2aVar3 = (x2a) bVar.H.get();
                    bVar.z(x2aVar3, new wx9(bVar, i3));
                    com.yandex.go.chargers.dvizh_subscription.data.a aVar = bVar.K;
                    String value = rx9Var.a.getValue();
                    String str = rx9Var.b;
                    chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.L$0 = null;
                    chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.L$1 = x2aVar3;
                    chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.label = 1;
                    Object a = aVar.a(value, "", str, chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    x2aVar = x2aVar3;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        chargersDvizhSubscriptionJsApi = (ChargersDvizhSubscriptionJsApi) chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.L$3;
                        x2aVar2 = (x2a) chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.L$1;
                        kotlin.b.b(obj);
                        bVar.j(new epb(x2aVar2));
                        bVar.A(((scg) ((ff41) bVar.M.getValue())).b(), new dg41((UiWebViewConfig) obj, new vx9(chargersDvizhSubscriptionJsApi, 0), null, null, null, null, null, 252), new wx9(bVar, i4));
                        return zy11.a;
                    }
                    x2aVar = (x2a) chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.L$1;
                    kotlin.b.b(obj);
                }
                ChargersDvizhSubscriptionJsApi Q = bVar.Q();
                a aVar2 = bVar.L;
                chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.L$0 = null;
                chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.L$1 = x2aVar;
                chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.L$2 = null;
                chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.L$3 = Q;
                chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.label = 2;
                obj = aVar2.b((String) obj, Q, chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1);
                if (obj != coroutineSingletons) {
                    x2aVar2 = x2aVar;
                    chargersDvizhSubscriptionJsApi = Q;
                    bVar.j(new epb(x2aVar2));
                    bVar.A(((scg) ((ff41) bVar.M.getValue())).b(), new dg41((UiWebViewConfig) obj, new vx9(chargersDvizhSubscriptionJsApi, 0), null, null, null, null, null, 252), new wx9(bVar, i4));
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1 = new ChargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1(bVar, continuationImpl);
        obj = chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.label;
        int i32 = 0;
        int i42 = 1;
        if (i != 0) {
        }
        ChargersDvizhSubscriptionJsApi Q2 = bVar.Q();
        a aVar22 = bVar.L;
        chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.L$0 = null;
        chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.L$1 = x2aVar;
        chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.L$2 = null;
        chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.L$3 = Q2;
        chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1.label = 2;
        obj = aVar22.b((String) obj, Q2, chargersDvizhSubscriptionWebContainerRouter$onLaunchSuspend$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new ChargersDvizhSubscriptionWebContainerRouter$onLaunch$1(this, (rx9) obj, null), 3);
    }

    public final ChargersDvizhSubscriptionJsApi Q() {
        bgc bgcVar = new bgc(12);
        ChargersDvizhSubscriptionWebContainerRouter$createJsApi$2 chargersDvizhSubscriptionWebContainerRouter$createJsApi$2 = new ChargersDvizhSubscriptionWebContainerRouter$createJsApi$2(1, this, b.class, "forceUpdate", "forceUpdate(Lru/yandex/taxi/web/nativeapi/ReloadPageParam;)V", 0);
        ChargersDvizhSubscriptionWebContainerRouter$createJsApi$3 chargersDvizhSubscriptionWebContainerRouter$createJsApi$3 = new ChargersDvizhSubscriptionWebContainerRouter$createJsApi$3(0, this, b.class, "requestHideWebView", "requestHideWebView()V", 0);
        ChargersDvizhSubscriptionWebContainerRouter$createJsApi$4 chargersDvizhSubscriptionWebContainerRouter$createJsApi$4 = new ChargersDvizhSubscriptionWebContainerRouter$createJsApi$4(1, this, b.class, "sendAnalyticsEvent", "sendAnalyticsEvent(Lru/yandex/taxi/analytics/AnalyticsWebViewEvent;)V", 0);
        ChargersDvizhSubscriptionWebContainerRouter$createJsApi$5 chargersDvizhSubscriptionWebContainerRouter$createJsApi$5 = new ChargersDvizhSubscriptionWebContainerRouter$createJsApi$5(0, this, b.class, "enableSwipe", "enableSwipe()V", 0);
        ChargersDvizhSubscriptionWebContainerRouter$createJsApi$6 chargersDvizhSubscriptionWebContainerRouter$createJsApi$6 = new ChargersDvizhSubscriptionWebContainerRouter$createJsApi$6(0, this, b.class, "disableSwipe", "disableSwipe()V", 0);
        ChargersDvizhSubscriptionWebContainerRouter$createJsApi$7 chargersDvizhSubscriptionWebContainerRouter$createJsApi$7 = new ChargersDvizhSubscriptionWebContainerRouter$createJsApi$7(2, this, b.class, "showStories", "showStories(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", 0);
        ChargersDvizhSubscriptionWebContainerRouter$createJsApi$8 chargersDvizhSubscriptionWebContainerRouter$createJsApi$8 = new ChargersDvizhSubscriptionWebContainerRouter$createJsApi$8(2, this, b.class, "showPlus", "showPlus(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", 0);
        mc mcVar = this.J.a;
        return new ChargersDvizhSubscriptionJsApi((wnt) mcVar.a.get(), (tt2) mcVar.b.get(), bgcVar, chargersDvizhSubscriptionWebContainerRouter$createJsApi$2, chargersDvizhSubscriptionWebContainerRouter$createJsApi$3, chargersDvizhSubscriptionWebContainerRouter$createJsApi$4, chargersDvizhSubscriptionWebContainerRouter$createJsApi$5, chargersDvizhSubscriptionWebContainerRouter$createJsApi$6, chargersDvizhSubscriptionWebContainerRouter$createJsApi$7, chargersDvizhSubscriptionWebContainerRouter$createJsApi$8);
    }
}
