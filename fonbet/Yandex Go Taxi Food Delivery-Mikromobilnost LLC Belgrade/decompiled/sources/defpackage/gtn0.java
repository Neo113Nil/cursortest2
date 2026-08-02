package defpackage;

import android.view.View;
import com.yandex.go.scooters.insurance.ScootersInsuranceModalView;
import com.yandex.go.scooters.insurance.model.ScootersInsuranceCompletion;

/* loaded from: classes13.dex */
public final /* synthetic */ class gtn0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersInsuranceModalView b;

    public /* synthetic */ gtn0(ScootersInsuranceModalView scootersInsuranceModalView, int i) {
        this.a = i;
        this.b = scootersInsuranceModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        View insetsType$lambda$0;
        tls tlsVar;
        int i = this.a;
        ScootersInsuranceModalView scootersInsuranceModalView = this.b;
        switch (i) {
            case 0:
                insetsType$lambda$0 = ScootersInsuranceModalView.insetsType$lambda$0(scootersInsuranceModalView);
                return insetsType$lambda$0;
            default:
                tlsVar = scootersInsuranceModalView.onComplete;
                tlsVar.invoke(ScootersInsuranceCompletion.DISABLED);
                return zy11.a;
        }
    }
}
