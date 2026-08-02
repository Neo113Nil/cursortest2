package com.yandex.go.logistics.cargo_flow.route_selector;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import defpackage.a4l0;
import defpackage.d0l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.q6l0;
import defpackage.scc;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.uyj;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ld0l0;", "route", "Lq6l0;", "routeOverride", "La4l0;", "<anonymous>", "(Ld0l0;Lq6l0;)La4l0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.logistics.cargo_flow.route_selector.CargoFlowRouteOverlay$getRoute$1", f = "CargoFlowRouteOverlay.kt", l = {337}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CargoFlowRouteOverlay$getRoute$1 extends SuspendLambda implements zls {
    final /* synthetic */ List<Integer> $routeStopsIndexesToDraw;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CargoFlowRouteOverlay$getRoute$1(b bVar, List list, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
        this.$routeStopsIndexesToDraw = list;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CargoFlowRouteOverlay$getRoute$1 cargoFlowRouteOverlay$getRoute$1 = new CargoFlowRouteOverlay$getRoute$1(this.this$0, this.$routeStopsIndexesToDraw, (Continuation) obj3);
        cargoFlowRouteOverlay$getRoute$1.L$0 = (d0l0) obj;
        cargoFlowRouteOverlay$getRoute$1.L$1 = (q6l0) obj2;
        return cargoFlowRouteOverlay$getRoute$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object k0;
        d0l0 d0l0Var = (d0l0) this.L$0;
        q6l0 q6l0Var = (q6l0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        List<Integer> list = this.$routeStopsIndexesToDraw;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        bVar.getClass();
        if (list != null) {
            List a = d0l0Var.a();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj2 : a) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    scc.m();
                    throw null;
                }
                if (list.contains(new Integer(i2))) {
                    arrayList.add(obj2);
                }
                i2 = i3;
            }
            if (!arrayList.isEmpty()) {
                d0l0Var = new d0l0(new ZoneAddress((Address) kotlin.collections.a.P(arrayList), 2), kotlin.collections.a.J(arrayList, 1), 4);
            }
        }
        Address h = d0l0Var.h();
        List list2 = d0l0Var.b;
        if (h == null) {
            k0 = new a4l0(null, 15);
        } else if (list2.isEmpty()) {
            k0 = new a4l0(h.B());
        } else if (q6l0Var != null) {
            List list3 = list2;
            ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(ru.yandex.taxi.map.utils.a.F(((Address) it.next()).B()));
            }
            k0 = new a4l0(null, null, arrayList2, q6l0Var);
        } else {
            bVar.C.getClass();
            sjh sjhVar = uyj.a;
            k0 = tje.k0(o400.a, new CargoFlowRouteOverlay$getRouteInfo$3(bVar, d0l0Var, null), this);
        }
        return k0 == coroutineSingletons ? coroutineSingletons : k0;
    }
}
