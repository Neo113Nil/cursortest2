package com.yandex.go.tariffcard.ui;

import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmi31;", "verticalTariff", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "<anonymous>", "(Lmi31;Lru/yandex/taxi/theme/ThemeType;)Lmi31;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.ui.TariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$1", f = "TariffOptionsCardStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$1 tariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$1 = new TariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$1(3, (Continuation) obj3);
        tariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$1.L$0 = (mi31) obj;
        return tariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mi31 mi31Var = (mi31) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return mi31Var;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
