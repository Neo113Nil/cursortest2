package com.yandex.go.taxi.order.change.source.interactor;

import defpackage.abu0;
import defpackage.ap9;
import defpackage.hxx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zau0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.interactor.OrderPickupPointClickInteractor$openModal$3", f = "OrderPickupPointClickInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderPickupPointClickInteractor$openModal$3 extends SuspendLambda implements wls {
    final /* synthetic */ zau0 $payload;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPickupPointClickInteractor$openModal$3(k kVar, zau0 zau0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$payload = zau0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderPickupPointClickInteractor$openModal$3(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderPickupPointClickInteractor$openModal$3 orderPickupPointClickInteractor$openModal$3 = (OrderPickupPointClickInteractor$openModal$3) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderPickupPointClickInteractor$openModal$3.invokeSuspend(zy11Var);
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
        k kVar = this.this$0;
        ((pep0) kVar.g).f(new ap9(4, (abu0) kVar.f.get()), this.$payload, hxx.a);
        return zy11.a;
    }
}
