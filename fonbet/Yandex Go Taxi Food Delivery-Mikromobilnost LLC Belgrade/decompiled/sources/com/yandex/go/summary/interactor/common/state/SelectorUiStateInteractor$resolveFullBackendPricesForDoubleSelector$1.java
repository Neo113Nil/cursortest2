package com.yandex.go.summary.interactor.common.state;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.summary.interactor.common.state.SelectorUiStateInteractor", f = "SelectorUiStateInteractor.kt", l = {351}, m = "resolveFullBackendPricesForDoubleSelector", v = 2)
/* loaded from: classes14.dex */
final class SelectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.d(this.this$0, null, null, this);
    }
}
