package com.ybsdk.feature.autotopup.internal.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository", f = "AutoTopupSetupRepository.kt", l = {546, 555}, m = "saveRegularAutoTopup-0E7RQCE")
/* loaded from: classes3.dex */
final class AutoTopupSetupRepository$saveRegularAutoTopup$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupRepository$saveRegularAutoTopup$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object o = this.this$0.o(null, null, this);
        return o == CoroutineSingletons.COROUTINE_SUSPENDED ? o : new Result(o);
    }
}
