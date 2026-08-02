package com.yandex.go.scooters.offers.v2.details;

import defpackage.b4p0;
import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lb4p0;", "tariffs", "selectedTariff", "Lsco0;", "<unused var>", "Lru/yandex/taxi/theme/ThemeType;", "Lkotlin/Pair;", "<anonymous>", "(Ljava/util/List;Lb4p0;Lsco0;Lru/yandex/taxi/theme/ThemeType;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.details.ScootersOfferDetailsPresenter$init$1", f = "ScootersOfferDetailsPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersOfferDetailsPresenter$init$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ScootersOfferDetailsPresenter$init$1 scootersOfferDetailsPresenter$init$1 = new ScootersOfferDetailsPresenter$init$1(5, (Continuation) obj5);
        scootersOfferDetailsPresenter$init$1.L$0 = (List) obj;
        scootersOfferDetailsPresenter$init$1.L$1 = (b4p0) obj2;
        return scootersOfferDetailsPresenter$init$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        b4p0 b4p0Var = (b4p0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(b4p0Var, list);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
