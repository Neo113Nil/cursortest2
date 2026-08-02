package com.yandex.passport.data.network.core;

import com.yandex.passport.common.network.k0;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.data.network.core.GetMasterTokenBackendRequest", f = "MasterTokenBackendRequest.kt", l = {HProv.ALG_SID_KECCAK_224, HProv.ALG_SID_KECCAK_256}, m = "run-gIAlu-s$suspendImpl")
/* loaded from: classes15.dex */
final class GetMasterTokenBackendRequest$run$1<TParams, TResponse, TErrorResponse extends k0> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMasterTokenBackendRequest$run$1(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return k.f(this.this$0, null, this);
    }
}
