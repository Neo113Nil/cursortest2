package com.yandex.go.payments.addmethod.ui.home;

import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$AddNequiToAppScreenActionType;
import defpackage.gg0;
import defpackage.lg0;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class AddPaymentHomeComposeRouter$content$1$3$1$1$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        gg0 gg0Var = (gg0) this.receiver;
        lg0 lg0Var = (lg0) gg0Var.x;
        if ((lg0Var != null ? lg0Var.a : null) == PaymentMethod$Type.NEQUI_TOKEN) {
            gg0Var.H.a(PaymentMethodsAnalytics$AddNequiToAppScreenActionType.Show, null);
        }
        return zy11.a;
    }
}
