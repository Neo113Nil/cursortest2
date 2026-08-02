package com.yandex.go.taxi.order.change.source.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.change.source.interactor.UpdateSourcePointConfirmationInteractor", f = "UpdateSourcePointConfirmationInteractor.kt", l = {42}, m = "prepareUiState", v = 2)
/* loaded from: classes14.dex */
final class UpdateSourcePointConfirmationInteractor$prepareUiState$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateSourcePointConfirmationInteractor$prepareUiState$1(b0 b0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
