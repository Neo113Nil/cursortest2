package com.yandex.go.superapp.biometrics.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.biometrics.data.BiometricsBleReceiverConnectionRepository", f = "BiometricsBleReceiverConnectionRepository.kt", l = {227}, m = "disconnectOnRulesViolation-8Mi8wO0", v = 2)
/* loaded from: classes14.dex */
final class BiometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, 0L, this);
    }
}
