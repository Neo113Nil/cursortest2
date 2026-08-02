package com.yandex.go.taxi.order.popup.ui;

import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import com.yandex.go.zone.dto.objects.PopupUiControl;
import defpackage.l480;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.y380;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.popup.ui.OrderPopupPresenter$cancelOrders$1", f = "OrderPopupPresenter.kt", l = {HProv.ALG_SID_SHA3_384, 85}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderPopupPresenter$cancelOrders$1 extends SuspendLambda implements wls {
    final /* synthetic */ PopupUiControl.CancelOrders $action;
    boolean Z$0;
    int label;
    final /* synthetic */ y380 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPopupPresenter$cancelOrders$1(y380 y380Var, PopupUiControl.CancelOrders cancelOrders, Continuation continuation) {
        super(2, continuation);
        this.this$0 = y380Var;
        this.$action = cancelOrders;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderPopupPresenter$cancelOrders$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderPopupPresenter$cancelOrders$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r1.a.J.a(new com.yandex.go.taxi.order.models.api.ChangeOrderState$Success(r2, 3), r11) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (r12 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        OrderChangesDto.Notification notification = null;
        if (i == 0) {
            b.b(obj);
            y380 y380Var = this.this$0;
            com.yandex.go.taxi.order.popup.a aVar = y380Var.B;
            List list = this.$action.a;
            OrderPopupPresenter$cancelOrders$1$isOrdersCanceled$1 orderPopupPresenter$cancelOrders$1$isOrdersCanceled$1 = new OrderPopupPresenter$cancelOrders$1$isOrdersCanceled$1(y380Var, null);
            this.label = 1;
            obj = aVar.a(list, orderPopupPresenter$cancelOrders$1$isOrdersCanceled$1, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue) {
            l480 l480Var = this.this$0.y;
            PopupUiControl.CancelOrders.DoneNotification doneNotification = this.$action.b;
            this.Z$0 = booleanValue;
            this.label = 2;
            if (doneNotification != null) {
                l480Var.getClass();
                notification = new OrderChangesDto.Notification(doneNotification.b, doneNotification.a, (String) null, (ChangeOrderNotificationActionResponse) null, 12);
            }
        }
        return zy11.a;
    }
}
