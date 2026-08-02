package com.yandex.go.preorder.deeplinks;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import com.yandex.go.taxi.tariffs.interactor.r;
import defpackage.a7t0;
import defpackage.arv0;
import defpackage.cpw0;
import defpackage.e2l0;
import defpackage.e3n;
import defpackage.ghv0;
import defpackage.hhv0;
import defpackage.ihv0;
import defpackage.jst;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.pv0;
import defpackage.qv10;
import defpackage.u1l0;
import defpackage.vre0;
import defpackage.xby;
import defpackage.yqv0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;

/* loaded from: classes13.dex */
public final class c {
    public final cpw0 a;
    public final com.yandex.go.route.interactor.b b;
    public final vre0 c;
    public final com.yandex.go.preorder.tariffs.b d;
    public final arv0 e;
    public final r f;

    public c(cpw0 cpw0Var, com.yandex.go.route.interactor.b bVar, vre0 vre0Var, com.yandex.go.preorder.tariffs.b bVar2, arv0 arv0Var, r rVar) {
        this.a = cpw0Var;
        this.b = bVar;
        this.c = vre0Var;
        this.d = bVar2;
        this.e = arv0Var;
        this.f = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(u1l0 u1l0Var, ContinuationImpl continuationImpl) {
        RouteDeeplinkPreorderInteractor$handleRoute$1 routeDeeplinkPreorderInteractor$handleRoute$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        ihv0 hhv0Var;
        boolean r;
        boolean p;
        boolean z;
        ihv0 ihv0Var;
        String str;
        com.yandex.go.preorder.tariffs.b bVar;
        ihv0 ihv0Var2;
        u1l0 u1l0Var2 = u1l0Var;
        if (continuationImpl instanceof RouteDeeplinkPreorderInteractor$handleRoute$1) {
            routeDeeplinkPreorderInteractor$handleRoute$1 = (RouteDeeplinkPreorderInteractor$handleRoute$1) continuationImpl;
            int i2 = routeDeeplinkPreorderInteractor$handleRoute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeDeeplinkPreorderInteractor$handleRoute$1.label = i2 - Integer.MIN_VALUE;
                obj = routeDeeplinkPreorderInteractor$handleRoute$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeDeeplinkPreorderInteractor$handleRoute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ZoneAddress a = u1l0Var2.a.a();
                    pv0 pv0Var = u1l0Var2.b;
                    qv10.C(new Object[]{a, pv0Var != null ? pv0Var.a : null}, 2, "Deeplink route\n[%s]\n -> \n[%s]", jst.e);
                    this.c.a = a.b;
                    this.a.a = false;
                    hhv0Var = u1l0Var2.l ? new hhv0(SummaryExpandReason.AUTO_ROUTE_DEEPLINK) : ghv0.a;
                    if (u1l0Var2.m && (str = u1l0Var2.f) != null) {
                        ((a7t0) this.e).b(new yqv0(SummaryUiState$Type.TRAP, str));
                    }
                    r = this.b.r(a);
                    com.yandex.go.route.interactor.b bVar2 = this.b;
                    pv0 pv0Var2 = u1l0Var2.b;
                    Address address = pv0Var2 != null ? pv0Var2.a : null;
                    List list = u1l0Var2.c;
                    if (address != null) {
                        if (list.isEmpty()) {
                            list = Collections.singletonList(address);
                        } else {
                            ArrayList arrayList = new ArrayList(list);
                            arrayList.add(address);
                            list = arrayList;
                        }
                    }
                    p = bVar2.p(list);
                    if ((r || p) && u1l0Var2.s) {
                        o430 o430Var = e3n.b;
                        long U = kp50.U(15, DurationUnit.SECONDS);
                        RouteDeeplinkPreorderInteractor$handleRoute$3 routeDeeplinkPreorderInteractor$handleRoute$3 = new RouteDeeplinkPreorderInteractor$handleRoute$3(this, null);
                        routeDeeplinkPreorderInteractor$handleRoute$1.L$0 = u1l0Var2;
                        routeDeeplinkPreorderInteractor$handleRoute$1.L$1 = null;
                        routeDeeplinkPreorderInteractor$handleRoute$1.L$2 = null;
                        routeDeeplinkPreorderInteractor$handleRoute$1.L$3 = hhv0Var;
                        routeDeeplinkPreorderInteractor$handleRoute$1.Z$0 = r;
                        routeDeeplinkPreorderInteractor$handleRoute$1.Z$1 = p;
                        routeDeeplinkPreorderInteractor$handleRoute$1.label = 1;
                        Object x = kotlinx.coroutines.a.x(U, routeDeeplinkPreorderInteractor$handleRoute$3, routeDeeplinkPreorderInteractor$handleRoute$1);
                        if (x != coroutineSingletons) {
                            ihv0 ihv0Var3 = hhv0Var;
                            z = r;
                            obj = x;
                            ihv0Var = ihv0Var3;
                        }
                        return coroutineSingletons;
                    }
                    bVar = this.d;
                    routeDeeplinkPreorderInteractor$handleRoute$1.L$0 = u1l0Var2;
                    routeDeeplinkPreorderInteractor$handleRoute$1.L$1 = null;
                    routeDeeplinkPreorderInteractor$handleRoute$1.L$2 = null;
                    routeDeeplinkPreorderInteractor$handleRoute$1.L$3 = hhv0Var;
                    routeDeeplinkPreorderInteractor$handleRoute$1.Z$0 = r;
                    routeDeeplinkPreorderInteractor$handleRoute$1.Z$1 = p;
                    routeDeeplinkPreorderInteractor$handleRoute$1.label = 2;
                    if (bVar.a(u1l0Var2, routeDeeplinkPreorderInteractor$handleRoute$1) != coroutineSingletons) {
                        ihv0Var2 = hhv0Var;
                        return new e2l0(u1l0Var2.a.a, ihv0Var2, u1l0Var2.n);
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ihv0Var2 = (ihv0) routeDeeplinkPreorderInteractor$handleRoute$1.L$3;
                    u1l0Var2 = (u1l0) routeDeeplinkPreorderInteractor$handleRoute$1.L$0;
                    kotlin.b.b(obj);
                    return new e2l0(u1l0Var2.a.a, ihv0Var2, u1l0Var2.n);
                }
                boolean z2 = routeDeeplinkPreorderInteractor$handleRoute$1.Z$1;
                z = routeDeeplinkPreorderInteractor$handleRoute$1.Z$0;
                ihv0Var = (ihv0) routeDeeplinkPreorderInteractor$handleRoute$1.L$3;
                u1l0 u1l0Var3 = (u1l0) routeDeeplinkPreorderInteractor$handleRoute$1.L$0;
                kotlin.b.b(obj);
                p = z2;
                u1l0Var2 = u1l0Var3;
                if (((zy11) obj) == null) {
                    xby.l(jst.e, "Preorder.RouteDeeplink:ROUTE:ROUTE_STATS_AWAIT", null, null, "Failed to wait routestats", 6);
                }
                r = z;
                hhv0Var = ihv0Var;
                bVar = this.d;
                routeDeeplinkPreorderInteractor$handleRoute$1.L$0 = u1l0Var2;
                routeDeeplinkPreorderInteractor$handleRoute$1.L$1 = null;
                routeDeeplinkPreorderInteractor$handleRoute$1.L$2 = null;
                routeDeeplinkPreorderInteractor$handleRoute$1.L$3 = hhv0Var;
                routeDeeplinkPreorderInteractor$handleRoute$1.Z$0 = r;
                routeDeeplinkPreorderInteractor$handleRoute$1.Z$1 = p;
                routeDeeplinkPreorderInteractor$handleRoute$1.label = 2;
                if (bVar.a(u1l0Var2, routeDeeplinkPreorderInteractor$handleRoute$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        routeDeeplinkPreorderInteractor$handleRoute$1 = new RouteDeeplinkPreorderInteractor$handleRoute$1(this, continuationImpl);
        obj = routeDeeplinkPreorderInteractor$handleRoute$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeDeeplinkPreorderInteractor$handleRoute$1.label;
        if (i != 0) {
        }
        if (((zy11) obj) == null) {
        }
        r = z;
        hhv0Var = ihv0Var;
        bVar = this.d;
        routeDeeplinkPreorderInteractor$handleRoute$1.L$0 = u1l0Var2;
        routeDeeplinkPreorderInteractor$handleRoute$1.L$1 = null;
        routeDeeplinkPreorderInteractor$handleRoute$1.L$2 = null;
        routeDeeplinkPreorderInteractor$handleRoute$1.L$3 = hhv0Var;
        routeDeeplinkPreorderInteractor$handleRoute$1.Z$0 = r;
        routeDeeplinkPreorderInteractor$handleRoute$1.Z$1 = p;
        routeDeeplinkPreorderInteractor$handleRoute$1.label = 2;
        if (bVar.a(u1l0Var2, routeDeeplinkPreorderInteractor$handleRoute$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
