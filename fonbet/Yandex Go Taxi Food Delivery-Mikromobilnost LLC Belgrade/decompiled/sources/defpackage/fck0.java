package defpackage;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;

/* loaded from: classes14.dex */
public final /* synthetic */ class fck0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ RideCardPresentationType b;

    public /* synthetic */ fck0(RideCardPresentationType rideCardPresentationType, int i) {
        this.a = i;
        this.b = rideCardPresentationType;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        RideCardPresentationType rideCardPresentationType = this.b;
        switch (i) {
            case 0:
                return "Requested presentation " + rideCardPresentationType + " is not supported";
            default:
                return "Unsupported presentation type: " + rideCardPresentationType;
        }
    }
}
