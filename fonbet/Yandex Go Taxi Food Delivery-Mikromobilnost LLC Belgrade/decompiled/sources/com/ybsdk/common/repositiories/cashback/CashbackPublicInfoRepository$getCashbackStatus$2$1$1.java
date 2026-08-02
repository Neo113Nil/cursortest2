package com.ybsdk.common.repositiories.cashback;

import com.ybsdk.network.dto.CashbackStatusResponse;
import defpackage.hf51;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/network/dto/CashbackStatusResponse;", "entityResult", "Lhf51;", "<anonymous>", "(Lcom/ybsdk/network/dto/CashbackStatusResponse;)Lhf51;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.repositiories.cashback.CashbackPublicInfoRepository$getCashbackStatus$2$1$1", f = "CashbackPublicInfoRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CashbackPublicInfoRepository$getCashbackStatus$2$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CashbackPublicInfoRepository$getCashbackStatus$2$1$1 cashbackPublicInfoRepository$getCashbackStatus$2$1$1 = new CashbackPublicInfoRepository$getCashbackStatus$2$1$1(2, continuation);
        cashbackPublicInfoRepository$getCashbackStatus$2$1$1.L$0 = obj;
        return cashbackPublicInfoRepository$getCashbackStatus$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CashbackPublicInfoRepository$getCashbackStatus$2$1$1) create((CashbackStatusResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        CashbackStatusResponse cashbackStatusResponse = (CashbackStatusResponse) this.L$0;
        return new hf51(cashbackStatusResponse.isAvailable(), cashbackStatusResponse.getMonth());
    }
}
