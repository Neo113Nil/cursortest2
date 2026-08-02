package com.yandex.go.payments.paymentlist.domain.converter;

import defpackage.bd90;
import defpackage.rhq0;
import defpackage.sdc;
import defpackage.u9a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes13.dex */
public final class e implements u9a0 {
    public final /* synthetic */ i a;

    public e(i iVar) {
        this.a = iVar;
    }

    @Override // defpackage.u9a0
    public final List b(List list, rhq0 rhq0Var) {
        i iVar = this.a;
        list.removeIf(new sdc(21, new bd90(iVar)));
        ArrayList j = iVar.j(list);
        PaymentMethodsConverter$ConvertMode paymentMethodsConverter$ConvertMode = PaymentMethodsConverter$ConvertMode.NORMAL;
        List i = iVar.i(list, paymentMethodsConverter$ConvertMode);
        return Collections.singletonList(new d(PaymentMethodsConverter$PaymentOptionGroupType.OTHERS, kotlin.collections.a.m0(iVar.g(list, paymentMethodsConverter$ConvertMode), kotlin.collections.a.m0(i, j))));
    }
}
