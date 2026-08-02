package com.yandex.go.scooters.data.mapper;

import com.yandex.go.scooters.data.model.SubscriptionPromoblock;
import defpackage.f9s;
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
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersSubscriptionMapper$mapPromoblockSubscription$2$subtitleAsync$1", f = "ScootersSubscriptionMapper.kt", l = {72}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSubscriptionMapper$mapPromoblockSubscription$2$subtitleAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ SubscriptionPromoblock $promoblock;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSubscriptionMapper$mapPromoblockSubscription$2$subtitleAsync$1(fef fefVar, e eVar, SubscriptionPromoblock subscriptionPromoblock, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$promoblock = subscriptionPromoblock;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersSubscriptionMapper$mapPromoblockSubscription$2$subtitleAsync$1(this.$currencyRules, this.this$0, this.$promoblock, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSubscriptionMapper$mapPromoblockSubscription$2$subtitleAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        e eVar = this.this$0;
        ru.yandex.taxi.widget.c cVar = eVar.e;
        FormattedText c = f9s.c(eVar.c, this.$currencyRules, this.$promoblock.d);
        this.label = 1;
        Object e = ru.yandex.taxi.widget.c.e(cVar, c, null, false, this, 30);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
