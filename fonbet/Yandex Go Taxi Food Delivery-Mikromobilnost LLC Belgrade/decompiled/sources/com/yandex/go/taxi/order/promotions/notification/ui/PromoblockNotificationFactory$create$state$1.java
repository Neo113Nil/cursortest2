package com.yandex.go.taxi.order.promotions.notification.ui;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.model.CommunicationItem;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Llsc;", "<anonymous>", "(Ltse;)Llsc;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.promotions.notification.ui.PromoblockNotificationFactory$create$state$1", f = "PromoblockNotificationFactory.kt", l = {19}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class PromoblockNotificationFactory$create$state$1 extends SuspendLambda implements wls {
    final /* synthetic */ CommunicationItem $item;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoblockNotificationFactory$create$state$1(b bVar, CommunicationItem communicationItem, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$item = communicationItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PromoblockNotificationFactory$create$state$1(this.this$0, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PromoblockNotificationFactory$create$state$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0.b;
        CommunicationItem communicationItem = this.$item;
        this.label = 1;
        aVar.getClass();
        Object n = bvf0.n(new CommunicationUiStateMapper$map$2(aVar, communicationItem, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
