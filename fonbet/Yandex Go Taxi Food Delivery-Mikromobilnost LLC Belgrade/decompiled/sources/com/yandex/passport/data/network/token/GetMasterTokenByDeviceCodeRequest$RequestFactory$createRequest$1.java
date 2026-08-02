package com.yandex.passport.data.network.token;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.data.network.token.GetMasterTokenByDeviceCodeRequest$RequestFactory", f = "GetMasterTokenByDeviceCodeRequest.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "createRequest")
/* loaded from: classes15.dex */
final class GetMasterTokenByDeviceCodeRequest$RequestFactory$createRequest$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMasterTokenByDeviceCodeRequest$RequestFactory$createRequest$1(z zVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
