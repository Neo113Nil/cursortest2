package com.yandex.go.promocodes.referral.impl.provider;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.promocodes.referral.impl.provider.ReferralCodesProviderImpl$ReferralCodesCache", f = "ReferralCodesProviderImpl.kt", l = {JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN}, m = "getValue", v = 2)
/* loaded from: classes13.dex */
final class ReferralCodesProviderImpl$ReferralCodesCache$getValue$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralCodesProviderImpl$ReferralCodesCache$getValue$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
