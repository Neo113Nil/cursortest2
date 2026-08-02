package com.yandex.go.chargers.partner_subscription.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.chargers.partner_subscription.ui.ChargersPartnerSubscriptionInfoUiStateMapper", f = "ChargersPartnerSubscriptionInfoUiStateMapper.kt", l = {52}, m = "mapToTermsLink", v = 2)
/* loaded from: classes12.dex */
final class ChargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
