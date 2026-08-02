package com.yandex.go.taxi.order.multi.tracking;

import com.yandex.go.taxi.order.feed.api.FeedVisibilityState;
import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/taxi/order/multi/tracking/TaxiOrderTrackingViewDelegate$Type;", "isTariffSelectionAvailable", "", "isMultimodal", "feedVisibility", "Lcom/yandex/go/taxi/order/feed/api/FeedVisibilityState;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingPresenter$subscribePresenceMonitoring$5", f = "TaxiOrderTrackingPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderTrackingPresenter$subscribePresenceMonitoring$5 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderTrackingPresenter$subscribePresenceMonitoring$5(i iVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = iVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        TaxiOrderTrackingPresenter$subscribePresenceMonitoring$5 taxiOrderTrackingPresenter$subscribePresenceMonitoring$5 = new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$5(this.this$0, (Continuation) obj4);
        taxiOrderTrackingPresenter$subscribePresenceMonitoring$5.Z$0 = booleanValue;
        taxiOrderTrackingPresenter$subscribePresenceMonitoring$5.Z$1 = booleanValue2;
        taxiOrderTrackingPresenter$subscribePresenceMonitoring$5.L$0 = (FeedVisibilityState) obj3;
        return taxiOrderTrackingPresenter$subscribePresenceMonitoring$5.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        FeedVisibilityState feedVisibilityState = (FeedVisibilityState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return z ? TaxiOrderTrackingViewDelegate$Type.TARIFF_SELECTION : z2 ? TaxiOrderTrackingViewDelegate$Type.MULTIMODAL : (this.this$0.P || feedVisibilityState == FeedVisibilityState.HIDE) ? TaxiOrderTrackingViewDelegate$Type.EMPTY : TaxiOrderTrackingViewDelegate$Type.FEED;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
