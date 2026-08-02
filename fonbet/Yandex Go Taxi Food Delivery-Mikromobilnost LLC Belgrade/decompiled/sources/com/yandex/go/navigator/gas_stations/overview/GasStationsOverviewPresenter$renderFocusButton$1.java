package com.yandex.go.navigator.gas_stations.overview;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qvs;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isFocusedOnUser", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lqvs;", "<anonymous>", "(ZLru/yandex/taxi/theme/ThemeType;)Lqvs;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewPresenter$renderFocusButton$1", f = "GasStationsOverviewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsOverviewPresenter$renderFocusButton$1 extends SuspendLambda implements zls {
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        GasStationsOverviewPresenter$renderFocusButton$1 gasStationsOverviewPresenter$renderFocusButton$1 = new GasStationsOverviewPresenter$renderFocusButton$1(3, (Continuation) obj3);
        gasStationsOverviewPresenter$renderFocusButton$1.Z$0 = booleanValue;
        return gasStationsOverviewPresenter$renderFocusButton$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new qvs(z ? GasStationsOverviewUiState$FocusButtonState$FocusButtonMode.ROUTE : GasStationsOverviewUiState$FocusButtonState$FocusButtonMode.USER_LOCATION);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
