package com.yandex.go.taxi.order.details.v2.state.elements.companion_buffer_search;

import com.yandex.go.slot.api.ui.SlotItemUiState$Size;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CompanionBufferSearch;
import defpackage.css0;
import defpackage.ess0;
import defpackage.mqs0;
import defpackage.mvg;
import defpackage.nek0;
import defpackage.ny61;
import defpackage.ock0;
import defpackage.rss0;
import defpackage.xss0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcss0;", "body", "Lock0;", "animationItemUiState", "Lnek0;", "<anonymous>", "(Lcss0;Lock0;)Lnek0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.companion_buffer_search.RideCardCompanionBufferSearchItemDataSource$stateFlow$1", f = "RideCardCompanionBufferSearchItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardCompanionBufferSearchItemDataSource$stateFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ RideCardItemDto$CompanionBufferSearch $item;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardCompanionBufferSearchItemDataSource$stateFlow$1(RideCardItemDto$CompanionBufferSearch rideCardItemDto$CompanionBufferSearch, Continuation continuation) {
        super(3, continuation);
        this.$item = rideCardItemDto$CompanionBufferSearch;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RideCardCompanionBufferSearchItemDataSource$stateFlow$1 rideCardCompanionBufferSearchItemDataSource$stateFlow$1 = new RideCardCompanionBufferSearchItemDataSource$stateFlow$1(this.$item, (Continuation) obj3);
        rideCardCompanionBufferSearchItemDataSource$stateFlow$1.L$0 = (css0) obj;
        rideCardCompanionBufferSearchItemDataSource$stateFlow$1.L$1 = (ock0) obj2;
        return rideCardCompanionBufferSearchItemDataSource$stateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        css0 css0Var = (css0) this.L$0;
        ock0 ock0Var = (ock0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        RideCardItemDto$CompanionBufferSearch rideCardItemDto$CompanionBufferSearch = this.$item;
        return new nek0(rideCardItemDto$CompanionBufferSearch.a, rideCardItemDto$CompanionBufferSearch.b, new xss0(ess0.a, css0Var, rss0.a, new mqs0(), SlotItemUiState$Size.L), ock0Var);
    }
}
