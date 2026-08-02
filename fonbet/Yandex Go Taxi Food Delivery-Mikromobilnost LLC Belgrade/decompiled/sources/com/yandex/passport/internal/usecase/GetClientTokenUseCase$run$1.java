package com.yandex.passport.internal.usecase;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.GetClientTokenUseCase", f = "GetClientTokenUseCase.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 59}, m = "run-gIAlu-s$suspendImpl")
/* loaded from: classes2.dex */
final class GetClientTokenUseCase$run$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetClientTokenUseCase$run$1(h0 h0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = h0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return h0.e(this.this$0, null, this);
    }
}
