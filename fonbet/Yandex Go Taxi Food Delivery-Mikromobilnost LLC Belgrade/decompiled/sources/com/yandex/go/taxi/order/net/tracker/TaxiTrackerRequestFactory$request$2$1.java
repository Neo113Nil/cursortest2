package com.yandex.go.taxi.order.net.tracker;

import com.yandex.go.taxi.order.net.taxi.dto.request.TaxiRouteParam;
import com.yandex.go.taxi.order.net.taxi.dto.response.TaxiRouteResponse;
import com.yandex.go.taxi.order.net.taxi.dto.response.TaxiRouteResponse$DriverRouteGeometry$Updated;
import com.yandex.go.taxi.order.net.taxi.dto.response.f;
import com.yandex.go.taxi.order.net.taxi.dto.response.h;
import defpackage.bay0;
import defpackage.cmt;
import defpackage.e3n;
import defpackage.fmt;
import defpackage.i201;
import defpackage.j201;
import defpackage.jl40;
import defpackage.k201;
import defpackage.kp50;
import defpackage.l201;
import defpackage.mvg;
import defpackage.n201;
import defpackage.ny61;
import defpackage.o201;
import defpackage.o430;
import defpackage.p201;
import defpackage.q201;
import defpackage.sls;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lo201;", "<anonymous>", "(Ltse;)Lo201;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.net.tracker.TaxiTrackerRequestFactory$request$2$1", f = "TaxiTrackerRequestFactory.kt", l = {43, 44}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiTrackerRequestFactory$request$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $remoteParamProvider;
    Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiTrackerRequestFactory$request$2$1(e eVar, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$remoteParamProvider = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiTrackerRequestFactory$request$2$1(this.this$0, this.$remoteParamProvider, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiTrackerRequestFactory$request$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0041, code lost:
    
        if (r15 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0043, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x002c, code lost:
    
        if (r15 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q201 q201Var;
        List list;
        l201 l201Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            sls slsVar = this.$remoteParamProvider;
            this.label = 1;
            obj = e.b(eVar, slsVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                fmt fmtVar = (fmt) obj;
                bay0 bay0Var = this.this$0.f;
                TaxiRouteResponse taxiRouteResponse = (TaxiRouteResponse) fmtVar.a;
                String a = fmtVar.e.a("X-YaTraceId");
                TaxiRouteResponse.DriverInfo driverInfo = taxiRouteResponse.a;
                if (driverInfo == null) {
                    ny61.g("DriverInfo is invalid");
                    return null;
                }
                bay0Var.getClass();
                p201 b = bay0.b(driverInfo);
                TaxiRouteResponse.DriverPath driverPath = taxiRouteResponse.b;
                if (driverPath == null) {
                    q201Var = q201.c;
                } else {
                    TaxiRouteResponse.DriverPath.ActiveRoute activeRoute = driverPath.a;
                    String str2 = activeRoute != null ? activeRoute.a : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    q201Var = new q201(new n201((activeRoute == null || (list = activeRoute.b) == null) ? EmptyList.a : kotlin.collections.a.M(list), str2, activeRoute != null ? activeRoute.c : null), bay0Var.c(driverPath.b));
                }
                ArrayList c = bay0Var.c(taxiRouteResponse.c);
                h hVar = taxiRouteResponse.e;
                if (hVar instanceof TaxiRouteResponse$DriverRouteGeometry$Updated) {
                    TaxiRouteResponse$DriverRouteGeometry$Updated taxiRouteResponse$DriverRouteGeometry$Updated = (TaxiRouteResponse$DriverRouteGeometry$Updated) hVar;
                    String str3 = taxiRouteResponse$DriverRouteGeometry$Updated.a;
                    String str4 = str3 != null ? str3 : "";
                    TaxiRouteResponse.DriverRouteGeometryPolyline driverRouteGeometryPolyline = taxiRouteResponse$DriverRouteGeometry$Updated.b;
                    l201Var = new k201(str4, bay0.a(driverRouteGeometryPolyline.b, driverRouteGeometryPolyline.a));
                } else if (jl40.l(hVar, com.yandex.go.taxi.order.net.taxi.dto.response.e.INSTANCE)) {
                    l201Var = new j201(str, 3);
                } else {
                    if (hVar != null && !hVar.equals(f.INSTANCE)) {
                        w511.b();
                        return null;
                    }
                    l201Var = i201.a;
                }
                l201 l201Var2 = l201Var;
                boolean z = taxiRouteResponse.d;
                o430 o430Var = e3n.b;
                return new o201(b, q201Var, c, l201Var2, z, e3n.e(kp50.U(1, DurationUnit.SECONDS)), a);
            }
            kotlin.b.b(obj);
        }
        cmt<TaxiRouteResponse> b2 = this.this$0.c.b((TaxiRouteParam) obj);
        this.L$0 = null;
        this.label = 2;
        obj = ru.yandex.taxi.network.api.a.b(b2, null, this);
    }
}
