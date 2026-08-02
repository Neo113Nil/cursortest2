package com.yandex.passport.internal.usecase.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.ui.CountrySuggestionUseCase", f = "CountrySuggestionUseCase.kt", l = {31}, m = "run-gIAlu-s$suspendImpl")
/* loaded from: classes2.dex */
final class CountrySuggestionUseCase$run$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountrySuggestionUseCase$run$1(q qVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return q.c(this.this$0, null, this);
    }
}
