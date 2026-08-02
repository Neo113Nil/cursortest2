package com.ybsdk.feature.merchant.offers.internal.data;

import com.ybsdk.feature.merchant.offers.internal.data.network.dto.MerchantOffersScreenResponseV2;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class MerchantOffersRepository$getMerchantOffersPage$3$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((com.ybsdk.feature.merchant.offers.internal.data.network.a) this.receiver).b((MerchantOffersScreenResponseV2) obj, (Continuation) obj2);
    }
}
