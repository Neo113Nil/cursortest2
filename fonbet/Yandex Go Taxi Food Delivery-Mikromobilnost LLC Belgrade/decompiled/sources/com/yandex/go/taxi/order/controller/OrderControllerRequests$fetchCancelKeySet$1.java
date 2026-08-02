package com.yandex.go.taxi.order.controller;

import defpackage.jl70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import retrofit2.HttpException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.controller.OrderControllerRequests$fetchCancelKeySet$1", f = "OrderControllerRequests.kt", l = {293}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderControllerRequests$fetchCancelKeySet$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderControllerRequests$fetchCancelKeySet$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderControllerRequests$fetchCancelKeySet$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderControllerRequests$fetchCancelKeySet$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        a aVar2;
        int a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar3 = this.this$0;
                try {
                    ru.yandex.taxi.translations.interactor.a aVar4 = aVar3.r;
                    this.L$0 = aVar3;
                    this.L$1 = aVar3;
                    this.label = 1;
                    Object b = aVar4.b("cancel_state", this);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar = aVar3;
                    obj = b;
                    aVar2 = aVar;
                } catch (Throwable th) {
                    th = th;
                    aVar = aVar3;
                    aVar.G.b("onFetchCancelKeySetError", th, new jl70(17));
                    if ((th instanceof HttpException) && ((a = th.a()) == 400 || a == 404)) {
                        aVar.J = kotlin.collections.b.f();
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$1;
                aVar2 = (a) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    aVar.G.b("onFetchCancelKeySetError", th, new jl70(17));
                    if (th instanceof HttpException) {
                        aVar.J = kotlin.collections.b.f();
                    }
                    return zy11.a;
                }
            }
            aVar2.J = new HashMap((Map) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
