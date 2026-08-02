package defpackage;

import com.yandex.div.core.view2.Div2View;
import com.yandex.payment.divkit.bind.DKBindCardFragment;
import com.yandex.payment.divkit.bind.b;
import com.yandex.payment.sdk.nfcscanner.NfcResult;
import com.yandex.payment.sdk.ui.CardInputView;
import kotlin.coroutines.Continuation;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class hrf implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ DKBindCardFragment b;

    public /* synthetic */ hrf(DKBindCardFragment dKBindCardFragment, int i) {
        this.a = i;
        this.b = dKBindCardFragment;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Div2View div2View;
        b viewModel;
        boolean z;
        Div2View div2View2;
        b viewModel2;
        Div2View div2View3;
        CardInputView cardInputView;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        DKBindCardFragment dKBindCardFragment = this.b;
        switch (i) {
            case 0:
                m960 m960Var = (m960) obj;
                if (!jl40.l(m960Var, m960.a)) {
                    if (!jl40.l(m960Var, m960.b)) {
                        if (jl40.l(m960Var, m960.c)) {
                            dKBindCardFragment.isNfcAdapterEnabled = false;
                            div2View = dKBindCardFragment.div2View;
                            if (div2View != null) {
                                div2View.setVariable("card_input_screen_nfc_visibility", "gone");
                                break;
                            }
                        }
                    } else {
                        viewModel = dKBindCardFragment.getViewModel();
                        if (viewModel.L == null) {
                            viewModel.L = Boolean.TRUE;
                        }
                        z = dKBindCardFragment.isNfcFlagEnabled;
                        if (z) {
                            dKBindCardFragment.isNfcAdapterEnabled = true;
                            div2View2 = dKBindCardFragment.div2View;
                            if (div2View2 != null) {
                                div2View2.setVariable("card_input_screen_nfc_visibility", "visible");
                                break;
                            }
                        }
                    }
                } else {
                    viewModel2 = dKBindCardFragment.getViewModel();
                    if (viewModel2.L == null) {
                        viewModel2.L = Boolean.FALSE;
                    }
                    dKBindCardFragment.isNfcAdapterEnabled = false;
                    div2View3 = dKBindCardFragment.div2View;
                    if (div2View3 != null) {
                        div2View3.setVariable("card_input_screen_nfc_visibility", "gone");
                        break;
                    }
                }
                break;
            case 1:
                dKBindCardFragment.observeDivData((cnk) obj);
                dKBindCardFragment.listenNfcState();
                break;
            default:
                NfcResult nfcResult = (NfcResult) obj;
                String cardNumber = nfcResult.getCardNumber();
                String date = nfcResult.getDate();
                cardInputView = dKBindCardFragment.cardInput;
                if (cardInputView != null) {
                    cardInputView.post(new d1(27, dKBindCardFragment, cardNumber, date));
                }
                ((y22) dKBindCardFragment.getEventReporter()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Данные, полученные от NFC, установлены", "nfc_data_set_on_card"));
                break;
        }
        return zy11Var;
    }
}
