package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ou60;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lou60;", ClidProvider.STATE, "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "<anonymous>", "(Lou60;Lru/yandex/taxi/theme/ThemeType;)Lou60;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.interactor.VerticalHubV1UiStateInteractor$hubOffersStateFlow$1", f = "VerticalHubV1UiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalHubV1UiStateInteractor$hubOffersStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VerticalHubV1UiStateInteractor$hubOffersStateFlow$1 verticalHubV1UiStateInteractor$hubOffersStateFlow$1 = new VerticalHubV1UiStateInteractor$hubOffersStateFlow$1(3, (Continuation) obj3);
        verticalHubV1UiStateInteractor$hubOffersStateFlow$1.L$0 = (ou60) obj;
        return verticalHubV1UiStateInteractor$hubOffersStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ou60 ou60Var = (ou60) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return ou60Var;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
