package com.yandex.go.order.tariffs_suggest.ui;

import defpackage.f1h0;
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
@mvg(c = "com.yandex.go.order.tariffs_suggest.ui.OrderWithTariffSuggestPresenter$showSuccessNotification$2", f = "OrderWithTariffSuggestPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class OrderWithTariffSuggestPresenter$showSuccessNotification$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $title;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderWithTariffSuggestPresenter$showSuccessNotification$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$title = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderWithTariffSuggestPresenter$showSuccessNotification$2(this.this$0, this.$title, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderWithTariffSuggestPresenter$showSuccessNotification$2 orderWithTariffSuggestPresenter$showSuccessNotification$2 = (OrderWithTariffSuggestPresenter$showSuccessNotification$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderWithTariffSuggestPresenter$showSuccessNotification$2.invokeSuspend(zy11Var);
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
        String str = this.$title;
        com.yandex.go.taxi.order.change.tariff.a aVar = (com.yandex.go.taxi.order.change.tariff.a) sg9Var;
        aVar.getClass();
        aVar.b(str, null, new nb9(f1h0.ic_success_change));
        return zy11.a;
    }
}
