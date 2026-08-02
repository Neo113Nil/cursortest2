package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.log.LogTag;
import defpackage.mdd0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class CheckoutFragment$onViewCreated$checkoutContentViewController$3 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d dVar = (d) this.receiver;
        r0 r0Var = dVar.O;
        PlusPayMailingAdsAgreement plusPayMailingAdsAgreement = (PlusPayMailingAdsAgreement) r0Var.getValue();
        if (plusPayMailingAdsAgreement != null) {
            mdd0.d(dVar.J, LogTag.TARIFFICATOR, "Mailing ads agreement status changed: isChecked=" + booleanValue + ", logic=" + plusPayMailingAdsAgreement.getTextLogic());
            r0Var.l(PlusPayMailingAdsAgreement.copy$default(plusPayMailingAdsAgreement, null, booleanValue, null, null, 13, null));
        }
        return zy11.a;
    }
}
