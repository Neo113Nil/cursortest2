package com.ybsdk.feature.change.payment.method.internal.ui;

import com.ybsdk.feature.deeplink.api.actions.DefaultPaymentMethodSet;
import defpackage.ds31;
import defpackage.jqr;
import defpackage.pzt0;
import defpackage.tls;
import defpackage.zy11;
import java.util.Map;
import kotlinx.coroutines.flow.e;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements tls {
    public final /* synthetic */ c a;

    public /* synthetic */ b(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        DefaultPaymentMethodSet defaultPaymentMethodSet = (DefaultPaymentMethodSet) obj;
        String productId = defaultPaymentMethodSet.getProductId();
        Map<String, String> parameters = defaultPaymentMethodSet.getParameters();
        c cVar = this.a;
        pzt0 pzt0Var = cVar.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        cVar.G = e.H(ds31.a(cVar), new jqr(cVar.D.a(productId, parameters, cVar), new ChangePaymentMethodViewModel$defaultPaymentMethodUnifiedSetInit$1(cVar, null), 3));
        return zy11.a;
    }
}
