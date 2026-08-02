package com.yandex.go.payments.sbp.navigation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.sbp.navigation.SbpTokenBindingRouterImpl", f = "SbpTokenBindingRouterImpl.kt", l = {HProv.PP_PASSWD_TERM}, m = "unbindSbpToken", v = 2)
/* loaded from: classes13.dex */
final class SbpTokenBindingRouterImpl$unbindSbpToken$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpTokenBindingRouterImpl$unbindSbpToken$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.T(this.this$0, null, this);
    }
}
