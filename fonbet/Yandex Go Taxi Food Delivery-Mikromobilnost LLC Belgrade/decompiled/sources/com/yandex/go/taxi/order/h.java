package com.yandex.go.taxi.order;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.an91;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zb6;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ p b;

    public h(vpr vprVar, p pVar) {
        this.a = vprVar;
        this.b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1 bottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1;
        int i;
        zb6 zb6Var;
        if (continuation instanceof BottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1) {
            bottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1 = (BottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1) continuation;
            int i2 = bottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = bottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    p pVar = this.b;
                    pVar.getClass();
                    OrderStatusInfo V = taxiOrder.V();
                    if (!an91.h(V.i) || jl40.l(V.g, Driver.v)) {
                        zb6Var = null;
                    } else {
                        String a = pVar.H.a(taxiOrder.b().a());
                        if (a == null) {
                            a = "";
                        }
                        Driver driver = taxiOrder.V().g;
                        zb6Var = new zb6(driver.n, driver.l, a, driver.s);
                    }
                    bottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1.L$0 = null;
                    bottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1.L$1 = null;
                    bottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1.L$2 = null;
                    bottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1.L$3 = null;
                    bottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(zb6Var, bottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        bottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1 = new BottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1(this, continuation);
        Object obj22 = bottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
