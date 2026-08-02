package com.yandex.go.taxi.order.controller;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/yandex/go/zone/model/Zone;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.controller.OrderControllerRequests$updateOrderZone$zoneFetchFunction$2", f = "OrderControllerRequests.kt", l = {330}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderControllerRequests$updateOrderZone$zoneFetchFunction$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $zoneName;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderControllerRequests$updateOrderZone$zoneFetchFunction$2(a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$zoneName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new OrderControllerRequests$updateOrderZone$zoneFetchFunction$2(this.this$0, this.$zoneName, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((OrderControllerRequests$updateOrderZone$zoneFetchFunction$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        com.yandex.go.zone.interactors.b bVar = this.this$0.j;
        String str = this.$zoneName;
        this.label = 1;
        Object a = bVar.a(str, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
