package com.ybsdk.feature.transfer.version2.internal.data.helpers;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.data.helpers.Transfer2Helper", f = "Transfer2Helper.kt", l = {120, HProv.PP_SAME_MEDIA, HProv.PP_DELETE_SAVED_PASSWD}, m = "getSuggestedPartners-BWLJW6A")
/* loaded from: classes3.dex */
final class Transfer2Helper$getSuggestedPartners$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transfer2Helper$getSuggestedPartners$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object j = this.this$0.j(null, null, null, this);
        return j == CoroutineSingletons.COROUTINE_SUSPENDED ? j : new Result(j);
    }
}
