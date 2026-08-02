package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.data;

import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import com.ybsdk.feature.transfer.version2.internal.network.dto.PaymentProviderDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments.GetAllMobileProvidersResponse;
import defpackage.m4m0;
import defpackage.pnb1;
import defpackage.tcc;
import defpackage.wls;
import defpackage.zt20;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class MobileProvidersListRepository$getAllProviders$3$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GetAllMobileProvidersResponse getAllMobileProvidersResponse = (GetAllMobileProvidersResponse) obj;
        ((a) this.receiver).getClass();
        PaymentProviderDto suggestedProvider = getAllMobileProvidersResponse.getSuggestedProvider();
        PaymentProviderEntity c = suggestedProvider != null ? pnb1.c(suggestedProvider) : null;
        List<PaymentProviderDto> providers = getAllMobileProvidersResponse.getProviders();
        ArrayList arrayList = new ArrayList(tcc.n(providers, 10));
        Iterator<T> it = providers.iterator();
        while (it.hasNext()) {
            arrayList.add(pnb1.c((PaymentProviderDto) it.next()));
        }
        return new zt20(c, arrayList, m4m0.k(getAllMobileProvidersResponse.getHeader()));
    }
}
