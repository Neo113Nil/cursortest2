package defpackage;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.actions.SplitDepositAutoTopup;
import com.ybsdk.feature.deeplink.api.actions.SplitDepositProcessing;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.payment.methods.AutoTopupPaymentMethodsFragment;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class k2h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ gtt0 b;

    public /* synthetic */ k2h(gtt0 gtt0Var, int i) {
        this.a = i;
        this.b = gtt0Var;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        gtt0 gtt0Var = this.b;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.SplitDeposit)) {
                    return x0hVar;
                }
                DeeplinkAction.SplitDeposit splitDeposit = (DeeplinkAction.SplitDeposit) baseDeeplinkAction;
                return new v0h(Collections.singletonList(gtt0Var.c(splitDeposit.getOrderId(), splitDeposit.getScenario())), null, 6);
            case 1:
                if (!(baseDeeplinkAction instanceof SplitDepositAutoTopup)) {
                    return x0hVar;
                }
                gtt0Var.b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("AutoTopupPaymentMethodsScreen", false, null, TransitionPolicyType.NONE, qoi0.a(AutoTopupPaymentMethodsFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 4, null)), null, 6);
            default:
                return baseDeeplinkAction instanceof SplitDepositProcessing ? new v0h(Collections.singletonList(gtt0Var.b(((SplitDepositProcessing) baseDeeplinkAction).getTransactionParameters())), null, 6) : x0hVar;
        }
    }
}
