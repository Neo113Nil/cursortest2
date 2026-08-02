package com.ybsdk.feature.transfer.version2.internal.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.domain.Transfer2Interactor", f = "Transfer2Interactor.kt", l = {HProv.PP_DELETE_KEYSET}, m = "getSuggestedPartners-BWLJW6A")
/* loaded from: classes3.dex */
final class Transfer2Interactor$getSuggestedPartners$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transfer2Interactor$getSuggestedPartners$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object k = this.this$0.k(null, null, null, this);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : new Result(k);
    }
}
