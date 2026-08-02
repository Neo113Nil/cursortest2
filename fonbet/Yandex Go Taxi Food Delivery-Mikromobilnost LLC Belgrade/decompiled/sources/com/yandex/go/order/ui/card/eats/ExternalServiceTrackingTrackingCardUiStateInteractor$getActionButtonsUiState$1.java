package com.yandex.go.order.ui.card.eats;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.order.ui.card.eats.ExternalServiceTrackingTrackingCardUiStateInteractor", f = "ExternalServiceTrackingTrackingCardUiStateInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE, 66}, m = "getActionButtonsUiState", v = 2)
/* loaded from: classes12.dex */
final class ExternalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.b(this.this$0, null, this);
    }
}
