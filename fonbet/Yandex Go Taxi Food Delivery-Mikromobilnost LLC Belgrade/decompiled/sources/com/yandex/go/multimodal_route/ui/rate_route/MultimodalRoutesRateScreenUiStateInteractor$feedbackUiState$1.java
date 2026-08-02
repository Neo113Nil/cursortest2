package com.yandex.go.multimodal_route.ui.rate_route;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.multimodal_route.ui.rate_route.MultimodalRoutesRateScreenUiStateInteractor", f = "MultimodalRoutesRateScreenUiStateInteractor.kt", l = {36, 38}, m = "feedbackUiState", v = 2)
/* loaded from: classes12.dex */
final class MultimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return g.a(this.this$0, null, this);
    }
}
