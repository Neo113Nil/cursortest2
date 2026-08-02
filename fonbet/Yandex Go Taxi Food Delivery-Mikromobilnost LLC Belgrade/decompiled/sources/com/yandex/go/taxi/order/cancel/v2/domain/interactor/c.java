package com.yandex.go.taxi.order.cancel.v2.domain.interactor;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.cancel.OrderCancelNotification;
import defpackage.gl70;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wh60;
import defpackage.xh60;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1;
        int i;
        gl70 gl70Var;
        if (continuation instanceof OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) {
            orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 = (OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    xh60 b = taxiOrder.V().P.b("order_cancel_notification");
                    if (b != null) {
                        wh60 wh60Var = b.b;
                        if (!((OrderCancelNotification) wh60Var).a()) {
                            wh60Var = null;
                        }
                        OrderCancelNotification orderCancelNotification = (OrderCancelNotification) wh60Var;
                        if (orderCancelNotification != null) {
                            gl70Var = new gl70(taxiOrder.a, orderCancelNotification.a, orderCancelNotification, taxiOrder.V().K, taxiOrder.i.e());
                            if (gl70Var != null) {
                                orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                                orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                                orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                                orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                                orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                                orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label = 1;
                                if (vprVar.emit(gl70Var, orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    }
                    gl70Var = null;
                    if (gl70Var != null) {
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
        orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 = new OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
