package defpackage;

import com.ybsdk.feature.savings.internal.screens.fund.creation.FundCreationFragment;
import com.ybsdk.feature.savings.internal.screens.fund.creation.a;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class dns implements mdq0 {
    public final /* synthetic */ FundCreationFragment a;

    public dns(FundCreationFragment fundCreationFragment) {
        this.a = fundCreationFragment;
    }

    @Override // defpackage.mdq0
    public final void onAddMethodClicked() {
    }

    @Override // defpackage.mdq0
    public final void onAdditionalButtonClicked(el0 el0Var) {
        a access$getViewModel = FundCreationFragment.access$getViewModel(this.a);
        access$getViewModel.D.b(el0Var.d);
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
        a access$getViewModel = FundCreationFragment.access$getViewModel(this.a);
        rt1 rt1Var = access$getViewModel.C.f0;
        String id = h5a0Var.getId();
        String b = id != null ? ssa1.b(id) : null;
        if (b == null) {
            b = "";
        }
        rt1Var.a.a("savings.opening.fund_topup_screen.sending_accounts.choose", g8e.w(1, "agreement_id", b));
        String action = h5a0Var.getAction();
        if (action == null || evu0.J(action)) {
            gns gnsVar = ((ins) access$getViewModel.X()).d;
            a.q0(access$getViewModel, gnsVar != null ? gns.a(gnsVar, null, null, h5a0Var, null, 4031) : null);
            access$getViewModel.o0();
        } else {
            if (access$getViewModel.D.b(action)) {
                return;
            }
            x4c.g("Failed to resolve action on payment method click", null, h5a0Var.getAction(), Collections.singletonList(lrp0.k), 2);
        }
    }
}
