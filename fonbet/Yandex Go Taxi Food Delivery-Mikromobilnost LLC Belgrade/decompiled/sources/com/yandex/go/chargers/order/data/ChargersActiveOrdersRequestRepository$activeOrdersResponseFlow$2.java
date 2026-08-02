package com.yandex.go.chargers.order.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvpr;", "Lkotlin/Result;", "Lfmt;", "Lcom/yandex/go/chargers/order/data/model/ChargersActiveOrdersResponse;", "", "cause", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.data.ChargersActiveOrdersRequestRepository$activeOrdersResponseFlow$2", f = "ChargersActiveOrdersRequestRepository.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ChargersActiveOrdersRequestRepository$activeOrdersResponseFlow$2 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersActiveOrdersRequestRepository$activeOrdersResponseFlow$2 chargersActiveOrdersRequestRepository$activeOrdersResponseFlow$2 = new ChargersActiveOrdersRequestRepository$activeOrdersResponseFlow$2(3, (Continuation) obj3);
        chargersActiveOrdersRequestRepository$activeOrdersResponseFlow$2.L$0 = (vpr) obj;
        chargersActiveOrdersRequestRepository$activeOrdersResponseFlow$2.L$1 = (Throwable) obj2;
        return chargersActiveOrdersRequestRepository$activeOrdersResponseFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Throwable th = (Throwable) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Result result = new Result(new Result.Failure(th));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(result, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
