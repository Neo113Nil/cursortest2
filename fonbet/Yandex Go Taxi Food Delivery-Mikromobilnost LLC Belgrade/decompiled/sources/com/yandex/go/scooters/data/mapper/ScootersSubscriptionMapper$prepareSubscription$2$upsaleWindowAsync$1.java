package com.yandex.go.scooters.data.mapper;

import com.yandex.go.scooters.data.model.ScootersSubscriptionUpsaleWindowDto;
import com.yandex.go.scooters.data.model.Subscription;
import defpackage.a0p0;
import defpackage.fef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "La0p0;", "<anonymous>", "(Ltse;)La0p0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersSubscriptionMapper$prepareSubscription$2$upsaleWindowAsync$1", f = "ScootersSubscriptionMapper.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSubscriptionMapper$prepareSubscription$2$upsaleWindowAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ Subscription $subscription;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSubscriptionMapper$prepareSubscription$2$upsaleWindowAsync$1(Subscription subscription, e eVar, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.$subscription = subscription;
        this.this$0 = eVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersSubscriptionMapper$prepareSubscription$2$upsaleWindowAsync$1(this.$subscription, this.this$0, this.$currencyRules, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSubscriptionMapper$prepareSubscription$2$upsaleWindowAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScootersSubscriptionUpsaleWindowDto scootersSubscriptionUpsaleWindowDto;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Subscription subscription = this.$subscription;
            if (subscription == null || (scootersSubscriptionUpsaleWindowDto = subscription.b) == null) {
                return null;
            }
            e eVar = this.this$0;
            fef fefVar = this.$currencyRules;
            this.label = 1;
            obj = e.f(eVar, scootersSubscriptionUpsaleWindowDto, fefVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return (a0p0) obj;
    }
}
