package defpackage;

import android.content.Context;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.ScootersArbitraryDestinationSelectionModalView;

/* loaded from: classes6.dex */
public final class kym0 implements mym0 {
    public final /* synthetic */ ScootersArbitraryDestinationSelectionModalView a;

    public kym0(ScootersArbitraryDestinationSelectionModalView scootersArbitraryDestinationSelectionModalView) {
        this.a = scootersArbitraryDestinationSelectionModalView;
    }

    @Override // defpackage.mym0
    public final void E2() {
        cma1.M(this.a);
    }

    @Override // defpackage.mym0
    public final void G() {
        pym0 binding;
        pym0 binding2;
        pym0 binding3;
        ScootersArbitraryDestinationSelectionModalView scootersArbitraryDestinationSelectionModalView = this.a;
        binding = scootersArbitraryDestinationSelectionModalView.getBinding();
        binding.b.setTitle("");
        binding2 = scootersArbitraryDestinationSelectionModalView.getBinding();
        binding2.b.setSubtitle("");
        binding3 = scootersArbitraryDestinationSelectionModalView.getBinding();
        binding3.e.setVisibility(0);
    }

    @Override // defpackage.mym0
    public final void Qd() {
        pym0 binding;
        String str;
        pym0 binding2;
        ScootersArbitraryDestinationSelectionModalView scootersArbitraryDestinationSelectionModalView = this.a;
        binding = scootersArbitraryDestinationSelectionModalView.getBinding();
        ButtonComponent buttonComponent = binding.c;
        str = scootersArbitraryDestinationSelectionModalView.buttonTitle;
        buttonComponent.setText(str);
        binding2 = scootersArbitraryDestinationSelectionModalView.getBinding();
        binding2.c.setEnabled(false);
    }

    @Override // defpackage.mym0
    public final void Te() {
        pym0 binding;
        pym0 binding2;
        pym0 binding3;
        ScootersArbitraryDestinationSelectionModalView scootersArbitraryDestinationSelectionModalView = this.a;
        binding = scootersArbitraryDestinationSelectionModalView.getBinding();
        binding.f.setVisibility(0);
        binding2 = scootersArbitraryDestinationSelectionModalView.getBinding();
        binding2.d.setVisibility(0);
        binding3 = scootersArbitraryDestinationSelectionModalView.getBinding();
        binding3.b.setDividers(DividerPosition.TOP, DividerType.MARGIN);
    }

    @Override // defpackage.mym0
    public final void U(String str) {
        pym0 binding;
        binding = this.a.getBinding();
        binding.b.setTitle(str);
    }

    @Override // defpackage.mym0
    public final void Z() {
        pym0 binding;
        binding = this.a.getBinding();
        binding.e.setVisibility(8);
    }

    @Override // defpackage.mym0
    public final void f5() {
        cma1.J(this.a);
    }

    @Override // defpackage.mym0
    public final void oa(String str) {
        pym0 binding;
        String str2;
        pym0 binding2;
        ScootersArbitraryDestinationSelectionModalView scootersArbitraryDestinationSelectionModalView = this.a;
        binding = scootersArbitraryDestinationSelectionModalView.getBinding();
        ButtonComponent buttonComponent = binding.c;
        Context context = scootersArbitraryDestinationSelectionModalView.getContext();
        str2 = scootersArbitraryDestinationSelectionModalView.buttonTitle;
        buttonComponent.setText(k1b1.a(context, str2, str, false));
        binding2 = scootersArbitraryDestinationSelectionModalView.getBinding();
        binding2.c.setEnabled(true);
    }

    @Override // defpackage.mym0
    public final void qb() {
        pym0 binding;
        pym0 binding2;
        pym0 binding3;
        ScootersArbitraryDestinationSelectionModalView scootersArbitraryDestinationSelectionModalView = this.a;
        binding = scootersArbitraryDestinationSelectionModalView.getBinding();
        binding.f.setVisibility(8);
        binding2 = scootersArbitraryDestinationSelectionModalView.getBinding();
        binding2.d.setVisibility(8);
        binding3 = scootersArbitraryDestinationSelectionModalView.getBinding();
        binding3.b.setDividers(DividerPosition.NONE, DividerType.MARGIN);
    }

    @Override // defpackage.mym0
    public final void updateAzimuth(float f) {
        gzx gzxVar;
        gzxVar = this.a.layersUserLocationOverlay;
        gzxVar.updateAzimuth(f);
    }

    @Override // defpackage.mym0
    public final void updateUserLocation(mo21 mo21Var) {
        gzx gzxVar;
        gzxVar = this.a.layersUserLocationOverlay;
        gzxVar.Ng(mo21Var.a, mo21Var.b, mo21Var.c);
    }
}
