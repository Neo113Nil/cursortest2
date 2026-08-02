package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.data;

import com.ybsdk.feature.transfer.version2.internal.network.dto.PaymentProviderDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments.GetSuggestedMobileProviderResponse;
import defpackage.pnb1;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class MobilePaymentSelectContactRepository$getProviderByPhone$3$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((a) this.receiver).getClass();
        PaymentProviderDto provider = ((GetSuggestedMobileProviderResponse) obj).getProvider();
        if (provider != null) {
            return pnb1.c(provider);
        }
        return null;
    }
}
