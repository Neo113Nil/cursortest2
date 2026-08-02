package defpackage;

import com.yandex.go.scooters.offers.v2.ScootersCardV2ModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class h6n0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersCardV2ModalView b;

    public /* synthetic */ h6n0(ScootersCardV2ModalView scootersCardV2ModalView, int i) {
        this.a = i;
        this.b = scootersCardV2ModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        boolean _init_$lambda$3;
        f4p0 scootersRouteOverlay_delegate$lambda$0;
        int i = this.a;
        ScootersCardV2ModalView scootersCardV2ModalView = this.b;
        switch (i) {
            case 0:
                _init_$lambda$3 = ScootersCardV2ModalView._init_$lambda$3(scootersCardV2ModalView);
                return Boolean.valueOf(_init_$lambda$3);
            default:
                scootersRouteOverlay_delegate$lambda$0 = ScootersCardV2ModalView.scootersRouteOverlay_delegate$lambda$0(scootersCardV2ModalView);
                return scootersRouteOverlay_delegate$lambda$0;
        }
    }
}
