package com.yandex.go.superapp.order.multi.old.view;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.i3y;
import defpackage.m48;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.superapp.orders.ui.PopupWindowAboveFromView;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/navigation/screen/api/Screen;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/navigation/screen/api/Screen;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.order.multi.old.view.OrderStackViewRouter$resume$1", f = "OrderStackViewRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderStackViewRouter$resume$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStackViewRouter$resume$1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderStackViewRouter$resume$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderStackViewRouter$resume$1 orderStackViewRouter$resume$1 = (OrderStackViewRouter$resume$1) create((Screen) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderStackViewRouter$resume$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.superapp.orders.ui.c cVar = ((m48) this.this$0.f).k;
        if (cVar != null) {
            i3y i3yVar = cVar.d;
            if (i3yVar.isInitialized()) {
                ((PopupWindowAboveFromView) i3yVar.getValue()).dismiss();
            }
        }
        return zy11.a;
    }
}
