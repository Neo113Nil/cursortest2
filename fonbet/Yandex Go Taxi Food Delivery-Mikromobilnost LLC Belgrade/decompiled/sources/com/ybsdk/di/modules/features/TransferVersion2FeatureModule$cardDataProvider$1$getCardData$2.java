package com.ybsdk.di.modules.features;

import com.ybsdk.network.Api;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.di.modules.features.TransferVersion2FeatureModule$cardDataProvider$1$getCardData$2", f = "TransferVersion2FeatureModule.kt", l = {460}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferVersion2FeatureModule$cardDataProvider$1$getCardData$2 extends SuspendLambda implements tls {
    final /* synthetic */ Api $api;
    final /* synthetic */ int $attemptNumber;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferVersion2FeatureModule$cardDataProvider$1$getCardData$2(Api api, int i, Continuation continuation) {
        super(1, continuation);
        this.$api = api;
        this.$attemptNumber = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TransferVersion2FeatureModule$cardDataProvider$1$getCardData$2(this.$api, this.$attemptNumber, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TransferVersion2FeatureModule$cardDataProvider$1$getCardData$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object o;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Api api = this.$api;
            int i2 = this.$attemptNumber;
            this.label = 1;
            o = api.o(i2, this);
            if (o == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            o = ((Result) obj).getValue();
        }
        return new Result(o);
    }
}
