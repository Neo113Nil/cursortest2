package com.yandex.passport.internal.usecase;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.TryAddPlusDeviceUseCase", f = "TryAddPlusDeviceUseCase.kt", l = {44}, m = "run-gIAlu-s")
/* loaded from: classes2.dex */
final class TryAddPlusDeviceUseCase$run$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ p1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TryAddPlusDeviceUseCase$run$1(p1 p1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = p1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
