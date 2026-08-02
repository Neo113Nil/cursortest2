package defpackage;

import com.yandex.go.chargers.qr.ChargersQrModalView;
import com.yandex.go.payments.shared.family.postcard.ui.PostcardView;
import com.yandex.go.scooters.qr.ui.ScootersQrModalView;
import com.yandex.go.taxi.order.chat.ui.chat.TaxiOrderChatModalView;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.address.entrances.ui.v1.PorchNumberInputModalView;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.settings.profile.rating.PassengerNameCreatorModalView;
import ru.yandex.taxi.settings.profile.rating.PassengerNameEditorModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class pw0 implements yjx {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pw0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yjx
    public final void onClose() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AddressInputView.lambda$0$2((ww0) obj);
                break;
            case 1:
                AnimatedListItemInputComponent.init$lambda$0((AnimatedListItemInputComponent) obj);
                break;
            case 2:
                ChargersQrModalView.setupListenersForManualEnterViews$lambda$2((ChargersQrModalView) obj);
                break;
            case 3:
                ((Runnable) obj).run();
                break;
            case 4:
                ((PassengerNameCreatorModalView) obj).onBackPressed();
                break;
            case 5:
                ((PassengerNameEditorModalView) obj).onBackPressed();
                break;
            case 6:
                PorchNumberInputModalView._init_$lambda$1((PorchNumberInputModalView) obj);
                break;
            case 7:
                PostcardView.initListeners$lambda$0$0((PostcardView) obj);
                break;
            case 8:
                ScootersQrModalView.setupListenersForManualEnterViews$lambda$3((ScootersQrModalView) obj);
                break;
            default:
                ((TaxiOrderChatModalView) obj).closeKeyboard();
                break;
        }
    }
}
