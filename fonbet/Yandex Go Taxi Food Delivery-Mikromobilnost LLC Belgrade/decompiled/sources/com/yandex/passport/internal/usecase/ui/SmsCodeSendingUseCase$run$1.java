package com.yandex.passport.internal.usecase.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.ui.SmsCodeSendingUseCase", f = "SmsCodeSendingUseCase.kt", l = {38}, m = "run-gIAlu-s")
/* loaded from: classes2.dex */
final class SmsCodeSendingUseCase$run$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsCodeSendingUseCase$run$1(r0 r0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
