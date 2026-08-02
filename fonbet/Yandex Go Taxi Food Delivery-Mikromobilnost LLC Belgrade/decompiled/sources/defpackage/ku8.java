package defpackage;

import com.yandex.go.logistics.cargo_flow.discovery_map.CargoFlowDiscoveryMapModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class ku8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CargoFlowDiscoveryMapModalView b;

    public /* synthetic */ ku8(CargoFlowDiscoveryMapModalView cargoFlowDiscoveryMapModalView, int i) {
        this.a = i;
        this.b = cargoFlowDiscoveryMapModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CargoFlowDiscoveryMapModalView cargoFlowDiscoveryMapModalView = this.b;
        switch (i) {
            case 0:
                cargoFlowDiscoveryMapModalView.onBackPressed();
                break;
            case 1:
                cargoFlowDiscoveryMapModalView.onLocationButtonClick();
                break;
            default:
                cargoFlowDiscoveryMapModalView.requestFocus();
                break;
        }
    }
}
