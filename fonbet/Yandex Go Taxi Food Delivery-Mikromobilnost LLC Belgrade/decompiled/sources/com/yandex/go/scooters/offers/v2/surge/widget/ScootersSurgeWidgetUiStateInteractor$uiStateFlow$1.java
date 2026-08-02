package com.yandex.go.scooters.offers.v2.surge.widget;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.b4p0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb4p0;", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Ly2p0;", "<anonymous>", "(Lb4p0;Lru/yandex/taxi/theme/ThemeType;)Ly2p0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.surge.widget.ScootersSurgeWidgetUiStateInteractor$uiStateFlow$1", f = "ScootersSurgeWidgetUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSurgeWidgetUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersSurgeWidgetUiStateInteractor$uiStateFlow$1 scootersSurgeWidgetUiStateInteractor$uiStateFlow$1 = new ScootersSurgeWidgetUiStateInteractor$uiStateFlow$1(3, (Continuation) obj3);
        scootersSurgeWidgetUiStateInteractor$uiStateFlow$1.L$0 = (b4p0) obj;
        return scootersSurgeWidgetUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b4p0 b4p0Var = (b4p0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (b4p0Var != null) {
            return b4p0Var.k;
        }
        return null;
    }
}
