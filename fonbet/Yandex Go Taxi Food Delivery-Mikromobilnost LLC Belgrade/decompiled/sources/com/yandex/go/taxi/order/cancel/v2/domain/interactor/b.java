package com.yandex.go.taxi.order.cancel.v2.domain.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.xk70;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ g a;
    public final /* synthetic */ xk70 b;

    public b(g gVar, xk70 xk70Var) {
        this.a = gVar;
        this.b = xk70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$1 orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$1) {
            orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$1 = (OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$1) continuation;
            int i2 = orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$0 = null;
                    orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$1 = null;
                    orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$2 = null;
                    orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$1 = new OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
