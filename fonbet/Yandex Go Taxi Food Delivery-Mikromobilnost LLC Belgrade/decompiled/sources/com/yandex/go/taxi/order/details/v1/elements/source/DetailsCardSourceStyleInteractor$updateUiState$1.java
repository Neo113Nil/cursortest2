package com.yandex.go.taxi.order.details.v1.elements.source;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.source.DetailsCardSourceStyleInteractor", f = "DetailsCardSourceStyleInteractor.kt", l = {122}, m = "updateUiState", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardSourceStyleInteractor$updateUiState$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardSourceStyleInteractor$updateUiState$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.d(this.this$0, null, this);
    }
}
