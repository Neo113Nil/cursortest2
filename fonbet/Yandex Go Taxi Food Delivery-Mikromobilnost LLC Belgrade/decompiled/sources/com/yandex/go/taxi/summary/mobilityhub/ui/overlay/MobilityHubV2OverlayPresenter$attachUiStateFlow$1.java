package com.yandex.go.taxi.summary.mobilityhub.ui.overlay;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.repository.HubContentState;
import defpackage.d0l0;
import defpackage.dms;
import defpackage.khq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Ld0l0;", "route", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/repository/HubContentState;", "hubContentState", "Lkhq0;", "selectedOfferData", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lkotlin/Triple;", "<anonymous>", "(Ld0l0;Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/repository/HubContentState;Lkhq0;Lru/yandex/taxi/theme/ThemeType;)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.ui.overlay.MobilityHubV2OverlayPresenter$attachUiStateFlow$1", f = "MobilityHubV2OverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MobilityHubV2OverlayPresenter$attachUiStateFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        MobilityHubV2OverlayPresenter$attachUiStateFlow$1 mobilityHubV2OverlayPresenter$attachUiStateFlow$1 = new MobilityHubV2OverlayPresenter$attachUiStateFlow$1(5, (Continuation) obj5);
        mobilityHubV2OverlayPresenter$attachUiStateFlow$1.L$0 = (d0l0) obj;
        mobilityHubV2OverlayPresenter$attachUiStateFlow$1.L$1 = (HubContentState) obj2;
        mobilityHubV2OverlayPresenter$attachUiStateFlow$1.L$2 = (khq0) obj3;
        return mobilityHubV2OverlayPresenter$attachUiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d0l0 d0l0Var = (d0l0) this.L$0;
        HubContentState hubContentState = (HubContentState) this.L$1;
        khq0 khq0Var = (khq0) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Triple(d0l0Var, hubContentState, khq0Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
