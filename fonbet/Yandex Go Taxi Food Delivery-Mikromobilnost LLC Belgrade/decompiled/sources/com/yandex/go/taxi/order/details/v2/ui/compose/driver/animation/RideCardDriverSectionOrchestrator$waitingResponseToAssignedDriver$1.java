package com.yandex.go.taxi.order.details.v2.ui.compose.driver.animation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.details.v2.ui.compose.driver.animation.RideCardDriverSectionOrchestrator", f = "RideCardDriverSectionOrchestrator.kt", l = {216, 226, 229, 237}, m = "waitingResponseToAssignedDriver", v = 2)
/* loaded from: classes14.dex */
final class RideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RideCardDriverSectionOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$1(RideCardDriverSectionOrchestrator rideCardDriverSectionOrchestrator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rideCardDriverSectionOrchestrator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.l(null, null, this);
    }
}
