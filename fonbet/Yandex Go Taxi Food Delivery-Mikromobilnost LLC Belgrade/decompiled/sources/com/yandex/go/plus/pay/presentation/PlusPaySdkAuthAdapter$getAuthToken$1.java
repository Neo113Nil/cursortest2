package com.yandex.go.plus.pay.presentation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.plus.pay.presentation.PlusPaySdkAuthAdapter", f = "PlusPaySdkAuthAdapter.kt", l = {HProv.ALG_SID_SHA3_384}, m = "getAuthToken-gIAlu-s", v = 2)
/* loaded from: classes13.dex */
final class PlusPaySdkAuthAdapter$getAuthToken$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPaySdkAuthAdapter$getAuthToken$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object i = this.this$0.i(null, this);
        return i == CoroutineSingletons.COROUTINE_SUSPENDED ? i : new Result(i);
    }
}
