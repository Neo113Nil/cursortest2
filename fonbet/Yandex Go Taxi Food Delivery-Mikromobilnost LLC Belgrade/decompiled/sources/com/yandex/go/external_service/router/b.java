package com.yandex.go.external_service.router;

import com.yandex.go.superapp.api.loading_tracker.GlobalLoadingEvent;
import com.yandex.go.superapp.model.Action;
import defpackage.bdn;
import defpackage.cxq0;
import defpackage.edn;
import defpackage.eh70;
import defpackage.f1p;
import defpackage.h1p;
import defpackage.h3y;
import defpackage.h55;
import defpackage.jst;
import defpackage.lvx;
import defpackage.mvx;
import defpackage.nvx;
import defpackage.ny61;
import defpackage.o3p;
import defpackage.p3p;
import defpackage.pzt0;
import defpackage.qu;
import defpackage.rit;
import defpackage.tje;
import defpackage.tse;
import defpackage.v3p;
import defpackage.w511;
import defpackage.x3p;
import defpackage.x6w0;
import defpackage.xsi;
import defpackage.xvf0;
import defpackage.y9w0;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.superapp.e;

/* loaded from: classes12.dex */
public final class b extends h55 {
    public final ru.yandex.taxi.service.a D;
    public final yvf0 E;
    public final h3y F;
    public final yvf0 G;
    public final rit H;
    public final f1p I;
    public final ru.yandex.taxi.deeplinks.b J;
    public final e K;
    public final edn L;
    public final bdn M;
    public final boolean N;
    public pzt0 O;

    public b(ru.yandex.taxi.service.a aVar, yvf0 yvf0Var, yvf0 yvf0Var2, h3y h3yVar, yvf0 yvf0Var3, rit ritVar, f1p f1pVar, ru.yandex.taxi.deeplinks.b bVar, e eVar, edn ednVar, bdn bdnVar) {
        super(null);
        this.D = aVar;
        this.E = yvf0Var;
        this.F = h3yVar;
        this.G = yvf0Var3;
        this.H = ritVar;
        this.I = f1pVar;
        this.J = bVar;
        this.K = eVar;
        this.L = ednVar;
        this.M = bdnVar;
        this.N = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(b bVar, h1p h1pVar, p3p p3pVar, ContinuationImpl continuationImpl) {
        ExternalServiceRouterImpl$onLaunchSuspend$1 externalServiceRouterImpl$onLaunchSuspend$1;
        int i;
        p3p p3pVar2;
        x6w0 x6w0Var;
        h1p h1pVar2 = h1pVar;
        bVar.getClass();
        if (continuationImpl instanceof ExternalServiceRouterImpl$onLaunchSuspend$1) {
            externalServiceRouterImpl$onLaunchSuspend$1 = (ExternalServiceRouterImpl$onLaunchSuspend$1) continuationImpl;
            int i2 = externalServiceRouterImpl$onLaunchSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                externalServiceRouterImpl$onLaunchSuspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = externalServiceRouterImpl$onLaunchSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = externalServiceRouterImpl$onLaunchSuspend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pzt0 pzt0Var = bVar.O;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    bVar.O = ru.yandex.taxi.deeplinks.a.c(bVar.o(), bVar.J, new x3p(0, bVar, h1pVar2));
                    ru.yandex.taxi.service.a aVar = bVar.D;
                    externalServiceRouterImpl$onLaunchSuspend$1.L$0 = h1pVar2;
                    p3pVar2 = p3pVar;
                    externalServiceRouterImpl$onLaunchSuspend$1.L$1 = p3pVar2;
                    externalServiceRouterImpl$onLaunchSuspend$1.label = 1;
                    obj = aVar.b(h1pVar2, externalServiceRouterImpl$onLaunchSuspend$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p3p p3pVar3 = (p3p) externalServiceRouterImpl$onLaunchSuspend$1.L$1;
                    h1p h1pVar3 = (h1p) externalServiceRouterImpl$onLaunchSuspend$1.L$0;
                    kotlin.b.b(obj);
                    p3pVar2 = p3pVar3;
                    h1pVar2 = h1pVar3;
                }
                x6w0Var = (x6w0) obj;
                zy11 zy11Var = zy11.a;
                if (x6w0Var != null) {
                    jst.e.a(15, "SUPERAPP:EXTERNAL_SERVICE:ROUTER", null, "No service model for service " + h1pVar2);
                    bVar.r(new qu(9));
                    return zy11Var;
                }
                f1p f1pVar = bVar.I;
                tse o = bVar.o();
                v3p v3pVar = new v3p(bVar, x6w0Var);
                cxq0 cxq0Var = f1pVar.a;
                com.yandex.go.superapp.impl.interactor.a aVar2 = (com.yandex.go.superapp.impl.interactor.a) ((xvf0) cxq0Var.b).get();
                y9w0 y9w0Var = (y9w0) ((xvf0) cxq0Var.c).get();
                rit ritVar = (rit) ((xvf0) cxq0Var.w).get();
                com.yandex.go.superapp.impl.interactor.b bVar2 = new com.yandex.go.superapp.impl.interactor.b(aVar2, y9w0Var, ritVar, (com.yandex.go.superapp.impl.delegate.a) ((xsi) cxq0Var.x).get(), o, v3pVar);
                nvx nvxVar = p3pVar2.a;
                if (nvxVar instanceof lvx) {
                    lvx lvxVar = (lvx) nvxVar;
                    bVar2.a(lvxVar.a, lvxVar.b);
                    return zy11Var;
                }
                if (!(nvxVar instanceof mvx)) {
                    w511.b();
                    return null;
                }
                mvx mvxVar = (mvx) nvxVar;
                String str = mvxVar.b;
                boolean z = mvxVar.c;
                ritVar.a(GlobalLoadingEvent.ROUTING_PREPARE);
                v3pVar.a(new o3p(Action.SHOW_ORDER, null, new eh70(str, z), null, null, 24));
                return zy11Var;
            }
        }
        externalServiceRouterImpl$onLaunchSuspend$1 = new ExternalServiceRouterImpl$onLaunchSuspend$1(bVar, continuationImpl);
        Object obj2 = externalServiceRouterImpl$onLaunchSuspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = externalServiceRouterImpl$onLaunchSuspend$1.label;
        if (i != 0) {
        }
        x6w0Var = (x6w0) obj2;
        zy11 zy11Var2 = zy11.a;
        if (x6w0Var != null) {
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        p3p p3pVar = (p3p) obj;
        h1p service = p3pVar.a.getService();
        if (service == null) {
            jst.e.a(15, "SUPERAPP:EXTERNAL_SERVICE:ROUTER", null, "No service provided in deeplinkData");
            r(new qu(9));
        } else {
            tje.N(o(), null, null, new ExternalServiceRouterImpl$onLaunch$1(this, service, null), 3);
            tje.N(o(), null, null, new ExternalServiceRouterImpl$onLaunch$2(this, service, p3pVar, null), 3);
        }
    }

    @Override // defpackage.h55
    public final boolean q() {
        return this.N;
    }
}
