package com.yandex.go.payments.cards.pci_dss.data.model;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/pci_dss/data/model/SupplyPaymentBillingRequest;", "", "Companion", "$serializer", "com/yandex/go/payments/cards/pci_dss/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SupplyPaymentBillingRequest {
    public static final b Companion = new b();
    public final SupplyPaymentData a;

    public /* synthetic */ SupplyPaymentBillingRequest(int i, SupplyPaymentData supplyPaymentData) {
        if (1 == (i & 1)) {
            this.a = supplyPaymentData;
        } else {
            qje.Z(i, 1, SupplyPaymentBillingRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public SupplyPaymentBillingRequest(SupplyPaymentData supplyPaymentData) {
        this.a = supplyPaymentData;
    }
}
