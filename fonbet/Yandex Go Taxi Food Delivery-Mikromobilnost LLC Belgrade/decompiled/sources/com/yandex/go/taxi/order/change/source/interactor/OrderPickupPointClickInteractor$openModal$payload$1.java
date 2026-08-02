package com.yandex.go.taxi.order.change.source.interactor;

import com.yandex.go.taxi.order.models.api.response.ModalItemDto$StepsInstructionsItem;
import com.yandex.go.taxi.order.models.api.response.u0;
import defpackage.jbu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.usc;
import defpackage.wls;
import defpackage.zau0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$ModalType;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$RideOpenReason;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzau0;", "<anonymous>", "(Ltse;)Lzau0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.interactor.OrderPickupPointClickInteractor$openModal$payload$1", f = "OrderPickupPointClickInteractor.kt", l = {90}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderPickupPointClickInteractor$openModal$payload$1 extends SuspendLambda implements wls {
    final /* synthetic */ u0 $modal;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPickupPointClickInteractor$openModal$payload$1(k kVar, u0 u0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$modal = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderPickupPointClickInteractor$openModal$payload$1(this.this$0, this.$modal, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderPickupPointClickInteractor$openModal$payload$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.taxi.order.popup.b bVar = this.this$0.b;
            ModalItemDto$StepsInstructionsItem modalItemDto$StepsInstructionsItem = (ModalItemDto$StepsInstructionsItem) this.$modal;
            this.label = 1;
            obj = bVar.g(modalItemDto$StepsInstructionsItem, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return new zau0((jbu0) obj, new usc(((ModalItemDto$StepsInstructionsItem) this.$modal).a, CommunicationModalAnalyticsData$ModalType.STEPS, this.this$0.a.b().a, CommunicationModalAnalyticsData$RideOpenReason.PIN_TAP));
    }
}
