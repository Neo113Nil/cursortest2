package com.yandex.go.taxi.order.change.source.interactor;

import com.yandex.go.taxi.order.models.api.response.ModalItemDto$DefaultItem;
import com.yandex.go.taxi.order.models.api.response.u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8s0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ln8e0;", "<anonymous>", "(Ltse;)Ln8e0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.interactor.OrderPickupPointClickInteractor$openModal$popupModalState$1", f = "OrderPickupPointClickInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderPickupPointClickInteractor$openModal$popupModalState$1 extends SuspendLambda implements wls {
    final /* synthetic */ u0 $modal;
    final /* synthetic */ o8s0 $showPolicy;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPickupPointClickInteractor$openModal$popupModalState$1(k kVar, u0 u0Var, o8s0 o8s0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$modal = u0Var;
        this.$showPolicy = o8s0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderPickupPointClickInteractor$openModal$popupModalState$1(this.this$0, this.$modal, this.$showPolicy, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderPickupPointClickInteractor$openModal$popupModalState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.this$0.b.i((ModalItemDto$DefaultItem) this.$modal, this.$showPolicy);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
