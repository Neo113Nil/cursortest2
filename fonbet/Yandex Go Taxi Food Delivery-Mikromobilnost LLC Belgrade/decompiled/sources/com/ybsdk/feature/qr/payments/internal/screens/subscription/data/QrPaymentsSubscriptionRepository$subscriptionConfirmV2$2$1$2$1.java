package com.ybsdk.feature.qr.payments.internal.screens.subscription.data;

import com.ybsdk.feature.qr.payments.internal.network.dto.SubscriptionResult;
import com.ybsdk.feature.qr.payments.internal.screens.subscription.data.entities.SubscriptionStatus;
import defpackage.sag0;
import defpackage.uag0;
import defpackage.w511;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2$1$2$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SubscriptionStatus subscriptionStatus;
        SubscriptionResult subscriptionResult = (SubscriptionResult) obj;
        ((a) this.receiver).getClass();
        int i = uag0.a[subscriptionResult.getStatus().ordinal()];
        if (i == 1) {
            subscriptionStatus = SubscriptionStatus.SUCCESS;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            subscriptionStatus = SubscriptionStatus.FAILED;
        }
        return new sag0(subscriptionStatus, subscriptionResult.getMessage());
    }
}
