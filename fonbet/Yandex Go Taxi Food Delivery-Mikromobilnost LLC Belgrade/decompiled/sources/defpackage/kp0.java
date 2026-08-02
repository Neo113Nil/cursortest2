package defpackage;

import ru.yandex.taxi.address.clarification.AddressClarificationCloseReason;
import ru.yandex.taxi.address.clarification.impl.ui.AddressAdjustmentModalView;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes5.dex */
public final class kp0 implements sp0 {
    public final /* synthetic */ AddressAdjustmentModalView a;

    public kp0(AddressAdjustmentModalView addressAdjustmentModalView) {
        this.a = addressAdjustmentModalView;
    }

    @Override // defpackage.sp0
    public final void A1(er0 er0Var) {
        cp0 adapter;
        AddressAdjustmentModalView addressAdjustmentModalView = this.a;
        adapter = addressAdjustmentModalView.getAdapter();
        if (adapter != null) {
            adapter.submitList(er0Var.a, new hc(7, addressAdjustmentModalView, er0Var));
        }
    }

    @Override // defpackage.sp0
    public final void Eb(AddressClarificationCloseReason addressClarificationCloseReason) {
        this.a.innerCloseModalView(addressClarificationCloseReason);
    }

    @Override // defpackage.sp0
    public final void applyModalTheme(int i, ThemeType themeType) {
        this.a.applyModalTheme(i, themeType);
    }

    @Override // defpackage.sp0
    public final void f1(CharSequence charSequence) {
        lr0 binding;
        binding = this.a.getBinding();
        binding.d.setText(charSequence.toString());
    }

    @Override // defpackage.sp0
    public final void g4(CharSequence charSequence, CharSequence charSequence2) {
        lr0 binding;
        binding = this.a.getBinding();
        ListTitleComponent listTitleComponent = binding.e;
        listTitleComponent.setTitle(charSequence);
        listTitleComponent.setSubtitle(charSequence2);
    }

    @Override // defpackage.sp0
    public final void updateVisibility(boolean z) {
        AddressAdjustmentModalView addressAdjustmentModalView = this.a;
        if ((addressAdjustmentModalView.getVisibility() == 0) == z) {
            return;
        }
        addressAdjustmentModalView.setEnabled(z);
        if (z) {
            cma1.J(addressAdjustmentModalView);
        } else {
            cma1.L(addressAdjustmentModalView);
        }
    }
}
