package com.yandex.go.order.ui.card.eats;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.order.ui.card.eats.ExternalServiceTrackingTrackingCardUiStateInteractor", f = "ExternalServiceTrackingTrackingCardUiStateInteractor.kt", l = {91}, m = "getActionButtonUiState", v = 2)
/* loaded from: classes12.dex */
final class ExternalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
