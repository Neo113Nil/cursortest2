package com.yandex.go.payments.paymentlist.domain.converter;

import defpackage.bd90;
import defpackage.rhq0;
import defpackage.sdc;
import defpackage.u9a0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class c implements u9a0 {
    public final /* synthetic */ i a;

    public c(i iVar) {
        this.a = iVar;
    }

    @Override // defpackage.u9a0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.u9a0
    public final List b(List list, rhq0 rhq0Var) {
        ArrayList arrayList = new ArrayList();
        PaymentMethodsConverter$PaymentOptionGroupType paymentMethodsConverter$PaymentOptionGroupType = PaymentMethodsConverter$PaymentOptionGroupType.YB;
        i iVar = this.a;
        d h = iVar.h(paymentMethodsConverter$PaymentOptionGroupType, list, null);
        if (h != null) {
            arrayList.add(h);
        }
        d h2 = iVar.h(PaymentMethodsConverter$PaymentOptionGroupType.TIPS, list, null);
        if (h2 != null) {
            arrayList.add(h2);
        }
        d h3 = iVar.h(PaymentMethodsConverter$PaymentOptionGroupType.BUSINESS_ACCOUNTS, list, null);
        if (h3 != null) {
            arrayList.add(h3);
        }
        d h4 = iVar.h(PaymentMethodsConverter$PaymentOptionGroupType.OTHERS, list, null);
        if (h4 != null) {
            arrayList.add(h4);
        }
        return arrayList;
    }

    @Override // defpackage.u9a0
    public final void c(ArrayList arrayList) {
        arrayList.removeIf(new sdc(22, new bd90(21)));
    }
}
