package com.yandex.passport.internal.usecase;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.SuggestedLanguageUseCase", f = "SuggestedLanguageUseCase.kt", l = {34}, m = "run-gIAlu-s$suspendImpl")
/* loaded from: classes2.dex */
final class SuggestedLanguageUseCase$run$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ n1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedLanguageUseCase$run$1(n1 n1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = n1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return n1.c(this.this$0, null, this);
    }
}
