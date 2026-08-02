package com.yandex.go.taxi.order.tariff_upgrade.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.tariff_upgrade.domain.TariffUpgradeInteractor$createTariffUpgrade$preloadResult$1", f = "TariffUpgradeInteractor.kt", l = {145}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffUpgradeInteractor$createTariffUpgrade$preloadResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageUrl;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffUpgradeInteractor$createTariffUpgrade$preloadResult$1(l lVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$imageUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffUpgradeInteractor$createTariffUpgrade$preloadResult$1(this.this$0, this.$imageUrl, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffUpgradeInteractor$createTariffUpgrade$preloadResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.image.domain.requests.g gVar = (com.yandex.go.image.domain.requests.g) this.this$0.a.e();
            gVar.g = true;
            gVar.c(this.$imageUrl);
            this.label = 1;
            e = ru.yandex.taxi.utils.a.e(gVar, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e = ((Result) obj).getValue();
        }
        return new Result(e);
    }
}
