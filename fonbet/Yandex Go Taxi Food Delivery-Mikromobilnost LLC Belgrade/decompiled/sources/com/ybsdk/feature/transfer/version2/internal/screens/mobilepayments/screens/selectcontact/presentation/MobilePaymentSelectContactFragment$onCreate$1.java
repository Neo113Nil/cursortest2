package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation;

import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import defpackage.uc5;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class MobilePaymentSelectContactFragment$onCreate$1 extends FunctionReferenceImpl implements wls {
    public MobilePaymentSelectContactFragment$onCreate$1(uc5 uc5Var) {
        super(2, uc5Var, a.class, "onProviderSelected", "onProviderSelected(Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/PaymentProviderEntity;Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((a) this.receiver).n0((PaymentProviderEntity) obj, (String) obj2);
        return zy11.a;
    }
}
