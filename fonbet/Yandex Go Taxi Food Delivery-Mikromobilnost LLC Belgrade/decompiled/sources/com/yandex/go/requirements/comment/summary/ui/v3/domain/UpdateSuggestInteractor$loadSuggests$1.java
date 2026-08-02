package com.yandex.go.requirements.comment.summary.ui.v3.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.requirements.comment.summary.ui.v3.domain.UpdateSuggestInteractor", f = "UpdateSuggestInteractor.kt", l = {21, 22}, m = "loadSuggests", v = 2)
/* loaded from: classes13.dex */
final class UpdateSuggestInteractor$loadSuggests$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateSuggestInteractor$loadSuggests$1(t tVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
