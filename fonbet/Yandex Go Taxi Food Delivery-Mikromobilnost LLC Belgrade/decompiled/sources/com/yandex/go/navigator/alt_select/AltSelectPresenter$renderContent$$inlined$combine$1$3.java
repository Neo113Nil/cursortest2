package com.yandex.go.navigator.alt_select;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import defpackage.avj0;
import defpackage.b6l0;
import defpackage.cv1;
import defpackage.e68;
import defpackage.g950;
import defpackage.h950;
import defpackage.hst;
import defpackage.hua1;
import defpackage.i950;
import defpackage.j950;
import defpackage.jl40;
import defpackage.jst;
import defpackage.k950;
import defpackage.kyh0;
import defpackage.l950;
import defpackage.mg50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ov1;
import defpackage.pe50;
import defpackage.pv1;
import defpackage.qe50;
import defpackage.qv1;
import defpackage.r901;
import defpackage.rv1;
import defpackage.t7s;
import defpackage.tcc;
import defpackage.tv1;
import defpackage.vpr;
import defpackage.w511;
import defpackage.x1l0;
import defpackage.zls;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.alt_select.AltSelectPresenter$renderContent$$inlined$combine$1$3", f = "AltSelectPresenter.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class AltSelectPresenter$renderContent$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ e receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AltSelectPresenter$renderContent$$inlined$combine$1$3(e eVar, Continuation continuation) {
        super(3, continuation);
        this.receiver$inlined = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AltSelectPresenter$renderContent$$inlined$combine$1$3 altSelectPresenter$renderContent$$inlined$combine$1$3 = new AltSelectPresenter$renderContent$$inlined$combine$1$3(this.receiver$inlined, (Continuation) obj3);
        altSelectPresenter$renderContent$$inlined$combine$1$3.L$0 = (vpr) obj;
        altSelectPresenter$renderContent$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return altSelectPresenter$renderContent$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01f6 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        CoroutineSingletons coroutineSingletons;
        String str;
        Object Kg;
        pe50 pe50Var;
        String str2;
        CoroutineSingletons coroutineSingletons2;
        qe50 qe50Var;
        e eVar;
        pe50 pe50Var2;
        AltSelectPresenter$renderContent$$inlined$combine$1$3 altSelectPresenter$renderContent$$inlined$combine$1$3 = this;
        vpr vprVar2 = (vpr) altSelectPresenter$renderContent$$inlined$combine$1$3.L$0;
        Object[] objArr = (Object[]) altSelectPresenter$renderContent$$inlined$combine$1$3.L$1;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = altSelectPresenter$renderContent$$inlined$combine$1$3.label;
        String str3 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            e68 e68Var = (e68) obj7;
            r901 r901Var = (r901) obj6;
            qe50 qe50Var2 = (qe50) obj5;
            DrivingRoute drivingRoute = (DrivingRoute) obj4;
            List list = (List) obj3;
            l950 l950Var = (l950) obj2;
            e eVar2 = altSelectPresenter$renderContent$$inlined$combine$1$3.receiver$inlined;
            zuj0 zuj0Var = eVar2.J;
            if (jl40.l(l950Var, g950.a) || jl40.l(l950Var, i950.a)) {
                vprVar = vprVar2;
                coroutineSingletons = coroutineSingletons3;
                str = null;
                List list2 = (qe50Var2 == null || (pe50Var = qe50Var2.a) == null) ? null : pe50Var.b;
                Kg = (list2 == null || list2.isEmpty()) ? eVar2.Kg(qe50Var2, e68Var, r901Var) : new tv1(qe50Var2, r901Var);
            } else {
                if (jl40.l(l950Var, j950.a)) {
                    eVar2.Lg();
                    avj0 avj0Var = (avj0) zuj0Var;
                    Kg = new rv1(r901Var, new pv1(avj0Var.h(kyh0.navigator_no_routes_route_screen_error_title), avj0Var.h(kyh0.navigator_no_routes_route_screen_error_subtitle), avj0Var.h(kyh0.navigator_no_routes_route_screen_error_button_title)));
                } else if (jl40.l(l950Var, k950.a)) {
                    eVar2.Lg();
                    avj0 avj0Var2 = (avj0) zuj0Var;
                    Kg = new qv1(r901Var, new pv1(avj0Var2.h(kyh0.navigator_loading_route_screen_error_title), avj0Var2.h(kyh0.navigator_loading_route_screen_error_subtitle), avj0Var2.h(kyh0.navigator_loading_route_screen_error_button_title)));
                } else {
                    if (!jl40.l(l950Var, h950.a)) {
                        w511.b();
                        return null;
                    }
                    List list3 = (qe50Var2 == null || (pe50Var2 = qe50Var2.a) == null) ? null : pe50Var2.b;
                    if (list3 == null) {
                        vprVar = vprVar2;
                        coroutineSingletons = coroutineSingletons3;
                        str = null;
                        qe50Var = qe50Var2;
                        eVar = eVar2;
                    } else if (list3.isEmpty()) {
                        vprVar = vprVar2;
                        eVar = eVar2;
                        coroutineSingletons = coroutineSingletons3;
                        str = null;
                        qe50Var = qe50Var2;
                    } else {
                        List list4 = list;
                        ArrayList arrayList = new ArrayList(tcc.n(list4, 10));
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            DrivingRoute drivingRoute2 = (DrivingRoute) it.next();
                            hst hstVar = jst.e;
                            String routeId = drivingRoute2.getRouteId();
                            boolean l = jl40.l(drivingRoute2.getRouteId(), drivingRoute != null ? drivingRoute.getRouteId() : str3);
                            boolean e = hua1.e(drivingRoute2);
                            String str4 = str3;
                            x1l0 x1l0Var = eVar2.C;
                            x1l0Var.getClass();
                            Iterator it2 = it;
                            DrivingRoute drivingRoute3 = drivingRoute;
                            double value = drivingRoute2.getMetadata().getWeight().getDistance().getValue();
                            double value2 = drivingRoute2.getMetadata().getWeight().getTime().getValue();
                            e eVar3 = eVar2;
                            CoroutineSingletons coroutineSingletons4 = coroutineSingletons3;
                            double value3 = drivingRoute2.getMetadata().getWeight().getTimeWithTraffic().getValue();
                            String d = hua1.d(x1l0Var.a, value);
                            mg50 mg50Var = x1l0Var.b;
                            String a = mg50Var.a((long) value2);
                            String a2 = mg50Var.a((long) value3);
                            Calendar calendar = Calendar.getInstance();
                            calendar.add(13, (int) value3);
                            arrayList.add(new cv1(routeId, l, e, new b6l0(d, a2, a, t7s.c(mg50Var.a, calendar, HProv.PP_SECURITY_LEVEL))));
                            drivingRoute = drivingRoute3;
                            qe50Var2 = qe50Var2;
                            str3 = str4;
                            coroutineSingletons3 = coroutineSingletons4;
                            it = it2;
                            vprVar2 = vprVar2;
                            eVar2 = eVar3;
                        }
                        vprVar = vprVar2;
                        coroutineSingletons = coroutineSingletons3;
                        str = str3;
                        Kg = new ov1(arrayList, qe50Var2, r901Var, e68Var);
                    }
                    Kg = eVar.Kg(qe50Var, e68Var, r901Var);
                }
                vprVar = vprVar2;
                coroutineSingletons = coroutineSingletons3;
                str2 = null;
                altSelectPresenter$renderContent$$inlined$combine$1$3.L$0 = str2;
                altSelectPresenter$renderContent$$inlined$combine$1$3.L$1 = str2;
                altSelectPresenter$renderContent$$inlined$combine$1$3.label = 1;
                coroutineSingletons2 = coroutineSingletons;
                if (vprVar.emit(Kg, altSelectPresenter$renderContent$$inlined$combine$1$3) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
            }
            altSelectPresenter$renderContent$$inlined$combine$1$3 = this;
            str2 = str;
            altSelectPresenter$renderContent$$inlined$combine$1$3.L$0 = str2;
            altSelectPresenter$renderContent$$inlined$combine$1$3.L$1 = str2;
            altSelectPresenter$renderContent$$inlined$combine$1$3.label = 1;
            coroutineSingletons2 = coroutineSingletons;
            if (vprVar.emit(Kg, altSelectPresenter$renderContent$$inlined$combine$1$3) == coroutineSingletons2) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
