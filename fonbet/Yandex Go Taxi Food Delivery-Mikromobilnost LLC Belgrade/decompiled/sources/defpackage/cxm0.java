package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.scooters.data.model.RootAcceptItem;
import com.yandex.go.scooters.data.model.ScootersOnboardingAgreement;
import com.yandex.go.scooters.data.model.ScootersOnboardingExperiment;
import com.yandex.go.scooters.onboarding.agreement.ScootersAgreementModalView;
import java.util.List;
import ru.yandex.taxi.design.ListItemSwitchComponent;

/* loaded from: classes13.dex */
public final class cxm0 implements exm0 {
    public final /* synthetic */ ScootersAgreementModalView a;

    public cxm0(ScootersAgreementModalView scootersAgreementModalView) {
        this.a = scootersAgreementModalView;
    }

    @Override // defpackage.exm0
    public final void Fe(boolean z) {
        ScootersAgreementModalView scootersAgreementModalView = this.a;
        scootersAgreementModalView.acceptedAllListening = z == ScootersAgreementModalView.access$getBinding(scootersAgreementModalView).b.isChecked();
        ScootersAgreementModalView.access$getBinding(scootersAgreementModalView).b.setCheckedWithAnimation(z);
    }

    @Override // defpackage.exm0
    public final void Gd() {
        ScootersAgreementModalView.access$getBinding(this.a).b.setVisibility(8);
    }

    @Override // defpackage.exm0
    public final void Ka(List list) {
        RecyclerView recyclerView = ScootersAgreementModalView.access$getBinding(this.a).c;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!(i2 < recyclerView.getChildCount())) {
                return;
            }
            int i3 = i2 + 1;
            View childAt = recyclerView.getChildAt(i2);
            if (childAt == null) {
                ny61.s();
                return;
            }
            int i4 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            if (childAt instanceof ListItemSwitchComponent) {
                ((ListItemSwitchComponent) childAt).setCheckedWithAnimation(((jxm0) list.get(i)).d);
            }
            i2 = i3;
            i = i4;
        }
    }

    @Override // defpackage.exm0
    public final void n2(boolean z) {
        ScootersAgreementModalView scootersAgreementModalView = this.a;
        ScootersAgreementModalView.access$getBinding(scootersAgreementModalView).d.setEnabled(z);
        k1b1.f(ScootersAgreementModalView.access$getBinding(scootersAgreementModalView).d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.exm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void xa() {
        zwm0 zwm0Var;
        mto0 mto0Var;
        RootAcceptItem rootAcceptItem;
        ScootersAgreementModalView scootersAgreementModalView = this.a;
        zwm0Var = scootersAgreementModalView.itemsBuilder;
        ScootersOnboardingExperiment scootersOnboardingExperiment = zwm0Var.a;
        ScootersOnboardingAgreement scootersOnboardingAgreement = scootersOnboardingExperiment.d;
        if (scootersOnboardingAgreement != null && (rootAcceptItem = scootersOnboardingAgreement.h) != null) {
            String str = rootAcceptItem.a;
            if (str == null) {
                str = "";
            }
            String Y = d6z.Y(scootersOnboardingExperiment, str);
            if (Y.length() != 0) {
                String str2 = rootAcceptItem.b;
                mto0Var = new mto0(Y, d6z.Y(scootersOnboardingExperiment, str2 != null ? str2 : ""));
                if (mto0Var == null) {
                    ScootersAgreementModalView.access$getBinding(scootersAgreementModalView).b.setTitle(mto0Var.a);
                    ScootersAgreementModalView.access$getBinding(scootersAgreementModalView).b.setSubtitle(mto0Var.b);
                    ScootersAgreementModalView.access$getBinding(scootersAgreementModalView).b.setVisibility(0);
                    ScootersAgreementModalView.access$getBinding(scootersAgreementModalView).b.setOnClickListener(new eaj0(8, scootersAgreementModalView));
                    ScootersAgreementModalView.access$getBinding(scootersAgreementModalView).b.setOnCheckedListener(new hn4(1, scootersAgreementModalView));
                    ScootersAgreementModalView.access$getBinding(scootersAgreementModalView).b.setTrackColors(qje.t(xng0.controlMain, scootersAgreementModalView.getContext()), qje.t(xng0.controlMinor, scootersAgreementModalView.getContext()));
                    return;
                }
                return;
            }
        }
        mto0Var = null;
        if (mto0Var == null) {
        }
    }
}
