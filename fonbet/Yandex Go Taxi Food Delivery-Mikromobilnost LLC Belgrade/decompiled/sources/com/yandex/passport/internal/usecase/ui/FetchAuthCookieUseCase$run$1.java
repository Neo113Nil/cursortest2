package com.yandex.passport.internal.usecase.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.ui.FetchAuthCookieUseCase", f = "FetchAuthCookieUseCase.kt", l = {27}, m = "run-gIAlu-s")
/* loaded from: classes15.dex */
final class FetchAuthCookieUseCase$run$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchAuthCookieUseCase$run$1(v vVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
