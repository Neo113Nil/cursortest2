package com.ybsdk.rconfig.retriever;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.rconfig.retriever.RemoteConfigRetrieverControllerImpl", f = "RemoteConfigRetrieverControllerImpl.kt", l = {HProv.ALG_SID_SHA3_256, HProv.ALG_SID_KECCAK_256, HProv.PP_CIPHEROID}, m = "awaitUpdate")
/* loaded from: classes3.dex */
final class RemoteConfigRetrieverControllerImpl$awaitUpdate$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigRetrieverControllerImpl$awaitUpdate$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
