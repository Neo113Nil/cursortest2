package com.yandex.go.agreement.repository;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.agreement.repository.AgreementToShowRepositoryImpl", f = "AgreementToShowRepository.kt", l = {HProv.PP_SAME_MEDIA}, m = "getLocationWithAgreement", v = 2)
/* loaded from: classes12.dex */
final class AgreementToShowRepositoryImpl$getLocationWithAgreement$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgreementToShowRepositoryImpl$getLocationWithAgreement$1(g gVar, Continuation continuation) {
        super(continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
