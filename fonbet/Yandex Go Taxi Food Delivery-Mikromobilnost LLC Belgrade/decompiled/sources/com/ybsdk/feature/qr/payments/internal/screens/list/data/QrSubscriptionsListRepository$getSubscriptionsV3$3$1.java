package com.ybsdk.feature.qr.payments.internal.screens.list.data;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.qr.payments.internal.network.dto.list.AgreementDto;
import com.ybsdk.feature.qr.payments.internal.network.dto.list.GetSubscriptionsResponseV3;
import com.ybsdk.feature.qr.payments.internal.network.dto.list.SubscriptionDto;
import com.ybsdk.feature.qr.payments.internal.screens.list.data.entities.SubscriptionEntity$Status;
import defpackage.cbg0;
import defpackage.gwn;
import defpackage.job1;
import defpackage.m4m0;
import defpackage.p0v0;
import defpackage.qxy0;
import defpackage.tcc;
import defpackage.wfg0;
import defpackage.wj1;
import defpackage.wls;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class QrSubscriptionsListRepository$getSubscriptionsV3$3$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GetSubscriptionsResponseV3 getSubscriptionsResponseV3 = (GetSubscriptionsResponseV3) obj;
        ((a) this.receiver).getClass();
        List<AgreementDto> agreements = getSubscriptionsResponseV3.getAgreements();
        ArrayList arrayList = new ArrayList(tcc.n(agreements, 10));
        for (AgreementDto agreementDto : agreements) {
            String id = agreementDto.getId();
            String title = agreementDto.getTitle();
            ThemedImageUrlEntity c = qxy0.c(agreementDto.getLogo(), null);
            List<SubscriptionDto> subscriptions = agreementDto.getSubscriptions();
            ArrayList arrayList2 = new ArrayList(tcc.n(subscriptions, 10));
            for (SubscriptionDto subscriptionDto : subscriptions) {
                arrayList2.add(new p0v0(subscriptionDto.getId(), subscriptionDto.getTitle(), subscriptionDto.getDescription(), job1.f(qxy0.c(subscriptionDto.getThemedLogo(), subscriptionDto.getLogo()), new cbg0(13)), SubscriptionEntity$Status.DEFAULT));
            }
            arrayList.add(new wj1(id, title, c, arrayList2));
        }
        return new wfg0(arrayList, m4m0.k(getSubscriptionsResponseV3.getHeader()), gwn.a(getSubscriptionsResponseV3.getEmptyListInfo()));
    }
}
