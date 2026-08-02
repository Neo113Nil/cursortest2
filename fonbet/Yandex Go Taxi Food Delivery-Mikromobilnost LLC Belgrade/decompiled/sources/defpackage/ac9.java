package defpackage;

import android.graphics.Bitmap;
import com.yandex.go.taxi.order.change.source.experiment.ChangeSourcePointExperiment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lac9;", "Ll050;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ac9 extends l050 {
    void changeAutoLocateButtonVisibility(boolean z);

    void changeBackButtonVisibility(boolean z);

    void changePinState(vf9 vf9Var);

    void changePorchNumber(String str);

    void onBack();

    void onSourceAddressChanged(pv0 pv0Var);

    void showAvailableCircle(wa4 wa4Var);

    void showDefaultIcon();

    void showIcon(kdc kdcVar, kdc kdcVar2, Bitmap bitmap);

    void updateConfirmButton(z2e z2eVar);

    void updateTitles(ChangeSourcePointExperiment changeSourcePointExperiment);
}
