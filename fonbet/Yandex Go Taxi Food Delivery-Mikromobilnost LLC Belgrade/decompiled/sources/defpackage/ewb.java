package defpackage;

import com.yandex.go.navigator.address.NavigatorFullscreenDestinationSearchModalView;
import com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.factory.CitySuggestDialogModalView;
import ru.yandex.taxi.search.address.view.FullscreenDestinationSearchModalView;
import ru.yandex.taxi.search.view.BaseAddressSearchModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class ewb implements bx4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseAddressSearchModalView b;

    public /* synthetic */ ewb(BaseAddressSearchModalView baseAddressSearchModalView, int i) {
        this.a = i;
        this.b = baseAddressSearchModalView;
    }

    @Override // defpackage.bx4
    public final void a() {
        int i = this.a;
        BaseAddressSearchModalView baseAddressSearchModalView = this.b;
        switch (i) {
            case 0:
                CitySuggestDialogModalView.onAttachedToWindow$lambda$1((CitySuggestDialogModalView) baseAddressSearchModalView);
                break;
            case 1:
                ((FullscreenDestinationSearchModalView) baseAddressSearchModalView).requestFocus();
                break;
            default:
                ((NavigatorFullscreenDestinationSearchModalView) baseAddressSearchModalView).requestFocus();
                break;
        }
    }
}
