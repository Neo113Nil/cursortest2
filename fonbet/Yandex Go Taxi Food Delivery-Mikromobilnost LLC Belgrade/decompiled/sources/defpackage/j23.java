package defpackage;

import com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.ApplinkPaymentFragment;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class j23 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ApplinkPaymentFragment b;

    public /* synthetic */ j23(ApplinkPaymentFragment applinkPaymentFragment, int i) {
        this.a = i;
        this.b = applinkPaymentFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        a23 componentStore_delegate$lambda$0;
        z13 component_delegate$lambda$1;
        a viewModel_delegate$lambda$2;
        zy11 attachNavigationController$lambda$4;
        int i = this.a;
        ApplinkPaymentFragment applinkPaymentFragment = this.b;
        switch (i) {
            case 0:
                componentStore_delegate$lambda$0 = ApplinkPaymentFragment.componentStore_delegate$lambda$0(applinkPaymentFragment);
                return componentStore_delegate$lambda$0;
            case 1:
                component_delegate$lambda$1 = ApplinkPaymentFragment.component_delegate$lambda$1(applinkPaymentFragment);
                return component_delegate$lambda$1;
            case 2:
                viewModel_delegate$lambda$2 = ApplinkPaymentFragment.viewModel_delegate$lambda$2(applinkPaymentFragment);
                return viewModel_delegate$lambda$2;
            default:
                attachNavigationController$lambda$4 = ApplinkPaymentFragment.attachNavigationController$lambda$4(applinkPaymentFragment);
                return attachNavigationController$lambda$4;
        }
    }
}
