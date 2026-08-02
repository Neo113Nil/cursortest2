package com.yandex.go.chargers.subscription.data;

import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionResponseDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/chargers/subscription/data/model/ChargersSubscriptionResponseDto;", "response", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lgta;", "<anonymous>", "(Lcom/yandex/go/chargers/subscription/data/model/ChargersSubscriptionResponseDto;Lru/yandex/taxi/theme/ThemeType;)Lgta;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.subscription.data.ChargersSubscriptionRepository$getSubscriptionData$2", f = "ChargersSubscriptionRepository.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersSubscriptionRepository$getSubscriptionData$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersSubscriptionRepository$getSubscriptionData$2(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersSubscriptionRepository$getSubscriptionData$2 chargersSubscriptionRepository$getSubscriptionData$2 = new ChargersSubscriptionRepository$getSubscriptionData$2(this.this$0, (Continuation) obj3);
        chargersSubscriptionRepository$getSubscriptionData$2.L$0 = (ChargersSubscriptionResponseDto) obj;
        return chargersSubscriptionRepository$getSubscriptionData$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChargersSubscriptionResponseDto chargersSubscriptionResponseDto = (ChargersSubscriptionResponseDto) this.L$0;
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
        com.yandex.go.chargers.subscription.data.mapper.a aVar = this.this$0.c;
        this.L$0 = null;
        this.label = 1;
        Object a = aVar.a(chargersSubscriptionResponseDto, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
