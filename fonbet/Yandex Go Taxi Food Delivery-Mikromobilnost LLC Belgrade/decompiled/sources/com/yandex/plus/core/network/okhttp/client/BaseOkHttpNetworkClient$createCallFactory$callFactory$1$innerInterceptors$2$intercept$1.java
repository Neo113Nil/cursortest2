package com.yandex.plus.core.network.okhttp.client;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.core.network.okhttp.client.BaseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2", f = "BaseOkHttpNetworkClient.kt", l = {HProv.ALG_SID_SHA3_384}, m = "intercept")
/* loaded from: classes2.dex */
final class BaseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2$intercept$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2$intercept$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
