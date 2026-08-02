package com.yandex.go.scooters.data.mapper;

import com.yandex.go.scooters.data.model.SubscriptionPromoblock;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.cxo0;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcxo0;", "<anonymous>", "(Ltse;)Lcxo0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersSubscriptionMapper$mapPromoblockSubscription$2$badgeAsync$1", f = "ScootersSubscriptionMapper.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSubscriptionMapper$mapPromoblockSubscription$2$badgeAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ SubscriptionPromoblock $promoblock;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSubscriptionMapper$mapPromoblockSubscription$2$badgeAsync$1(fef fefVar, e eVar, SubscriptionPromoblock subscriptionPromoblock, Continuation continuation) {
        super(2, continuation);
        this.$promoblock = subscriptionPromoblock;
        this.this$0 = eVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SubscriptionPromoblock subscriptionPromoblock = this.$promoblock;
        return new ScootersSubscriptionMapper$mapPromoblockSubscription$2$badgeAsync$1(this.$currencyRules, this.this$0, subscriptionPromoblock, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSubscriptionMapper$mapPromoblockSubscription$2$badgeAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            SubscriptionPromoblock.Badge badge = this.$promoblock.e;
            if (badge == null) {
                return null;
            }
            e eVar = this.this$0;
            fef fefVar = this.$currencyRules;
            this.label = 1;
            obj = e.a(eVar, badge, fefVar, this);
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
        return (cxo0) obj;
    }
}
