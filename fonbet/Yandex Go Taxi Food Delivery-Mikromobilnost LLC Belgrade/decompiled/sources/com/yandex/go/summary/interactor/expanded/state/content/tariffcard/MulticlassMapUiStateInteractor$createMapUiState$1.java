package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.MulticlassMapUiStateInteractor", f = "MulticlassMapUiStateInteractor.kt", l = {44}, m = "createMapUiState", v = 2)
/* loaded from: classes14.dex */
final class MulticlassMapUiStateInteractor$createMapUiState$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticlassMapUiStateInteractor$createMapUiState$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, false, null, this);
    }
}
