package com.yandex.go.payments.paymentlist.domain.converter;

import defpackage.md3;
import defpackage.rhq0;
import defpackage.u9a0;
import defpackage.weu;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class a implements u9a0 {
    public final /* synthetic */ i a;

    public a(i iVar) {
        this.a = iVar;
    }

    @Override // defpackage.u9a0
    public final List b(List list, rhq0 rhq0Var) {
        ArrayList arrayList = new ArrayList();
        PaymentMethodsConverter$PaymentOptionGroupType paymentMethodsConverter$PaymentOptionGroupType = PaymentMethodsConverter$PaymentOptionGroupType.SELECTED_OPTION_UNAVAILABLE;
        i iVar = this.a;
        d h = iVar.h(paymentMethodsConverter$PaymentOptionGroupType, list, rhq0Var);
        if (h != null) {
            arrayList.add(h);
        }
        d h2 = iVar.h(PaymentMethodsConverter$PaymentOptionGroupType.UNAVAILABLE, list, null);
        if (h2 != null) {
            arrayList.add(h2);
        }
        d h3 = iVar.h(PaymentMethodsConverter$PaymentOptionGroupType.LOYALTY, list, null);
        if (h3 != null) {
            arrayList.add(h3);
        }
        d h4 = iVar.h(PaymentMethodsConverter$PaymentOptionGroupType.YB, list, null);
        if (h4 != null) {
            arrayList.add(h4);
        }
        d h5 = iVar.h(PaymentMethodsConverter$PaymentOptionGroupType.BUSINESS_ACCOUNTS, list, null);
        if (h5 != null) {
            arrayList.add(h5);
        }
        d h6 = iVar.h(PaymentMethodsConverter$PaymentOptionGroupType.OTHERS, list, null);
        if (h6 != null) {
            arrayList.add(h6);
        }
        return arrayList;
    }

    @Override // defpackage.u9a0
    public final void c(ArrayList arrayList) {
        arrayList.removeIf(new md3(13, new weu(21, this.a)));
    }
}
