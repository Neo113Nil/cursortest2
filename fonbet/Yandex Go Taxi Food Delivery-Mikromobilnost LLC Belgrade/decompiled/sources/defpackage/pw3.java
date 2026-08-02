package defpackage;

import com.ybsdk.feature.split.deposit.internal.ui.autotopup.payment.methods.AutoTopupPaymentMethodsFragment;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class pw3 implements mdq0 {
    public final /* synthetic */ AutoTopupPaymentMethodsFragment a;

    public pw3(AutoTopupPaymentMethodsFragment autoTopupPaymentMethodsFragment) {
        this.a = autoTopupPaymentMethodsFragment;
    }

    @Override // defpackage.mdq0
    public final void onAddMethodClicked() {
    }

    @Override // defpackage.mdq0
    public final void onAdditionalButtonClicked(el0 el0Var) {
        vw3 access$getViewModel = AutoTopupPaymentMethodsFragment.access$getViewModel(this.a);
        String str = el0Var.d;
        access$getViewModel.F.a.k0.a.a("split_deposit.auto_topup_payment_methods.new_account.click", null);
        access$getViewModel.b0();
        access$getViewModel.B.c(str);
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
        r0 r0Var;
        Object value;
        vw3 access$getViewModel = AutoTopupPaymentMethodsFragment.access$getViewModel(this.a);
        m04 m04Var = access$getViewModel.F;
        String id = h5a0Var.getId();
        em3 em3Var = m04Var.a.k0;
        em3Var.a.a("split_deposit.auto_topup_payment_methods.account.click", g8e.w(1, "payment_method_id", id));
        if (((sw3) access$getViewModel.X()).b instanceof rg6) {
            pz40 Y = access$getViewModel.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, sw3.a((sw3) value, new rg6(h5a0Var), 13)));
        }
    }
}
