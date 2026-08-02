package com.yandex.go.order.tariffs_suggest.ui;

import defpackage.f1h0;
import defpackage.kyh0;
import defpackage.lg9;
import defpackage.mvg;
import defpackage.nb9;
import defpackage.ny61;
import defpackage.sg9;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.tariffs_suggest.ui.OrderWithTariffSuggestPresenter$showFailedNotification$2", f = "OrderWithTariffSuggestPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class OrderWithTariffSuggestPresenter$showFailedNotification$2 extends SuspendLambda implements wls {
    final /* synthetic */ lg9 $message;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderWithTariffSuggestPresenter$showFailedNotification$2(a aVar, lg9 lg9Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$message = lg9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderWithTariffSuggestPresenter$showFailedNotification$2(this.this$0, this.$message, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderWithTariffSuggestPresenter$showFailedNotification$2 orderWithTariffSuggestPresenter$showFailedNotification$2 = (OrderWithTariffSuggestPresenter$showFailedNotification$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderWithTariffSuggestPresenter$showFailedNotification$2.invokeSuspend(zy11Var);
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
        sg9 sg9Var = this.this$0.A;
        lg9 lg9Var = this.$message;
        String str = lg9Var != null ? lg9Var.a : null;
        String str2 = lg9Var != null ? lg9Var.b : null;
        com.yandex.go.taxi.order.change.tariff.a aVar = (com.yandex.go.taxi.order.change.tariff.a) sg9Var;
        if (str == null) {
            str = aVar.a.getString(kyh0.order_details_tariff_suggest_failed_notification_title);
        } else {
            aVar.getClass();
        }
        aVar.b(str, str2, new nb9(f1h0.ic_failed_change));
        return zy11.a;
    }
}
