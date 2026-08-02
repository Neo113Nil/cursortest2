package com.yandex.go.shortcuts.impl.route;

import com.yandex.go.shortcuts.dto.request.RouteEtaParam;
import com.yandex.go.shortcuts.dto.response.RouteEtaResponse;
import com.yandex.go.shortcuts.impl.dto.ShortcutsApi;
import defpackage.bvf0;
import defpackage.c0z0;
import defpackage.d1z;
import defpackage.e1z;
import defpackage.hst;
import defpackage.i3l0;
import defpackage.jst;
import defpackage.mth;
import defpackage.ny61;
import defpackage.pgk0;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.zy11;
import java.util.Objects;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class a {
    public final pgk0 a;
    public final c0z0 b;
    public final tse c;
    public final r0 d;
    public pzt0 e;
    public final mth f;

    public a(pgk0 pgk0Var, c0z0 c0z0Var, tse tseVar) {
        this.a = pgk0Var;
        this.b = c0z0Var;
        this.c = tseVar;
        r0 c = bvf0.c(null);
        this.d = c;
        this.f = new mth(c, 6);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|28|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0035, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        defpackage.xby.l(defpackage.jst.e, "SHORTCUTS:ROUTE_ETA:ERROR", null, r0, "Failed to update route eta", 2);
        r0 = new defpackage.i3l0(r6, r7);
        r2.getClass();
        r2.m(null, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, RouteEtaParam routeEtaParam, Continuation continuation) {
        GetRouteEtaInteractor$getRouteEta$1 getRouteEtaInteractor$getRouteEta$1;
        int i;
        r0 r0Var = aVar.d;
        if (continuation instanceof GetRouteEtaInteractor$getRouteEta$1) {
            getRouteEtaInteractor$getRouteEta$1 = (GetRouteEtaInteractor$getRouteEta$1) continuation;
            int i2 = getRouteEtaInteractor$getRouteEta$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getRouteEtaInteractor$getRouteEta$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getRouteEtaInteractor$getRouteEta$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getRouteEtaInteractor$getRouteEta$1.label;
                d1z d1zVar = d1z.a;
                int i3 = 2;
                if (i != 0) {
                    b.b(obj);
                    hst hstVar = jst.e;
                    Objects.toString(routeEtaParam);
                    hstVar.getClass();
                    i3l0 i3l0Var = new i3l0(e1z.a, i3);
                    r0Var.getClass();
                    r0Var.m(null, i3l0Var);
                    pgk0 pgk0Var = aVar.a;
                    getRouteEtaInteractor$getRouteEta$1.L$0 = null;
                    getRouteEtaInteractor$getRouteEta$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(((ShortcutsApi) pgk0Var.b).c(routeEtaParam), null, getRouteEtaInteractor$getRouteEta$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                i3l0 i3l0Var2 = new i3l0(d1zVar, ((RouteEtaResponse) obj).a);
                r0Var.getClass();
                r0Var.m(null, i3l0Var2);
                return zy11.a;
            }
        }
        getRouteEtaInteractor$getRouteEta$1 = new GetRouteEtaInteractor$getRouteEta$1(aVar, continuation);
        Object obj2 = getRouteEtaInteractor$getRouteEta$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getRouteEtaInteractor$getRouteEta$1.label;
        d1z d1zVar2 = d1z.a;
        int i32 = 2;
        if (i != 0) {
        }
        i3l0 i3l0Var22 = new i3l0(d1zVar2, ((RouteEtaResponse) obj2).a);
        r0Var.getClass();
        r0Var.m(null, i3l0Var22);
        return zy11.a;
    }
}
