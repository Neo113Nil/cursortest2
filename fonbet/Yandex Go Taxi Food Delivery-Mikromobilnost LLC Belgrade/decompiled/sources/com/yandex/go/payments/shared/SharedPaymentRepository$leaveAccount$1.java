package com.yandex.go.payments.shared;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.shared.SharedPaymentRepository", f = "SharedPaymentRepository.kt", l = {HProv.PP_DHOID, HProv.PP_REBOOT}, m = "leaveAccount$impl", v = 2)
/* loaded from: classes13.dex */
final class SharedPaymentRepository$leaveAccount$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPaymentRepository$leaveAccount$1(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
