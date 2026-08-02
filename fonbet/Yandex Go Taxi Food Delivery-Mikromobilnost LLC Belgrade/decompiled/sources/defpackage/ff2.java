package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import com.yandex.go.payments.sbp.ui.home.SbpHomeModalView;
import com.yandex.go.payments.shared.business.accountcreation.corp.factory.CorpCreatingDraftModalView;
import com.yandex.go.payments.shared.wizard.welcome.CreateAccountView;
import com.yandex.go.taxi.order.chat.ui.chat.TaxiOrderChatModalView;
import com.yandex.go.taxi.order.view.tips.TipsInputModalView;
import com.yandex.payment.divkit.bind.view.DKCardNumberInput;
import com.yandex.payment.divkit.bind.view.DKCvnInput;
import com.yandex.payment.divkit.bind.view.DKExpirationDateInput;
import com.yandex.payment.sdk.ui.view.card.CardNumberInput;
import com.yandex.payment.sdk.ui.view.card.CvnInput;
import com.yandex.payment.sdk.ui.view.card.ExpirationDateInput;
import com.yandex.plus.core.debug.panel.internal.presentation.view.DebugPanelLogsView;
import com.ybsdk.feature.merchant.offers.internal.screens.search.MerchantOffersSearchFragment;
import ru.yandex.taxi.costcenters.input.CostCenterInputModalView;
import ru.yandex.taxi.costcenters.selection.CostCenterSelectionModalView;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.search.view.BaseAddressSearchView;

/* loaded from: classes2.dex */
public final /* synthetic */ class ff2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ff2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean init$lambda$1;
        boolean editorActionListener$lambda$0;
        boolean _init_$lambda$1;
        boolean z;
        boolean _init_$lambda$0;
        boolean onAttachedToWindow$lambda$1;
        boolean _init_$lambda$02;
        boolean _init_$lambda$2;
        boolean _init_$lambda$12;
        boolean _init_$lambda$22;
        boolean _init_$lambda$13;
        boolean z2;
        boolean _init_$lambda$14;
        boolean onViewCreated$lambda$9$lambda$8;
        boolean _init_$lambda$03;
        boolean onAttachedToWindow$lambda$2;
        boolean z3;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                init$lambda$1 = AnimatedListItemInputComponent.init$lambda$1((AnimatedListItemInputComponent) obj, textView, i, keyEvent);
                return init$lambda$1;
            case 1:
                editorActionListener$lambda$0 = BaseAddressSearchView.editorActionListener$lambda$0((BaseAddressSearchView) obj, textView, i, keyEvent);
                return editorActionListener$lambda$0;
            case 2:
                _init_$lambda$1 = CardNumberInput._init_$lambda$1((CardNumberInput) obj, textView, i, keyEvent);
                return _init_$lambda$1;
            case 3:
                z = CorpCreatingDraftModalView.setupCompanyNameItemInput$lambda$0((CorpCreatingDraftModalView) obj, textView, i, keyEvent);
                return z;
            case 4:
                _init_$lambda$0 = CostCenterInputModalView._init_$lambda$0((CostCenterInputModalView) obj, textView, i, keyEvent);
                return _init_$lambda$0;
            case 5:
                onAttachedToWindow$lambda$1 = CostCenterSelectionModalView.onAttachedToWindow$lambda$1((CostCenterSelectionModalView) obj, textView, i, keyEvent);
                return onAttachedToWindow$lambda$1;
            case 6:
                _init_$lambda$02 = CreateAccountView._init_$lambda$0((CreateAccountView) obj, textView, i, keyEvent);
                return _init_$lambda$02;
            case 7:
                _init_$lambda$2 = CvnInput._init_$lambda$2((CvnInput) obj, textView, i, keyEvent);
                return _init_$lambda$2;
            case 8:
                _init_$lambda$12 = DKCardNumberInput._init_$lambda$1((DKCardNumberInput) obj, textView, i, keyEvent);
                return _init_$lambda$12;
            case 9:
                _init_$lambda$22 = DKCvnInput._init_$lambda$2((DKCvnInput) obj, textView, i, keyEvent);
                return _init_$lambda$22;
            case 10:
                _init_$lambda$13 = DKExpirationDateInput._init_$lambda$1((DKExpirationDateInput) obj, textView, i, keyEvent);
                return _init_$lambda$13;
            case 11:
                z2 = DebugPanelLogsView.setupListeners$lambda$8((DebugPanelLogsView) obj, textView, i, keyEvent);
                return z2;
            case 12:
                _init_$lambda$14 = ExpirationDateInput._init_$lambda$1((ExpirationDateInput) obj, textView, i, keyEvent);
                return _init_$lambda$14;
            case 13:
                onViewCreated$lambda$9$lambda$8 = MerchantOffersSearchFragment.onViewCreated$lambda$9$lambda$8((MerchantOffersSearchFragment) obj, textView, i, keyEvent);
                return onViewCreated$lambda$9$lambda$8;
            case 14:
                _init_$lambda$03 = SbpHomeModalView._init_$lambda$0((SbpHomeModalView) obj, textView, i, keyEvent);
                return _init_$lambda$03;
            case 15:
                onAttachedToWindow$lambda$2 = TaxiOrderChatModalView.onAttachedToWindow$lambda$2((TaxiOrderChatModalView) obj, textView, i, keyEvent);
                return onAttachedToWindow$lambda$2;
            default:
                z3 = TipsInputModalView.setupInputField$lambda$0((TipsInputModalView) obj, textView, i, keyEvent);
                return z3;
        }
    }
}
