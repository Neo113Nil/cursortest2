package com.yandex.passport.internal.usecase;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.RevokeMasterTokenUseCase", f = "RevokeMasterTokenUseCase.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "execute-hUnOzRk$suspendImpl")
/* loaded from: classes2.dex */
final class RevokeMasterTokenUseCase$execute$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevokeMasterTokenUseCase$execute$1(f1 f1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = f1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = f1.c(this.this$0, null, null, null, null, null, this);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : new Result(c);
    }
}
