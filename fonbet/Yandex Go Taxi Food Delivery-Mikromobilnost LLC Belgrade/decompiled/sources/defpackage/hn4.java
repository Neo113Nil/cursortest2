package defpackage;

import com.yandex.go.scooters.analytics.ScootersRentContractAnalytics$ButtonName;
import com.yandex.go.scooters.onboarding.agreement.ScootersAgreementModalView;
import com.yandex.go.settings.mvp.SettingsModalView;
import java.util.Iterator;

/* loaded from: classes13.dex */
public final /* synthetic */ class hn4 implements xyw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hn4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xyw0
    public final void a(boolean z) {
        boolean z2;
        hxm0 hxm0Var;
        xro0 xro0Var;
        String str;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((kbx0) obj).b.invoke(Boolean.valueOf(z));
                return;
            case 1:
                ScootersAgreementModalView scootersAgreementModalView = (ScootersAgreementModalView) obj;
                z2 = scootersAgreementModalView.acceptedAllListening;
                if (!z2) {
                    scootersAgreementModalView.acceptedAllListening = true;
                    return;
                }
                hxm0Var = scootersAgreementModalView.scootersAgreementPresenter;
                int i2 = 0;
                hxm0Var.z = hxm0Var.y.isEmpty() && z;
                Iterator it = hxm0Var.y.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        scc.m();
                        throw null;
                    }
                    hxm0Var.y.set(i2, jxm0.a((jxm0) next, z));
                    i2 = i3;
                }
                ((exm0) hxm0Var.Dg()).Ka(hxm0Var.y);
                ((exm0) hxm0Var.Dg()).n2(hxm0Var.Kg());
                xro0Var = scootersAgreementModalView.rentContractAnalytics;
                ScootersRentContractAnalytics$ButtonName scootersRentContractAnalytics$ButtonName = ScootersRentContractAnalytics$ButtonName.AcceptToggle;
                str = scootersAgreementModalView.onboardingType;
                xro0Var.a(scootersRentContractAnalytics$ButtonName, str, Boolean.valueOf(z));
                return;
            default:
                SettingsModalView.initLayout$lambda$0$9$1((SettingsModalView) obj, z);
                return;
        }
    }
}
