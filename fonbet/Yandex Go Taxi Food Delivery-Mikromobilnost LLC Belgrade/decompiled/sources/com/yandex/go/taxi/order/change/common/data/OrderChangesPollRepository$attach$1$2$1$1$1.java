package com.yandex.go.taxi.order.change.common.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tb9;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lio70;", "<anonymous>", "(Ltse;)Lio70;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.common.data.OrderChangesPollRepository$attach$1$2$1$1$1", f = "OrderChangesPollRepository.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderChangesPollRepository$attach$1$2$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $launchId;
    final /* synthetic */ tb9 $payload;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderChangesPollRepository$attach$1$2$1$1$1(d dVar, String str, tb9 tb9Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$launchId = str;
        this.$payload = tb9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderChangesPollRepository$attach$1$2$1$1$1(this.this$0, this.$launchId, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderChangesPollRepository$attach$1$2$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        d dVar = this.this$0;
        String str = this.$launchId;
        tb9 tb9Var = this.$payload;
        this.label = 1;
        Object f = dVar.f(str, tb9Var, 0, this);
        return f == coroutineSingletons ? coroutineSingletons : f;
    }
}
