package com.yandex.go.scooters;

import android.content.Intent;
import android.net.Uri;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.h3y;
import defpackage.kuo0;
import defpackage.l8x;
import defpackage.m5u;
import defpackage.m950;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.odn0;
import defpackage.ouo0;
import defpackage.p4g0;
import defpackage.pzt0;
import defpackage.s4b1;
import defpackage.sve;
import defpackage.tje;
import defpackage.wvn0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.domain.q;

/* loaded from: classes13.dex */
public final class c extends BaseRootNavigationRouter implements kuo0 {
    public final h3y D;
    public final sve E;
    public final ru.yandex.taxi.deeplinks.b F;
    public final ouo0 G;
    public final BaseRootNavigationRouter.a H = new BaseRootNavigationRouter.a(Screen.SCOOTERS, BaseRootNavigationRouter.Background.MAP, null, 12);
    public pzt0 I;

    public c(h3y h3yVar, sve sveVar, ru.yandex.taxi.deeplinks.b bVar, ouo0 ouo0Var) {
        this.D = h3yVar;
        this.E = sveVar;
        this.F = bVar;
        this.G = ouo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(c cVar, Intent intent, ContinuationImpl continuationImpl) {
        ScootersRootRouterImpl$processIntent$1 scootersRootRouterImpl$processIntent$1;
        int i;
        odn0 odn0Var;
        cVar.getClass();
        if (continuationImpl instanceof ScootersRootRouterImpl$processIntent$1) {
            scootersRootRouterImpl$processIntent$1 = (ScootersRootRouterImpl$processIntent$1) continuationImpl;
            int i2 = scootersRootRouterImpl$processIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersRootRouterImpl$processIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersRootRouterImpl$processIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersRootRouterImpl$processIntent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Uri data = intent.getData();
                    if (data != null) {
                        q qVar = (q) cVar.D.get();
                        scootersRootRouterImpl$processIntent$1.L$0 = null;
                        scootersRootRouterImpl$processIntent$1.L$1 = null;
                        scootersRootRouterImpl$processIntent$1.label = 1;
                        obj = qVar.p(data, scootersRootRouterImpl$processIntent$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return n5u.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                odn0Var = (odn0) obj;
                if (odn0Var != null) {
                    wvn0 c = s4b1.c(odn0Var);
                    cVar.G.a.b(ouo0.a(c));
                    cVar.D((m950) cVar.E.get(), c, new p4g0(cVar, 9));
                    return new m5u(false, false);
                }
                return n5u.a;
            }
        }
        scootersRootRouterImpl$processIntent$1 = new ScootersRootRouterImpl$processIntent$1(cVar, continuationImpl);
        Object obj2 = scootersRootRouterImpl$processIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRootRouterImpl$processIntent$1.label;
        if (i != 0) {
        }
        odn0Var = (odn0) obj2;
        if (odn0Var != null) {
        }
        return n5u.a;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        this.I = tje.N(o(), null, null, new ScootersRootRouterImpl$onAttach$1(this, null), 3);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        ScootersRootRouterImpl$onDetach$1 scootersRootRouterImpl$onDetach$1 = new ScootersRootRouterImpl$onDetach$1(this, c.class, "intentHandlerJob", "getIntentHandlerJob()Lkotlinx/coroutines/Job;", 0);
        l8x l8xVar = (l8x) scootersRootRouterImpl$onDetach$1.get();
        scootersRootRouterImpl$onDetach$1.i(null);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        wvn0 wvn0Var = (wvn0) obj;
        this.G.a.b(ouo0.a(wvn0Var));
        D((m950) this.E.get(), wvn0Var, new p4g0(this, 9));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.H;
    }
}
