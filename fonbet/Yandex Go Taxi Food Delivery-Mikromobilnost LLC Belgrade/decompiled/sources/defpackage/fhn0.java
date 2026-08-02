package defpackage;

import ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2ModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class fhn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersDetailedOrderV2ModalView b;

    public /* synthetic */ fhn0(ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView, int i) {
        this.a = i;
        this.b = scootersDetailedOrderV2ModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView = this.b;
        switch (i) {
            case 0:
                ScootersDetailedOrderV2ModalView.topButtonContainer$lambda$0(scootersDetailedOrderV2ModalView);
                break;
            case 1:
                scootersDetailedOrderV2ModalView.onBackButtonClick();
                break;
            default:
                ScootersDetailedOrderV2ModalView.topButtonContainer$lambda$2(scootersDetailedOrderV2ModalView);
                break;
        }
    }
}
