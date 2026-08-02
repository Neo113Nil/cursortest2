package com.yandex.go.rida.bids.router;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.rida.bids.router.RidaBidsRootRouterImpl", f = "RidaBidsRootRouterImpl.kt", l = {HProv.ALG_SID_SHA3_256}, m = "launchRidaBidsRouter", v = 2)
/* loaded from: classes13.dex */
final class RidaBidsRootRouterImpl$launchRidaBidsRouter$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RidaBidsRootRouterImpl$launchRidaBidsRouter$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return g.R(this.this$0, null, this);
    }
}
