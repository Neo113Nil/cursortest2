package com.yandex.passport.data.network.token;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.data.network.token.GetMasterTokenForwardByTrackRequest$RequestFactory", f = "GetMasterTokenForwardByTrackRequest.kt", l = {HProv.ALG_SID_SHA3_384}, m = "createRequest")
/* loaded from: classes15.dex */
final class GetMasterTokenForwardByTrackRequest$RequestFactory$createRequest$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMasterTokenForwardByTrackRequest$RequestFactory$createRequest$1(j1 j1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = j1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
