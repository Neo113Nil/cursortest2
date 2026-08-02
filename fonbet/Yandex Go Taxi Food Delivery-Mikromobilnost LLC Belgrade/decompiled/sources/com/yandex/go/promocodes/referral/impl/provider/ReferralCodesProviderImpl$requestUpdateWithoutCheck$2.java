package com.yandex.go.promocodes.referral.impl.provider;

import defpackage.mvg;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.promocodes.referral.impl.provider.ReferralCodesProviderImpl", f = "ReferralCodesProviderImpl.kt", l = {190, 106, 108, 208, BuildConfig.API_LEVEL, 208, 208}, m = "requestUpdateWithoutCheck", v = 2)
/* loaded from: classes13.dex */
final class ReferralCodesProviderImpl$requestUpdateWithoutCheck$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralCodesProviderImpl$requestUpdateWithoutCheck$2(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
