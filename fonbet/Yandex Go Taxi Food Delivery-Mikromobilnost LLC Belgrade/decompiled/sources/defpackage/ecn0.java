package defpackage;

import ru.yandex.taxi.scooters.presentation.common.ui.ScootersCameraView;
import ru.yandex.taxi.scooters.presentation.ontheway.damage.ScootersDamageView;

/* loaded from: classes6.dex */
public final /* synthetic */ class ecn0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersDamageView b;

    public /* synthetic */ ecn0(ScootersDamageView scootersDamageView, int i) {
        this.a = i;
        this.b = scootersDamageView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ScootersCameraView scootersCameraView_delegate$lambda$0;
        zy11 onAttachedToWindow$lambda$5;
        int i = this.a;
        ScootersDamageView scootersDamageView = this.b;
        switch (i) {
            case 0:
                scootersCameraView_delegate$lambda$0 = ScootersDamageView.scootersCameraView_delegate$lambda$0(scootersDamageView);
                return scootersCameraView_delegate$lambda$0;
            default:
                onAttachedToWindow$lambda$5 = ScootersDamageView.onAttachedToWindow$lambda$5(scootersDamageView);
                return onAttachedToWindow$lambda$5;
        }
    }
}
