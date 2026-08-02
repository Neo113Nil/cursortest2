package com.yandex.go.taxi.order.details.v2.ui.compose.driver.animation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.details.v2.ui.compose.driver.animation.RideCardDriverSectionOrchestrator", f = "RideCardDriverSectionOrchestrator.kt", l = {MSException.ERROR_BUSY, 177}, m = "plainContentChange", v = 2)
/* loaded from: classes14.dex */
final class RideCardDriverSectionOrchestrator$plainContentChange$1 extends ContinuationImpl {
    float F$0;
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RideCardDriverSectionOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDriverSectionOrchestrator$plainContentChange$1(RideCardDriverSectionOrchestrator rideCardDriverSectionOrchestrator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rideCardDriverSectionOrchestrator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, null, null, this);
    }
}
