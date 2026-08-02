package com.yandex.passport.internal.usecase;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.FetchModernAccountUseCase", f = "FetchModernAccountUseCase.kt", l = {42}, m = "run-gIAlu-s$suspendImpl")
/* loaded from: classes15.dex */
final class FetchModernAccountUseCase$run$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchModernAccountUseCase$run$1(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return p.c(this.this$0, null, this);
    }
}
