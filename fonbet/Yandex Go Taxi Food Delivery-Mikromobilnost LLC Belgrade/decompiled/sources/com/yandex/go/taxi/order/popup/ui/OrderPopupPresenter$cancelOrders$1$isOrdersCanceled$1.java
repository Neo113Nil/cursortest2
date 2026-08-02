package com.yandex.go.taxi.order.popup.ui;

import android.app.Activity;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.y380;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.dialog.AlertDialog;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.popup.ui.OrderPopupPresenter$cancelOrders$1$isOrdersCanceled$1", f = "OrderPopupPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderPopupPresenter$cancelOrders$1$isOrdersCanceled$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ y380 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPopupPresenter$cancelOrders$1$isOrdersCanceled$1(y380 y380Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = y380Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new OrderPopupPresenter$cancelOrders$1$isOrdersCanceled$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        OrderPopupPresenter$cancelOrders$1$isOrdersCanceled$1 orderPopupPresenter$cancelOrders$1$isOrdersCanceled$1 = (OrderPopupPresenter$cancelOrders$1$isOrdersCanceled$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        orderPopupPresenter$cancelOrders$1$isOrdersCanceled$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        com.yandex.go.taxi.order.popup.navigation.a aVar = this.this$0.y.a;
        AlertDialog alertDialog = aVar.L;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        aVar.L = new AlertDialog((Activity) aVar.K).setCancelable(false).setCancelableOnTouchOutside(false).setMessage(kyh0.order_cancel_fail).setPositiveButton(kyh0.common_ok).show();
        return zy11.a;
    }
}
