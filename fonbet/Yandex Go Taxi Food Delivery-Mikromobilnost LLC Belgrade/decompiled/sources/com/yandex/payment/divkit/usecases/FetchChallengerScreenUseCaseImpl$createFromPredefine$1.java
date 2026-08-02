package com.yandex.payment.divkit.usecases;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.payment.divkit.usecases.FetchChallengerScreenUseCaseImpl", f = "FetchChallengerScreenUseCase.kt", l = {72}, m = "createFromPredefine", v = 1)
/* loaded from: classes2.dex */
final class FetchChallengerScreenUseCaseImpl$createFromPredefine$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchChallengerScreenUseCaseImpl$createFromPredefine$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.a(this.this$0, null, null, this);
    }
}
