package defpackage;

import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class e9l0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ RouteSelectorModalView b;

    public /* synthetic */ e9l0(RouteSelectorModalView routeSelectorModalView, int i) {
        this.a = i;
        this.b = routeSelectorModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 newbiesAddressView_delegate$lambda$0$0$0;
        zy11 newbiesAddressView_delegate$lambda$0$0$1;
        zy11 renderPickupFromPhotoButton$lambda$0;
        AddressInputView newbiesAddressView_delegate$lambda$0;
        int i = this.a;
        RouteSelectorModalView routeSelectorModalView = this.b;
        switch (i) {
            case 0:
                newbiesAddressView_delegate$lambda$0$0$0 = RouteSelectorModalView.newbiesAddressView_delegate$lambda$0$0$0(routeSelectorModalView);
                return newbiesAddressView_delegate$lambda$0$0$0;
            case 1:
                newbiesAddressView_delegate$lambda$0$0$1 = RouteSelectorModalView.newbiesAddressView_delegate$lambda$0$0$1(routeSelectorModalView);
                return newbiesAddressView_delegate$lambda$0$0$1;
            case 2:
                renderPickupFromPhotoButton$lambda$0 = RouteSelectorModalView.renderPickupFromPhotoButton$lambda$0(routeSelectorModalView);
                return renderPickupFromPhotoButton$lambda$0;
            default:
                newbiesAddressView_delegate$lambda$0 = RouteSelectorModalView.newbiesAddressView_delegate$lambda$0(routeSelectorModalView);
                return newbiesAddressView_delegate$lambda$0;
        }
    }
}
