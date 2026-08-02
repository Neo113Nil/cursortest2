package com.yandex.go.taxi.order.detailed_price.data;

import com.yandex.go.taxi.order.detailed_price.data.api.DetailedPriceRequest;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/go/taxi/order/detailed_price/data/api/response/j;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.detailed_price.data.DetailedPriceRepository$getDetailedPrice$2", f = "DetailedPriceRepository.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailedPriceRepository$getDetailedPrice$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailedPriceRepository$getDetailedPrice$2(String str, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$orderId = str;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailedPriceRepository$getDetailedPrice$2(this.$orderId, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailedPriceRepository$getDetailedPrice$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                String str = this.$orderId;
                a aVar = this.this$0;
                mth mthVar = new mth(e.I(aVar.a.i(), new DetailedPriceRepository$getDetailedPrice$2$1$response$1(aVar, new DetailedPriceRequest(str, 2), null)), 6);
                this.L$0 = null;
                this.label = 1;
                obj = e.y(mthVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            failure = (List) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        if (failure instanceof Result.Failure) {
            return null;
        }
        return failure;
    }
}
