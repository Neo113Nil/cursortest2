package defpackage;

import com.yandex.go.scooters.analytics.ScootersDebtAnalytics$CloseReason;
import com.yandex.go.scooters.debt.ScootersDebtModalView;
import com.yandex.go.scooters.debt.b;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class cdn0 implements fdn0 {
    public final /* synthetic */ ScootersDebtModalView a;

    public cdn0(ScootersDebtModalView scootersDebtModalView) {
        this.a = scootersDebtModalView;
    }

    @Override // defpackage.fdn0
    public final void C4() {
        ddn0 binding;
        binding = this.a.getBinding();
        binding.b.setEnabled(true);
    }

    @Override // defpackage.fdn0
    public final void Hf() {
        ddn0 binding;
        binding = this.a.getBinding();
        binding.c.setEnabled(true);
    }

    @Override // defpackage.fdn0
    public final void I0() {
        ddn0 binding;
        ddn0 binding2;
        ScootersDebtModalView scootersDebtModalView = this.a;
        binding = scootersDebtModalView.getBinding();
        binding.b.startAnimation();
        binding2 = scootersDebtModalView.getBinding();
        binding2.b.setText(scootersDebtModalView.getContext().getString(kyh0.scooters_you_have_a_dept_btn_in_progress));
    }

    @Override // defpackage.fdn0
    public final void M7(int i, fef fefVar) {
        ddn0 binding;
        cno0 cno0Var;
        ScootersDebtModalView scootersDebtModalView = this.a;
        binding = scootersDebtModalView.getBinding();
        RobotoTextView robotoTextView = binding.e;
        cno0Var = scootersDebtModalView.scootersPriceStringFactory;
        robotoTextView.setText(cno0Var.a(fefVar, kyh0.scooters_you_have_a_dept_title, new e1f0(Integer.valueOf(i).doubleValue())));
    }

    @Override // defpackage.fdn0
    public final void Q5() {
        ddn0 binding;
        ddn0 binding2;
        ScootersDebtModalView scootersDebtModalView = this.a;
        binding = scootersDebtModalView.getBinding();
        binding.b.stopAnimation();
        binding2 = scootersDebtModalView.getBinding();
        binding2.b.setText(scootersDebtModalView.getContext().getString(kyh0.scooters_you_have_a_dept_btn));
    }

    @Override // defpackage.fdn0
    public final void W4(Throwable th, sls slsVar) {
        wls wlsVar;
        wlsVar = this.a.showErrorDialog;
        wlsVar.invoke(th, slsVar);
    }

    @Override // defpackage.fdn0
    public final void e9() {
        ddn0 binding;
        binding = this.a.getBinding();
        binding.c.setEnabled(false);
    }

    @Override // defpackage.fdn0
    public final void hideLoading() {
        ddn0 binding;
        binding = this.a.getBinding();
        binding.d.setVisibility(8);
    }

    @Override // defpackage.fdn0
    public final void k7(hfa0 hfa0Var) {
        ddn0 binding;
        rea0 rea0Var;
        ddn0 binding2;
        bia0 bia0Var;
        ddn0 binding3;
        lea0 b = hfa0Var.b();
        ScootersDebtModalView scootersDebtModalView = this.a;
        binding = scootersDebtModalView.getBinding();
        ListItemComponent listItemComponent = binding.c;
        rea0Var = scootersDebtModalView.paymentModelsTitleInteractor;
        listItemComponent.setSubtitle(((sea0) rea0Var).a(scootersDebtModalView.getContext(), b));
        binding2 = scootersDebtModalView.getBinding();
        ListItemComponent listItemComponent2 = binding2.c;
        bia0Var = scootersDebtModalView.paymentResourceProvider;
        listItemComponent2.setTrailImage(bia0.a(bia0Var, scootersDebtModalView.getContext(), b));
        binding3 = scootersDebtModalView.getBinding();
        binding3.c.setDebounceClickListener(new ajl0(17, scootersDebtModalView, hfa0Var));
    }

    @Override // defpackage.fdn0
    public final void k8() {
        ddn0 binding;
        binding = this.a.getBinding();
        binding.b.setEnabled(false);
    }

    @Override // defpackage.fdn0
    public final void lc() {
        xcn0 xcn0Var;
        b bVar;
        sls slsVar;
        ScootersDebtModalView scootersDebtModalView = this.a;
        xcn0Var = scootersDebtModalView.scootersDebtAnalytics;
        bVar = scootersDebtModalView.scootersDebtPresenter;
        xcn0.a(xcn0Var, ScootersDebtAnalytics$CloseReason.DebtPaid, r1b1.b(bVar.A.a));
        slsVar = scootersDebtModalView.onDebtPayedListener;
        slsVar.invoke();
    }
}
