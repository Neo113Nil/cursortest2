package com.yandex.go.payments.addmethod.ui.home;

import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$AddNequiToAppScreenActionType;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$AddNequiToAppScreenButton;
import defpackage.bh0;
import defpackage.dh0;
import defpackage.fh0;
import defpackage.gg0;
import defpackage.gh0;
import defpackage.jh0;
import defpackage.jl40;
import defpackage.lg0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class AddPaymentHomeComposeRouter$content$1$3$1$2$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        PaymentMethodsAnalytics$AddNequiToAppScreenButton paymentMethodsAnalytics$AddNequiToAppScreenButton;
        jh0 jh0Var = (jh0) obj;
        gg0 gg0Var = (gg0) this.receiver;
        lg0 lg0Var = (lg0) gg0Var.x;
        if ((lg0Var != null ? lg0Var.a : null) == PaymentMethod$Type.NEQUI_TOKEN) {
            if (jl40.l(jh0Var, bh0.a)) {
                paymentMethodsAnalytics$AddNequiToAppScreenButton = PaymentMethodsAnalytics$AddNequiToAppScreenButton.Skip;
            } else if (jl40.l(jh0Var, dh0.a)) {
                paymentMethodsAnalytics$AddNequiToAppScreenButton = PaymentMethodsAnalytics$AddNequiToAppScreenButton.Back;
            } else if ((jh0Var instanceof fh0) || (jh0Var instanceof gh0)) {
                paymentMethodsAnalytics$AddNequiToAppScreenButton = PaymentMethodsAnalytics$AddNequiToAppScreenButton.ContinueInApp;
            }
            gg0Var.H.a(PaymentMethodsAnalytics$AddNequiToAppScreenActionType.Tap, paymentMethodsAnalytics$AddNequiToAppScreenButton);
        }
        return zy11.a;
    }
}
