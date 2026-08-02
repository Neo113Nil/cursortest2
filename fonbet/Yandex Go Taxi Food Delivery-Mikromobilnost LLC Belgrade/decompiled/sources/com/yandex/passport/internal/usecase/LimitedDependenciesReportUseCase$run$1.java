package com.yandex.passport.internal.usecase;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.LimitedDependenciesReportUseCase", f = "LimitedDependenciesReportUseCase.kt", l = {30}, m = "run")
/* loaded from: classes8.dex */
final class LimitedDependenciesReportUseCase$run$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitedDependenciesReportUseCase$run$1(s0 s0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = s0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
