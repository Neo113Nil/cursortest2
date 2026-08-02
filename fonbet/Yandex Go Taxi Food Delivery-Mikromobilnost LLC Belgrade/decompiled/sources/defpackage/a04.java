package defpackage;

import com.ybsdk.feature.autotopup.internal.presentation.setup.v1.AutoTopupSetupFragment;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v1.b;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class a04 implements mdq0 {
    public final /* synthetic */ AutoTopupSetupFragment a;

    public a04(AutoTopupSetupFragment autoTopupSetupFragment) {
        this.a = autoTopupSetupFragment;
    }

    @Override // defpackage.mdq0
    public final void onAddMethodClicked() {
    }

    @Override // defpackage.mdq0
    public final void onAdditionalButtonClicked(el0 el0Var) {
        b viewModel;
        viewModel = this.a.getViewModel();
        if (((sv3) viewModel.F).a.c(el0Var.d).b) {
            return;
        }
        viewModel.d0();
        viewModel.f0();
    }

    @Override // defpackage.mdq0
    public final void onBackPressedFromSbp() {
    }

    @Override // defpackage.mdq0
    public final void onCreditPaymentMethodChanged(saf safVar) {
    }

    @Override // defpackage.mdq0
    public final void onSbpMethodClicked() {
    }

    @Override // defpackage.mdq0
    public final void onSbpWidgetClicked() {
    }

    @Override // defpackage.mdq0
    public final void onSelectedAccountChanged(sl slVar) {
    }

    @Override // defpackage.mdq0
    public final void onSelectedPaymentMethodChanged(h5a0 h5a0Var) {
        b viewModel;
        viewModel = this.a.getViewModel();
        viewModel.getClass();
        String action = h5a0Var.getAction();
        z2z c = action != null ? ((sv3) viewModel.F).a.c(action) : null;
        if ((c != null ? c.a : null) instanceof v0h) {
            return;
        }
        String action2 = h5a0Var.getAction();
        if (action2 != null && !evu0.J(action2)) {
            x4c.g("Failed to resolve action on payment method click", null, h5a0Var.getAction(), Collections.singletonList(lrp0.b), 2);
        }
        viewModel.a1(h5a0Var);
    }
}
