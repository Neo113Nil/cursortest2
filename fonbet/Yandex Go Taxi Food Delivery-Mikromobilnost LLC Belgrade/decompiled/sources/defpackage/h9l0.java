package defpackage;

import com.yandex.go.address_confirmation.modal.SourceAddressConfirmationModalView;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class h9l0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7r b;
    public final /* synthetic */ AddressResolveRepository c;

    public /* synthetic */ h9l0(f7r f7rVar, AddressResolveRepository addressResolveRepository, int i) {
        this.a = i;
        this.b = f7rVar;
        this.c = addressResolveRepository;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        g7r finalizeAddressByGravityRouter_delegate$lambda$0;
        g7r finalizeAddressByGravityRouter_delegate$lambda$02;
        switch (this.a) {
            case 0:
                finalizeAddressByGravityRouter_delegate$lambda$0 = RouteSelectorModalView.finalizeAddressByGravityRouter_delegate$lambda$0(this.b, this.c);
                return finalizeAddressByGravityRouter_delegate$lambda$0;
            default:
                finalizeAddressByGravityRouter_delegate$lambda$02 = SourceAddressConfirmationModalView.finalizeAddressByGravityRouter_delegate$lambda$0(this.b, this.c);
                return finalizeAddressByGravityRouter_delegate$lambda$02;
        }
    }
}
