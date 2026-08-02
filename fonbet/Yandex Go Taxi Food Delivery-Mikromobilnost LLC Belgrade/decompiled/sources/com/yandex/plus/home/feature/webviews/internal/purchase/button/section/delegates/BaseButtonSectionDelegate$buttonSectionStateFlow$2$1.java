package com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates;

import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionInfo;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$PaymentType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseStatusTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import defpackage.pzf0;
import defpackage.rzf0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class BaseButtonSectionDelegate$buttonSectionStateFlow$2$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CompositeSubscriptionInfo compositeSubscriptionInfo = (CompositeSubscriptionInfo) obj;
        c cVar = (c) this.receiver;
        cVar.getClass();
        rzf0 rzf0Var = cVar.a;
        if (compositeSubscriptionInfo.getConfig() == null) {
            pzf0.a(rzf0Var, null, PurchaseTypeDto.UNKNOWN, PurchaseStatusTypeDto.FAILURE, compositeSubscriptionInfo.getError(), 1);
            rzf0Var.f.b(PlusPayButtonDiagnostic$ButtonType.NATIVE_SDK, PlusPayButtonDiagnostic$PaymentType.TARIFFICATOR, null);
        }
        return zy11.a;
    }
}
