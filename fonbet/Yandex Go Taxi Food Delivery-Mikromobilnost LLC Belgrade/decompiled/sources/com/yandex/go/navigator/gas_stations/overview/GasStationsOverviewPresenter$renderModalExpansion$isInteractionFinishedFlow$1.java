package com.yandex.go.navigator.gas_stations.overview;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "isFinished"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewPresenter$renderModalExpansion$isInteractionFinishedFlow$1", f = "GasStationsOverviewPresenter.kt", l = {112}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsOverviewPresenter$renderModalExpansion$isInteractionFinishedFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GasStationsOverviewPresenter$renderModalExpansion$isInteractionFinishedFlow$1 gasStationsOverviewPresenter$renderModalExpansion$isInteractionFinishedFlow$1 = new GasStationsOverviewPresenter$renderModalExpansion$isInteractionFinishedFlow$1(2, continuation);
        gasStationsOverviewPresenter$renderModalExpansion$isInteractionFinishedFlow$1.Z$0 = ((Boolean) obj).booleanValue();
        return gasStationsOverviewPresenter$renderModalExpansion$isInteractionFinishedFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((GasStationsOverviewPresenter$renderModalExpansion$isInteractionFinishedFlow$1) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (z) {
                this.Z$0 = z;
                this.label = 1;
                if (kotlinx.coroutines.a.i(600L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return Boolean.valueOf(z);
    }
}
