package com.yandex.passport.data.network;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.data.network.GetCookieByTokenRequest$RequestFactory", f = "GetCookieByTokenRequest.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "createRequest")
/* loaded from: classes15.dex */
final class GetCookieByTokenRequest$RequestFactory$createRequest$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCookieByTokenRequest$RequestFactory$createRequest$1(r6 r6Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = r6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
