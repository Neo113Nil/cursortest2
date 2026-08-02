package com.yandex.go.taxi.order.details.v2.navigation;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.ra80;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ o2y0 c;
    public final /* synthetic */ OrderScreen w;
    public final /* synthetic */ ra80 x;

    public b(jqr jqrVar, c cVar, o2y0 o2y0Var, OrderScreen orderScreen, ra80 ra80Var) {
        this.a = jqrVar;
        this.b = cVar;
        this.c = o2y0Var;
        this.w = orderScreen;
        this.x = ra80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TaxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$$inlined$map$1$1 taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof TaxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$$inlined$map$1$1) {
            taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$$inlined$map$1$1 = (TaxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$$inlined$map$1$1) continuation;
            int i2 = taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c, this.w, this.x);
                    taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$$inlined$map$1$1.L$0 = null;
                    taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$$inlined$map$1$1.L$1 = null;
                    taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$$inlined$map$1$1.L$2 = null;
                    taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$$inlined$map$1$1 = new TaxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
