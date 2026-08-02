package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.search.SearchView;
import com.google.android.material.textfield.c;
import com.yandex.go.chargers.qr.ChargersQrModalView;
import com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.factory.CitySuggestDialogModalView;
import com.yandex.go.payments.shared.family.postcard.ui.PostcardView;
import com.yandex.go.platform.auth.a;
import com.yandex.go.scooters.qr.ui.ScootersQrModalView;
import com.yandex.go.taxi.order.chat.ui.chat.TaxiOrderChatModalView;
import com.yandex.payment.divkit.bind.view.DKCardNumberInput;
import com.yandex.payment.divkit.bind.view.DKCvnInput;
import com.yandex.payment.divkit.bind.view.DKExpirationDateInput;
import com.yandex.payment.divkit.select.DkCvvInputView;
import com.yandex.payment.sdk.ui.payment.sbp.SbpFragment;
import com.yandex.payment.sdk.ui.view.CardNumberView;
import com.yandex.payment.sdk.ui.view.CvnView;
import com.yandex.payment.sdk.ui.view.EmailView;
import com.yandex.payment.sdk.ui.view.ExpirationDateView;
import com.yandex.payment.sdk.ui.view.card.CardNumberInput;
import com.yandex.payment.sdk.ui.view.card.CvnInput;
import com.yandex.payment.sdk.ui.view.card.CvnInputViewImpl;
import com.yandex.payment.sdk.ui.view.card.ExpirationDateInput;
import com.ybsdk.widgets.common.LoadableInput;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.widget.BackportNumberPicker;

/* loaded from: classes2.dex */
public final /* synthetic */ class bk implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bk(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                a aVar = (a) obj;
                if (z) {
                    aVar.a(true);
                    break;
                }
                break;
            case 1:
                ((AddressInputView) obj).checkClearTextVisible();
                break;
            case 2:
                ((AnimatedListItemInputComponent) obj).inputFocusChanged(z);
                break;
            case 3:
                ((BackportNumberPicker) obj).lambda$new$0(view, z);
                break;
            case 4:
                CardNumberInput._init_$lambda$0((CardNumberInput) obj, view, z);
                break;
            case 5:
                CardNumberView._init_$lambda$0((CardNumberView) obj, view, z);
                break;
            case 6:
                ChargersQrModalView.setupListenersForManualEnterViews$lambda$3((ChargersQrModalView) obj, view, z);
                break;
            case 7:
                CitySuggestDialogModalView.onAttachedToWindow$lambda$0((CitySuggestDialogModalView) obj, view, z);
                break;
            case 8:
                com.google.android.material.textfield.a aVar2 = (com.google.android.material.textfield.a) obj;
                aVar2.s(aVar2.t());
                break;
            case 9:
                CvnInput._init_$lambda$1((CvnInput) obj, view, z);
                break;
            case 10:
                CvnInputViewImpl._init_$lambda$1((CvnInputViewImpl) obj, view, z);
                break;
            case 11:
                CvnView._init_$lambda$1((CvnView) obj, view, z);
                break;
            case 12:
                DKCardNumberInput._init_$lambda$0((DKCardNumberInput) obj, view, z);
                break;
            case 13:
                DKCvnInput._init_$lambda$1((DKCvnInput) obj, view, z);
                break;
            case 14:
                DKExpirationDateInput._init_$lambda$0((DKExpirationDateInput) obj, view, z);
                break;
            case 15:
                DateSelector.lambda$showKeyboardWithAutoHideBehavior$0((EditText[]) obj, view, z);
                break;
            case 16:
                DkCvvInputView._init_$lambda$2((DkCvvInputView) obj, view, z);
                break;
            case 17:
                c cVar = (c) obj;
                cVar.l = z;
                cVar.p();
                if (!z) {
                    cVar.s(false);
                    cVar.m = false;
                    break;
                }
                break;
            case 18:
                EmailView._init_$lambda$1((EmailView) obj, view, z);
                break;
            case 19:
                ExpirationDateInput._init_$lambda$0((ExpirationDateInput) obj, view, z);
                break;
            case 20:
                ExpirationDateView._init_$lambda$0((ExpirationDateView) obj, view, z);
                break;
            case 21:
                ((View) obj).setSelected(z);
                break;
            case 22:
                hdu hduVar = (hdu) obj;
                if (z) {
                    ((InputMethodManager) hduVar.b).hideSoftInputFromWindow(((View) hduVar.a).getWindowToken(), 0);
                    break;
                }
                break;
            case 23:
                LoadableInput._init_$lambda$2((LoadableInput) obj, view, z);
                break;
            case 24:
                PostcardView.initListeners$lambda$0$1((PostcardView) obj, view, z);
                break;
            case 25:
                SbpFragment.initBankListLayout$lambda$0$3$1((SbpFragment) obj, view, z);
                break;
            case 26:
                ScootersQrModalView.setupListenersForManualEnterViews$lambda$4((ScootersQrModalView) obj, view, z);
                break;
            case 27:
                ((SearchView) obj).lambda$setUpEditText$1(view, z);
                break;
            default:
                TaxiOrderChatModalView.onAttachedToWindow$lambda$3((TaxiOrderChatModalView) obj, view, z);
                break;
        }
    }
}
