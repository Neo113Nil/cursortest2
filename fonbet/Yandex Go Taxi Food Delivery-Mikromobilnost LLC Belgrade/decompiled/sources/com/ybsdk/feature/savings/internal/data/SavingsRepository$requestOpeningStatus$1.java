package com.ybsdk.feature.savings.internal.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.savings.internal.data.SavingsRepository", f = "SavingsRepository.kt", l = {HProv.PP_CIPHEROID, 101}, m = "requestOpeningStatus-0hPOyJY")
/* loaded from: classes3.dex */
final class SavingsRepository$requestOpeningStatus$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsRepository$requestOpeningStatus$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object j = this.this$0.j(0, null, this);
        return j == CoroutineSingletons.COROUTINE_SUSPENDED ? j : new Result(j);
    }
}
