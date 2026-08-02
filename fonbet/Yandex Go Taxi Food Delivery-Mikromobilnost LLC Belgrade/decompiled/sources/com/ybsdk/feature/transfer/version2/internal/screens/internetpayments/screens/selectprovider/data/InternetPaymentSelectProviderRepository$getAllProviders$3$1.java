package com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.data;

import com.ybsdk.feature.transfer.version2.internal.network.dto.internetpayments.GetAllInternetProvidersResponse;
import com.ybsdk.feature.transfer.version2.internal.network.dto.internetpayments.InternetProviderWithPersonalAccountDto;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.domain.InternetProviderWithPersonalAccountEntity;
import defpackage.duw;
import defpackage.m4m0;
import defpackage.pnb1;
import defpackage.tcc;
import defpackage.wls;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class InternetPaymentSelectProviderRepository$getAllProviders$3$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GetAllInternetProvidersResponse getAllInternetProvidersResponse = (GetAllInternetProvidersResponse) obj;
        ((a) this.receiver).getClass();
        List<InternetProviderWithPersonalAccountDto> providers = getAllInternetProvidersResponse.getProviders();
        ArrayList arrayList = new ArrayList(tcc.n(providers, 10));
        for (InternetProviderWithPersonalAccountDto internetProviderWithPersonalAccountDto : providers) {
            arrayList.add(new InternetProviderWithPersonalAccountEntity(pnb1.c(internetProviderWithPersonalAccountDto.getProvider()), internetProviderWithPersonalAccountDto.getPersonalAccount()));
        }
        return new duw(arrayList, m4m0.k(getAllInternetProvidersResponse.getHeader()));
    }
}
