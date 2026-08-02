package defpackage;

import com.yandex.go.address_confirmation.modal.SourceAddressConfirmationModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class gat0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SourceAddressConfirmationModalView b;

    public /* synthetic */ gat0(SourceAddressConfirmationModalView sourceAddressConfirmationModalView, int i) {
        this.a = i;
        this.b = sourceAddressConfirmationModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 renderPickupFromPhotoButton$lambda$0;
        zy11 _init_$lambda$3;
        int i = this.a;
        SourceAddressConfirmationModalView sourceAddressConfirmationModalView = this.b;
        switch (i) {
            case 0:
                renderPickupFromPhotoButton$lambda$0 = SourceAddressConfirmationModalView.renderPickupFromPhotoButton$lambda$0(sourceAddressConfirmationModalView);
                return renderPickupFromPhotoButton$lambda$0;
            default:
                _init_$lambda$3 = SourceAddressConfirmationModalView._init_$lambda$3(sourceAddressConfirmationModalView);
                return _init_$lambda$3;
        }
    }
}
