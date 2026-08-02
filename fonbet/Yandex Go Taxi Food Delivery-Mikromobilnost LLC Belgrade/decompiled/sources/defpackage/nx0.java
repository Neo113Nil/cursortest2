package defpackage;

import ru.yandex.taxi.fragment.preorder.AddressMapFragment;

/* loaded from: classes5.dex */
public final /* synthetic */ class nx0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ AddressMapFragment b;

    public /* synthetic */ nx0(AddressMapFragment addressMapFragment, int i) {
        this.a = i;
        this.b = addressMapFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 createPanoramaButtonIfNeed$lambda$1;
        zy11 onPositionMapToCurrentLocation$lambda$0;
        zy11 onLocationClick$lambda$0;
        zy11 zy11Var;
        int i = this.a;
        AddressMapFragment addressMapFragment = this.b;
        switch (i) {
            case 0:
                createPanoramaButtonIfNeed$lambda$1 = AddressMapFragment.createPanoramaButtonIfNeed$lambda$1(addressMapFragment, (zzs) obj);
                return createPanoramaButtonIfNeed$lambda$1;
            case 1:
                onPositionMapToCurrentLocation$lambda$0 = AddressMapFragment.onPositionMapToCurrentLocation$lambda$0(addressMapFragment, (mo21) obj);
                return onPositionMapToCurrentLocation$lambda$0;
            case 2:
                onLocationClick$lambda$0 = AddressMapFragment.onLocationClick$lambda$0(addressMapFragment, (mo21) obj);
                return onLocationClick$lambda$0;
            default:
                zy11Var = AddressMapFragment.setupPickupPoints$lambda$2(addressMapFragment, (wpb0) obj);
                return zy11Var;
        }
    }
}
