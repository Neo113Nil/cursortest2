package com.yandex.go.superapp.biometrics.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.biometrics.domain.BiometricVerificationInteractor", f = "BiometricVerificationInteractor.kt", l = {80, HProv.PP_SIGNATUREOID}, m = "verifyBiometricWithReceiver-zkXUZaI", v = 2)
/* loaded from: classes14.dex */
final class BiometricVerificationInteractor$verifyBiometricWithReceiver$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricVerificationInteractor$verifyBiometricWithReceiver$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, 0, 0L, this);
    }
}
