package com.yandex.go.safety.center.lost_item.modal.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.safety.center.lost_item.modal.interactor.LostItemsUiStateInteractor", f = "LostItemsUiStateInteractor.kt", l = {85}, m = "tryFallbackOrReturnError", v = 2)
/* loaded from: classes13.dex */
final class LostItemsUiStateInteractor$tryFallbackOrReturnError$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LostItemsUiStateInteractor$tryFallbackOrReturnError$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, this);
    }
}
