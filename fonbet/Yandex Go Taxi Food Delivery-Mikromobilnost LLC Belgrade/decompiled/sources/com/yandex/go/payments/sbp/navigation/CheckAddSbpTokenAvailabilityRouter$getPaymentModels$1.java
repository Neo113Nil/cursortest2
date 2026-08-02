package com.yandex.go.payments.sbp.navigation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.sbp.navigation.CheckAddSbpTokenAvailabilityRouter", f = "CheckAddSbpTokenAvailabilityRouter.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "getPaymentModels", v = 2)
/* loaded from: classes13.dex */
final class CheckAddSbpTokenAvailabilityRouter$getPaymentModels$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckAddSbpTokenAvailabilityRouter$getPaymentModels$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.Q(null, this);
    }
}
