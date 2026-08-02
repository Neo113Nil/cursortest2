package com.yandex.go.environment;

import defpackage.a5o;
import defpackage.bvf0;
import defpackage.h3y;
import defpackage.hs50;
import defpackage.jst;
import defpackage.jy60;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pv0;
import defpackage.ra00;
import defpackage.rmv0;
import defpackage.rx2;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.wu30;
import defpackage.x2p;
import defpackage.y9y0;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes.dex */
public final class i implements jy60 {
    public final ru.yandex.taxi.search.suggest.i a;
    public final y9y0 b;
    public final wu30 c;
    public final ra00 d;
    public final tse e;
    public final tt2 f;
    public final rmv0 g;
    public final h3y h;
    public final ru.yandex.taxi.am.token.a i;
    public final hs50 j;
    public final x2p k;
    public final com.yandex.go.order.external.tracking.h l;
    public final yvf0 m;
    public final oep0 n;
    public final b o;
    public final com.yandex.go.taxi.order.provider.a p;
    public final rx2 q;
    public final com.yandex.go.navigation.screen.c r;

    public i(ru.yandex.taxi.search.suggest.i iVar, y9y0 y9y0Var, wu30 wu30Var, ra00 ra00Var, tse tseVar, tt2 tt2Var, rmv0 rmv0Var, h3y h3yVar, ru.yandex.taxi.am.token.a aVar, hs50 hs50Var, x2p x2pVar, com.yandex.go.order.external.tracking.h hVar, yvf0 yvf0Var, oep0 oep0Var, b bVar, com.yandex.go.taxi.order.provider.a aVar2, rx2 rx2Var, com.yandex.go.navigation.screen.c cVar) {
        this.a = iVar;
        this.b = y9y0Var;
        this.c = wu30Var;
        this.d = ra00Var;
        this.e = tseVar;
        this.f = tt2Var;
        this.g = rmv0Var;
        this.h = h3yVar;
        this.i = aVar;
        this.j = hs50Var;
        this.k = x2pVar;
        this.l = hVar;
        this.m = yvf0Var;
        this.n = oep0Var;
        this.o = bVar;
        this.p = aVar2;
        this.q = rx2Var;
        this.r = cVar;
    }

    public static final String d(i iVar, pv0 pv0Var) {
        iVar.getClass();
        a5o environment = pv0Var.a.getEnvironment();
        String str = environment != null ? environment.a : null;
        return str == null ? "default" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(i iVar, pv0 pv0Var, RoutePointType routePointType, ContinuationImpl continuationImpl) {
        SwitchNetworkEnvironmentListener$requestEndpoints$1 switchNetworkEnvironmentListener$requestEndpoints$1;
        int i;
        zy11 zy11Var;
        iVar.getClass();
        try {
            if (continuationImpl instanceof SwitchNetworkEnvironmentListener$requestEndpoints$1) {
                switchNetworkEnvironmentListener$requestEndpoints$1 = (SwitchNetworkEnvironmentListener$requestEndpoints$1) continuationImpl;
                int i2 = switchNetworkEnvironmentListener$requestEndpoints$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    switchNetworkEnvironmentListener$requestEndpoints$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = switchNetworkEnvironmentListener$requestEndpoints$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = switchNetworkEnvironmentListener$requestEndpoints$1.label;
                    zy11Var = zy11.a;
                    if (i == 0) {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                    b bVar = iVar.o;
                    switchNetworkEnvironmentListener$requestEndpoints$1.L$0 = null;
                    switchNetworkEnvironmentListener$requestEndpoints$1.L$1 = null;
                    switchNetworkEnvironmentListener$requestEndpoints$1.label = 1;
                    bVar.getClass();
                    Object n = bvf0.n(new RequestEndpointInteractor$requestEndpoints$2(bVar, pv0Var, routePointType, null), switchNetworkEnvironmentListener$requestEndpoints$1);
                    if (n != coroutineSingletons) {
                        n = zy11Var;
                    }
                    return n == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Failed to request endpoints after network environment switch");
            return zy11Var;
        }
        switchNetworkEnvironmentListener$requestEndpoints$1 = new SwitchNetworkEnvironmentListener$requestEndpoints$1(iVar, continuationImpl);
        Object obj2 = switchNetworkEnvironmentListener$requestEndpoints$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = switchNetworkEnvironmentListener$requestEndpoints$1.label;
        zy11Var = zy11.a;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "SwitchNetworkEnvironmentListener";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.e, null, null, new SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1(this, null), 3);
    }
}
