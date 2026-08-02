package com.yandex.go.summary.interactor.core;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.summary.interactor.core.ShowRunnableWhenSummaryExpandedInteractor", f = "ShowRunnableWhenSummaryExpandedInteractor.kt", l = {22}, m = "awaitExpandedSummaryOrFallback", v = 2)
/* loaded from: classes14.dex */
final class ShowRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
