package com.yandex.passport.internal.ui.bouncer.challenge;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.bouncer.challenge.BouncerChallengeStoreFactory$ExcecutorImpl", f = "BouncerChallengeStoreFactory.kt", l = {HProv.PROV_GOST_2001_DH}, m = "onProcessReturnUrl-OaxHe8w")
/* loaded from: classes2.dex */
final class BouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.k(null, this);
    }
}
