package com.ybsdk.feature.qr.payments.internal.screens.subscription.presentation;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.cma0;
import defpackage.g8e;
import defpackage.pz40;
import defpackage.rt1;
import defpackage.ssa1;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class QrPaymentsSubscriptionFragment$getViewBinding$1$1 extends FunctionReferenceImpl implements tls {
    public QrPaymentsSubscriptionFragment$getViewBinding$1$1(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onSelectAgreement", "onSelectAgreement(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        r0 r0Var;
        Object value;
        String str = (String) obj;
        a aVar = (a) this.receiver;
        rt1 rt1Var = ((AppAnalyticsReporter) aVar.F.a).Y;
        rt1Var.a.a("qr.subscription.agreement_changed", g8e.w(1, "agreement_id", ssa1.b(str)));
        pz40 Y = aVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, cma0.a((cma0) value, null, str, null, 59)));
        return zy11.a;
    }
}
