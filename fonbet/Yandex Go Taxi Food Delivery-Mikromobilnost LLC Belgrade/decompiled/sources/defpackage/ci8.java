package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.textfield.a;
import com.yandex.go.payments.cards.pci_dss.ui.c;
import com.yandex.messaging.internal.auth.AuthorizationObservable$AuthState;
import com.yandex.messaging.ui.chatinfo.editchat.ChatSettingsSwitch;
import com.yandex.messaging.ui.createpoll.b;
import com.yandex.payment.divkit.bind.view.DKCvnInput;
import com.yandex.payment.divkit.challenger.DKChallengerInputView;
import com.yandex.payment.divkit.cvv_confirm.CvvConfirmFragment;
import com.yandex.payment.divkit.sbp.DKSbpSearchBankLayout;
import com.yandex.payment.sdk.cardscanner.CardScannerActivity;
import com.yandex.payment.sdk.ui.view.ChallengerInputView;
import com.yandex.plus.core.debug.panel.internal.presentation.view.DebugPanelGeneralInfoView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import com.ybsdk.feature.card.internal.presentation.cardlimit.CardLimitFragment;
import com.ybsdk.feature.card.internal.presentation.cardterm.CardSettingsTermFragment;
import com.ybsdk.feature.cashback.impl.screens.categories.CashbackCategoriesFragment;
import com.ybsdk.feature.change.payment.method.internal.ui.ChangePaymentMethodFragment;
import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositFragment;
import com.ybsdk.widgets.common.checkbox.CheckBoxView;
import ru.CryptoPro.JCSP.tools.common.window.DefaultCspBioGuiCustomizer;
import ru.yandex.taxi.delivery.impl.requirement.door_to_door.DeliveryD2dRequirementView;
import ru.yandex.taxi.design.CroppedTextView;
import ru.yandex.taxi.preorder.source.ConfirmationDialog;
import ru.yandex.taxi.web.view.DefaultWebViewErrorView;

/* loaded from: classes2.dex */
public final /* synthetic */ class ci8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ci8(zkf zkfVar, ykf ykfVar) {
        this.a = 18;
        this.b = zkfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        int i2 = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                CardLimitFragment.getViewBinding$lambda$6$lambda$5((CardLimitFragment) obj, view);
                break;
            case 1:
                CardScannerActivity.onCreate$lambda$0((CardScannerActivity) obj, view);
                break;
            case 2:
                CardSettingsTermFragment.getBottomSheetState$lambda$8$lambda$7((CardSettingsTermFragment) obj, view);
                break;
            case 3:
                CashbackCategoriesFragment.onViewCreated$lambda$2((CashbackCategoriesFragment) obj, view);
                break;
            case 4:
                ChallengerInputView.applyConfig$lambda$0((ChallengerInputView) obj, view);
                break;
            case 5:
                ChangePaymentMethodFragment.renderBottomSheet$lambda$14$lambda$13((ChangePaymentMethodFragment) obj, view);
                break;
            case 6:
                s3b s3bVar = (s3b) obj;
                TextView textView = s3bVar.z;
                textView.setVisibility(8);
                s3bVar.A.setVisibility(0);
                textView.setEnabled(false);
                s3bVar.B.postDelayed(s3bVar.C, 10000L);
                h9x h9xVar = s3bVar.b;
                bo3 bo3Var = h9xVar.w;
                boolean z = h9xVar.z;
                jn3 jn3Var = bo3Var.a;
                ak3 ak3Var = new ak3(h9xVar, z, i2);
                jn3Var.getClass();
                tje.e();
                AuthorizationObservable$AuthState authorizationObservable$AuthState = jn3Var.i;
                if (authorizationObservable$AuthState == null) {
                    authorizationObservable$AuthState = jn3Var.a();
                    jn3Var.i = authorizationObservable$AuthState;
                }
                jn3Var.b(authorizationObservable$AuthState, new g191(ak3Var));
                break;
            case 7:
                ChatSettingsSwitch._init_$lambda$5((ChatSettingsSwitch) obj, view);
                break;
            case 8:
                CheckBoxView._init_$lambda$3((CheckBoxView) obj, view);
                break;
            case 9:
                a aVar = (a) obj;
                EditText editText = aVar.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (view.hasFocus()) {
                        aVar.i.requestFocus();
                    }
                    if (text != null) {
                        text.clear();
                    }
                    aVar.p();
                    break;
                }
                break;
            case 10:
                ((BottomSheetDialog) ((j4n) obj).b).cancel();
                break;
            case 11:
                ((ConfirmationDialog) obj).dismiss();
                break;
            case 12:
                ContactsFragment.onViewCreated$lambda$9((ContactsFragment) obj, view);
                break;
            case 13:
                ((b) obj).a.finish();
                break;
            case 14:
                CreditDepositFragment.onViewCreated$lambda$14$lambda$0((q661) obj, view);
                break;
            case 15:
                CroppedTextView.setExpandOnClickListener$lambda$0$0((CroppedTextView) obj, view);
                break;
            case 16:
                cef cefVar = (cef) obj;
                int F = cefVar.F();
                dye dyeVar = cefVar.O;
                if (dyeVar != null && F != -1) {
                    dyeVar.invoke(Integer.valueOf(F));
                    break;
                }
                break;
            case 17:
                ijf ijfVar = (ijf) obj;
                ((jir) ijfVar.c).a().setEnabled(false);
                ijfVar.b.a(new jxl(true));
                break;
            case 18:
                ((zkf) obj).N.invoke(null);
                break;
            case 19:
                c cVar = (c) obj;
                String obj2 = cVar.a.getText().toString();
                if (!TextUtils.isDigitsOnly(obj2)) {
                    jst.e.c("CVN contains non-digit characters");
                    break;
                } else {
                    cVar.c.a(new biw0(obj2));
                    break;
                }
            case 20:
                CvvConfirmFragment.onViewCreated$lambda$3((CvvConfirmFragment) obj, view);
                break;
            case 21:
                DKChallengerInputView.applyConfig$lambda$0((DKChallengerInputView) obj, view);
                break;
            case 22:
                DKCvnInput._init_$lambda$3((DKCvnInput) obj, view);
                break;
            case 23:
                DKSbpSearchBankLayout.setOnTextChangeListener$lambda$1((DKSbpSearchBankLayout) obj, view);
                break;
            case 24:
                DebugPanelGeneralInfoView.setupListeners$lambda$0((DebugPanelGeneralInfoView) obj, view);
                break;
            case 25:
                ((PopupMenu) obj).show();
                break;
            case 26:
                ((DefaultCspBioGuiCustomizer) obj).lambda$onCreateView$0(view);
                break;
            case 27:
                DefaultWebViewErrorView.lambda$0$0((DefaultWebViewErrorView) obj, view);
                break;
            case 28:
                ((DeliveryD2dRequirementView) obj).toggle();
                break;
            default:
                ((gai) obj).r(new wth(21));
                break;
        }
    }

    public /* synthetic */ ci8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
