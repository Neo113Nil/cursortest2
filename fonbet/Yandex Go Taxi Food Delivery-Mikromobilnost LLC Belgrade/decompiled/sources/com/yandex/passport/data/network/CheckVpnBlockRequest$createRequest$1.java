package com.yandex.passport.data.network;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.data.network.CheckVpnBlockRequest", f = "CheckVpnBlockRequest.kt", l = {HProv.ALG_SID_NO_HASH}, m = "createRequest")
/* loaded from: classes8.dex */
final class CheckVpnBlockRequest$createRequest$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ q0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckVpnBlockRequest$createRequest$1(q0 q0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = q0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
