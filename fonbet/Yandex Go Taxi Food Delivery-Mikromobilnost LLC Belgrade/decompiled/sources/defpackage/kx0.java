package defpackage;

import com.yandex.mapkit.ScreenRect;
import ru.yandex.taxi.address.c;
import ru.yandex.taxi.fragment.preorder.AddressMapFragment;
import ru.yandex.taxi.fragment.preorder.e;

/* loaded from: classes5.dex */
public final /* synthetic */ class kx0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ AddressMapFragment b;

    public /* synthetic */ kx0(AddressMapFragment addressMapFragment, int i) {
        this.a = i;
        this.b = addressMapFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        g7r finalizeAddressByGravityRouter_delegate$lambda$0;
        a71 a71Var;
        b1c0 b1c0Var;
        zy11 massTransitPoiMovePinCallback$lambda$0;
        boolean isResumed;
        ScreenRect screenRect;
        ey0 networkListener_delegate$lambda$0;
        hbp0 panoramaScopeDelegate_delegate$lambda$0;
        e addressMapFragmentAddressController_delegate$lambda$0;
        s31 pickupPointsController_delegate$lambda$0;
        xx0 addressMapFragmentBlockedZoneController_delegate$lambda$0;
        c presenter_delegate$lambda$0;
        int i = this.a;
        AddressMapFragment addressMapFragment = this.b;
        switch (i) {
            case 0:
                finalizeAddressByGravityRouter_delegate$lambda$0 = AddressMapFragment.finalizeAddressByGravityRouter_delegate$lambda$0(addressMapFragment);
                return finalizeAddressByGravityRouter_delegate$lambda$0;
            case 1:
                a71Var = addressMapFragment.setupPinV1DataRepository();
                return a71Var;
            case 2:
                b1c0Var = addressMapFragment.setupPinV2DataRepository();
                return b1c0Var;
            case 3:
                massTransitPoiMovePinCallback$lambda$0 = AddressMapFragment.massTransitPoiMovePinCallback$lambda$0(addressMapFragment);
                return massTransitPoiMovePinCallback$lambda$0;
            case 4:
                isResumed = addressMapFragment.isResumed();
                break;
            case 5:
                screenRect = AddressMapFragment.setupPickupPoints$lambda$0(addressMapFragment);
                return screenRect;
            case 6:
                isResumed = AddressMapFragment.setupPickupPoints$lambda$1(addressMapFragment);
                break;
            case 7:
                networkListener_delegate$lambda$0 = AddressMapFragment.networkListener_delegate$lambda$0(addressMapFragment);
                return networkListener_delegate$lambda$0;
            case 8:
                panoramaScopeDelegate_delegate$lambda$0 = AddressMapFragment.panoramaScopeDelegate_delegate$lambda$0(addressMapFragment);
                return panoramaScopeDelegate_delegate$lambda$0;
            case 9:
                addressMapFragmentAddressController_delegate$lambda$0 = AddressMapFragment.addressMapFragmentAddressController_delegate$lambda$0(addressMapFragment);
                return addressMapFragmentAddressController_delegate$lambda$0;
            case 10:
                pickupPointsController_delegate$lambda$0 = AddressMapFragment.pickupPointsController_delegate$lambda$0(addressMapFragment);
                return pickupPointsController_delegate$lambda$0;
            case 11:
                addressMapFragmentBlockedZoneController_delegate$lambda$0 = AddressMapFragment.addressMapFragmentBlockedZoneController_delegate$lambda$0(addressMapFragment);
                return addressMapFragmentBlockedZoneController_delegate$lambda$0;
            default:
                presenter_delegate$lambda$0 = AddressMapFragment.presenter_delegate$lambda$0(addressMapFragment);
                return presenter_delegate$lambda$0;
        }
        return Boolean.valueOf(isResumed);
    }
}
