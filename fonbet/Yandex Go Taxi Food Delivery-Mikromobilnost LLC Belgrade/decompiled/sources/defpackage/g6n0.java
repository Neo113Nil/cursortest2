package defpackage;

import com.yandex.go.scooters.offers.v2.ScootersCardV2ModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class g6n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersCardV2ModalView b;

    public /* synthetic */ g6n0(ScootersCardV2ModalView scootersCardV2ModalView, int i) {
        this.a = i;
        this.b = scootersCardV2ModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ScootersCardV2ModalView scootersCardV2ModalView = this.b;
        switch (i) {
            case 0:
                ScootersCardV2ModalView.backButton$lambda$0(scootersCardV2ModalView);
                break;
            case 1:
                scootersCardV2ModalView.updateFocusCoordinatorMargins();
                break;
            default:
                scootersCardV2ModalView.updateAnchoredHeight(false);
                break;
        }
    }
}
