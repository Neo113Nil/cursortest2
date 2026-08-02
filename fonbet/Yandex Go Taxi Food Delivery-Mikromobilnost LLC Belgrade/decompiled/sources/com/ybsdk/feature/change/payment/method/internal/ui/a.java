package com.ybsdk.feature.change.payment.method.internal.ui;

import defpackage.ds31;
import defpackage.tje;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements wls {
    public final /* synthetic */ c a;

    public /* synthetic */ a(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        c cVar = this.a;
        tje.N(ds31.a(cVar), null, null, new ChangePaymentMethodViewModel$reloadData$1(cVar, (String) obj2, (String) obj, null), 3);
        return zy11.a;
    }
}
