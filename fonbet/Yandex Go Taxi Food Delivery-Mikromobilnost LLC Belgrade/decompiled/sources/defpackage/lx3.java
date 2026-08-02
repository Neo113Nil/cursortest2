package defpackage;

import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularFragment;
import com.ybsdk.feature.autotopup.internal.presentation.saver.a;
import java.util.Collections;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class lx3 implements mdq0 {
    public final /* synthetic */ AutoTopupRegularFragment a;

    public lx3(AutoTopupRegularFragment autoTopupRegularFragment) {
        this.a = autoTopupRegularFragment;
    }

    @Override // defpackage.mdq0
    public final void onAddMethodClicked() {
    }

    @Override // defpackage.mdq0
    public final void onAdditionalButtonClicked(el0 el0Var) {
        a access$getViewModel = AutoTopupRegularFragment.access$getViewModel(this.a);
        if (((sv3) access$getViewModel.J).a.c(el0Var.d).b) {
            return;
        }
        access$getViewModel.f0();
        access$getViewModel.Z(sx3.a);
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
        a access$getViewModel = AutoTopupRegularFragment.access$getViewModel(this.a);
        access$getViewModel.getClass();
        String action = h5a0Var.getAction();
        if (action != null && !evu0.J(action)) {
            if (((sv3) access$getViewModel.J).a.c(action).a instanceof x0h) {
                x4c.g("Failed to resolve action on payment method click", null, h5a0Var.getAction(), Collections.singletonList(lrp0.c), 2);
                return;
            }
            return;
        }
        access$getViewModel.L.K(h5a0Var, access$getViewModel.B, (qx3) access$getViewModel.X());
        pz40 Y = access$getViewModel.Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            h5a0 h5a0Var2 = h5a0Var;
            if (r0Var.k(value, qx3.a((qx3) value, null, null, null, null, null, null, h5a0Var2, false, 191))) {
                access$getViewModel.N0();
                return;
            }
            h5a0Var = h5a0Var2;
        }
    }
}
