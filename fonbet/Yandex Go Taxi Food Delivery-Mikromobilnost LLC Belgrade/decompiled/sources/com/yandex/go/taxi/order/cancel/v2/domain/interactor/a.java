package com.yandex.go.taxi.order.cancel.v2.domain.interactor;

import com.yandex.go.taxi.order.cancel.v2.domain.models.OrderCancelUiState$HeaderImage$Content;
import defpackage.nk70;
import defpackage.ny61;
import defpackage.pk70;
import defpackage.qk70;
import defpackage.ql70;
import defpackage.rk70;
import defpackage.rl70;
import defpackage.sk70;
import defpackage.sl70;
import defpackage.tk70;
import defpackage.tl70;
import defpackage.vl70;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xk70;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ xk70 b;

    public a(vpr vprVar, xk70 xk70Var) {
        this.a = vprVar;
        this.b = xk70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1;
        int i;
        tl70 orderCancelUiState$HeaderImage$Content;
        tl70 tl70Var;
        if (continuation instanceof OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) {
            orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = (OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    tk70 tk70Var = (tk70) obj;
                    this.b.getClass();
                    rk70 rk70Var = tk70Var.c;
                    if (rk70Var instanceof pk70) {
                        tl70Var = rl70.a;
                    } else {
                        if (rk70Var instanceof qk70) {
                            orderCancelUiState$HeaderImage$Content = new sl70(((qk70) rk70Var).a);
                        } else {
                            if (!(rk70Var instanceof com.yandex.go.taxi.order.cancel.v2.domain.models.a)) {
                                w511.b();
                                return null;
                            }
                            com.yandex.go.taxi.order.cancel.v2.domain.models.a aVar = (com.yandex.go.taxi.order.cancel.v2.domain.models.a) rk70Var;
                            orderCancelUiState$HeaderImage$Content = new OrderCancelUiState$HeaderImage$Content(aVar.a, aVar.b, aVar.c, aVar.d);
                        }
                        tl70Var = orderCancelUiState$HeaderImage$Content;
                    }
                    nk70 nk70Var = tk70Var.f;
                    ql70 ql70Var = new ql70(nk70Var.a, nk70Var.b);
                    sk70 sk70Var = tk70Var.d;
                    vl70 vl70Var = new vl70(tl70Var, sk70Var.a, sk70Var.b, tk70Var.e.a, ql70Var);
                    orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(vl70Var, orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = new OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
