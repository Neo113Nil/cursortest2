package defpackage;

import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.permission.location_with_agreement.ui.LocationPermissionWithAgreementModalView;

/* loaded from: classes13.dex */
public final class gbz implements hdz {
    public final /* synthetic */ LocationPermissionWithAgreementModalView a;

    public gbz(LocationPermissionWithAgreementModalView locationPermissionWithAgreementModalView) {
        this.a = locationPermissionWithAgreementModalView;
    }

    @Override // defpackage.hdz
    public final void Gc() {
        ibz binding;
        binding = this.a.getBinding();
        binding.c.setProgressing(true);
    }

    @Override // defpackage.hdz
    public final void qc(sbz sbzVar) {
        hc6 hc6Var;
        rbz rbzVar = sbzVar.a;
        LocationPermissionWithAgreementModalView locationPermissionWithAgreementModalView = this.a;
        locationPermissionWithAgreementModalView.setTitle(rbzVar);
        locationPermissionWithAgreementModalView.setLocation(sbzVar.b);
        locationPermissionWithAgreementModalView.setButtonTitle(sbzVar.c);
        locationPermissionWithAgreementModalView.setAgreement(sbzVar.d);
        locationPermissionWithAgreementModalView.setTitleIcon(sbzVar.e);
        locationPermissionWithAgreementModalView.setRootBackground(sbzVar.f);
        hc6Var = locationPermissionWithAgreementModalView.bottomContainerShadowRenderer;
        OneShotPreDrawListener.add(hc6Var.a, new js4(15, hc6Var));
    }
}
