package com.yandex.go.scooters.data.mapper;

import com.yandex.go.scooters.data.model.ScootersSubscriptionUpsaleBadgeDto;
import com.yandex.go.scooters.data.model.ScootersSubscriptionUpsaleWindowDto;
import defpackage.fef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xzo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxzo0;", "<anonymous>", "(Ltse;)Lxzo0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2$badgeAsync$1", f = "ScootersSubscriptionMapper.kt", l = {159}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2$badgeAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ ScootersSubscriptionUpsaleWindowDto $this_mapSubscriptionUpsaleWindow;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2$badgeAsync$1(fef fefVar, e eVar, ScootersSubscriptionUpsaleWindowDto scootersSubscriptionUpsaleWindowDto, Continuation continuation) {
        super(2, continuation);
        this.$this_mapSubscriptionUpsaleWindow = scootersSubscriptionUpsaleWindowDto;
        this.this$0 = eVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersSubscriptionUpsaleWindowDto scootersSubscriptionUpsaleWindowDto = this.$this_mapSubscriptionUpsaleWindow;
        return new ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2$badgeAsync$1(this.$currencyRules, this.this$0, scootersSubscriptionUpsaleWindowDto, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2$badgeAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ScootersSubscriptionUpsaleBadgeDto scootersSubscriptionUpsaleBadgeDto = this.$this_mapSubscriptionUpsaleWindow.d;
            if (scootersSubscriptionUpsaleBadgeDto == null) {
                return null;
            }
            e eVar = this.this$0;
            fef fefVar = this.$currencyRules;
            this.label = 1;
            obj = e.d(eVar, scootersSubscriptionUpsaleBadgeDto, fefVar, this);
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
        return (xzo0) obj;
    }
}
